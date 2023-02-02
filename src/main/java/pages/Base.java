package pages;

import com.shaft.driver.SHAFT;
import io.qameta.allure.Step;

public class Base {
    private SHAFT.GUI.WebDriver driver;
    private String url = "https://demo.nopcommerce.com/";
    private String title = "nopcommerce";


    public Base(SHAFT.GUI.WebDriver driver){
        this.driver = driver;
    }

    @Step("When I navigate to the Home page.")
    public Base navigate(){
        driver.browser().navigateToURL(url);
        return this;
    }

    @Step("Then the browser title should be 'nopcommerce'.")
    public Base verifyBrowserTitleIsCorrect(){
        driver.verifyThat().browser().title().isEqualTo(title).perform();
        return this;
    }
}
