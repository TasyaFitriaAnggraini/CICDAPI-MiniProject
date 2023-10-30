package starter.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.API.Comment;

public class CommentSteps {

    @Steps
    Comment comment;

    //Scenario: TC73 - Get comment products valid endpoints
    @Given("I GET comment products endpoints")
    public void getCommentProductsEndpoints() {
        comment.getCommentProductsEndpoints();
    }
    @When("I GET HTTP request with valid data for comments products")
    public void getHTTPRequestWithValidDataForCommentsProducts() {
        comment.getHTTPRequestWithValidDataForCommentsProducts();
    }
    @Then("I receive valid HTTP response 200 for comments products")
    public void receiveResponseCode200ForCommentsProducts() {
        comment.receiveResponseCode200ForCommentsProducts();
    }

    //Scenario: TC74 - Get comment for products invalid endpoints
    @Given("I GET comment products endpoints 2")
    public void getCommentProductsEndpoints2() {
        comment.getCommentProductsEndpoints2();
    }
    @Then("I GET HTTP request for comments products using invalid endpoints")
    public void getHTTPRequestForCommentProductsUsingInvalidEndpoints() {
        comment.getHTTPRequestForCommentProductsUsingInvalidEndpoints();
    }
    @When("I receive valid HTTP response 404 for comments products using invalid endpoints")
    public void receiveResponseCode404ForCommentProductsUsingInvalidEndpoints() {
        comment.receiveResponseCode404ForCommentProductsUsingInvalidEndpoints();
    }

    //Scenario: TC75 - Create a comment for products
    @Given("I POST create a comment for products endpoints")
    public void postCreateCommentForProductsEndpoints() {
        comment.postCreateCommentForProductsEndpoints();
    }
    @When("I POST HTTP request create a comment for products")
    public void postHTTPRequestCreateCommentForProducts() {
        comment.postHTTPRequestCreateCommentForProducts();
    }
    @Then("I receive valid HTTP response 200 for create comment products")
    public void receiveResponseCode200ForCreateCommentProducts() {
        comment.receiveResponseCode200ForCreateCommentProducts();
    }

    //Scenario: TC76 - Create a comment product invalid by ID with character symbols
    @Given("I POST create a comment for products endpoints by ID")
    public void postCreateCommentForProductsEndpointsByID() {
        comment.postCreateCommentForProductsEndpointsByID();
    }
    @When("I POST HTTP request for comment products invalid by ID with character symbols")
    public void postHTTPRequestForCommentProductsInvalidByIDWithCharacterSymbols() {
        comment.postHTTPRequestForCommentProductsInvalidByIDWithCharacterSymbols();
    }
    @Then("I receive valid HTTP response 500 for comment products invalid by ID with character symbols")
    public void receiveResponseCode401ForCommentProductsInvalidByIDWithCharacterSymbols() {
        comment.receiveResponseCode502ForCommentProductsInvalidByIDWithCharacterSymbols();
    }

    //Scenario: TC77 - Create a comment product invalid by ID with character alphabet
    @Given("I POST create a comment for products endpoints by ID 2")
    public void postCreateCommentForProductsEndpointsByID2() {
        comment.postCreateCommentForProductsEndpointsByID2();
    }
    @When("I POST HTTP request for comment products invalid by ID with character alphabet")
    public void postHTTPRequestForCommentProductsInvalidByIDWithCharacterAlphabet() {
        comment.postHTTPRequestForCommentProductsInvalidByIDWithCharacterAlphabet();
    }
    @Then("I receive valid HTTP response 400 for comment products invalid by ID with character alphabet")
    public void receiveResponseCode400ForCommentProductsInvalidByIDWithCharacterAlphabet() {
        comment.receiveResponseCode400ForCommentProductsInvalidByIDWithCharacterAlphabet();
    }

    //Scenario: TC78 - Create a comment for products with body parameter is empty
    @Given("I POST create a comment for products endpoints 2")
    public void postCreateCommentForProductsEndpoints2() {
        comment.postCreateCommentForProductsEndpoints2();
    }
    @When("I POST HTTP request for comment products with body parameter is empty")
    public void postHTTPRequestForCommentProductsWithBodyParameterIsEmpty() {
        comment.postHTTPRequestForCommentProductsWithBodyParameterIsEmpty();
    }
    @Then("I receive valid HTTP response 401 for comment products with body parameter is empty")
    public void receiveResponseCode401ForCommentProductsWithBodyParameterIsEmpty() {
        comment.receiveResponseCode401ForCommentProductsWithBodyParameterIsEmpty();
    }
}
