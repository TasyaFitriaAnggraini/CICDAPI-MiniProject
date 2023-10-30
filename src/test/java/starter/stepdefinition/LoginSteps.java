package starter.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.API.Login;

public class LoginSteps {

    @Steps
    Login login;

    //Scenario: TC13 - Login
    @Given("I POST login endpoints")
    public void postLoginEndpoints() {
        login.postLoginEndpoints();
    }
    @When("I POST HTTP request for login using valid data")
    public void postHTTPRequestForLogin() {
        login.postHTTPRequestForLogin();
    }
    @Then("I receive valid HTTP response 200 for login")
    public void receiveResponseCode200ForLogin() {
        login.receiveResponseCode200ForLogin();
    }

    //Scenario: TC14 - Login using valid account but empty email
    @Given("I POST login endpoints 2")
    public void postLoginEndpoints2() {
        login.postLoginEndpoints2();
    }
    @When("I POST HTTP request for login using valid account but empty email")
    public void postHTTPRequestForLoginUsingValidAccountButEmptyEmail() {
        login.postHTTPRequestForLoginUsingValidAccountButEmptyEmail();
    }
    @Then("I receive valid HTTP response 400 for login using valid account but empty email")
    public void receiveResponseCode400ForLoginUsingValidAccountButEmptyEmail() {
        login.receiveResponseCode400ForLoginUsingValidAccountButEmptyEmail();
    }

    //Scenario: TC15 - Login using valid account but empty password
    @Given("I POST login endpoints 3")
    public void postLoginEndpoints3() {
        login.postLoginEndpoints3();
    }
    @When("I POST HTTP request for login using valid account but empty password")
    public void postHTTPRequestForLoginUsingValidAccountButEmptyPassword() {
        login.postHTTPRequestForLoginUsingValidAccountButEmptyPassword();
    }
    @Then("I receive valid HTTP response 400 for login using valid account but empty password")
    public void receiveResponseCode400ForLoginUsingValidAccountButEmptyPassword() {
        login.receiveResponseCode400ForLoginUsingValidAccountButEmptyPassword();
    }

    //Scenario: TC16 - Login with valid account but change email with password and password with email
    @Given("I POST login endpoints 4")
    public void postLoginEndpoint4() {
        login.postLoginEndpoint4();
    }
    @When("I POST HTTP request for login with valid account but change email with password and password with email")
    public void postHTTPRequestForLoginWithValidAccoutButChangeEmailWithPasswordAndPasswordWithEmail() {
        login.postHTTPRequestForLoginWithValidAccoutButChangeEmailWithPasswordAndPasswordWithEmail();
    }
    @Then("I receive valid HTTP response 400 for login with valid account but change email with password and password with email")
    public void receiveResponseCode400ForLoginWithValidAccoutButChangeEmailWithPasswordAndPasswordWithEmail() {
        login.receiveResponseCode400ForLoginWithValidAccoutButChangeEmailWithPasswordAndPasswordWithEmail();
    }

    //Scenario: TC17 - Login with valid account but change the email payload with fullname
    @Given("I POST login endpoints 5")
    public void postLoginEndpoints5() {
        login.postLoginEndpoints5();
    }
    @When("I POST HTTP request for login with valid account but change the email payload with fullname")
    public void postHTTPRequestForLoginWithValidAccountButChangeTheEmailPayloadWithFullname() {
        login.postHTTPRequestForLoginWithValidAccountButChangeTheEmailPayloadWithFullname();
    }
    @Then("I receive valid HTTP response 400 for login with valid account but change the email payload with fullname")
    public void receiveResponseCode400ForLoginWithValidAccountButChangeTheEmailPayloadWithFullname() {
        login.receiveResponseCode400ForLoginWithValidAccountButChangeTheEmailPayloadWithFullname();
    }

    //Scenario: TC18 - Login without payload
    @Given("I POST login endpoints 6")
    public void postLoginEndpoints6() {
        login.postLoginEndpoints6();
    }
    @When("I POST HTTP request for login without payload")
    public void postHTTPRequestForLoginWithoutPayload() {
        login.postHTTPRequestForLoginWithoutPayload();
    }
    @Then("I receive valid HTTP response 400 for login without payload")
    public void receiveResponseCode400ForLoginWithoutPayload() {
        login.receiveResponseCode400ForLoginWithoutPayload();
    }

    //Scenario: TC19 - Login with invalid format payload
    @Given("I POST login endpoints 7")
    public void postLoginEndpoints7() {
        login.postLoginEndpoints7();
    }
    @When("I POST HTTP request for login with invalid format payload")
    public void postHTTPRequestForLoginWithInvalidFormatPayload() {
        login.postHTTPRequestForLoginWithInvalidFormatPayload();
    }
    @Then("I receive valid HTTP response 400 for login with invalid format payload")
    public void receiveResponseCode400ForLoginWithInvalidFormatPayload() {
        login.receiveResponseCode400ForLoginWithInvalidFormatPayload();
    }

    //Scenario: TC20 - Login with body parameter is empty
    @Given("I POST login endpoints 8")
    public void postLoginEndpoints8() {
        login.postLoginEndpoints8();
    }
    @When("I POST HTTP request for login with body parameter is empty")
    public void postHTTPRequestForLoginWithBodyParameterIsEmpty() {
        login.postHTTPRequestForLoginWithBodyParameterIsEmpty();
    }
    @Then("I receive valid HTTP response 400 for login with body parameter is empty")
    public void receiveResponseCode400ForLoginWithBodyParameterIsEmpty() {
        login.receiveResponseCode400ForLoginWithBodyParameterIsEmpty();
    }

    //Scenario: TC21 - Login with invalid HTTP method
    @Given("I PUT login endpoints 9")
    public void postLoginEndpoints9() {
        login.postLoginEndpoints9();
    }
    @When("I send request for login with invalid HTTP method")
    public void postHTTPRequestForLoginWithInvalidHTTPMethod() {
        login.postHTTPRequestForLoginWithInvalidHTTPMethod();
    }
    @Then("I receive valid HTTP response 405 for login with invalid HTTP method")
    public void receiveResponseCode405ForLoginWithInvalidHTTPMethod() {
        login.receiveResponseCode405ForLoginWithInvalidHTTPMethod();
    }
}
