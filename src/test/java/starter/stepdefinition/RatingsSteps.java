package starter.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.API.Ratings;

public class RatingsSteps {

    @Steps
    Ratings ratings;

    //Scenario: TC65 - Give products ratings
    @Given("I POST give products ratings endpoints")
    public void postGiveProductsRatingsEndpoints() {
        ratings.postGiveProductsRatingsEndpoints();
    }
    @When("I POST HTTP request for give products ratings")
    public void postHTTPRequestForGiveProductsRatings() {
        ratings.postHTTPRequestForGiveProductsRatings();
    }
    @Then("I receive valid HTTP response 200 for give products ratings")
    public void receiveValidHTTPResponse200ForGiveProductsRatings() {
        ratings.receiveValidHTTPResponse200ForGiveProductsRatings();
    }

    //Scenario: TC66 - Give product ratings without setting token
    @Given("I POST give products ratings endpoints 2")
    public void postGiveProductsRatingsEndpoints2() {
        ratings.postGiveProductsRatingsEndpoints2();
    }
    @When("I POST HTTP request for give products ratings without setting token")
    public void postHTTPRequestForGiveProductsRatingsWithoutSettingToken() {
        ratings.postHTTPRequestForGiveProductsRatingsWithoutSettingToken();
    }
    @Then("I receive valid HTTP response 401 for give products ratings without setting token")
    public void receiveResponseCode401ForGiveProductsRatingsWithoutSettingToken() {
        ratings.receiveResponseCode401ForGiveProductsRatingsWithoutSettingToken();
    }

    //Scenario: TC67 - Give product ratings with invalid count data payload
//    @Given("I POST give products ratings endpoints 3")
//    public void postGiveProductsRatingsEndpoints3() {
//        ratings.postGiveProductsRatingsEndpoints3();
//    }
//    @When("I POST HTTP request for give products ratings with invalid count data payload")
//    public void postHTTPRequestForGiveProductsRatingsWithInvalidCountDataPayload() {
//        ratings.postHTTPRequestForGiveProductsRatingsWithInvalidCountDataPayload();
//    }
//    @Then("I receive valid HTTP response 400 for give products ratings with invalid count data payload")
//    public void receiveResponseCode400ForGiveProductsRatingsWithInvalidCountDataPayload() {
//        ratings.receiveResponseCode400ForGiveProductsRatingsWithInvalidCountDataPayload();
//    }

    //Scenario: TC68 - Give products ratings with unavailable
    @Given("I POST give products ratings endpoints 4")
    public void postGiveProductsRatingsEndpoints4() {
        ratings.postGiveProductsRatingsEndpoints4();
    }
    @When("I POST HTTP request for give products ratings with unavailable")
    public void postHTTPRequestForGiveProductsRatingsWithUnavailable() {
        ratings.postHTTPRequestForGiveProductsRatingsWithUnavailable();
    }
    @Then("I receive valid HTTP response 401 for give products ratings with unavailable")
    public void receiveResponseCode401ForGiveProductsRatingsWithUnavailable() {
        ratings.receiveResponseCode401ForGiveProductsRatingsWithUnavailable();
    }

    //Scenario: TC69 - Give products ratings with invalid HTTP method
    @Given("I set PUT give products ratings endpoints")
    public void putGiveProductsRatingsEndpoints() {
        ratings.putGiveProductsRatingsEndpoints();
    }
    @When("I send HTTP request for give products ratings with invalid HTTP method")
    public void sendHTTPRequestForGiveProductsRatingsWithInvalidHTTPMethod() {
        ratings.sendHTTPRequestForGiveProductsRatingsWithInvalidHTTPMethod();
    }
    @Then("I receive valid HTTP response 405 for give products ratings with invalid HTTP method")
    public void receiveResponseCode405ForGiveProductsRatingsWithInvalidHTTPMethod() {
        ratings.receiveResponseCode405ForGiveProductsRatingsWithInvalidHTTPMethod();
    }

    //Scenario: TC70 - Get products ratings
    @Given("I GET products ratings endpoints")
    public void getProductsRatingsEndpoints() {
        ratings.getProductsRatingsEndpoints();
    }
    @When("I GET HTTP request for products ratings")
    public void getHTTPRequestForProductsRatings() {
        ratings.getHTTPRequestForProductsRatings();
    }
    @Then("I receive valid HTTP response 200 for get products ratings")
    public void receiveResponseCode200ForProductsRatings() {
        ratings.receiveResponseCode200ForProductsRatings();
    }

    //Scenario: TC71 - Get product rating using invalid product ID with character symbols
    @Given("I GET products ratings endpoints by ID")
    public void getProductsRatingsEndpointsByID() {
        ratings.getProductsRatingsEndpointsByID();
    }
    @When("I GET HTTP request for products ratings using invalid products ID with character symbols")
    public void getHTTPRequestForProductsRatingsUsingInvalidProductsIDWithCharacterSymbols() {
        ratings.getHTTPRequestForProductsRatingsUsingInvalidProductsIDWithCharacterSymbols();
    }
    @Then("I receive valid HTTP response 500 for get products ratings using invalid product ID with character symbols")
    public void receiveResponseCode500ForProductsRatingsUsingInvalidProductsIDWithCharacterSymbols() {
        ratings.receiveResponseCode500ForProductsRatingsUsingInvalidProductsIDWithCharacterSymbols();
    }

    //Scenario: TC72 - Get product rating using invalid product id with character alphabet
    @Given("I GET products ratings endpoints by ID 2")
    public void getProductsRatingsEndpointsByID2() {
        ratings.getProductsRatingsEndpointsByID2();
    }
    @When("I GET HTTP request for products ratings using invalid products ID with character alphabet")
    public void getHTTPRequestForProductsRatingsUsingInvalidProductsIDWithCharacterAlphabet() {
        ratings.getHTTPRequestForProductsRatingsUsingInvalidProductsIDWithCharacterAlphabet();
    }
    @Then("I receive valid HTTP response 400 for get products ratings using invalid product ID with character alphabet")
    public void receiveResponseCode400ForProductsRatingsUsingInvalidProductsIDWithCharacterAlphabet() {
        ratings.receiveResponseCode400ForProductsRatingsUsingInvalidProductsIDWithCharacterAlphabet();
    }
}
