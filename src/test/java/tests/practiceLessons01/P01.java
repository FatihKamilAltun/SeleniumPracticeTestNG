package tests.practiceLessons01;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import utilities.TestBaseBeforeMethodAfterMethod;

public class P01 extends TestBaseBeforeMethodAfterMethod {
    // ...Exercise3...
    // go to url : https://www.techlistic.com/p/selenium-practice-form.html
    //fill the firstname
    //fill the lastname
    //check the gender
    //check the experience
    //fill the date
    //choose your profession -> Automation Tester
    //choose your tool -> Selenium Webdriver
    //choose your continent -> Antartica
    //choose your command  -> Browser Commands
    //click submit button

    @Test
    public void test01() {
        // go to url : https://www.techlistic.com/p/selenium-practice-form.html
        driver.get("https://www.techlistic.com/p/selenium-practice-form.html");

        //fill the firstname
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Ali");

        //fill the lastname
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("CAN");

        //check the gender
        driver.findElement(By.xpath("//input[@id='sex-0']")).click();

        //check the experience
        driver.findElement(By.xpath("//input[@id='exp-2']")).click();

        //fill the date
        driver.findElement(By.xpath("//input[@id='datepicker']")).sendKeys("11.11.2022");

        //choose your profession -> Automation Tester
        driver.findElement(By.xpath("//input[@id='profession-1']")).click();

        //choose your tool -> Selenium Webdriver
        driver.findElement(By.xpath("//input[@id='tool-2']")).click();

        //choose your continent -> Antartica
        //        WebElement dropdownContinent =  driver.findElement(By.xpath("//select[@id='continents']"));
        //        Select select = new Select(dropdownContinent);
        //        select.selectByVisibleText("Antartica");

        driver.findElement(By.xpath("//select[@id='continents']")).sendKeys("Antartica");

        //choose your command  -> Browser Commands
        driver.findElement(By.xpath("//select[@id='selenium_commands']/option[1]")).click();

        //click submit button
        driver.findElement(By.xpath("//button[@id='submit']")).click();

    }
}
