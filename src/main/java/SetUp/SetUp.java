package SetUp;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class SetUp {
    public static final String URL = "https://perromart.com.sg/";
    public static WebDriver driver;

    @BeforeMethod
    public void setUp(){
        setDriver("chrome");
        driver = getDriver();
        driver.get(URL);
    }

    @BeforeTest(groups = {"search", "cart"})
    public void setDriver(String type) {
        switch (type.trim().toLowerCase()) {
            case "edge":
                WebDriverManager.edgedriver().setup();
                driver = new EdgeDriver();
                break;
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
        }
//        WebDriverManager.chromedriver().setup();
//        ChromeOptions ops = new ChromeOptions();
//        ops.addArguments("--headed");
//        driver = new ChromeDriver(ops);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    public static WebDriver getDriver() {
        return driver;
    }

    @AfterTest(groups = {"search", "cart"})
    public void logout() {
        driver.close();
    }
}

