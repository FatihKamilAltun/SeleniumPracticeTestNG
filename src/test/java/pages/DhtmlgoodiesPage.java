package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DhtmlgoodiesPage {
    public DhtmlgoodiesPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    // Capitals

    @FindBy(xpath = "//div[@id='box1']")
    public WebElement oslo;

    @FindBy(xpath = "//div[@id='box2']")
    public WebElement stockholm;

    @FindBy(xpath = "//div[@id='box3']")
    public WebElement washington;

    @FindBy (xpath = "//div[@id='box4']")
    public WebElement copanhagen;

    @FindBy(xpath = "//div[@id='box5']")
    public WebElement seoul;

    @FindBy(xpath = "//div[@id='box6']")
    public WebElement rome;

    @FindBy(xpath = "//div[@id='box7']")
    public WebElement madrid;


    // Countries

    @FindBy(xpath = "//div[@id='box101']")
    public WebElement Norway;

    @FindBy(xpath = "//div[@id='box102']")
    public WebElement Sweden;

    @FindBy(xpath = "//div[@id='box103']")
    public WebElement UnitedStates;

    @FindBy(xpath = "//div[@id='box104']")
    public WebElement Denmark;

    @FindBy(xpath = "//div[@id='box105']")
    public WebElement SouthKorea;

    @FindBy(xpath = "//div[@id='box106']")
    public WebElement Italy;

    @FindBy(xpath = "//div[@id='box107']")
    public WebElement Spain;




}
