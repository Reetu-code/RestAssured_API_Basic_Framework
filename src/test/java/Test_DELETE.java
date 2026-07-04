import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class Test_DELETE {

    @Test
    public void testDelete() {
        System.out.println("Test_DELETE executed");

        given().
        //    pathParam("id", 6).
        when().
            delete("https://api.restful-api.dev/objects/6").
        then().
            statusCode(405);
    }
}
