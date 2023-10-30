package starter.stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.API.Orders;

public class OrdersSteps {

    @Steps
    Orders orders;

    //Scenario: TC56 - Add new orders
    @Given("I POST add new orders endpoints")
    public void postAddNewOrdersEndpoints() {
        orders.postAddNewOrdersEndpoints();
    }
    @When("I POST HTTP request for add new orders with valid data")
    public void postHTTPRequestAddNewOrdersWithValidData() {
        orders.postHTTPRequestAddNewOrdersWithValidData();
    }
    @Then("I receive valid HTTP response 200 for add new orders")
    public void receiveResponsceCode200ForAddNewOrders() {
        orders.receiveResponsceCode200ForAddNewOrders();
    }

    //Scenario: TC57 - Add new orders without set the token
    @Given("I POST add new orders endpoints 2")
    public void postAddNewOrdersEndpoints2() {
        orders.postAddNewOrdersEndpoints2();
    }
    @When("I POST HTTP request for add new orders without set the token")
    public void postHTTPRequestForAddNewOrdersWithoutSetTheToken() {
        orders.postHTTPRequestForAddNewOrdersWithoutSetTheToken();
    }
    @Then("I receive valid HTTP response 401 for add new orders without set the token")
    public void receiveResponseCode401ForAddNewOrdersWithoutSetTheToken() {
        orders.receiveResponseCode401ForAddNewOrdersWithoutSetTheToken();
    }

    //Scenario: TC58 - Add new orders with invalid quantity data payload
//    @Given("I POST add new orders endpoints 3")
//    public void postAddNewOrdersEndpoints3() {
//        orders.postAddNewOrdersEndpoints3();
//    }
//    @When("I POST HTTP request for add new orders with invalid quantity data payload")
//    public void postHTTPRequestForAddNewOrdersWithInvalidQuantityDataPayload() {
//        orders.postHTTPRequestForAddNewOrdersWithInvalidQuantityDataPayload();
//    }
//    @Then("I receive valid HTTP response 400 for add new orders with invalid quantity data payload")
//    public void receiveResponseCode400ForAddNewOrdersWithInvalidQuantityDataPayload() {
//        orders.receiveResponseCode400ForAddNewOrdersWithInvalidQuantityDataPayload();
//    }

    //Scenario: TC59 - Add new orders with invalid payload format
//    @Given("I POST add new orders endpoints 4")
//    public void postAddNewOrdersEndpoints4() {
//        orders.postAddNewOrdersEndpoints4();
//    }
//    @When("I POST HTTP request for add new orders with invalid payload format")
//    public void postHTTPRequestForAddNewOrdersWithInvalidPayloadFormat() {
//        orders.postHTTPRequestForAddNewOrdersWithInvalidPayloadFormat();
//    }
//    @Then("I receive valid HTTP response 400 for add new orders with with invalid payload format")
//    public void receiveResponseCode400ForAddNewOrdersWithInvalidPayloadFormat() {
//        orders.receiveResponseCode400ForAddNewOrdersWithInvalidPayloadFormat();
//    }

    //Scenario: TC60 - Get all orders
    @Given("I GET all orders endpoints")
    public void getAllOrdersEndpoints() {
        orders.getAllOrdersEndpoints();
    }
    @When("I GET HTTP request with valid endpoints for get all orders")
    public void getHTTPRequestAllOrders() {
        orders.getHTTPRequestAllOrders();
    }
    @Then("I receive valid HTTP response 200 for get all orders")
    public void receiveResponseCode200GetAllOrders() {
        orders.receiveResponseCode200GetAllOrders();
    }

    //Scenario: TC61 - Get all orders without token
    @Given("I GET all orders endpoints 2")
    public void getAllProductsEndpoints2() {
        orders.getAllProductsEndpoints2();
    }
    @When("I GET HTTP request for get all orders without token")
    public void getHTTPRequestForGetAllOrdersWithoutToken() {
        orders.getHTTPRequestForGetAllOrdersWithoutToken();
    }
    @Then("I receive valid HTTP response 401 for get all orders without token")
    public void receiveResponseCode401ForGetAllOrdersWithoutToken() {
        orders.receiveResponseCode401ForGetAllOrdersWithoutToken();
    }

    //Scenario: TC62 - Get order by ID
    @Given("I GET orders endpoints by ID")
    public void getOrderEndpointsByID() {
        orders.getOrderEndpointsByID();
    }
    @When("I GET orders HTTP request with valid ID")
    public void getHTTPRequestOrdersByID() {
        orders.getHTTPRequestOrdersByID();
    }
    @Then("I receive valid HTTP response 200 for get order by ID")
    public void receiveResponseCode200GetOrderByID() {
        orders.receiveResponseCode200GetOrderByID();
    }

    //Scenario: TC63 - Get orders by invalid ID with character symbols
    @Given("I GET orders endpoints by ID 2")
    public void getOrdersEndpointsByID2() {
        orders.getOrdersEndpointsByID2();
    }
    @When("I GET orders HTTP request invalid ID with character symbols")
    public void getOrdersHTTPRequestWithInvalidIDWithCharacterSymbols() {
        orders.getOrdersHTTPRequestWithInvalidIDWithCharacterSymbols();
    }
    @Then("I receive valid HTTP response 401 for get orders by invalid ID with character symbols")
    public void receiveResponseCode401ForGetOrdersByInvalidIDWithCharacterSymbols() {
        orders.receiveResponseCode401ForGetOrdersByInvalidIDWithCharacterSymbols();
    }

    //Scenario:TC64 - Get orders by invalid ID with character alphabet
    @Given("I GET orders endpoints by ID 3")
    public void getOrdersEndpointsByID3() {
        orders.getOrdersEndpointsByID3();
    }
    @When("I GET orders HTTP request invalid ID with character alphabet")
    public void getOrdersHTTPRequestWithInvalidIDWithCharacterAlphabet() {
        orders.getOrdersHTTPRequestWithInvalidIDWithCharacterAlphabet();
    }
    @Then("I receive valid HTTP response 401 for get orders by invalid ID with character alphabet")
    public void receiveResponseCode401ForGetOrdersByInvalidIDWithCharacterAlphabet() {
        orders.receiveResponseCode401ForGetOrdersByInvalidIDWithCharacterAlphabet();
    }
}
