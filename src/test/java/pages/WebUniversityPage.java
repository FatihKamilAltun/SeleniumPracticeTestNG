package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.List;

public class WebUniversityPage {
    public WebUniversityPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//input[@placeholder='Add new todo']")
    public WebElement addNewTodo;

    @FindBy(xpath = "//li")
    public List<WebElement> drowButtons;

    @FindBy(xpath = "//i[@class='fa fa-trash']")
    public List<WebElement> deleteButtons;
}
