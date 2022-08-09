package TestRunners;

import Blueprints.CartCheckOut;
import SetUp.SetUp;
import org.testng.annotations.Test;

public class CartCheckOutTestRunner extends SetUp {
    @Test(groups = "cart",description = "Check if Product is in the Cart")
    public void cartCheck() throws InterruptedException{
        driver.get("https://perromart.com.sg/");
        CartCheckOut cartCheckOut = new CartCheckOut(driver);
        cartCheckOut.productDetail();
    }

}
