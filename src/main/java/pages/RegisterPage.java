package pages;

import com.shaft.driver.SHAFT;
import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class RegisterPage {
    private SHAFT.GUI.WebDriver driver;

    //constructor
    public RegisterPage(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

    //elements
    private By genderMaleRadioButton = By.id("gender-male");
    private By genderFemaleRadioButton = By.id("gender-female");
    private By firstNameField = By.id("FirstName");
    private By lastNameField = By.id("LastName");


    public By dayListDropDown = By.cssSelector("select[name='DateOfBirthDay']");
    public By monthListDropDown = By.cssSelector("select[name='DateOfBirthMonth']");
    public By yearListDropDown = By.cssSelector("select[name='DateOfBirthYear']");
    public By registerText = By.className("page-title");


//    public int dayListCount = driver.element().getElementsCount(dayListDropDown);

    //actions




}
