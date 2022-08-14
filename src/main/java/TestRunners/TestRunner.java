package TestRunners;

import Pages.ProductSearch;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestRunner extends BaseTest {
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
    private ProductSearch productSearchPage ;

    @Override
    public void initialize() {
        productSearchPage = new ProductSearch(getDriver());
    }

    @Test(testName = "test-demo",description = "Select Brocon Salmon")
    public void test() throws Exception {
        productSearchPage
                .foodSearchProcess()
                .typoSearch("Brocon Salmon")
                .chooseProduct();
    }


}
