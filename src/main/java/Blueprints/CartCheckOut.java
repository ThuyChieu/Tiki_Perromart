package Blueprints;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CartCheckOut {
    WebDriverWait wait;
    WebDriver driver;

    @FindBy(xpath = "//span[text()='Add to cart']")
    private WebElement addToCart;

    @FindBy(xpath = "//button[@aria-label='close']//*[name()='svg']")
    private WebElement closeNotification;

    @FindBy(xpath = "//div[@class='px-3 py-3 p-xxl-3 d-flex align-items-center position-relative']//div[@class='Nav_notificationIcon__PO8_E']")
    private WebElement shoppingCart;

    public CartCheckOut(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void productDetail() {
        addToCart.click();
        shoppingCart.click();
    }

    public int verifyProductName(String itemName) {
        By titleProduct = By.xpath("//div[@class='CartItems_Title__x96Gd' and text()='" + itemName + "']");
        return driver.findElements(titleProduct).size();
    }
}
