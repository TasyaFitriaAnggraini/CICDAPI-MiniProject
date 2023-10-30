package starter.API;

import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;
import org.json.simple.JSONObject;

import static net.serenitybdd.rest.SerenityRest.restAssuredThat;
import static org.hamcrest.core.IsEqual.equalTo;


public class ProductCategories {
    protected static String url = "https://altashop-api.fly.dev/api";

    //Scenario: TC24 - Add new products categories
    @Step("I POST create product categories endpoints")
    public String postProductCategories() {
        return url + "/categories";
    }
    @Step("I POST HTTP request with valid data")
    public void postHTTPRequestProductCategories() {
        JSONObject body = new JSONObject();
        body.put("name", "gaming");
        body.put("description", "for gaming purposes");

        SerenityRest
                .given()
                .header("Content-Type", "application/json")
                .body(body.toJSONString())
                .post(postProductCategories());

    }
    @Step("I receive response data for product categories")
    public void receiveResponseProductCategories() {
        restAssuredThat(response -> response.statusCode(200)
                .body("data.Name", equalTo("gaming"))
                .body("data.Description", equalTo("for gaming purposes")));
    }
    @Step("I receive valid HTTP response 200")
    public void receiveResponseCode200ProductCategories() {
        restAssuredThat(response -> response.statusCode(200));
    }

    //Scenario: TC25 - Add new products categories without description data payload
    @Step("I POST create product categories endpoints 2")
    public String postCreateProductCategoriesEndpoints2() {
        return url + "/categories";
    }
    @Step("I POST HTTP request add new categories without description data payload")
    public void postHTTPRequestAddNewCategoriesWithoutDescriptionDataPayload() {
        JSONObject body = new JSONObject();
        body.put("name", "gaming");

        SerenityRest
                .given()
                .header("Content-Type", "application/json")
                .body(body.toJSONString())
                .post(postCreateProductCategoriesEndpoints2());
    }
    @Step("I receive response data for add new categories without description data payload")
    public void receiveResponseDataForAddNewCategoriesWithoutDescriptionDataPayload() {
        restAssuredThat(response -> response.statusCode(200)
                .body("data.Name", equalTo("gaming")));
    }
    @Step("I receive valid HTTP response 200 for add new categories without description data payload")
    public void receiveResponseCode200ForAddNewCategoriesWithoutDescriptionDataPayload() {
        restAssuredThat(response -> response.statusCode(200));
    }

    //Scenario: TC26 - Add new products categories without name data payload
    @Step("I POST create products categories endpoints 3")
    public String postCreateProductsCategoriesEndpoint3() {
        return url + "/categories";
    }
    @Step("I POST HTTP request add new categories without name data payload")
    public void postHTTPRequestAddNewCategoriesWithoutNameDataPayload() {
        JSONObject body = new JSONObject();
        body.put("description", "for gaming purposes");

        SerenityRest
                .given()
                .header("Content-Type", "application/json")
                .body(body.toJSONString())
                .post(postCreateProductsCategoriesEndpoint3());
    }
    @Step("I receive response data for add new categories without name data payload")
    public void receiveResponseDataForAddNewCategoriesWithoutNameDataPayload() {
        restAssuredThat(response -> response.statusCode(500)
                .body("data.Description", equalTo(null)));
    }
    @Step("I receive valid HTTP response 500 for add new categories without name data payload")
    public void receiveResponseCode500ForAddNewCategoriesWithoutNameDataPayload() {
        restAssuredThat(response -> response.statusCode(500));
    }

    //Scenario: TC27 - Add new products categories with invalid payload format
    @Step("I POST create products categories endpoints 4")
    public String postCreateProductsCategoriesEndpoints4() {
        return url + "/categories";
    }
    @Step("I POST HTTP request add new categories with invalid payload format")
    public void postHTTPRequestAddNewCategoriesWithInvalidPayloadFormat() {
        JSONObject body = new JSONObject();
        body.put("nama", "gaming");
        body.put("deskripsi", "for gaming purposes");

        SerenityRest
                .given()
                .header("Content-Type", "application/json")
                .body(body.toJSONString())
                .post(postCreateProductsCategoriesEndpoints4());
    }
    @Step("I receive response data for add new categories with invalid payload format")
    public void receiveResponseDataForAddNewCategoriesWithInvalidPayloadFormat() {
        restAssuredThat(response -> response.statusCode(500)
                .body("data.Nama", equalTo(null))
                .body("data.Deskripsi", equalTo(null)));
    }
    @Step("I receive valid HTTP response 500 for add new categories with invalid payload format")
    public void receiveResponseCode500ForAddNewCategoriesWithInvalidPayloadFormat() {
        restAssuredThat(response -> response.statusCode(500));
    }

    //Scenario: TC28 -  Add new products categories with body parameter is empty
    @Step("I POST add new products categories endpoints 5")
    public String postAddNewProductsCategoriesEndpoints5() {
        return url + "/categories";
    }
    @Step("I POST HTTP request for add new products categories with body parameter is empty")
    public void postHTTPRequestForAddNewProductsCategoriesWithBodyParameterIsEmpty() {
        JSONObject body = new JSONObject();
        body.put("name", "");
        body.put("description", "");

        SerenityRest
                .given()
                .header("Content-Type", "application/json")
                .body(body.toJSONString())
                .post(postAddNewProductsCategoriesEndpoints5());
    }
    @Step("I receive valid HTTP response 500 for add new products categories with body parameter is empty")
    public void receiveResponseCode500ForAddNewProductsCategoriesWithBodyParameterIsEmpty() {
        restAssuredThat(response -> response.statusCode(500));
    }

