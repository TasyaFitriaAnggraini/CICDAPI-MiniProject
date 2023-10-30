package starter.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.API.Products;

public class ProductsSteps {

    @Steps
    Products products;

    //Scenario: TC37 - Get all products
    @Given("I GET all products endpoints")
    public void getAllProductEndpoints() {
        products.getAllProductEndpoints();
    }
    @When("I GET HTTP request with valid endpoints all products")
    public void getHTTPRequestWithValidEndpointsAllProducts() {
        products.getHTTPRequestWithValidEndpointsAllProducts();
    }
    @Then("I receive valid HTTP response 200 for get all products")
    public void receiveResponseCode200ForGetAllProducts() {
        products.receiveResponseCode200ForGetAllProducts();
    }

    //Scenario: TC38 - Get all products using invalid endpoints
    @Given("I GET all products endpoints 2")
    public void getAllProductsEndpoints2() {
        products.getAllProductsEndpoints2();
    }
    @When("I GET HTTP request with invalid endpoints")
    public void getHTTPRequestWithInvalidEndpoints() {
        products.getHTTPRequestWithInvalidEndpoints();
    }
    @Then("I receive valid HTTP response 404 for get all products using invalid endpoints")
    public void receiveResponseCode404ForGetAllProductUsingInvalidEndpoints() {
        products.receiveResponseCode404ForGetAllProductUsingInvalidEndpoints();
    }

    //Scenario: TC39 - Add new products
    @Given("I POST add new products endpoints")
    public void postAddNewProductsEndpoints() {
        products.postAddNewProductsEndpoints();
    }
    @When("I POST HTTP request for add new products")
    public void postHTTPRequestForAddNewProducts() {
        products.postHTTPRequestForAddNewProducts();
    }
    @Then("I receive valid HTTP response 200 for add new products")
    public void receiveResponseCode200ForAddNewProducts() {
        products.receiveResponseCode200ForAddNewProducts();
    }

    //Scenario: TC40 - Add new products without name payload
    @Given("I POST add new products endpoints 2")
    public void postAddNewProductsEndpoints2() {
        products.postAddNewProductsEndpoints2();
    }
    @When("I POST HTTP request for add new products without name payload")
    public void postHTTPRequestForAddNewProductsWithoutNamePayload() {
        products.postHTTPRequestForAddNewProductsWithoutNamePayload();
    }
    @Then("I receive valid HTTP response 500 for add new products without name payload")
    public void receiveResponseCode500ForAddNewProductsWithoutNamePayload() {
        products.receiveResponseCode500ForAddNewProductsWithoutNamePayload();
    }

    //Scenario: TC41 - Add new products with only space on name payload
//    @Given("I POST add new products endpoints 3")
//    public void postAddNewProductsEndpoints3() {
//        products.postAddNewProductsEndpoints3();
//    }
//    @When("I POST HTTP request for add new products with only space on name payload")
//    public void postHTTPRequestForAddNewProductsWithOnlySpaceOnNamePayload() {
//        products.postHTTPRequestForAddNewProductsWithOnlySpaceOnNamePayload();
//    }
//    @Then("I receive valid HTTP response 400 for add new products with only space on name payload")
//    public void receiveResponseCode400ForAddNewProductsWithOnlySpaceOnNamePayload() {
//        products.receiveResponseCode400ForAddNewProductsWithOnlySpaceOnNamePayload();
//    }

    //Scenario: TC42 - Add new product with blank name payload
    @Given("I POST add new products endpoints 4")
    public void postAddNewProductsEndpoints4() {
        products.postAddNewProductsEndpoints4();
    }
    @When("I POST HTTP request for add new products with blank name payload")
    public void postHTTPRequestForAddNewProductesWithBlankNamePayload() {
        products.postHTTPRequestForAddNewProductesWithBlankNamePayload();
    }
    @Then("I receive valid HTTP response 500 for add new products with blank name payload")
    public void receiveResponseCode500ForAddNewProductesWithBlankNamePayload() {
        products.receiveResponseCode500ForAddNewProductesWithBlankNamePayload();
    }

    //Scenario: TC43 - Add new product without price payload
//    @Given("I POST add new products endpoints 5")
//    public void postAddNewProductsEndpoints5() {
//        products.postAddNewProductsEndpoints5();
//    }
//    @When("I POST HTTP request for add new products without price payload")
//    public void postHTTPRequestForAddNewProductsWithoutPricePayload() {
//        products.postHTTPRequestForAddNewProductsWithoutPricePayload();
//    }
//    @Then("I receive valid HTTP response 500 for add new products without price payload")
//    public void receiveResponseCode500ForAddNewProductsWithoutPricePayload() {
//        products.receiveResponseCode500ForAddNewProductsWithoutPricePayload();
//    }

