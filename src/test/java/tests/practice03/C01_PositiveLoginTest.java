package tests.practice03;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.RentalPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C01_PositiveLoginTest {
    RentalPage rentalPage=new RentalPage();
    @Test
    public void test01() {
        // https://www.bluerentalcars.com/ adresine gidin
        Driver.getDriver().get(ConfigReader.getProperty("rentalUrl"));

        // login butonuna basin
        rentalPage.firstLoginButton.click();

        // test data user email: customer@bluerentalcars.com
        rentalPage.emailTextBox.sendKeys(ConfigReader.getProperty("rentalValidEmail"));

        // test data password : 12345
        rentalPage.passwordBox.sendKeys(ConfigReader.getProperty("rentalValidPassword"));

        // login butonuna tiklayin
        rentalPage.secondLoginButton.click();

        // degerleri girdikten sonra sayfaya basarili giris yapildigini test et
        String actualUserName=rentalPage.loggedAsAUserName.getText();
        String expectedUserName=ConfigReader.getProperty("rentalValidUserName");
        Assert.assertEquals(actualUserName,expectedUserName);

        // sayfayi kapatin
        Driver.closeDriver();

    }
}