    //Scenario: TC29 - Get all products categories
    @Step("I GET all products categories endpoint")
    public String getAllProductsCategoriesEndponts() {
        return url + "/categories";
    }
    @Step("I GET HTTP request with valid endpoints all products categories")
    public void getHTTPRequestWithAllProductsCategories() {
        SerenityRest
                .given()
                .get(getAllProductsCategoriesEndponts());
    }
    @Step("I receive valid HTTP response 200 for get all products categories")
    public void receiveResponseCode200GetAllProductsCategories() {
        restAssuredThat(response -> response.statusCode(200));
    }

    //Scenario: TC30 - Get all products categories with invalid endpoints
    @Step("I GET all products categories endpoints 2")
    public String getAllProductsCategoriesEndpoints2() {
        return url + "/categorie";
    }
    @Step("I GET HTTP request with invalid endpoints all products categories")
    public void getHTTPRequestWithInvalidEndpointsAllProductsCategories() {
        SerenityRest
                .given()
                .get(getAllProductsCategoriesEndpoints2());
    }
    @Step("I receive valid HTTP response 404 for all products categories with invalid endpoints")
    public void receiveResponseCode404ForAllProductsCategoriesWithInvalidEndpoints() {
        restAssuredThat(response -> response.statusCode(404));
    }

    //Scenario: TC31 - Get products categories by ID
    @Step("I GET products categories endpoints by ID")
    public String getProductCategoriesEndpointsByID() {
        return url + "/categories/29729";
    }
    @Step("I GET HTTP request with valid ID")
    public void getHTTPRequestProductCategoryByID() {
        SerenityRest
                .given()
                .get(getProductCategoriesEndpointsByID());
    }
    @Step("I receive valid HTTP response 200 for get by ID")
    public void receiveResponseCode200ProductCategoryByID() {
        restAssuredThat(response -> response.statusCode(200));
    }

    //Scenario: TC32 - Get products categories by invalid ID with character symbols
    @Step("I GET products categories endpoints by ID 2")
    public String getProductsCategoriesEndpointsByID2() {
        return url + "/categories/-11331";
    }
    @Step("I GET HTTP request with invalid ID with character symbols")
    public void getHTTPRequestWithInvalidIDWithCharacterSysmbols() {
        SerenityRest
                .given()
                .get(getProductsCategoriesEndpointsByID2());
    }
    @Step("I receive valid HTTP response 500 for get by invalid ID with character symbols")
    public void receiveResponseCode500ForGetByInvalidIDWithCharacterSysmbols(){
        restAssuredThat(response -> response.statusCode(500));
    }

    //Scenario: TC33 - Get categories by invalid ID with character alphabet
    @Step("I GET products categories endpoints by ID 3")
    public String getProductsCategoriesEndpointsByID3() {
        return url + "/categories/satu";
    }
    @Step("I GET HTTP request with invalid ID with character alphabet")
    public void getHTTPRequestWithInvalidIDWithCharacterAlphabet() {
        SerenityRest
                .given()
                .get(getProductsCategoriesEndpointsByID3());
    }
    @Step("I receive valid HTTP response 400 for get by invalid ID with character alphabet")
    public void receiveResponseCode400ForGetByInvalidIDWithCharacterAlphabet() {
        restAssuredThat(response -> response.statusCode(400));
    }

    //Scenario: TC34 - Delete a products categories
    @Step("I DELETE a products categories endpoints")
    public String deleteProductCategoriesEndpoints() {
        return url + "/categories/11382";
    }
    @Step("I DELETE HTTP request with valid ID")
    public void deleteHTTPRequestAProductCategory() {
        SerenityRest
                .given()
                .delete(deleteProductCategoriesEndpoints());
    }
    @Step("I receive valid HTTP response 200 for delete a product categories")
    public void receiveResponseCode200DeleteProductCategories() {
        restAssuredThat(response -> response.statusCode(200));
    }

    //Scenario: TC35 - Delete a products categories by invalid ID with character symbols
    @Step("I DELETE a product categories endpoints by ID")
    public String deleteProductsCategoriesEndpointsByID() {
        return url + "/categories/-11382";
    }
    @Step("I DELETE HTTP request with invalid ID with character symbols")
    public void deleteHTTPRequestWithInvalidIDWithCharacterSymbols() {
        SerenityRest
                .given()
                .delete(deleteProductsCategoriesEndpointsByID());
    }
    @Step("I receive valid HTTP response 500 for delete a product categories with character symbols")
    public void receiveResponseCode500ForDeleteProductsCategoriesWithCharacterSymbols() {
        restAssuredThat(response -> response.statusCode(500));
    }

    //Scenario: TC36 - Delete a categories by invalid ID with character alphabet
    @Step("I DELETE a product categories endpoints by ID 2")
    public String deleteProducstCategoriesEndpointsByID2() {
        return url + "/categories/satu";
    }
    @Step("I DELETE HTTP request with invalid ID with character alphabet")
    public void deleteHTTPRequestWithInvalidIDWithCharacterAlphabet() {
        SerenityRest
                .given()
                .delete(deleteProducstCategoriesEndpointsByID2());
    }
    @Step("I receive valid HTTP response 400 for delete a product categories with character alphabet")
    public void receiveResponseCode400ForDeleteProductsCategoriesWithCharacterAlphabet() {
        restAssuredThat(response -> response.statusCode(400));
    }
}
