package starter.API;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;
import org.json.simple.JSONArray;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
public class Products {

    protected static String url = "https://altashop-api.fly.dev/api";

    //Scenario: TC37 - Get all products
    @Step("I GET all products endpoints")
    public String getAllProductEndpoints() {
        return url + "/products";
    }
    @Step("I GET HTTP request with valid endpoints all products")
    public void getHTTPRequestWithValidEndpointsAllProducts() {
        SerenityRest
                .given()
                .get(getAllProductEndpoints());
    }
    @Step("I receive valid HTTP response 200 for get all products")
    public void receiveResponseCode200ForGetAllProducts() {
        restAssuredThat(response -> response.statusCode(200));
    }

    //Scenario: TC38 - Get all products using invalid endpoints
    @Step("I GET all products endpoints 2")
    public String getAllProductsEndpoints2() {
        return url + "/product";
    }
    @Step("I GET HTTP request with invalid endpoints")
    public void getHTTPRequestWithInvalidEndpoints() {
        SerenityRest
                .given()
                .get(getAllProductsEndpoints2());
    }
    @Step("I receive valid HTTP response 404 for get all products using invalid endpoints")
    public void receiveResponseCode404ForGetAllProductUsingInvalidEndpoints() {
        restAssuredThat(response -> response.statusCode(404));
    }

    //Scenario: TC39 - Add new products
    @Step("I POST add new products endpoints")
    public String postAddNewProductsEndpoints() {
        return url + "/products";
    }
    @Step("I POST HTTP request for add new products")
    public void postHTTPRequestForAddNewProducts() {
        JSONObject body = new JSONObject();
        body.put("name", "Sony PS5");
        body.put("description", "play has no limits");
        body.put("price", 299);
        JSONArray categories = new JSONArray();
        categories.add(1);
        body.put("categories", categories);

        SerenityRest
                .given()
                .header("Content-Type", "application/json")
                .body(body.toJSONString())
                .post(postAddNewProductsEndpoints());
    }
    @Step("I receive valid HTTP response 200 for add new products")
    public void receiveResponseCode200ForAddNewProducts() {
        restAssuredThat(response -> response.statusCode(200));
    }

    //Scenario: TC40 - Add new products without name payload
    @Step("I POST add new products endpoints 2")
    public String postAddNewProductsEndpoints2() {
        return url + "/products";
    }
    @Step("I POST HTTP request for add new products without name payload")
    public void postHTTPRequestForAddNewProductsWithoutNamePayload() {
        JSONObject body = new JSONObject();
        body.put("description", "play has no limits");
        body.put("price", 299);
        JSONArray categories = new JSONArray();
        categories.add(1);
        body.put("categories", categories);

        SerenityRest
                .given()
                .header("Content-Type", "application/json")
                .body(body.toJSONString())
                .post(postAddNewProductsEndpoints2());

    }
    @Step("I receive valid HTTP response 500 for add new products without name payload")
    public void receiveResponseCode500ForAddNewProductsWithoutNamePayload() {
        restAssuredThat(response -> response.statusCode(500));
    }

    //Scenario: TC41 - Add new products with only space on name payload
//    @Step("I POST add new products endpoints 3")
//    public String postAddNewProductsEndpoints3() {
//        return url + "/products";
//    }
//    @Step("I POST HTTP request for add new products with only space on name payload")
//    public void postHTTPRequestForAddNewProductsWithOnlySpaceOnNamePayload() {
//        JSONObject body = new JSONObject();
//        body.put("name", " ");
//        body.put("description", "play has no limits");
//        body.put("price", 299);
//        JSONArray categories = new JSONArray();
//        categories.add(1);
//        body.put("categories", categories);
//
//        SerenityRest
//                .given()
//                .header("Content-Type", "application/json")
//                .body(body.toJSONString())
//                .post(postAddNewProductsEndpoints3());
//    }
//    @Step("I receive valid HTTP response 400 for add new products with only space on name payload")
//    public void receiveResponseCode400ForAddNewProductsWithOnlySpaceOnNamePayload() {
//        restAssuredThat(response -> response.statusCode(400));
//    }

