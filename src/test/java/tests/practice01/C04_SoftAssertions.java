package tests.practice01;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import utilities.TestBase;

public class C04_SoftAssertions extends TestBase {
    @Test
    public void test01() {
        /*
        Soft Assertion başlangıç ve bitiş satırları arasındaki tum assertionsları yapıp
        bitis satirina geldiginde bize buldugu tum hatalari rapor eder

        Soft assertion'un baslangici obje olusturmaktir
         */

        SoftAssert softAssert=new SoftAssert();

        // 1- amazon anasayfasına gidin
        driver.get("https://amazon.com");

        // 2- title'in Amazon icerdigini test edin
        String expectedTitle="Amazon";
        String actualTitle=driver.getTitle();
        softAssert.assertTrue(actualTitle.contains(expectedTitle),"title amazon icermiyor");

        // 3- arama kutusunun erisilebilir oldugunu test edin
        WebElement searchBox=driver.findElement(By.id("twotabsearchtextbox"));
        softAssert.assertTrue(searchBox.isEnabled(),"arama kutusuna erisilemiyor");

        // 4- arama kutusuna Nutella yazdirip aratin
        searchBox.sendKeys("Nutella", Keys.ENTER);

        // 5- aramayapildigini test edin
        WebElement resultText=driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        softAssert.assertTrue(resultText.isDisplayed(),"sonuc yazisi gorunmuyor");

        // 6- arama sonucunun Nutella icerdigini test edin
        softAssert.assertTrue(resultText.getText().contains("Nutella"),"sonuc yazisi Nutella icermiyor");

        // softAssert'a bitiş satirini söylemek için assertAll() kullanılır
        softAssert.assertAll();

        // softAssert'un hata bulsa bile calismaya devam etme ozelligi
        // assertAll'a kadardir. Eger assertAll'da failed rapor edilirse class'in kalan kismi calismaz
        // assertAll hard assert'deki her bir assert gibidir. Hatayı yakalarsa calisma durur
        System.out.println("Assertionlarda hata varsa bu satir calismayacak");
    }
}
