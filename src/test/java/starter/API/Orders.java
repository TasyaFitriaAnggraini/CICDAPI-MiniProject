package starter.API;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.Matchers.equalTo;

public class Orders {

    protected static String url = "https://altashop-api.fly.dev/api";

    //Scenario: TC56 - Add new orders
    @Step("I POST add new orders endpoints")
    public String postAddNewOrdersEndpoints() {
        return url + "/orders";
    }
    @Step("I POST HTTP request for add new orders with valid data")
    public void postHTTPRequestAddNewOrdersWithValidData() {
        JSONArray orderItems = new JSONArray();
        JSONObject orderItem = new JSONObject();
        orderItem.put("product_id", 12604);
        orderItem.put("quantity", 1);
        orderItems.add(orderItem);

        JSONArray requestBody = new JSONArray();
        JSONObject orderCreate = new JSONObject();
        orderCreate.put("order_items", orderItems);
        requestBody.add(orderCreate);

        SerenityRest
                .given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IldpeWFuIEhlcnJhIEhlcnZpYW5hIiwiRW1haWwiOiJ3aXlhbjEyM0BnbWFpbC5jb20ifQ.Rsm7iH_obOaXakAORv2RniUWUxeZfBjkK8S8HtuLly8")
                .contentType("application/json")
                .body(requestBody.toString())
                .post(postAddNewOrdersEndpoints());
    }
    @Step("I receive valid HTTP response 200 for add new orders")
    public void receiveResponsceCode200ForAddNewOrders() {
        restAssuredThat(response -> response.statusCode(200));
    }

    //Scenario: TC57 - Add new orders without set the token
    @Step("I POST add new orders endpoints 2")
    public String postAddNewOrdersEndpoints2() {
        return url + "/orders";
    }
    @Step("I POST HTTP request for add new orders without set the token")
    public void postHTTPRequestForAddNewOrdersWithoutSetTheToken() {
        JSONArray orderItems = new JSONArray();
        JSONObject orderItem = new JSONObject();
        orderItem.put("product_id", 11649);
        orderItem.put("quantity", 1);
        orderItems.add(orderItem);

        JSONArray requestBody = new JSONArray();
        JSONObject orderCreate = new JSONObject();
        orderCreate.put("order_items", orderItems);
        requestBody.add(orderCreate);

        SerenityRest
                .given()
                .contentType("application/json")
                .body(requestBody.toString())
                .post(postAddNewOrdersEndpoints2());
    }
    @Step("I receive valid HTTP response 401 for add new orders without set the token")
    public void receiveResponseCode401ForAddNewOrdersWithoutSetTheToken() {
        restAssuredThat(response -> response.statusCode(401));
    }

    //Scenario: TC58 - Add new orders with invalid quantity data payload
//    @Step("I POST add new orders endpoints 3")
//    public String postAddNewOrdersEndpoints3() {
//        return url + "/orders";
//    }
//    @Step("I POST HTTP request for add new orders with invalid quantity data payload")
//    public void postHTTPRequestForAddNewOrdersWithInvalidQuantityDataPayload() {
//        JSONArray orderItems = new JSONArray();
//        JSONObject orderItem = new JSONObject();
//        orderItem.put("product_id", 11649);
//        orderItem.put("quantity", -1);
//        orderItems.add(orderItem);
//
//        JSONArray requestBody = new JSONArray();
//        JSONObject orderCreate = new JSONObject();
//        orderCreate.put("order_items", orderItems);
//        requestBody.add(orderCreate);
//
//        SerenityRest
//                .given()
//                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IldpeWFuIEhlcnJhIEhlcnZpYW5hIiwiRW1haWwiOiJ3aXlhbkBtYWlsLmNvbSJ9.NPXYoUbe7TJtZoFcbm-zZ2v4Arez-S9PaYhOwdAKxZI")
//                .contentType("application/json")
//                .body(requestBody.toString())
//                .post(postAddNewOrdersEndpoints3());
//    }
//    @Step("I receive valid HTTP response 400 for add new orders with invalid quantity data payload")
//    public void receiveResponseCode400ForAddNewOrdersWithInvalidQuantityDataPayload() {
//        restAssuredThat(response -> response.statusCode(400));
//    }

    //Scenario: TC59 - Add new orders with invalid payload format
//    @Step("I POST add new orders endpoints 4")
//    public String postAddNewOrdersEndpoints4() {
//        return url + "/orders";
//    }
//    @Step("I POST HTTP request for add new orders with with invalid payload format")
//    public void postHTTPRequestForAddNewOrdersWithInvalidPayloadFormat() {
//        JSONArray orderItems = new JSONArray();
//        JSONObject orderItem = new JSONObject();
//        orderItem.put("produc", 11324);
//        orderItem.put("quanty", 1);
//        orderItems.add(orderItem);
//
//        JSONArray requestBody = new JSONArray();
//        JSONObject orderCreate = new JSONObject();
//        orderCreate.put("order_items", orderItems);
//        requestBody.add(orderCreate);
//
//        SerenityRest
//                .given()
//                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IldpeWFuIEhlcnJhIEhlcnZpYW5hIiwiRW1haWwiOiJ3aXlhbkBtYWlsLmNvbSJ9.NPXYoUbe7TJtZoFcbm-zZ2v4Arez-S9PaYhOwdAKxZI")
//                .contentType("application/json")
//                .body(requestBody.toString())
//                .post(postAddNewOrdersEndpoints4());
//    }
//    @Step("I receive valid HTTP response 400 for add new orders with with invalid payload format")
//    public void receiveResponseCode400ForAddNewOrdersWithInvalidPayloadFormat() {
//      restAssuredThat(response -> response.body("data[0].Product", equalTo(null)));
//      restAssuredThat(response -> response.statusCode(400));
//    }