    //Scenario: TC42 - Add new product with blank name payload
    @Step("I POST add new products endpoints 4")
    public String postAddNewProductsEndpoints4() {
        return url + "/products";
    }
    @Step("I POST HTTP request for add new products with blank name payload")
    public void postHTTPRequestForAddNewProductesWithBlankNamePayload() {
        JSONObject body = new JSONObject();
        body.put("name", "");
        body.put("description", "play has no limits");
        body.put("price", 299);
        JSONArray categories = new JSONArray();
        categories.add(1);
        body.put("categories", categories);

        SerenityRest
                .given()
                .header("Content-Type", "application/json")
                .body(body.toJSONString())
                .post(postAddNewProductsEndpoints4());
    }
    @Step("I receive valid HTTP response 500 for add new products with blank name payload")
    public void receiveResponseCode500ForAddNewProductesWithBlankNamePayload() {
        restAssuredThat(response -> response.statusCode(500));
    }

    //Scenario: TC43 - Add new product without price payload
//    @Step("I POST add new products endpoints 5")
//    public String postAddNewProductsEndpoints5() {
//        return url + "/products";
//    }
//    @Step("I POST HTTP request for add new products without price payload")
//    public void postHTTPRequestForAddNewProductsWithoutPricePayload() {
//        JSONObject body = new JSONObject();
//        body.put("name", "Sony PS5");
//        body.put("description", "play has no limits");
//        JSONArray categories = new JSONArray();
//        categories.add(1);
//        body.put("categories", categories);
//
//        SerenityRest
//                .given()
//                .header("Content-Type", "application/json")
//                .body(body.toJSONString())
//                .post(postAddNewProductsEndpoints5());
//    }
//    @Step("I receive valid HTTP response 500 for add new products without price payload")
//    public void receiveResponseCode500ForAddNewProductsWithoutPricePayload() {
//        restAssuredThat(response -> response.statusCode(500));
//    }

    //Scenario: TC44 - Add new product with blank price payload
    @Step("I POST add new products endpoints 6")
    public String postAddNewProductsEndpoints6() {
        return url + "/products";
    }
    @Step("I POST HTTP request for add new products with blank price payload")
    public void postHTTPRequestForAddNewProductsWithBlankPricePayload() {
        JSONObject body = new JSONObject();
        body.put("name", "Sony PS5");
        body.put("description", "play has no limits");
        body.put("price", "");
        JSONArray categories = new JSONArray();
        categories.add(1);
        body.put("categories", categories);

        SerenityRest
                .given()
                .header("Content-Type", "application/json")
                .body(body.toJSONString())
                .post(postAddNewProductsEndpoints6());
    }
    @Step("I receive valid HTTP response 400 for add new products with blank price payload")
    public void receiveResponseCode400ForAddNewProductsWithBlankPricePayload() {
        restAssuredThat(response -> response.statusCode(400));
    }

    //Scenario: TC45 - Add new product with only space on price payload
    @Step("I POST add new products endpoints 7")
    public String postAddNewProductsEndpoints7() {
        return url + "/products";
    }
    @Step("I POST HTTP request for add new products with only space on price payload")
    public void postHTTPRequestForAddNewProductsWithOnlySpaceOnPricePayload() {
        JSONObject body = new JSONObject();
        body.put("name", "Sony PS5");
        body.put("description", "play has no limits");
        body.put("price", " ");
        JSONArray categories = new JSONArray();
        categories.add(1);
        body.put("categories", categories);

        SerenityRest
                .given()
                .header("Content-Type", "application/json")
                .body(body.toJSONString())
                .post(postAddNewProductsEndpoints7());
    }
    @Step("I receive valid HTTP response 400 for add new products with only space on price payload")
    public void receiveResponseCode400ForAddNewProductsWithOnlySpaceOnPricePayload() {
        restAssuredThat(response -> response.statusCode(400));
    }

