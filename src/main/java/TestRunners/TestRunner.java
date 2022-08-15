package TestRunners;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/main/resources"}, glue = {"StepDefinitions"}, monochrome = true)

public class TestRunner {

//    @Test(groups = "cart",description = "Select Brocon Salmon")
//    public void chooseBroconSalmon() throws InterruptedException{
////        driver.get("https://perromart.com.sg/");
//        ProductSearch productSearch = new ProductSearch(driver);
//        CartCheckOut cartCheckOut = new CartCheckOut(driver);
//        productSearch.foodSearchProcess();
//        productSearch.typoSearch();
//        productSearch.chooseProduct();
//        cartCheckOut.productDetail();
//        //Verify
//        Assert.assertEquals(cartCheckOut.verifyProductName("Bronco Jerky Salmon Dog Treat 70g"),1);
//    }
}


