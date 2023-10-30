package starter.API;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Register {

    protected static String url = "https://altashop-api.fly.dev/api/auth";

    //Scenario: TC01 - Register using valid format fullname, email and password
    @Step("I POST register endpoints")
    public String postRegisterEndpoints() {
        return url + "/register";
    }
    @Step("I POST HTTP request for register using valid data")
    public void postHTTPRequestForRegister() {
        JSONObject body = new JSONObject();
        body.put("email", "wiyan2@gmail.com");
        body.put("password", "wiyan123");
        body.put("fullname", "Wiyan Herra Herviana");

        SerenityRest
                .given()
                .header("Content-Type", "application/json")
                .body(body.toJSONString())
                .post(postRegisterEndpoints());
    }
    @Step("I receive valid HTTP response 200 for register")
    public void receiveResponseCode200ForRegister() {
        restAssuredThat(response -> response.statusCode(200));
    }

    //Scenario: TC02 - Register without using fullname
    @Step("I POST register endpoints 2")
    public String postRegisterEndpoints2() {
        return url + "/register";
    }
    @Step("I POST HTTP request for register without using fullname")
    public void postHTTPRequestForRegisterWithoutUsingFullname() {
        JSONObject body = new JSONObject();
        body.put("email", "wiyan123@gmail.com");
        body.put("password", "wiyan123");
        body.put("fullname", "");

        SerenityRest
                .given()
                .header("Content-Type", "application/json")
                .body(body.toJSONString())
                .post(postRegisterEndpoints2());
    }
    @Step("I receive valid HTTP response 400 for register without using fullname")
    public void receiveResponseCode400ForRegisterWithoutUsingFullname() {
        restAssuredThat(response -> response.statusCode(400));
    }

    //Scenario: TC03 - Register without using email
    @Step("I POST register endpoints 3")
    public String postRegisterEndpoints3() {
        return url + "/register";
    }
    @Step("I POST HTTP request for register without using email")
    public void postHTTPRequestForRegisterWithoutUsingEmail() {
        JSONObject body = new JSONObject();
        body.put("email", "");
        body.put("password", "wiyan123");
        body.put("fullname", "Wiyan Herra Herviana");

        SerenityRest
                .given()
                .header("Content-Type", "application/json")
                .body(body.toJSONString())
                .post(postRegisterEndpoints3());
    }

    @Step("I receive valid HTTP response 400 for register without using email")
    public void receiveResponseCode400ForRegisterWithoutUsingEmail() {
        restAssuredThat(response -> response.statusCode(400));
    }

    //Scenario: TC04 - Register without using password
    @Step("I POST register endpoints 4")
    public String postRegisterEndpoints4() {
        return url + "/register";
    }
    @Step("I POST HTTP request for register without using password")
    public void postHTTPRequestForRegisterWithoutUsingPassword() {
        JSONObject body = new JSONObject();
        body.put("email", "wiyan123@gmail.com");
        body.put("password", "");
        body.put("fullname", "Wiyan Herra Herviana");

        SerenityRest
                .given()
                .header("Content-Type", "application/json")
                .body(body.toJSONString())
                .post(postRegisterEndpoints4());
    }
    @Step("I receive valid HTTP response 400 for register without using password")
    public void receiveResponseCode400ForRegisterWithoutUsingPassword() {
        restAssuredThat(response -> response.statusCode(400));
    }

    //Scenario: TC05 - Register with invalid format fullname
//    @Step("I POST register endpoints 5")
//    public String postRegisterEndpoints5() {
//        return url + "/register";
//    }
//    @Step("I POST HTTP request for register with invalid format fullname")
//    public void postHTTPRequestForRegisterWithInvalidFormatFullname() {
//        JSONObject body = new JSONObject();
//        body.put("email", "wiyanalta2@gmail.com");
//        body.put("password", "wiyan123");
//        body.put("fullname", "  ");
//
//        SerenityRest
//                .given()
//                .header("Content-Type", "application/json")
//                .body(body.toJSONString())
//                .post(postRegisterEndpoints5());
//    }
//    @Step("I receive valid HTTP response 400 for register with invalid format fullname")
//    public void receiveResponseCode400ForRegisterWithInvalidFormatFullname() {
//        restAssuredThat(response -> response.statusCode(400));
//    }

    //Scenario: TC06 - Register with invalid format email
//    @Step("I POST register endpoints 6")
//    public String postRegisterEndpoints6() {
//        return url + "/register";
//    }
//    @Step("I POST HTTP request for register with invalid format email")
//    public void postHTTPRequestForRegisterWithInvalidFormatEmail() {
//        JSONObject body = new JSONObject();
//        body.put("email", "  ");
//        body.put("password", "wiyan123");
//        body.put("fullname", "Wiyan Herra Herviana");
//
//        SerenityRest
//                .given()
//                .header("Content-Type", "application/json")
//                .body(body.toJSONString())
//                .post(postRegisterEndpoints6());
//    }
//    @Step("I receive valid HTTP response 400 for register with invalid format email")
//    public void receiveResponseCode400ForRegisterWithInvalidFormatEmail() {
//        restAssuredThat(response -> response.statusCode(400));
//    }

    //Scenario: TC07 - Register with invalid format password
//    @Step("I POST register endpoints 7")
//    public String postRegisterEndpoints7() {
//        return url + "/register";
//    }
//    @Step("I POST HTTP request for register with invalid format password")
//    public void postHTTPRequestForRegisterWithInvalidFormatPassword() {
//        JSONObject body = new JSONObject();
//        body.put("email", "wiyanalta3@gmail.com");
//        body.put("password", "  ");
//        body.put("fullname", "Wiyan Herra Herviana");
//
//        SerenityRest
//                .given()
//                .header("Content-Type", "application/json")
//                .body(body.toJSONString())
//                .post(postRegisterEndpoints7());
//    }
//    @Step("I receive valid HTTP response 400 for register with invalid format password")
//    public void receiveResponseCode400ForRegisterWithInvalidFormatPassword() {
//        restAssuredThat(response -> response.statusCode(400));
//    }

    //Scenario: TC08 - Register with existed account
    @Step("I POST register endpoints 8")
    public String postRegisterEndpoints8() {
        return url + "/register";
    }
    @Step("I POST HTTP request for register with existed account")
    public void postHTTPRequestForRegisterWithExistedAccount() {
        JSONObject body = new JSONObject();
        body.put("email", "anandatest1@gmail.com");
        body.put("password", "Nandatest1");
        body.put("fullname", "Ananda Dwi Rizkyta");

        SerenityRest
                .given()
                .header("Content-Type", "application/json")
                .body(body.toJSONString())
                .post(postRegisterEndpoints8());
    }
    @Step("I receive valid HTTP response 400 for register with existed account")
    public void receiveResponseCode400ForRegisterWithExistedAccount() {
        restAssuredThat(response -> response.statusCode(400));
    }

    //Scenario: TC09 - Register with invalid payload format
    @Step("I POST register endpoints 9")
    public String postRegisterEndpoints9() {
        return url + "/register";
    }
    @Step("I POST HTTP request for register with invalid payload format")
    public void postHTTPRequestForRegisterWithInvalidPayloadFormat() {
        JSONObject body = new JSONObject();
        body.put("mail", "wiyan123@gmail.com");
        body.put("pass", "wiyan123");
        body.put("fullnme", "Wiyan Herra Herviana");

        SerenityRest
                .given()
                .header("Content-Type", "application/json")
                .body(body.toJSONString())
                .post(postRegisterEndpoints9());
    }
    @Step("I receive valid HTTP response 400 for register with invalid payload format")
    public void receiveResponseCode400ForRegisterWithInvalidPayloadFormat() {
        restAssuredThat(response -> response.statusCode(400));
    }

    //Scenario: TC10 - Register without any payload
    @Step("I POST register endpoints 10")
    public String postRegisterEndpoints10() {
        return url + "/register";
    }
    @Step("I POST HTTP request for register without any payload")
    public void postHTTPRequestForRegisterWithoutAnyPayload() {
        JSONObject body = new JSONObject();

        SerenityRest
                .given()
                .header("Content-Type", "application/json")
                .body(body.toJSONString())
                .post(postRegisterEndpoints10());
    }
    @Step("I receive valid HTTP response 400 for register without any payload")
    public void receiveResponseCode400ForRegisterWithoutAnyPayload() {
        restAssuredThat(response -> response.statusCode(400));
    }

    //Scenario: TC11 - Register with body parameter is empty
    @Step("I POST register endpoints 11")
    public String  postRegisterEndpoints11() {
        return url + "/register";
    }
    @Step("I POST HTTP request for register with body parameter is empty")
    public void postHTTPRequestForRegisterWithBodyParameterIsEmpty() {
        JSONObject body = new JSONObject();
        body.put("email", "");
        body.put("password", "");
        body.put("fullname", "");

        SerenityRest
                .given()
                .header("Content-Type", "application/json")
                .body(body.toJSONString())
                .post(postRegisterEndpoints11());
    }
    @Step("I receive valid HTTP response 400 for register with body parameter is empty")
    public void receiveResponseCode400ForRegisterWithBodyParameterIsEmpty() {
        restAssuredThat(response -> response.statusCode(400));
    }

    //Scenario: TC12 - Register with invalid HTTP method
    @Step("I PUT register endpoints")
    public String putRegisterEndpoints() {
        return url + "/register";
    }
    @Step("I send request for register with invalid HTTP method")
    public void putRequestForRegisterWithInvalidHTTPMethod() {
        JSONObject body = new JSONObject();
        body.put("email","wiyan123@gmail.com");
        body.put("password","wiyan123");
        body.put("fullname","Wiyan Herra Herviana");

        SerenityRest
                .given()
                .header("Content-Type", "application/json")
                .body(body.toJSONString())
                .put(putRegisterEndpoints());
    }
    @Step("I receive valid HTTP response 405 for register with invalid HTTP method")
    public void receiveResponseCode405ForRegisterWithInvalidHTTPMethod() {
        restAssuredThat(response -> response.statusCode(405));
    }
}