package starter.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import starter.API.Register;

public class RegisterSteps {

    @Steps
    Register authentication;

    //Scenario: TC01 - Register using valid format fullname, email and password
    @Given("I POST register endpoints")
    public void postRegisterEndpoints() {
        authentication.postRegisterEndpoints();
    }
    @When("I POST HTTP request for register using valid data")
    public void postHTTPRequestForRegister() {
        authentication.postHTTPRequestForRegister();
    }
    @Then("I receive valid HTTP response 200 for register")
    public void receiveResponseCode200ForRegister() {
        authentication.receiveResponseCode200ForRegister();
    }

    //Scenario: TC02 - Register without using fullname
    @Given("I POST register endpoints 2")
    public void postRegisterEndpoints2() {
        authentication.postRegisterEndpoints2();
    }
    @When("I POST HTTP request for register without using fullname")
    public void postHTTPRequestForRegisterWithoutUsingFullname() {
        authentication.postHTTPRequestForRegisterWithoutUsingFullname();
    }
    @Then("I receive valid HTTP response 400 for register without using fullname")
    public void receiveResponseCode400ForRegisterWithoutUsingFullname() {
        authentication.receiveResponseCode400ForRegisterWithoutUsingFullname();
    }

    //Scenario: TC03 - Register without using email
    @Given("I POST register endpoints 3")
    public void postRegisterEndpoints3() {
        authentication.postRegisterEndpoints3();
    }
    @When("I POST HTTP request for register without using email")
    public void postHTTPRequestForRegisterWithoutUsingEmail() {
        authentication.postHTTPRequestForRegisterWithoutUsingEmail();
    }
    @Then("I receive valid HTTP response 400 for register without using email")
    public void receiveResponseCode400ForRegisterWithoutUsingEmail() {
        authentication.receiveResponseCode400ForRegisterWithoutUsingEmail();
    }

    //Scenario: TC04 - Register without using password
    @Given("I POST register endpoints 4")
    public void postRegisterEndpoints4() {
        authentication.postRegisterEndpoints4();
    }
    @When("I POST HTTP request for register without using password")
    public void postHTTPRequestForRegisterWithoutUsingPassword() {
        authentication.postHTTPRequestForRegisterWithoutUsingPassword();
    }
    @Then("I receive valid HTTP response 400 for register without using password")
    public void receiveResponseCode400ForRegisterWithoutUsingPassword() {
        authentication.receiveResponseCode400ForRegisterWithoutUsingPassword();
    }

    //Scenario: TC05 - Register with invalid format fullname
//    @Given("I POST register endpoints 5")
//    public void postRegisterEndpoints5() {
//        authentication.postRegisterEndpoints5();
//    }
//    @When("I POST HTTP request for register with invalid format fullname")
//    public void postHTTPRequestForRegisterWithInvalidFormatFullname() {
//        authentication.postHTTPRequestForRegisterWithInvalidFormatFullname();
//    }
//    @Then("I receive valid HTTP response 400 for register with invalid format fullname")
//    public void receiveResponseCode400ForRegisterWithInvalidFormatFullname() {
//        authentication.receiveResponseCode400ForRegisterWithInvalidFormatFullname();
//    }

    //Scenario: TC06 - Register with invalid format email
//    @Given("I POST register endpoints 6")
//    public void postRegisterEndpoints6() {
//        authentication.postRegisterEndpoints6();
//    }
//    @When("I POST HTTP request for register with invalid format email")
//    public void postHTTPRequestForRegisterWithInvalidFormatEmail() {
//        authentication.postHTTPRequestForRegisterWithInvalidFormatEmail();
//    }
//    @Then("I receive valid HTTP response 400 for register with invalid format email")
//    public void receiveResponseCode400ForRegisterWithInvalidFormatEmail() {
//        authentication.receiveResponseCode400ForRegisterWithInvalidFormatEmail();
//    }