    //Scenario: TC44 - Add new product with blank price payload
    @Given("I POST add new products endpoints 6")
    public void postAddNewProductsEndpoints6() {
        products.postAddNewProductsEndpoints6();
    }
    @When("I POST HTTP request for add new products with blank price payload")
    public void postHTTPRequestForAddNewProductsWithBlankPricePayload() {
        products.postHTTPRequestForAddNewProductsWithBlankPricePayload();
    }
    @Then("I receive valid HTTP response 400 for add new products with blank price payload")
    public void receiveResponseCode400ForAddNewProductsWithBlankPricePayload() {
        products.receiveResponseCode400ForAddNewProductsWithBlankPricePayload();
    }

    //Scenario: TC45 - Add new product with only space on price payload
    @Given("I POST add new products endpoints 7")
    public void postAddNewProductsEndpoints7() {
        products.postAddNewProductsEndpoints7();
    }
    @When("I POST HTTP request for add new products with only space on price payload")
    public void postHTTPRequestForAddNewProductsWithOnlySpaceOnPricePayload() {
        products.postHTTPRequestForAddNewProductsWithOnlySpaceOnPricePayload();
    }
    @Then("I receive valid HTTP response 400 for add new products with only space on price payload")
    public void receiveResponseCode400ForAddNewProductsWithOnlySpaceOnPricePayload() {
        products.receiveResponseCode400ForAddNewProductsWithOnlySpaceOnPricePayload();
    }

    //Scenario: TC46 - Add new product without categories payload
//    @Given("I POST add new products endpoints 8")
//    public void postAddNewProductsEndpoints8() {
//        products.postAddNewProductsEndpoints8();
//    }
//    @When("I POST HTTP request for add new products without categories payload")
//    public void postHTTPRequestForAddNewProductsWithoutCategoriesPayload() {
//        products.postHTTPRequestForAddNewProductsWithoutCategoriesPayload();
//    }
//    @Then("I receive valid HTTP response 400 for add new products without categories payload")
//    public void receiveResponseCode400ForAddNewProductsWithoutCategoriesPayload() {
//        products.receiveResponseCode400ForAddNewProductsWithoutCategoriesPayload();
//    }

    //Scenario: TC47 - Add new product with invalid categories payload
//    @Given("I POST add new products endpoints 9")
//    public void postAddNewProductsEndpoints9() {
//        products.postAddNewProductsEndpoints9();
//    }
//    @When("I POST HTTP request for add new products with invalid categories payload")
//    public void postHTTPRequestForAddNewProductsWithInvalidCategoriesPayload() {
//        products.postHTTPRequestForAddNewProductsWithInvalidCategoriesPayload();
//    }
//    @Then("I receive valid HTTP response 200 for add new products with invalid categories payload")
//    public void receiveResponseCode200ForAddNewProductsWithInvalidCategoriesPayload() {
//        products.receiveResponseCode200ForAddNewProductsWithInvalidCategoriesPayload();
//    }

    //Scenario: TC48 - Add new product with body parameter is empty
    @Given("I POST add new products endpoints 10")
    public void postAddNewProductsEndpoints10() {
        products.postAddNewProductsEndpoints10();
    }
    @When("I POST HTTP request for add new products with body parameter is empty")
    public void postHTTPRequestForAddNewProductsWithBodyParameterIsEmpty() {
        products.postHTTPRequestForAddNewProductsWithBodyParameterIsEmpty();
    }
    @Then("I receive valid HTTP response 400 for add new products with body parameter is empty")
    public void receiveResponseCode400ForAddNewProductsWithBodyParameterIsEmpty() {
        products.receiveResponseCode400ForAddNewProductsWithBodyParameterIsEmpty();
    }

    //Scenario: TC49 - Add new products with invalid HTTP method
    @Given("I PUT add new products endpoints")
    public void putAddNewProductsEndpoints() {
        products.putAddNewProductsEndpoints();
    }
    @When("I send request for add new products with invalid HTTP method")
    public void sendRequestForAddNewProductsWithInvalidHTTPMethod() {
        products.sendRequestForAddNewProductsWithInvalidHTTPMethod();
    }
    @Then("I receive valid HTTP response 405 for for add new products with invalid HTTP method")
    public void receiveResponseCode405ForAddNewProductsWithInvalidHTTPMethod() {
        products.receiveResponseCode405ForAddNewProductsWithInvalidHTTPMethod();
    }

