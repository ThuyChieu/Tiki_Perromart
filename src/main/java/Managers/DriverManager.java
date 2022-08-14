package Managers;

import Config.Config;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public final class DriverManager {
    private static WebDriver driver = null;

    // Make class static
    private DriverManager() {}

    private static WebDriver createWebDriver(DriverName driverName) {
        switch (driverName) {
            case EDGE:
                WebDriverManager.edgedriver().setup();
                return new EdgeDriver();

            case CHROME:
                WebDriverManager.chromedriver().setup();
                return new ChromeDriver();

            case FIREFOX:
                WebDriverManager.firefoxdriver().setup();
                return new FirefoxDriver();
            default:
                System.out.println("Driver name is not found");
                return null;
        }
    }

    /**
     * @return an instance of browser driver implementation
     */
    public static WebDriver getInstant() {
        if (driver == null) {
            driver = createWebDriver(Config.driverName);
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        }

        return driver;
    }
}
