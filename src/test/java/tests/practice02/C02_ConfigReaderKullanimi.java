package tests.practice02;

import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C02_ConfigReaderKullanimi {
    @Test
    public void test01() {
        // facebook anasayfaya gidin
        Driver.getDriver().get(ConfigReader.getProperty("facebookUrl"));

        // kullanici mail kutusuna yanlis bir isim yazdirin
        FacebookPage facebookPage=new FacebookPage();
        facebookPage.emailBox.sendKeys(ConfigReader.getProperty("facebookWrongUserName"));

        // kullanici sifre kutusuna yanlis bir sifre yazdirin
        facebookPage.passwordBox.sendKeys(ConfigReader.getProperty("facebookWrongPassword"));

        // login butonuna basin
        facebookPage.loginButton.click();

        // giris yapilamadigini test edin
        assert facebookPage.loginFailed.isDisplayed();

        // sayfayi kapatin
        Driver.closeDriver();

    }
}
