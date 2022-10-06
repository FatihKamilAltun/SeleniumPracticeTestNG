package tests.practice01;

import org.testng.annotations.Test;
import utilities.Driver;

public class C05_YeniDriverIlkTest {
    @Test
    public void test01() {
        Driver.getDriver().get("https://amazon.com");



        Driver.getDriver().get("https://bestbuy.com");
        Driver.getDriver().get("https://facebook.com");
    }
}
