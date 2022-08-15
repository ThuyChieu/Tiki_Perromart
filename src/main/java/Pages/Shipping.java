package Pages;

import Config.Config;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Shipping extends BasePage {
    WebDriver driver;

    @FindBy(xpath = ".CartItems_PlaceOrder__clRYj")
    private WebElement btnCheckOut;
    @FindBy(xpath = "//input[@id='checkout_email']")
    private WebElement txtEmail;
    @FindBy(xpath = "//input[@id='checkout_shipping_address_first_name']")
    private WebElement txtFirstName;
    @FindBy(xpath = "//input[@id='checkout_shipping_address_last_name']")
    private WebElement txtLastName;
    @FindBy(xpath = "//input[@id='checkout_shipping_address_address1']")
    private WebElement txtAddress;
    @FindBy(xpath = "//input[@id='checkout_shipping_address_address2']")
    private WebElement txtApartment;
    @FindBy(xpath = "//input[@id='checkout_shipping_address_zip']")
    private WebElement txtPostalCode;
    @FindBy(xpath = "//input[@id='checkout_shipping_address_phone']")
    private WebElement txtPhone;
    @FindBy(xpath = ".step__footer__continue-btn")
    private WebElement btnContinueShopping;

    public Shipping(WebDriver driver) {
        initialize(driver);
        this.driver.get(Config.pageUrl);
    }
    public Shipping inputInfor(String email, String firstName, String lastName, String address, String apartment, String postalCode, String phone){
        inputText(txtAddress,email);
        inputText(txtFirstName, firstName);
        inputText(txtLastName, lastName);

    }


}
