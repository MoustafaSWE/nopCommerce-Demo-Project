package pages;

import com.shaft.driver.SHAFT;
import com.shaft.gui.element.ElementActions;
import org.openqa.selenium.By;

public class HomePage {
    private SHAFT.GUI.WebDriver driver;

    //constructor
    public HomePage(SHAFT.GUI.WebDriver driver) {
        this.driver = driver;
    }

    //elements
    private By registerButton = By.className("ico-register");
    private By loginButton = By.className("ico-login");
    private By wishListButton = By.className("ico-wishlist");
    private By shoppingCartButton = By.className("ico-cart");
    private By searchField = By.id("small-searchterms");
    private By searchButton = By.className("button-1 search-box-button");


    //actions

}
