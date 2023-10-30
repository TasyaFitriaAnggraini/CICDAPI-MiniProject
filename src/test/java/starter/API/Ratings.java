package starter.API;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Ratings {
    protected static String url = "https://altashop-api.fly.dev/api/products";

    //Scenario: TC65 - Give products ratings
    @Step("I POST give products ratings endpoints")
    public String postGiveProductsRatingsEndpoints() {
        return url + "/85536/ratings";
    }
    @Step("I POST HTTP request for give products ratings")
    public void postHTTPRequestForGiveProductsRatings() {
        JSONObject body = new JSONObject();
        body.put("count", 4);

        SerenityRest
                .given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IldpeWFuIEhlcnJhIEhlcnZpYW5hIiwiRW1haWwiOiJ3aXlhbjEyM0BnbWFpbC5jb20ifQ.Rsm7iH_obOaXakAORv2RniUWUxeZfBjkK8S8HtuLly8")
                .contentType("application/json")
                .post(postGiveProductsRatingsEndpoints());

    }
    @Step("I receive valid HTTP response 200 for give products ratings")
    public void receiveValidHTTPResponse200ForGiveProductsRatings() {
        restAssuredThat(response -> response.statusCode(200));
    }

    //Scenario: TC66 - Give product ratings without setting token
    @Step("I POST give products ratings endpoints 2")
    public String postGiveProductsRatingsEndpoints2() {
        return url + "/11672/ratings";
    }
    @Step("I POST HTTP request for give products ratings without setting token")
    public void postHTTPRequestForGiveProductsRatingsWithoutSettingToken() {
        JSONObject body = new JSONObject();
        body.put("count", 4);

        SerenityRest
                .given()
                .contentType("application/json")
                .post(postGiveProductsRatingsEndpoints2());
    }
    @Step("I receive valid HTTP response 401 for give products ratings without setting token")
    public void receiveResponseCode401ForGiveProductsRatingsWithoutSettingToken() {
        restAssuredThat(response -> response.statusCode(401));
    }

    //Scenario: TC67 - Give product ratings with invalid count data payload
//    @Step("I POST give products ratings endpoints 3")
//    public String postGiveProductsRatingsEndpoints3() {
//        return url + "/11672/ratings";
//    }
//    @Step("I POST HTTP request for give products ratings with invalid count data payload")
//    public void postHTTPRequestForGiveProductsRatingsWithInvalidCountDataPayload() {
//        JSONObject body = new JSONObject();
//        body.put("count", -4);
//
//        SerenityRest
//                .given()
//                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IldpeWFuIEhlcnJhIEhlcnZpYW5hIiwiRW1haWwiOiJ3aXlhbkBtYWlsLmNvbSJ9.NPXYoUbe7TJtZoFcbm-zZ2v4Arez-S9PaYhOwdAKxZI")
//                .contentType("application/json")
//                .post(postGiveProductsRatingsEndpoints3());
//    }
//    @Step("I receive valid HTTP response 400 for give products ratings with invalid count data payload")
//    public void receiveResponseCode400ForGiveProductsRatingsWithInvalidCountDataPayload() {
//        restAssuredThat(response -> response.statusCode(400));
//    }

    //Scenario: TC68 - Give products ratings with unavailable
    @Step("I POST give products ratings endpoints 4")
    public String postGiveProductsRatingsEndpoints4() {
        return url + "/2/ratings";
    }
    @Step("I POST HTTP request for give products ratings with unavailable")
    public void postHTTPRequestForGiveProductsRatingsWithUnavailable() {
        JSONObject body = new JSONObject();
        body.put("count", "4");
        SerenityRest
                .given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IldpeWFuIEhlcnJhIEhlcnZpYW5hIiwiRW1haWwiOiJ3aXlhbkBtYWlsLmNvbSJ9.NPXYoUbe7TJtZoFcbm-zZ2v4Arez-S9PaYhOwdAKxZI")
                .contentType("application/json")
                .post(postGiveProductsRatingsEndpoints4());
    }
    @Step("I receive valid HTTP response 401 for give products ratings with unavailable")
    public void receiveResponseCode401ForGiveProductsRatingsWithUnavailable() {
        restAssuredThat(response -> response.statusCode(401));
    }

    //Scenario: TC69 - Give products ratings with invalid HTTP method
    @Step("I set PUT give products ratings endpoints")
    public String putGiveProductsRatingsEndpoints() {
        return url + "/11672/ratings";
    }
    @Step("I send HTTP request for give products ratings with invalid HTTP method")
    public void sendHTTPRequestForGiveProductsRatingsWithInvalidHTTPMethod() {
        JSONObject body = new JSONObject();
        body.put("count", 4);

        SerenityRest
                .given()
                .contentType("application/json")
                .put(putGiveProductsRatingsEndpoints());
    }
    @Step("I receive valid HTTP response 405 for give products ratings with invalid HTTP method")
    public void receiveResponseCode405ForGiveProductsRatingsWithInvalidHTTPMethod() {
        restAssuredThat(response -> response.statusCode(405));
    }

    //Scenario: TC70 - Get products ratings
    @Step("I GET products ratings endpoints")
    public String getProductsRatingsEndpoints() {
        return url + "/11672/ratings";
    }
    @Step("I GET HTTP request for products ratings")
    public void getHTTPRequestForProductsRatings() {
        SerenityRest
                .given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IldpeWFuIEhlcnJhIEhlcnZpYW5hIiwiRW1haWwiOiJ3aXlhbkBtYWlsLmNvbSJ9.NPXYoUbe7TJtZoFcbm-zZ2v4Arez-S9PaYhOwdAKxZI")
                .get(getProductsRatingsEndpoints());
    }
    @Step("I receive valid HTTP response 200 for get products ratings")
    public void receiveResponseCode200ForProductsRatings() {
        restAssuredThat(response -> response.statusCode(200));
    }

    //Scenario: TC71 - Get product rating using invalid product ID with character symbols
    @Step("I GET products ratings endpoints by ID")
    public String getProductsRatingsEndpointsByID() {
        return url + "/-11672/ratings";
    }
    @Step("I GET HTTP request for products ratings using invalid products ID with character symbols")
    public void getHTTPRequestForProductsRatingsUsingInvalidProductsIDWithCharacterSymbols() {
        SerenityRest
                .given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IldpeWFuIEhlcnJhIEhlcnZpYW5hIiwiRW1haWwiOiJ3aXlhbkBtYWlsLmNvbSJ9.NPXYoUbe7TJtZoFcbm-zZ2v4Arez-S9PaYhOwdAKxZI")
                .get(getProductsRatingsEndpointsByID());
    }
    @Step("I receive valid HTTP response 500 for get products ratings using invalid product ID with character symbols")
    public void receiveResponseCode500ForProductsRatingsUsingInvalidProductsIDWithCharacterSymbols() {
        restAssuredThat(response -> response.statusCode(500));
    }

    //Scenario: TC72 - Get product rating using invalid product id with character alphabet
    @Step("I GET products ratings endpoints by ID 2")
    public String getProductsRatingsEndpointsByID2() {
        return url + "/satu/ratings";
    }
    @Step("I GET HTTP request for products ratings using invalid products ID with character alphabet")
    public void getHTTPRequestForProductsRatingsUsingInvalidProductsIDWithCharacterAlphabet() {
        SerenityRest
                .given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IldpeWFuIEhlcnJhIEhlcnZpYW5hIiwiRW1haWwiOiJ3aXlhbkBtYWlsLmNvbSJ9.NPXYoUbe7TJtZoFcbm-zZ2v4Arez-S9PaYhOwdAKxZI")
                .get(getProductsRatingsEndpointsByID2());
    }
    @Step("I receive valid HTTP response 400 for get products ratings using invalid product ID with character alphabet")
    public void receiveResponseCode400ForProductsRatingsUsingInvalidProductsIDWithCharacterAlphabet() {
        restAssuredThat(response -> response.statusCode(400));
    }
}