    //Scenario: TC60 - Get all orders
    @Step("I GET all orders endpoints")
    public String getAllOrdersEndpoints() {
        return url + "/orders";
    }
    @Step("I GET HTTP request with valid endpoints for get all orders")
    public void getHTTPRequestAllOrders() {
        SerenityRest
                .given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IldpeWFuIEhlcnJhIEhlcnZpYW5hIiwiRW1haWwiOiJ3aXlhbjEyM0BnbWFpbC5jb20ifQ.Rsm7iH_obOaXakAORv2RniUWUxeZfBjkK8S8HtuLly8")
                .get(getAllOrdersEndpoints());
    }
    @Step("I receive valid HTTP response 200 for get all orders")
    public void receiveResponseCode200GetAllOrders() {
        restAssuredThat(response -> response.statusCode(200));
    }

    //Scenario: TC61 - Get all orders without token
    @Step("I GET all orders endpoints 2")
    public String getAllProductsEndpoints2() {
        return url + "/orders";
    }
    @Step("I GET HTTP request for get all orders without token")
    public void getHTTPRequestForGetAllOrdersWithoutToken() {
        SerenityRest
                .given()
                .get(getAllProductsEndpoints2());
    }
    @Step("I receive valid HTTP response 401 for get all orders without token")
    public void receiveResponseCode401ForGetAllOrdersWithoutToken() {
        restAssuredThat(response -> response.statusCode(401));
    }

    //Scenario: TC62 - Get order by ID
    @Step("I GET orders endpoints by ID")
    public String getOrderEndpointsByID() {
        return url + "/orders/13020";
    }
    @Step("I GET orders HTTP request with valid ID")
    public void getHTTPRequestOrdersByID() {
        SerenityRest
                .given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IldpeWFuIEhlcnJhIEhlcnZpYW5hIiwiRW1haWwiOiJ3aXlhbjEyM0BnbWFpbC5jb20ifQ.Rsm7iH_obOaXakAORv2RniUWUxeZfBjkK8S8HtuLly8")
                .get(getOrderEndpointsByID());
    }
    @Step("I receive valid HTTP response 200 for get order by ID")
    public void receiveResponseCode200GetOrderByID() {
        restAssuredThat(response -> response.statusCode(200));
    }

    //Scenario: TC63 - Get orders by invalid ID with character symbols
    @Step("I GET orders endpoints by ID 2")
    public String getOrdersEndpointsByID2() {
        return url + "/orders/-2";
    }
    @Step("I GET orders HTTP request invalid ID with character symbols")
    public void getOrdersHTTPRequestWithInvalidIDWithCharacterSymbols() {
        SerenityRest
                .given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IldpeWFuIEhlcnJhIEhlcnZpYW5hIiwiRW1haWwiOiJ3aXlhbkBtYWlsLmNvbSJ9.NPXYoUbe7TJtZoFcbm-zZ2v4Arez-S9PaYhOwdAKxZI")
                .get(getOrdersEndpointsByID2());
    }
    @Step("I receive valid HTTP response 401 for get orders by invalid IDwith character symbols")
    public void receiveResponseCode401ForGetOrdersByInvalidIDWithCharacterSymbols() {
        restAssuredThat(response -> response.statusCode(401));
    }

    //Scenario:TC64 - Get orders by invalid ID with character alphabet
    @Step("I GET orders endpoints by ID 3")
    public String getOrdersEndpointsByID3() {
        return url + "/orders/satu";
    }
    @Step("I GET orders HTTP request invalid ID with character alphabet")
    public void getOrdersHTTPRequestWithInvalidIDWithCharacterAlphabet() {
        SerenityRest
                .given()
                .header("Authorization", "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJGdWxsbmFtZSI6IldpeWFuIEhlcnJhIEhlcnZpYW5hIiwiRW1haWwiOiJ3aXlhbkBtYWlsLmNvbSJ9.NPXYoUbe7TJtZoFcbm-zZ2v4Arez-S9PaYhOwdAKxZI")
                .get(getOrdersEndpointsByID3());
    }
    @Step("I receive valid HTTP response 401 for get orders by invalid ID with character alphabet")
    public void receiveResponseCode401ForGetOrdersByInvalidIDWithCharacterAlphabet() {
        restAssuredThat(response -> response.statusCode(401));
    }
}
