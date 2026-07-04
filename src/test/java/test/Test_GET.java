package test;

import base.BaseTest;
import org.testng.annotations.Test;

//import static com.sun.tools.sjavac.Log.log;
import static io.restassured.RestAssured.*;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static org.testng.internal.Utils.log;

public class Test_GET extends BaseTest {

    @Test
    public void testGetRequest() {
        // Implement your GET request test logic here
        given().
                header("Content-Type", "application/json").
                param("page",1).
                when().
                get("https://api.restful-api.dev/objects").
                then().
                statusCode(200).
          //      body("data[1].id", equalTo("null")).
                log().all();
    }


    @Test(retryAnalyzer = listeners.RetryAnalyzer.class)
    public void getObject() {
        given()
                .when()
                .get("/objects/7")
                .then()
                .statusCode(200)
                .assertThat()
                .body(matchesJsonSchemaInClasspath("schemas/get_object_schema.json"));
    }



}