    //Scenario: TC46 - Add new product without categories payload
//    @Step("I POST add new products endpoints 8")
//    public String postAddNewProductsEndpoints8() {
//        return url + "/products";
//    }
//    @Step("I POST HTTP request for add new products without categories payload")
//    public void postHTTPRequestForAddNewProductsWithoutCategoriesPayload() {
//        JSONObject body = new JSONObject();
//        body.put("name", "Sony PS5");
//        body.put("description", "play has no limits");
//        body.put("price", 299);
//
//        SerenityRest
//                .given()
//                .header("Content-Type", "application/json")
//                .body(body.toJSONString())
//                .post(postAddNewProductsEndpoints8());
//    }
//    @Step("I receive valid HTTP response 400 for add new products without categories payload")
//    public void receiveResponseCode400ForAddNewProductsWithoutCategoriesPayload() {
//        restAssuredThat(response -> response.statusCode(400));
//    }

    //Scenario: TC47 - Add new product with invalid categories payload
//    @Step("I POST add new products endpoints 9")
//    public String postAddNewProductsEndpoints9() {
//        return url + "/products";
//    }
//    @Step("I POST HTTP request for add new products with invalid categories payload")
//    public void postHTTPRequestForAddNewProductsWithInvalidCategoriesPayload() {
//        JSONObject body = new JSONObject();
//        body.put("name", "Sony PS5");
//        body.put("description", "play has no limits");
//        body.put("price", 299);
//        JSONArray categories = new JSONArray();
//        categories.add(100000);
//        body.put("categories", categories);
//
//        SerenityRest
//                .given()
//                .header("Content-Type", "application/json")
//                .body(body.toJSONString())
//                .post(postAddNewProductsEndpoints9());
//    }
//    @Step("I receive valid HTTP response 200 for add new products with invalid categories payload")
//    public void receiveResponseCode200ForAddNewProductsWithInvalidCategoriesPayload() {
//        restAssuredThat(response -> response.statusCode(200));
//    }

    //Scenario: TC48 - Add new product with body parameter is empty
    @Step("I POST add new products endpoints 10")
    public String postAddNewProductsEndpoints10() {
        return url + "/products";
    }
    @Step("I POST HTTP request for add new products with body parameter is empty")
    public void postHTTPRequestForAddNewProductsWithBodyParameterIsEmpty() {
        JSONObject body = new JSONObject();
        body.put("name", "");
        body.put("description", "");
        body.put("price","");
        JSONArray categories = new JSONArray();
        categories.add(1);
        body.put("categories", categories);

        SerenityRest
                .given()
                .header("Content-Type", "application/json")
                .body(body.toJSONString())
                .post(postAddNewProductsEndpoints10());
    }
    @Step("I receive valid HTTP response 400 for add new products with body parameter is empty")
    public void receiveResponseCode400ForAddNewProductsWithBodyParameterIsEmpty() {
        restAssuredThat(response -> response.statusCode(400));
    }

    //Scenario: TC49 - Add new products with invalid HTTP method
    @Step("I PUT add new products endpoints")
    public String putAddNewProductsEndpoints() {
        return url + "/products";
    }
    @Step("I send request for add new products with invalid HTTP method")
    public void sendRequestForAddNewProductsWithInvalidHTTPMethod() {
        JSONObject body = new JSONObject();
        body.put("name", "Sony PS5");
        body.put("description", "play has no limits");
        body.put("price", 299);
        JSONArray categories = new JSONArray();
        categories.add(1);
        body.put("categories", categories);

        SerenityRest
                .given()
                .header("Content-Type", "application/json")
                .body(body.toJSONString())
                .put(putAddNewProductsEndpoints());
    }
    @Step("I receive valid HTTP response 405 for for add new products with invalid HTTP method")
    public void receiveResponseCode405ForAddNewProductsWithInvalidHTTPMethod() {
        restAssuredThat(response -> response.statusCode(405));
    }

