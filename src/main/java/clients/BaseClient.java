package client;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class BaseClient {

    public Response post(String endpoint, Object body) {
        return RestAssured
                .given()
                .header("Content-Type", "application/json")
                .body(body)
                .when()
                .post(endpoint);
    }

    public Response get(String endpoint) {
        return RestAssured
                .given()
                .when()
                .get(endpoint);
    }
}
