package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {
    protected WebDriver driver;

    public void initialize(final WebDriver webdriver) {
        this.driver = webdriver;
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
}
