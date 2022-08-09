package TestRunners;

import Blueprints.ProductSearch;
import SetUp.SetUp;
import org.testng.annotations.Test;

public class ProductSearchTestRunner extends SetUp {
//    @Test(groups = "cart",description = "Search food for dog")
//    public void foodSearch() throws InterruptedException{
//        driver.get("https://perromart.com.sg/");
//        ProductSearch productSearch = new ProductSearch(driver);
//        productSearch.foodSearchProcess();
//    }
//    @Test(groups = "cart",description = "Search Bronco Salmon product in search bar")
//    public void typoBarSearch() throws InterruptedException{
//        driver.get("https://perromart.com.sg/");
//        ProductSearch productSearch = new ProductSearch(driver);
//        productSearch.typoSearch();
//    }
    @Test(groups = "cart",description = "Select Brocon Salmon")
    public void chooseBroconSalmon() throws InterruptedException{
        driver.get("https://perromart.com.sg/");
        ProductSearch productSearch = new ProductSearch(driver);
        productSearch.foodSearchProcess();
        productSearch.typoSearch();
        productSearch.chooseProduct();
    }
}
