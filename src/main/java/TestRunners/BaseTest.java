package TestRunners;

import Config.Config;
import Managers.DriverManager;
import Managers.TestListener;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

/**
 * This class provides the basic functionalities required by the test scripts.
 */
@Listeners(TestListener.class)
public abstract class BaseTest {
  private WebDriver driver;

  public abstract void initialize();

  public WebDriver getDriver() {
    return driver;
  }

  @BeforeClass
  public void setup() {
    try {
      Config.setup();
      driver = DriverManager.getInstant();
      initialize();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  @AfterClass
  public void tearDown() {
    driver.quit();
  }
}
