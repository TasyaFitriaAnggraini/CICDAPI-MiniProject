package starter.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.API.UserInformation;

public class UserInformationSteps {

    @Steps
    UserInformation userInformation;

    //Scenario: TC22 - Get user information
    @Given("I GET user information endpoints")
    public void getUserInformationEndpoints() {
        userInformation.getUserInformationEndpoints();
    }
    @When("I GET HTTP request with valid token")
    public void getHTTPRequestUserInformation() {
        userInformation.getHTTPRequestUserInformation();
    }
    @Then("I receive valid HTTP response 200 for user information")
    public void receiveResponseCode200UserInformation() {
        userInformation.receiveResponseCode200UserInformation();
    }

    //Scenario: TC23 - Get user information without token
    @Given("I GET user information endpoints 2")
    public void getUserInformationEndpoints2() {
        userInformation.getUserInformationEndpoints2();
    }
    @When("I GET HTTP request for user information without token")
    public void getHTTPRequestForUserInformationWithoutToken() {
        userInformation.getHTTPRequestForUserInformationWithoutToken();
    }
    @Then("I receive valid HTTP response 401 for user information without token")
    public void receiveResponseCode401ForUserInformationWithoutToken() {
        userInformation.receiveResponseCode401ForUserInformationWithoutToken();
    }
}
