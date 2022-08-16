package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class BasePage {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public BasePage(final WebDriver webdriver) {
        this.driver = webdriver;
        this.wait = new WebDriverWait(this.driver, Duration.ofSeconds(50000));
        PageFactory.initElements(driver, this);
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void captureScreenshot(String fileName) {
//        Shutterbug.shootPage(driver)
//                .withName(fileName)
//                .save(configuration().baseReportPath() + configuration().baseScreenshotPath());
    }

    public void clickElement(WebElement element){
        wait.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }
    public void inputText(WebElement element, String value){
        wait.until(ExpectedConditions.visibilityOf(element));
        element.clear();
        element.sendKeys(value);
    }
    public By productXPath(String value) {
        return (By.xpath("//div[text()='" + value + "']"));
    }
}
