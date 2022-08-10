package Blueprints;

import Utilities.Elements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProductSearch {
    WebDriver driver;
    @FindBy(xpath = Elements.closePopUp)
    private WebElement closePopUp;

    @FindBy(xpath = Elements.btnDog)
    private WebElement btnDog;

    @FindBy(xpath = Elements.btnFood)
    private WebElement btnFood;

    @FindBy(xpath = Elements.barSearch)
    private WebElement barSearch;

    @FindBy(css = Elements.btnSearch)
    private WebElement btnSearch;

    @FindBy(xpath = Elements.clickBroncoSalmon)
    private WebElement clickBroncoSalmon;

    public ProductSearch(WebDriver driver) {
        this.driver = this.driver;
        PageFactory.initElements(driver, this);
    }

    public void foodSearchProcess() throws InterruptedException {
        closePopUp.click();
        btnDog.click();
        btnFood.click();
    }

    public void typoSearch() throws InterruptedException {
        barSearch.sendKeys("Bronco Salmon");
        btnSearch.click();
        Thread.sleep(2500);
    }

    public void chooseProduct() throws InterruptedException {
        clickBroncoSalmon.click();
    }
}
