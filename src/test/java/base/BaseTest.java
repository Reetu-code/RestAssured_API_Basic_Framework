package base;

import io.restassured.RestAssured;
import io.restassured.filter.log.RequestLoggingFilter;
import org.testng.annotations.BeforeClass;

public class BaseTest {

    @BeforeClass
    public void setup() {
        RestAssured.baseURI = "https://api.restful-api.dev";
    }
}

  //RestAssured.filters(new RequestLoggingFilter(), new ResponseLoggingFilter());



