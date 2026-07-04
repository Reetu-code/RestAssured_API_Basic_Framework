package utils;
import org.testng.annotations.DataProvider;

public class DataProviders {

    @DataProvider(name = "productData")
    public Object[][] productData() {
        return new Object[][]{
                {"Apple MacBook Pro 16", 2019, 1849.99},
                {"Dell XPS 15", 2020, 1599.99},
                {"HP Spectre x360", 2021, 1399.99}
        };
    }

}
