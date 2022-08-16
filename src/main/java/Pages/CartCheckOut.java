package Pages;

import Config.Config;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartCheckOut extends BasePage {
    @FindBy(xpath = "//span[text()='Add to cart']")
    private WebElement addToCart;

    @FindBy(xpath = "//button[@aria-label='close']//*[name()='svg']")
    private WebElement closeNotification;

    @FindBy(xpath = "//div[@class='px-3 py-3 p-xxl-3 d-flex align-items-center position-relative']//div[@class='Nav_notificationIcon__PO8_E']")
    private WebElement shoppingCart;
    @FindBy(xpath = ".CartItems_PlaceOrder__clRYj")
    private WebElement btnCheckOut;

    public CartCheckOut(WebDriver driver) {
        super(driver);
        this.driver.get(Config.pageUrl);
    }

    public CartCheckOut getProductDetail() {
        clickElement(addToCart);
        clickElement(shoppingCart);
        return this;
    }
    public CartCheckOut cartCheckOut(){
        clickElement(btnCheckOut);
        return this;
    }

    public int verifyProductName(String itemName) {
        By titleProduct = By.xpath("//div[@class='CartItems_Title__x96Gd' and text()='" + itemName + "']");
        return driver.findElements(titleProduct).size();
    }
}
