package tests.practice01;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.FacebookPage;
import utilities.Driver;

public class C07_PageClassKullanimi {
    @Test
    public void test01() {
        // facebook anasayfaya gidin
        Driver.getDriver().get("https://facebook.com");

        // kullanici mail kutusuna rastgele bir isim yazdirin
        Faker faker=new Faker();
        FacebookPage facebookPage=new FacebookPage();
        facebookPage.emailBox.sendKeys(faker.internet().emailAddress());

        // kullanici sifre kutusuna rastgele bir sifre yazdirin
        facebookPage.passwordBox.sendKeys(faker.internet().password());

        // login butonuna basin
        facebookPage.loginButton.click();

        // giris yapilamadigini test edin
        Assert.assertFalse(facebookPage.loginFailed.isDisplayed());
    }
}
