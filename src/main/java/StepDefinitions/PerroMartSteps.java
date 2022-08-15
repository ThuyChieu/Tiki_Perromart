package StepDefinitions;

import Pages.CartCheckOut;
import Pages.ProductSearch;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class PerroMartSteps {
    WebDriver driver;
    @Given("I go to {string} website")
    public void openHomePage(String URL){
        driver.get(URL);
    }
    @When("I navigate to page food")
    public void foodSearch(){
        ProductSearch productSearch = new ProductSearch(driver);
        productSearch.foodSearchProcess();
    }
    @When("I send keyword {string} to search engine and click search button")
    public void searchProduct(String productName){
        ProductSearch productSearch = new ProductSearch(driver);
        productSearch.typoSearch(productName);
    }
    @When("I click product name {string}")
    public void chooseProduct(){
        CartCheckOut cartCheckOut = new CartCheckOut(driver);
//        cartCheckOut.getProductDetail();
    }
    @Then("I verify that {string} have been added with correct ")

}
