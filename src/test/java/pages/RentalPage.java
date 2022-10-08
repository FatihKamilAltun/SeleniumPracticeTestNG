package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RentalPage {
    public RentalPage() {
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//a[@class='btn btn-primary btn-sm']")
    public WebElement firstLoginButton;

    @FindBy(xpath = "//input[@id='formBasicEmail']")
    public WebElement emailTextBox;

    @FindBy(xpath = "//input[@id='formBasicPassword']")
    public WebElement passwordBox;

    @FindBy(xpath = "//button[@class='btn btn-primary']")
    public WebElement secondLoginButton;

    @FindBy(xpath = "//*[text()='John Walker']")
    public WebElement loggedAsAUserName;
}
