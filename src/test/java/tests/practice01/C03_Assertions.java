package tests.practice01;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.TestBase;

public class C03_Assertions extends TestBase {

    @Test
    public void test01() {
        // 1- amazon anasayfasına gidin
        driver.get("https://amazon.com");

        // 2- title'in Amazon icerdigini test edin
        String expectedTitle="amazon";
        String actualTitle=driver.getTitle();
        Assert.assertTrue(actualTitle.contains(expectedTitle));

        // 3- arama kutusunun erisilebilir oldugunu test edin
        WebElement searchBox=driver.findElement(By.id("twotabsearchtextbox"));
        Assert.assertTrue(searchBox.isEnabled());

        // 4- arama kutusuna Nutella yazdirip aratin
        searchBox.sendKeys("Nutella",Keys.ENTER);

        // 5- aramayapildigini test edin
        WebElement resultText=driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        Assert.assertTrue(resultText.isDisplayed());

        // 6- arama sonucunun Nutella icerdigini test edin
        Assert.assertTrue(resultText.getText().contains("Kutella"));
    }
}
