import org.json.JSONObject;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.given;
import static reports.ExtentListener.test;

public class Test_PATCH {

    @Test
    public void testPatch() {

        JSONObject data = new JSONObject();
        data.put("year", 2019);
        data.put("price", 1849.99);
        data.put("CPU model", "Intel Core i9");
        data.put("Hard disk size", "1 TB");

        JSONObject jsonObject2 = new JSONObject();
        jsonObject2.put("id", "7");
        jsonObject2.put("name", "Apple MacBook Pro 16");
        // jsonObject2.put("data", data);


        given().
                header("Content-Type", "application/json").
                //    body(jsonObject.toString()).
                        when().
                patch("https://api.restful-api.dev/objects/7").
                then().
                statusCode(400).
                log().all();

    }
        // Test code for PATCH request

        // Using TestNG DataProvider to supply test data

    @Test(dataProvider = "productData", dataProviderClass = utils.DataProviders.class)
    public void testPut(String name, int year, double price) {
        // build JSON and send PUT request

      //  test.get().info("Sending PATCH request");

  //  System.out.println("Test_PATCH executed with name: " + name + " and value: " + value);

        given().
                header("Content-Type", "application/json").
             //  body("{\"name\":\"" + name + "\", \"year\":\"" + year + "\"}").
                when().
                patch("https://api.restful-api.dev/objects/7").
                then().
                statusCode(400).
                log().all();

        }
    }