    //Scenario: TC07 - Register with invalid format password
//    @Given("I POST register endpoints 7")
//    public void postRegisterEndpoints7() {
//        authentication.postRegisterEndpoints7();
//    }
//    @When("I POST HTTP request for register with invalid format password")
//    public void postHTTPRequestForRegisterWithInvalidFormatPassword() {
//        authentication.postHTTPRequestForRegisterWithInvalidFormatPassword();
//    }
//    @Then("I receive valid HTTP response 400 for register with invalid format password")
//    public void receiveResponseCode400ForRegisterWithInvalidFormatPassword() {
//        authentication.receiveResponseCode400ForRegisterWithInvalidFormatPassword();
//    }

    //Scenario: TC08 - Register with existed account
    @Given("I POST register endpoints 8")
    public void postRegisterEndpoints8() {
        authentication.postRegisterEndpoints8();
    }
    @When("I POST HTTP request for register with existed account")
    public void postHTTPRequestForRegisterWithExistedAccount() {
        authentication.postHTTPRequestForRegisterWithExistedAccount();
    }
    @Then("I receive valid HTTP response 400 for register with existed account")
    public void receiveResponseCode400ForRegisterWithExistedAccount() {
        authentication.receiveResponseCode400ForRegisterWithExistedAccount();
    }

    //Scenario: TC09 - Register with invalid payload format
    @Given("I POST register endpoints 9")
    public void postRegisterEndpoints9() {
        authentication.postRegisterEndpoints9();
    }
    @When("I POST HTTP request for register with invalid payload format")
    public void postHTTPRequestForRegisterWithInvalidPayloadFormat() {
        authentication.postHTTPRequestForRegisterWithInvalidPayloadFormat();
    }
    @Then("I receive valid HTTP response 400 for register with invalid payload format")
    public void receiveResponseCode400ForRegisterWithInvalidPayloadFormat() {
        authentication.receiveResponseCode400ForRegisterWithInvalidPayloadFormat();
    }

    //Scenario: TC10 - Register without any payload
    @Given("I POST register endpoints 10")
    public void postRegisterEndpoints10() {
        authentication.postRegisterEndpoints10();
    }
    @When("I POST HTTP request for register without any payload")
    public void postHTTPRequestForRegisterWithoutAnyPayload() {
        authentication.postHTTPRequestForRegisterWithoutAnyPayload();
    }
    @Then("I receive valid HTTP response 400 for register without any payload")
    public void receiveResponseCode400ForRegisterWithoutAnyPayload() {
        authentication.receiveResponseCode400ForRegisterWithoutAnyPayload();
    }

    //Scenario: TC11 - Register with body parameter is empty
    @Given("I POST register endpoints 11")
    public void postRegisterEndpoints11() {
        authentication.postRegisterEndpoints11();
    }
    @When("I POST HTTP request for register with body parameter is empty")
    public void postHTTPRequestForRegisterWithBodyParameterIsEmpty() {
        authentication.postHTTPRequestForRegisterWithBodyParameterIsEmpty();
    }
    @Then("I receive valid HTTP response 400 for register with body parameter is empty")
    public void receiveResponseCode400ForRegisterWithBodyParameterIsEmpty() {
        authentication.receiveResponseCode400ForRegisterWithBodyParameterIsEmpty();
    }

    //Scenario: TC12 - Register with invalid HTTP method
    @Given("I PUT register endpoints")
    public void putRegisterEndpoints() {
        authentication.putRegisterEndpoints();
    }
    @When("I send request for register with invalid HTTP method")
    public void putRequestForRegisterWithInvalidHTTPMethod() {
        authentication.putRequestForRegisterWithInvalidHTTPMethod();
    }
    @Then("I receive valid HTTP response 405 for register with invalid HTTP method")
    public void receiveResponseCode405ForRegisterWithInvalidHTTPMethod() {
        authentication.receiveResponseCode405ForRegisterWithInvalidHTTPMethod();
    }
}
