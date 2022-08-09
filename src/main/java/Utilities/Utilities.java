package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class Utilities {
    WebDriver driver;
    public Utilities(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
}