    //Scenario: TC50 - Get products by ID
    @Step("I GET products endpoints by ID")
    public String getProductsEndpointsByID() {
        return url + "/products/85536";
    }
    @Step("I GET HTTP request for products with valid ID")
    public void getHTTPRequestForProductsWithValidID() {
        SerenityRest
                .given()
                .get(getProductsEndpointsByID());
    }
    @Step("I receive valid HTTP response 200 for get products by ID")
    public void receiveResponseCode200ForProductsWithValidID() {
        restAssuredThat(response -> response.statusCode(200));
    }

    //Scenario: TC51 - Get product using invalid ID with character symbols
    @Step("I GET products endpoints by ID 2")
    public String getProductsEndpointsByID2() {
        return url + "/products/-11318";
    }
    @Step("I GET HTTP request for products using invalid ID with character symbols")
    public void getHTTPRequestsForProductsUsingInvalidIDWithCharacterSysmbols() {
        SerenityRest
                .given()
                .get(getProductsEndpointsByID2());
    }
    @Step("I receive valid HTTP response 500 for get products using invalid ID with character symbols")
    public void receiveResponseCode500ForProductsUsingInvalidIDWithCharacterSysmbols() {
        restAssuredThat(response -> response.statusCode(500));
    }

    //Scenario: TC52 - Get categories by invalid ID with character alphabet
    @Step("I GET products endpoints by ID 3")
    public String getProductsEndpointsbyID3() {
        return url + "/products/satu";
    }
    @Step("I GET HTTP request for products using invalid ID with character alphabet")
    public void getHTTPRequestsForProductsUsingInvalidIDWithCharacterAlphabet() {
        SerenityRest
                .given()
                .get(getProductsEndpointsbyID3());
    }
    @Step("I receive valid HTTP response 400 for get products using invalid ID with character alphabet")
    public void receiveResponseCode400ForProductsUsingInvalidIDWithCharacterAlphabet() {
        restAssuredThat(response -> response.statusCode(400));
    }

    //Scenario: TC53 - Delete a products by ID
    @Step("I DELETE a products endpoints by ID")
    public String deleteAProductsEndpointsByID() {
        return url + "/products/11286";
    }
    @Step("I DELETE HTTP request for a products with valid ID")
    public void deleteHTTPRequestForAProductsWithValidID() {
        SerenityRest
                .given()
                .delete(deleteAProductsEndpointsByID());
    }
    @Step("I receive valid HTTP response 200 for delete a products")
    public void receiveResponseCode200ForDeleteAProducts() {
        restAssuredThat(response -> response.statusCode(200));
    }

    //Scenario: TC54 - Delete a products using invalid ID with character symbols
    @Step("I DELETE a products endpoints by ID 2")
    public String deleteAProductsEndpointsByID2() {
        return url + "/products/-11286";
    }
    @Step("I DELETE HTTP request for a products using invalid ID with character symbols")
    public void deleteHTTPRequestForAProductsUsingInvalidIDWithCharacterSymbols() {
        SerenityRest
                .given()
                .delete(deleteAProductsEndpointsByID2());
    }
    @Step("I receive valid HTTP response 500 for a products using invalid ID with character symbols")
    public void receiveResponseCode500ForAProductsUsingInvalidIDWithCharacterSymbols() {
        restAssuredThat(response -> response.statusCode(500));
    }

    //Scenario: TC55 - Delete a products using invalid ID with character alphabet
    @Step("I DELETE a products endpoints by ID 3")
    public String deleteAProductsEndpointsByID3() {
        return url + "/products/satu";
    }
    @Step("I DELETE HTTP request for a products using invalid ID with character alphabet")
    public void deleteHTTPRequestForAProductsUsingInvalidIDWithCharacterAlphabet() {
        SerenityRest
                .given()
                .delete(deleteAProductsEndpointsByID3());
    }
    @Step("I receive valid HTTP response 400 for a products using invalid ID with character alphabet")
    public void receiveResponseCode400ForAProductsUsingInvalidIDWithCharacterAlphabet() {
        restAssuredThat(response -> response.statusCode(400));
    }
}
