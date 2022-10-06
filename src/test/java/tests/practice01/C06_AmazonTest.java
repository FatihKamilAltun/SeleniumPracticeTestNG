package tests.practice01;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class C06_AmazonTest {
    @Test
    public void test01() {

        // amazona gidelim
        Driver.getDriver().get("https://amazon.com");

        // nutella aratalim
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.searchBox.sendKeys("Nutella", Keys.ENTER);

        // sonucun 'Nutella' icerdigini test edin
        String actualResultText=amazonPage.resultText.getText();
        String expectedResult="Nutella";
        Assert.assertTrue(actualResultText.contains(expectedResult));
    }
}
