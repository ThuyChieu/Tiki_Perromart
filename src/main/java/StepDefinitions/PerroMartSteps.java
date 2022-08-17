package StepDefinitions;

import Config.Config;
import Managers.DriverManager;
import Pages.CartCheckOut;
import Pages.ProductCategory;
import Pages.ProductSearch;
import Pages.Shipping;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

public class PerroMartSteps {
    WebDriver driver;
    @Given("I go to {string} website")
    public void openHomePage(String URL){
        try {
            Config.setup();
            driver = DriverManager.getInstant();
        } catch (Exception e) {
            e.printStackTrace();
        }
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
    public void clickProduct(String productName){
        ProductCategory productCategory = new ProductCategory(driver);
        productCategory.chooseFood(productName);
    }
    @When("I add to cart and click cart button")
    public void addToCart(){
        CartCheckOut cartCheckOut = new CartCheckOut(driver);
        cartCheckOut.getProductDetail();
    }
    @Then("I verify that product have been added with correct {string} name")
    public void verifyCart(String productName){
        CartCheckOut cartCheckOut = new CartCheckOut(driver);
        cartCheckOut.verifyProductName(productName);
    }
    @When("I click check out button")
    public void checkOut(){
        CartCheckOut cartCheckOut = new CartCheckOut(driver);
        cartCheckOut.cartCheckOut();
    }
    @When("I input {string}, {string}, {string}, {string}, {string}, {string}, {string} and click continue to shipping button")
    public void inputInfor(String email, String firstName, String lastName, String address, String apartment, String postalCode, String phone){
        Shipping shipping = new Shipping(driver);
        shipping.inputInfor(email, firstName, lastName, address, apartment, postalCode, phone);
    }
    @Then("I verify that {string}, {string} is correct")
    public void verifyInfor(String email, String shipTo){
        Shipping shipping = new Shipping(driver);
        shipping.verifyInfor(email, shipTo);
    }
}
