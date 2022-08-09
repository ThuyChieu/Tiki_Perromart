package Blueprints;

import Utilities.Elements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartCheckOut {
    WebDriverWait wait;
    WebDriver driver;

    @FindBy(xpath = Elements.addToCart)
    private WebElement addToCart;

    @FindBy(xpath = Elements.closeNotification)
    private WebElement closeNotification;

    @FindBy(xpath = Elements.shoppingCart)
    private WebElement shoppingCart;

    public CartCheckOut(WebDriver driver){
        this.driver = this.driver;
        PageFactory.initElements(driver,this);
    }
    public void productDetail(){
        closeNotification.click();
        addToCart.click();
        shoppingCart.click();
    }
}
