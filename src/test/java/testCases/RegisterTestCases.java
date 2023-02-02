package testCases;

import com.shaft.driver.SHAFT;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.Base;
import pages.HomePage;
import pages.RegisterPage;

public class RegisterTestCases {
    private SHAFT.GUI.WebDriver driver;
    private SHAFT.TestData.JSON testData;
    private HomePage homePage;
    private RegisterPage registerPage;

    @Test
    public void userRegisterWithValidData(){
        homePage.userNavigateToRegisterPage();
        driver.assertThat()
                .element(registerPage.registerText)
                .text()
                .contains("Register")
                .perform();
        driver.element().select(registerPage.dayListDropDown,testData.getTestData("day"));
        driver.element().select(registerPage.monthListDropDown,testData.getTestData("month"));
        driver.element().select(registerPage.yearListDropDown,testData.getTestData("year"));



    }


    @BeforeClass(description = "Setup Test Data.")
    public void beforeClass(){
        testData = new SHAFT.TestData.JSON("testData.json");
        homePage = new HomePage(driver);
        registerPage = new RegisterPage(driver);
    }

    @BeforeMethod(description = "Setup Browser instance.")
    public void beforeMethod() {
        driver = new SHAFT.GUI.WebDriver();
        new Base(driver).navigate();
    }

    @AfterMethod(description = "Teardown Browser instance.")
    public void afterMethod() {
        driver.quit();
    }

}
