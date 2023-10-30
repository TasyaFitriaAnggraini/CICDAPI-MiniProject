package starter.API;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Login {
    protected static String url = "https://altashop-api.fly.dev/api/auth";

    //Scenario: TC13 - Login valid account
    @Step("I POST login endpoints")
    public String postLoginEndpoints() {
        return url + "/login";
    }
    @Step("I POST HTTP request for login using valid data")
    public void postHTTPRequestForLogin() {
        JSONObject body = new JSONObject();
        body.put("email", "tasyafangg@gmail.com");
        body.put("password", "Sezzle2021");

        SerenityRest
                .given()
                .header("Content-Type", "application/json")
                .body(body.toJSONString())
                .post(postLoginEndpoints());
    }
    @Step("I receive valid HTTP response 200 for login")
    public void receiveResponseCode200ForLogin() {
        restAssuredThat(response -> response.statusCode(200));
    }

    //Scenario: TC14 - Login using valid account but empty email
    @Step("I POST login endpoints 2")
    public String postLoginEndpoints2() {
        return url + "/login";
    }
    @Step("I POST HTTP request for login using valid account but empty email")
    public void postHTTPRequestForLoginUsingValidAccountButEmptyEmail() {
        JSONObject body = new JSONObject();
        body.put("email", "");
        body.put("password", "Sezzle2021");

        SerenityRest
                .given()
                .header("Content-Type", "application/json")
                .body(body.toJSONString())
                .post(postLoginEndpoints2());
    }
    @Step("I receive valid HTTP response 400 for login using valid account but empty email")
    public void receiveResponseCode400ForLoginUsingValidAccountButEmptyEmail() {
        restAssuredThat(response -> response.statusCode(400));
    }

    //Scenario: TC15 - Login using valid account but empty password
    @Step("I POST login endpoints 3")
    public String postLoginEndpoints3() {
        return url + "/login";
    }
    @Step("I POST HTTP request for login using valid account but empty password")
    public void postHTTPRequestForLoginUsingValidAccountButEmptyPassword() {
        JSONObject body = new JSONObject();
        body.put("email", "tasyafangg@gmail.com");
        body.put("password", "");

        SerenityRest
                .given()
                .header("Content-Type", "application/json")
                .body(body.toJSONString())
                .post(postLoginEndpoints3());
    }
    @Step("I receive valid HTTP response 400 for login using valid account but empty password")
    public void receiveResponseCode400ForLoginUsingValidAccountButEmptyPassword() {
        restAssuredThat(response -> response.statusCode(400));
    }

    //Scenario: TC16 - Login with valid account but change email with password and password with email
    @Step("I POST login endpoints 4")
    public String postLoginEndpoint4() {
        return url + "/login";
    }
    @Step("I POST HTTP request for login with valid account but change email with password and password with email")
    public void postHTTPRequestForLoginWithValidAccoutButChangeEmailWithPasswordAndPasswordWithEmail() {
        JSONObject body = new JSONObject();
        body.put("email", "Sezzle2021");
        body.put("password", "tasyafangg@gmail.com");

        SerenityRest
                .given()
                .header("Content-Type", "application/json")
                .body(body.toJSONString())
                .post(postLoginEndpoint4());
    }
    @Step("I receive valid HTTP response 400 for login with valid account but change email with password and password with email")
    public void receiveResponseCode400ForLoginWithValidAccoutButChangeEmailWithPasswordAndPasswordWithEmail() {
        restAssuredThat(response -> response.statusCode(400));
    }

    //Scenario: TC17 - Login with valid account but change the email payload with fullname
    @Step("I POST login endpoints 5")
    public String postLoginEndpoints5() {
        return url + "/login";
    }
    @Step("I POST HTTP request for login with valid account but change the email payload with fullname")
    public void postHTTPRequestForLoginWithValidAccountButChangeTheEmailPayloadWithFullname() {
        JSONObject body = new JSONObject();
        body.put("email", "Tasya Fitria Anggraini");
        body.put("password", "Sezzle2021");

        SerenityRest
                .given()
                .header("Content-Type", "application/json")
                .body(body.toJSONString())
                .post(postLoginEndpoints5());
    }
    @Step("I receive valid HTTP response 400 for login with valid account but change the email payload with fullname")
    public void receiveResponseCode400ForLoginWithValidAccountButChangeTheEmailPayloadWithFullname() {
        restAssuredThat(response -> response.statusCode(400));
    }

    //Scenario: TC18 - Login without payload
    @Step("I POST login endpoints 6")
    public String postLoginEndpoints6() {
        return url + "/login";
    }
    @Step("I POST HTTP request for login without payload")
    public void postHTTPRequestForLoginWithoutPayload() {
        JSONObject body = new JSONObject();

        SerenityRest
                .given()
                .header("Content-Type", "application/json")
                .body(body.toJSONString())
                .post(postLoginEndpoints6());
    }
    @Step("I receive valid HTTP response 400 for login without payload")
    public void receiveResponseCode400ForLoginWithoutPayload() {
        restAssuredThat(response -> response.statusCode(400));
    }

    //Scenario: TC19 - Login with invalid format payload
    @Step("I POST login endpoints 7")
    public String postLoginEndpoints7() {
        return url + "/login";
    }
    @Step("I POST HTTP request for login with invalid format payload")
    public void postHTTPRequestForLoginWithInvalidFormatPayload() {
        JSONObject body = new JSONObject();
        body.put("mail", "tasyafangg@gmail.com");
        body.put("pass", "Sezzle2021");

        SerenityRest
                .given()
                .header("Content-Type", "application/json")
                .body(body.toJSONString())
                .post(postLoginEndpoints7());
    }
    @Step("I receive valid HTTP response 400 for login with invalid format payload")
    public void receiveResponseCode400ForLoginWithInvalidFormatPayload() {
        restAssuredThat(response -> response.statusCode(400));
    }

    //Scenario: TC20 - Login with body parameter is empty
    @Step("I POST login endpoints 8")
    public String postLoginEndpoints8() {
        return url + "/login";
    }
    @Step("I POST HTTP request for login with body parameter is empty")
    public void postHTTPRequestForLoginWithBodyParameterIsEmpty() {
        JSONObject body = new JSONObject();
        body.put("email", "");
        body.put("password", "");

        SerenityRest
                .given()
                .header("Content-Type", "application/json")
                .body(body.toJSONString())
                .post(postLoginEndpoints8());
    }
    @Step("I receive valid HTTP response 400 for login with body parameter is empty")
    public void receiveResponseCode400ForLoginWithBodyParameterIsEmpty() {
        restAssuredThat(response -> response.statusCode(400));
    }

    //Scenario: TC21 - Login with invalid HTTP method
    @Step("I POST login endpoints 9")
    public String postLoginEndpoints9() {
        return url + "/login";
    }
    @Step("I send request for login with invalid HTTP method")
    public void postHTTPRequestForLoginWithInvalidHTTPMethod() {
        JSONObject body = new JSONObject();
        body.put("email", "tasyafangg@gmail.com");
        body.put("password", "Sezzle2021");

        SerenityRest
                .given()
                .header("Content-Type", "application/json")
                .body(body.toJSONString())
                .put(postLoginEndpoints9());
    }
    @Step("I receive valid HTTP response 405 for login with invalid HTTP method")
    public void receiveResponseCode405ForLoginWithInvalidHTTPMethod() {
        restAssuredThat(response -> response.statusCode(405));
    }
}
