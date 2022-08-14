package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductSearch {
    WebDriver driver;
    @FindBy(xpath = "//button[@tabindex='0']")
    private WebElement closePopUp;

    @FindBy(xpath = "//div[@class='navBorder'][normalize-space()='Dog']")
    private WebElement btnDog;

    @FindBy(xpath = "//div[text()='Food']")
    private WebElement btnFood;

    @FindBy(xpath = "//input[@placeholder='Search for products, brands and more']")
    private WebElement barSearch;

    @FindBy(css = ".NavSearchBar_searchIconDiv__Vr5NB")
    private WebElement btnSearch;

    @FindBy(xpath = "//div[normalize-space()='Bronco Jerky Salmon Dog Treat 70g']")
    private WebElement clickBroncoSalmon;

    public ProductSearch(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public ProductSearch foodSearchProcess() throws InterruptedException {
        closePopUp.click();
        btnDog.click();
        btnFood.click();

        return this;
    }

    public ProductSearch typoSearch(String value) throws InterruptedException {
        barSearch.sendKeys(value);
        btnSearch.click();
        Thread.sleep(2500);

        return this;
    }

    public ProductSearch chooseProduct() throws InterruptedException {
        clickBroncoSalmon.click();

        return this;
    }
}
