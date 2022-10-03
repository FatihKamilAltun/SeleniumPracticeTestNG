package tests.practice01;

import org.testng.annotations.Test;
import utilities.TestBase;

public class C01_Priority extends TestBase {



    @Test (priority = 5)
    public void amazonTesti() {
        driver.get("https://amazon.com");
        System.out.println(driver.getCurrentUrl());
    }

    @Test(priority = -2)
    public void test02() {
        driver.get("https://bestbuy.com");
        System.out.println(driver.getCurrentUrl());
    }

    @Test
    public void trendyolTesti() {
        driver.get("https://trendyol.com");
        System.out.println(driver.getCurrentUrl());
    }
}
