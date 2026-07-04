package test;

import base.BaseTest;
import client.BaseClient;
import io.restassured.response.Response;
import org.testng.annotations.Test;
import pojo.Data;
import pojo.ObjectPayload;

public class Test_POST extends BaseTest {

    @Test
    public void testPostRequest() {

        Data data = new Data();
        data.setYear(2019);
        data.setPrice(1849.99);
        data.setCpuModel("Intel Core i9");
        data.setHardDiskSize("1 TB");

        ObjectPayload payload = new ObjectPayload("Apple MacBook Pro 16", data);

        BaseClient client = new BaseClient();
        Response response = client.post("/objects", payload);

        response.then().statusCode(200).log().all();
    }
}

            /*
            // Map → JSONObject example
            Map<String, Object> map = new HashMap<>();
            map.put("name", "Apple MacBook Pro 16");
            map.put("data.year", 2019);
            map.put("data.price", 1849.99);
            map.put("data.CPU model", "Intel Core i9");

            JSONObject jsonObject = new JSONObject(map);
             */

