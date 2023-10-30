package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.API.ProductCategories;

public class ProductCategoriesSteps {

    @Steps
    ProductCategories product;

    //Scenario: TC24 - Add new products categories
    @Given("I POST create product categories endpoints")
    public void postProductCategories() {
        product.postProductCategories();
    }
    @When("I POST HTTP request with valid data")
    public void postHTTPRequestProductCategories() {
        product.postHTTPRequestProductCategories();
    }
    @And("I receive response data for product categories")
    public void receiveResponseProductCategories() {
        product.receiveResponseProductCategories();
    }
    @Then("I receive valid HTTP response 200")
    public void receiveResponseCode200ProductCategories() {
        product.receiveResponseCode200ProductCategories();
    }

    //Scenario: TC25 - Add new products categories without description data payload
    @Given("I POST create product categories endpoints 2")
    public void postCreateProductCategoriesEndpoints2() {
        product.postCreateProductCategoriesEndpoints2();
    }
    @When("I POST HTTP request add new categories without description data payload")
    public void postHTTPRequestAddNewCategoriesWithoutDescriptionDataPayload() {
        product.postHTTPRequestAddNewCategoriesWithoutDescriptionDataPayload();
    }
    @And("I receive response data for add new categories without description data payload")
    public void receiveResponseDataForAddNewCategoriesWithoutDescriptionDataPayload() {
        product.receiveResponseDataForAddNewCategoriesWithoutDescriptionDataPayload();
    }
    @Then("I receive valid HTTP response 200 for add new categories without description data payload")
    public void receiveResponseCode200ForAddNewCategoriesWithoutDescriptionDataPayload() {
        product.receiveResponseCode200ForAddNewCategoriesWithoutDescriptionDataPayload();
    }

    //Scenario: TC26 - Add new products categories without name data payload
    @Given("I POST create products categories endpoints 3")
    public void postCreateProductsCategoriesEndpoint3() {
        product.postCreateProductsCategoriesEndpoint3();
    }
    @When("I POST HTTP request add new categories without name data payload")
    public void postHTTPRequestAddNewCategoriesWithoutNameDataPayload() {
        product.postHTTPRequestAddNewCategoriesWithoutNameDataPayload();
    }
    @And("I receive response data for add new categories without name data payload")
    public void receiveResponseDataForAddNewCategoriesWithoutNameDataPayload() {
        product.receiveResponseDataForAddNewCategoriesWithoutNameDataPayload();
    }
    @Then("I receive valid HTTP response 500 for add new categories without name data payload")
    public void receiveResponseCode500ForAddNewCategoriesWithoutNameDataPayload() {
        product.receiveResponseCode500ForAddNewCategoriesWithoutNameDataPayload();
    }

    //Scenario: TC27 - Add new products categories with invalid payload format
    @Given("I POST create products categories endpoints 4")
    public void postCreateProductsCategoriesEndpoints4() {
        product.postCreateProductsCategoriesEndpoints4();
    }
    @When("I POST HTTP request add new categories with invalid payload format")
    public void postHTTPRequestAddNewCategoriesWithInvalidPayloadFormat() {
        product.postHTTPRequestAddNewCategoriesWithInvalidPayloadFormat();
    }
    @And("I receive response data for add new categories with invalid payload format")
    public void receiveResponseDataForAddNewCategoriesWithInvalidPayloadFormat() {
        product.receiveResponseDataForAddNewCategoriesWithInvalidPayloadFormat();
    }
    @Then("I receive valid HTTP response 500 for add new categories with invalid payload format")
    public void receiveResponseCode500ForAddNewCategoriesWithInvalidPayloadFormat() {
        product.receiveResponseCode500ForAddNewCategoriesWithInvalidPayloadFormat();
    }

    //Scenario: TC28 -  Add new products categories with body parameter is empty
    @Given("I POST add new products categories endpoints 5")
    public void postAddNewProductsCategoriesEndpoints5() {
        product.postAddNewProductsCategoriesEndpoints5();
    }
    @When("I POST HTTP request for add new products categories with body parameter is empty")
    public void postHTTPRequestForAddNewProductsCategoriesWithBodyParameterIsEmpty() {
        product.postHTTPRequestForAddNewProductsCategoriesWithBodyParameterIsEmpty();
    }
    @Then("I receive valid HTTP response 500 for add new products categories with body parameter is empty")
    public void receiveResponseCode500ForAddNewProductsCategoriesWithBodyParameterIsEmpty() {
        product.receiveResponseCode500ForAddNewProductsCategoriesWithBodyParameterIsEmpty();
    }

    //Scenario: TC29 - Get all products categories
    @Given("I GET all products categories endpoints")
    public void getAllProductsCategoriesEndponts() {
        product.getAllProductsCategoriesEndponts();
    }
    @When("I GET HTTP request with valid endpoints all products categories")
    public void getHTTPRequestWithAllProductsCategories() {
        product.getHTTPRequestWithAllProductsCategories();
    }
    @Then("I receive valid HTTP response 200 for get all products categories")
    public void receiveResponseCode200GetAllProductsCategories() {
        product.receiveResponseCode200GetAllProductsCategories();
    }