    //Scenario: TC50 - Get products by ID
    @Given("I GET products endpoints by ID")
    public void getProductsEndpointsByID() {
        products.getProductsEndpointsByID();
    }
    @When("I GET HTTP request for products with valid ID")
    public void getHTTPRequestForProductsWithValidID() {
        products.getHTTPRequestForProductsWithValidID();
    }
    @Then("I receive valid HTTP response 200 for get products by ID")
    public void receiveResponseCode200ForProductsWithValidID() {
        products.receiveResponseCode200ForProductsWithValidID();
    }

    //Scenario: TC51 - Get product using invalid ID with character symbols
    @Given("I GET products endpoints by ID 2")
    public void getProductsEndpointsByID2() {
        products.getProductsEndpointsByID2();
    }
    @When("I GET HTTP request for products using invalid ID with character symbols")
    public void getHTTPRequestsForProductsUsingInvalidIDWithCharacterSysmbols() {
        products.getHTTPRequestsForProductsUsingInvalidIDWithCharacterSysmbols();
    }
    @Then("I receive valid HTTP response 500 for get products using invalid ID with character symbols")
    public void receiveResponseCode500ForProductsUsingInvalidIDWithCharacterSysmbols() {
        products.receiveResponseCode500ForProductsUsingInvalidIDWithCharacterSysmbols();
    }

    //Scenario: TC52 - Get categories by invalid ID with character alphabet
    @Given("I GET products endpoints by ID 3")
    public void getProductsEndpointsbyID3() {
        products.getProductsEndpointsbyID3();
    }
    @When("I GET HTTP request for products using invalid ID with character alphabet")
    public void getHTTPRequestsForProductsUsingInvalidIDWithCharacterAlphabet() {
        products.getHTTPRequestsForProductsUsingInvalidIDWithCharacterAlphabet();
    }
    @Then("I receive valid HTTP response 400 for get products using invalid ID with character alphabet")
    public void receiveResponseCode400ForProductsUsingInvalidIDWithCharacterAlphabet() {
        products.receiveResponseCode400ForProductsUsingInvalidIDWithCharacterAlphabet();
    }

    //Scenario: TC53 - Delete a products by ID
    @Given("I DELETE a products endpoints by ID")
    public void deleteAProductsEndpointsByID() {
        products.deleteAProductsEndpointsByID();
    }
    @When("I DELETE HTTP request for a products with valid ID")
    public void deleteHTTPRequestForAProductsWithValidID() {
        products.deleteHTTPRequestForAProductsWithValidID();
    }
    @Then("I receive valid HTTP response 200 for delete a products")
    public void receiveResponseCode200ForDeleteAProducts() {
        products.receiveResponseCode200ForDeleteAProducts();
    }

    //Scenario: TC54 - Delete a products using invalid ID with character symbols
    @Given("I DELETE a products endpoints by ID 2")
    public void deleteAProductsEndpointsByID2() {
        products.deleteAProductsEndpointsByID2();
    }
    @When("I DELETE HTTP request for a products using invalid ID with character symbols")
    public void deleteHTTPRequestForAProductsUsingInvalidIDWithCharacterSymbols() {
        products.deleteHTTPRequestForAProductsUsingInvalidIDWithCharacterSymbols();
    }
    @Then("I receive valid HTTP response 500 for a products using invalid ID with character symbols")
    public void receiveResponseCode500ForAProductsUsingInvalidIDWithCharacterSymbols() {
        products.receiveResponseCode500ForAProductsUsingInvalidIDWithCharacterSymbols();
    }

    //Scenario: TC55 - Delete a products using invalid ID with character alphabet
    @Given("I DELETE a products endpoints by ID 3")
    public void deleteAProductsEndpointsByID3() {
        products.deleteAProductsEndpointsByID3();
    }
    @When("I DELETE HTTP request for a products using invalid ID with character alphabet")
    public void deleteHTTPRequestForAProductsUsingInvalidIDWithCharacterAlphabet() {
        products.deleteHTTPRequestForAProductsUsingInvalidIDWithCharacterAlphabet();
    }
    @Then("I receive valid HTTP response 400 for a products using invalid ID with character alphabet")
    public void receiveResponseCode400ForAProductsUsingInvalidIDWithCharacterAlphabet() {
        products.receiveResponseCode400ForAProductsUsingInvalidIDWithCharacterAlphabet();
    }
}
