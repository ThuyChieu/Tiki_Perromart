package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class ProductCategory extends BasePage{
    public ProductCategory(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public ProductCategory chooseFood(String itemName){
        clickElement(driver.findElement(productXPath(itemName)));
        return this;
    }
}
