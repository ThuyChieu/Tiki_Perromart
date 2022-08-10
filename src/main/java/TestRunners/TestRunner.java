package TestRunners;

import Blueprints.CartCheckOut;
import Blueprints.ProductSearch;
import SetUp.SetUp;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestRunner extends SetUp {
    @Test(groups = "cart",description = "Select Brocon Salmon")
    public void chooseBroconSalmon() throws InterruptedException{
//        driver.get("https://perromart.com.sg/");
        ProductSearch productSearch = new ProductSearch(driver);
        CartCheckOut cartCheckOut = new CartCheckOut(driver);
        productSearch.foodSearchProcess();
        productSearch.typoSearch();
        productSearch.chooseProduct();
        cartCheckOut.productDetail();
        //Verify
        Assert.assertEquals(cartCheckOut.verifyProductName("Bronco Jerky Salmon Dog Treat 70g"),1);
    }
}