    //Scenario: TC30 - Get all products categories with invalid endpoints
    @Given("I GET all products categories endpoints 2")
    public void getAllProductsCategoriesEndpoints2() {
        product.getAllProductsCategoriesEndpoints2();
    }
    @When("I GET HTTP request with invalid endpoints all products categories")
    public void getHTTPRequestWithInvalidEndpointsAllProductsCategories() {
        product.getHTTPRequestWithInvalidEndpointsAllProductsCategories();
    }
    @Then("I receive valid HTTP response 404 for all products categories with invalid endpoints")
    public void receiveResponseCode404ForAllProductsCategoriesWithInvalidEndpoints() {
        product.receiveResponseCode404ForAllProductsCategoriesWithInvalidEndpoints();
    }

    //Scenario: TC31 - Get products categories by ID
    @Given("I GET products categories endpoints by ID")
    public void getProductCategoryByID() {
        product.getProductCategoriesEndpointsByID();
    }
    @When("I GET HTTP request with valid ID")
    public void getHTTPRequestProductCategoryByID() {
        product.getHTTPRequestProductCategoryByID();
    }
    @Then("I receive valid HTTP response 200 for get by ID")
    public void receiveResponseCode200ProductCategoryByID() {
        product.receiveResponseCode200ProductCategoryByID();
    }

    //Scenario: TC32 - Get products categories by invalid ID with character symbols
    @Given("I GET products categories endpoints by ID 2")
    public void getProductsCategoriesEndpointsByID2() {
        product.getProductsCategoriesEndpointsByID2();
    }
    @When("I GET HTTP request with invalid ID with character symbols")
    public void getHTTPRequestWithInvalidIDWithCharacterSysmbols() {
        product.getHTTPRequestWithInvalidIDWithCharacterSysmbols();
    }
    @Then("I receive valid HTTP response 500 for get by invalid ID with character symbols")
    public void receiveResponseCode500ForGetByInvalidIDWithCharacterSysmbols() {
        product.receiveResponseCode500ForGetByInvalidIDWithCharacterSysmbols();
    }

    //Scenario: TC33 - Get categories by invalid ID with character alphabet
    @Given("I GET products categories endpoints by ID 3")
    public void getProductsCategoriesEndpointsByID3() {
        product.getProductsCategoriesEndpointsByID3();
    }
    @When("I GET HTTP request with invalid ID with character alphabet")
    public void getHTTPRequestWithInvalidIDWithCharacterAlphabet() {
        product.getHTTPRequestWithInvalidIDWithCharacterAlphabet();
    }
    @Then("I receive valid HTTP response 400 for get by invalid ID with character alphabet")
    public void receiveResponseCode400ForGetByInvalidIDWithCharacterAlphabet() {
        product.receiveResponseCode400ForGetByInvalidIDWithCharacterAlphabet();
    }

    //Scenario: TC34 - Delete a products categories
    @Given("I DELETE a products categories endpoints")
    public void deleteProductCategoriesEndpoints() {
        product.deleteProductCategoriesEndpoints();
    }
    @When("I DELETE HTTP request with valid ID")
    public void deleteHTTPRequestAProductCategory() {
        product.deleteHTTPRequestAProductCategory();
    }
    @Then("I receive valid HTTP response 200 for delete a product categories")
    public void receiveResponseCode200DeleteProductCategories() {
        product.receiveResponseCode200DeleteProductCategories();
    }

    //Scenario: TC35 - Delete a products categories by invalid ID with character symbols
    @Given("I DELETE a product categories endpoints by ID")
    public void deleteProductsCategoriesEndpointsByID() {
        product.deleteProductsCategoriesEndpointsByID();
    }
    @When("I DELETE HTTP request with invalid ID with character symbols")
    public void deleteHTTPRequestWithInvalidIDWithCharacterSymbols() {
        product.deleteHTTPRequestWithInvalidIDWithCharacterSymbols();
    }
    @Then("I receive valid HTTP response 500 for delete a product categories with character symbols")
    public void receiveResponseCode500ForDeleteProductsCategoriesWithCharacterSymbols() {
        product.receiveResponseCode500ForDeleteProductsCategoriesWithCharacterSymbols();
    }

    //Scenario: TC36 - Delete a categories by invalid ID with character alphabet
    @Given("I DELETE a product categories endpoints by ID 2")
    public void deleteProducstCategoriesEndpointsByID2() {
        product.deleteProducstCategoriesEndpointsByID2();
    }
    @When("I DELETE HTTP request with invalid ID with character alphabet")
    public void deleteHTTPRequestWithInvalidIDWithCharacterAlphabet() {
        product.deleteHTTPRequestWithInvalidIDWithCharacterAlphabet();
    }
    @Then("I receive valid HTTP response 400 for delete a product categories with character alphabet")
    public void receiveResponseCode400ForDeleteProductsCategoriesWithCharacterAlphabet() {
        product.receiveResponseCode400ForDeleteProductsCategoriesWithCharacterAlphabet();
    }
}
