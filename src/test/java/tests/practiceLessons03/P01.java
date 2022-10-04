package tests.practiceLessons03;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.WebUniversityPage;
import utilities.Driver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Dictionary;
import java.util.List;

public class P01 {
    @Test
    public void test01() {
        // http://webdriveruniversity.com/To-Do-List/index.html adresine gidin
        Driver.getDriver().get("http://webdriveruniversity.com/To-Do-List/index.html");

        // Todos ekle: (Kahvaltıyı hazırla, Bulaşıkları yıka, Bebekle ilgilen, Çocuğunun ödevine yardım et, Selenyum çalış, Uyu)
        WebUniversityPage webUniPage=new WebUniversityPage();
        List<String> dutyList= new ArrayList<>(Arrays.asList("Kahvaltiyi Hazirla","Bulasiklari Yika","Bebekle Ilgilen","Cocugunun Odevine Yardim Et","Selenyum Calis","Uyu"));
        for (String w:dutyList
             ) {
            webUniPage.addNewTodo.sendKeys(w,Keys.ENTER);
        }


        // Tüm yapılacakların üzerini çiz.
        for (WebElement w:webUniPage.drowButtons
             ) {
            w.click();
        }

        // Tüm yapılacakları sil.
        for (WebElement w: webUniPage.deleteButtons
             ) {
            w.click();
        }

        // Tüm yapılacakların silindiğini doğrulayın.
        Assert.assertFalse(Driver.getDriver().getPageSource().contains("//li"));

    }
}
