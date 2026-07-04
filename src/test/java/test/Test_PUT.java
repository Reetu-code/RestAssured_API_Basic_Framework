package test;

import org.json.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;

public class Test_PUT {

    @Test
    public void testPutRequest() {

    /*    JSONObject jsonObject2 = new JSONObject();

        jsonObject2.put("id", 7);
        jsonObject2.put("name", "Apple MacBook Pro 16");
        jsonObject2.put("data.year", 2019);
        jsonObject2.put("data.price", 1849.99);
        jsonObject2.put("data.CPU model", "Intel Core i9");
        jsonObject2.put("Hard disk size", "1 TB");
*/

        JSONObject data = new JSONObject();
        data.put("year", 2019);
        data.put("price", 1849.99);
        data.put("CPU model", "Intel Core i9");
        data.put("Hard disk size", "1 TB");
        data.put("color", "silver");

        JSONObject jsonObject2 = new JSONObject();
     //   jsonObject2.put("id", "7");
        jsonObject2.put("name", "Apple MacBook Pro 16");
       // jsonObject2.put("data", data);


        given().
                header("Content-Type", "application/json").
          //    body(jsonObject.toString()).
                when().
                put("https://api.restful-api.dev/objects/7").
                then().
                statusCode(400).
                log().all();

    }
}
