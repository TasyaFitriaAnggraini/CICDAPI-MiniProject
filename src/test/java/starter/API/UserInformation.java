package starter.API;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class UserInformation {
    protected static String url = "https://altashop-api.fly.dev/api/auth";

    //Scenario: TC22 - Get user information
    @Step("I GET user information endpoints")
    public String getUserInformationEndpoints() {
        return url + "/info";
    }
    @Step("I GET HTTP request with valid token")
    public void getHTTPRequestUserInformation() {
        SerenityRest
                .given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IldpeWFuIEhlcnJhIEhlcnZpYW5hIiwiRW1haWwiOiJ3aXlhbjEyM0BnbWFpbC5jb20ifQ.Rsm7iH_obOaXakAORv2RniUWUxeZfBjkK8S8HtuLly8")
                .get(getUserInformationEndpoints());
    }
    @Step("I receive valid HTTP response 200 for user information")
    public void receiveResponseCode200UserInformation() {
        restAssuredThat(response -> response.statusCode(200));
    }

    //Scenario: TC23 - Get user information without token
    @Step("I GET user information endpoints 2")
    public String getUserInformationEndpoints2() {
        return url + "/info";
    }
    @Step("I GET HTTP request for user information without token")
    public void getHTTPRequestForUserInformationWithoutToken() {
        SerenityRest
                .given()
                .get(getUserInformationEndpoints());
    }
    @Step("I receive valid HTTP response 401 for user information without token")
    public void receiveResponseCode401ForUserInformationWithoutToken() {
        restAssuredThat(response -> response.statusCode(401));
    }
}
