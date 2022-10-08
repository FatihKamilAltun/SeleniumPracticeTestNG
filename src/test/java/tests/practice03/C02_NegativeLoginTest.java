package tests.practice03;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.RentalPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_NegativeLoginTest {
    RentalPage rentalPage=new RentalPage();

    @Test
    public void test01() {
        // https://www.bluerentalcars.com/ adresine gidin
        Driver.getDriver().get(ConfigReader.getProperty("rentalUrl"));

        // login butonuna basin
        rentalPage.firstLoginButton.click();

        // test data user email: admin@bluerentalcars.com
        rentalPage.emailTextBox.sendKeys(ConfigReader.getProperty("rentalWrongEmail"));

        // test data password : 54321
        rentalPage.passwordBox.sendKeys(ConfigReader.getProperty("rentalWrongPassword"));

        // login butonuna tiklayin
        rentalPage.secondLoginButton.click();

        // degerleri girdikten sonra sayfaya basarili giris yapilamadigini test et
        Assert.assertTrue(rentalPage.secondLoginButton.isDisplayed());

        // sayfayi kapatin
        Driver.closeDriver();
    }
}
