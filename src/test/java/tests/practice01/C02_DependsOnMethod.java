package tests.practice01;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.time.Duration;

public class C02_DependsOnMethod {
    /*
    DependsOnMethod, test methodlarinin calisma siralamasina karismaz.
    Sadece bagli olan test baglandigi testin sonucuna bakar
    Baglandigi test passed olmaz ise baglanan test hic calismaz(ignore)
     */
    WebDriver driver;

    @BeforeClass
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        System.out.println("Before Class");
    }

    @AfterClass
    public void tearDown() {
        driver.close();
    }

    @Test
    public void test01() {
        // Amazon'a gidelim
        driver.get("https://amazon.com");
    }

    @Test (dependsOnMethods ="test01")
    public void test02() {
        // Nutella aratalim
        WebElement searchBox = driver.findElement(By.id("twotabsearchtextbox"));
        searchBox.sendKeys("Nutella", Keys.ENTER);
    }

    @Test(dependsOnMethods ="test02")
    public void test03() {
        // Sonuc yazisinin Nutella icerdigini test edelim
        WebElement resultText = driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']"));
        Assert.assertTrue(resultText.getText().contains("Nutella"));
    }
}
