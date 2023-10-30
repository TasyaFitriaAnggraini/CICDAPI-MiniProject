package starter.API;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;

public class Comment {
    protected static String url = "https://altashop-api.fly.dev/api/products";

    //Scenario: TC73 - Get comment products valid endpoints
    @Step("I GET comment products endpoints")
    public String getCommentProductsEndpoints() {
        return url + "/2/comments";
    }
    @Step("I GET HTTP request with valid data for comments products")
    public void getHTTPRequestWithValidDataForCommentsProducts() {
        SerenityRest
                .given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6Ik5hdXJhIFZpZXRhIEhhZmxhIiwiRW1haWwiOiJuYXVyYWhhZmxhQGdtYWlsLmNvbSJ9.s7o8kacM5c5L7fMRQwNBVTO4m2AeQS4Fu9QSdP9ASbA")
                .get(getCommentProductsEndpoints());
    }
    @Step("I receive valid HTTP response 200 for comments products")
    public void receiveResponseCode200ForCommentsProducts() {
        restAssuredThat(response -> response.statusCode(200));
    }

    //Scenario: TC74 - Get comment for products invalid endpoints
    @Step("I GET comment products endpoints 2")
    public String getCommentProductsEndpoints2() {
        return url + "/2/comment";
    }
    @Step("I GET HTTP request for comments products using invalid endpoints")
    public void getHTTPRequestForCommentProductsUsingInvalidEndpoints() {
        SerenityRest
                .given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6Ik5hdXJhIFZpZXRhIEhhZmxhIiwiRW1haWwiOiJuYXVyYWhhZmxhQGdtYWlsLmNvbSJ9.s7o8kacM5c5L7fMRQwNBVTO4m2AeQS4Fu9QSdP9ASbA")
                .get(getCommentProductsEndpoints2());
    }
    @Step("I receive valid HTTP response 404 for comments products using invalid endpoints")
    public void receiveResponseCode404ForCommentProductsUsingInvalidEndpoints() {
        restAssuredThat(response -> response.statusCode(404));
    }

    //Scenario: TC75 - Create a comment for products
    @Step("I POST create a comment for products endpoints")
    public String postCreateCommentForProductsEndpoints() {
        return url + "/2/comments";
    }
    @Step("I POST HTTP request create a comment for products")
    public void postHTTPRequestCreateCommentForProducts() {
        JSONObject body = new JSONObject();
        body.put("content", "the games are great including Gran Turismo 7 but sadly GT4 is much better");

        SerenityRest
                .given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6Ik5hdXJhIFZpZXRhIEhhZmxhIiwiRW1haWwiOiJuYXVyYWhhZmxhQGdtYWlsLmNvbSJ9.s7o8kacM5c5L7fMRQwNBVTO4m2AeQS4Fu9QSdP9ASbA")
                .contentType("application/json")
                .body(body.toJSONString())
                .post(postCreateCommentForProductsEndpoints());
    }
    @Step("I receive valid HTTP response 200 for create comment products")
    public void receiveResponseCode200ForCreateCommentProducts() {
        restAssuredThat(response -> response.statusCode(200));
    }

    //Scenario: TC76 - Create a comment product invalid by ID with character symbols
    @Step("I POST create a comment for products endpoints by ID")
    public String postCreateCommentForProductsEndpointsByID() {
        return url + "/-2/comments";
    }
    @Step("I POST HTTP request for comment products invalid by ID with character symbols")
    public void postHTTPRequestForCommentProductsInvalidByIDWithCharacterSymbols() {
        JSONObject body = new JSONObject();
        body.put("content", "the games are great including Gran Turismo 7 but sadly GT4 is much better");

        SerenityRest
                .given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6Ik5hdXJhIFZpZXRhIEhhZmxhIiwiRW1haWwiOiJuYXVyYWhhZmxhQGdtYWlsLmNvbSJ9.s7o8kacM5c5L7fMRQwNBVTO4m2AeQS4Fu9QSdP9ASbA")
                .contentType("application/json")
                .body(body.toJSONString())
                .post(postCreateCommentForProductsEndpointsByID());
    }
    @Step("I receive valid HTTP response 500 for comment products invalid by ID with character symbols")
    public void receiveResponseCode502ForCommentProductsInvalidByIDWithCharacterSymbols() {
        restAssuredThat(response -> response.statusCode(500));
    }

    //Scenario: TC77 - Create a comment product invalid by ID with character alphabet
    @Step("I POST create a comment for products endpoints by ID 2")
    public String postCreateCommentForProductsEndpointsByID2() {
        return url + "/dua/comments";
    }
    @Step("I POST HTTP request for comment products invalid by ID with character alphabet")
    public void postHTTPRequestForCommentProductsInvalidByIDWithCharacterAlphabet() {
        JSONObject body = new JSONObject();
        body.put("content", "the games are great including Gran Turismo 7 but sadly GT4 is much better");

        SerenityRest
                .given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6Ik5hdXJhIFZpZXRhIEhhZmxhIiwiRW1haWwiOiJuYXVyYWhhZmxhQGdtYWlsLmNvbSJ9.s7o8kacM5c5L7fMRQwNBVTO4m2AeQS4Fu9QSdP9ASbA")
                .contentType("application/json")
                .body(body.toJSONString())
                .post(postCreateCommentForProductsEndpointsByID2());
    }
    @Step("I receive valid HTTP response 400 for comment products invalid by ID with character alphabet")
    public void receiveResponseCode400ForCommentProductsInvalidByIDWithCharacterAlphabet() {
        restAssuredThat(response -> response.statusCode(400));
    }

    //Scenario: TC78 - Create a comment for products with body parameter is empty
    @Step("I POST create a comment for products endpoints 2")
    public String postCreateCommentForProductsEndpoints2() {
        return url + "/2/comments";
    }
    @Step("I POST HTTP request for comment products with body parameter is empty")
    public void postHTTPRequestForCommentProductsWithBodyParameterIsEmpty() {
        JSONObject body = new JSONObject();

        SerenityRest
                .given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6Ik5hdXJhIFZpZXRhIEhhZmxhIiwiRW1haWwiOiJuYXVyYWhhZmxhQGdtYWlsLmNvbSJ9.s7o8kacM5c5L7fMRQwNBVTO4m2AeQS4Fu9QSdP9ASbA)")
                .contentType("application/json")
                .body(body.toJSONString())
                .post(postCreateCommentForProductsEndpoints2());
    }
    @Step("I receive valid HTTP response 401 for comment products with body parameter is empty")
    public void receiveResponseCode401ForCommentProductsWithBodyParameterIsEmpty() {
        restAssuredThat(response -> response.statusCode(401));
    }
}
