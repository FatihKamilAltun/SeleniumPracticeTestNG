package tests.practiceLessons02;

import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import pages.DhtmlgoodiesPage;
import utilities.Driver;

public class P01 {
    // Go to URL : http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html
    // Fill in capitals by country.

    @Test
    public void test01() {
        // Go to URL : http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html
        Driver.getDriver().get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");


        DhtmlgoodiesPage dhtmlgoodiesPage=new DhtmlgoodiesPage();
        Actions actions=new Actions(Driver.getDriver());

        // Fill in capitals by country.
        actions
                .dragAndDrop(dhtmlgoodiesPage.rome,dhtmlgoodiesPage.Italy)
                .dragAndDrop(dhtmlgoodiesPage.madrid, dhtmlgoodiesPage.Spain)
                .dragAndDrop(dhtmlgoodiesPage.seoul, dhtmlgoodiesPage.SouthKorea)
                .dragAndDrop(dhtmlgoodiesPage.copanhagen, dhtmlgoodiesPage.Denmark)
                .dragAndDrop(dhtmlgoodiesPage.oslo, dhtmlgoodiesPage.Norway)
                .dragAndDrop(dhtmlgoodiesPage.washington, dhtmlgoodiesPage.UnitedStates)
                .dragAndDrop(dhtmlgoodiesPage.stockholm, dhtmlgoodiesPage.Sweden).perform();

        Driver.closeDriver();

        /*
        Frameworkler büyüdükçe
        yeni classlar, yeni test methodları, yeni webelementler olusturdukça
        işin icinden çıkılmaz, anlaşılmaz, tekrar bakımı yapılamaz,
        güncellemesi çok zor hatta imkansız bir hal alır
        */


        /*
        Uzmanlar
        reusable, maintainable, rahat manipule edilebilir bir framework için
        bir design pattern olarak POM : PAGE OBJECT MODELde karar vermişler
        */


        /*
        Olmazsa olmazlar
        1-) Driver class
        2-) Page class
        3-) Test class
        4-) Utilities class
         */


        /*
        Aradığımız bir webElementi ya da bir methosu kolaylıkla bulabilmek
        veya güncellemek için Java'dan öğrenmiş olduğumuz OOP konsept
        Selenium ile POM'da birleştirilmiş oluyor
         */
    }
}
