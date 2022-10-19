package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ProjectPagesAli {
    public ProjectPagesAli() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    // 001

    @FindBy(xpath = "//*[text()='Register']")
    public WebElement registerButton;

    @FindBy(xpath = "(//*[text()='Become a Vendor'])[1]")
    public WebElement becomeAVendorButton;

    @FindBy(xpath = "//input[@id='user_email']")
    public WebElement registrationPageEmailBox;

    @FindBy(xpath = "//input[@id='passoword']")
    public WebElement registrationPagePasswordBox;

    @FindBy(xpath = "//input[@id='confirm_pwd']")
    public WebElement registrationPageConfirmPasswordBox;

    @FindBy(xpath = "//input[@id='wcfm_membership_register_button']")
    public WebElement registrationPageRegisterButton;

    // 002

    @FindBy(xpath = "//*[text()='Sign In']")
    public WebElement signInButton;

    @FindBy(xpath = "//input[@id='username']")
    public WebElement signInPageUserNameBox;

    @FindBy(xpath = "//input[@id='password']")
    public WebElement signInPagePasswordBox;

    @FindBy(xpath = "//button[@value='Sign In']")
    public WebElement signInPageSignInButton;

    @FindBy(xpath = "//span[@class='icon-box-icon icon-orders']")
    public WebElement myAccountPageOrdersIcon;

    @FindBy(xpath = "//span[@class='icon-box-icon icon-downloads']")
    public WebElement myAccountPageDownloadsIcon;

    @FindBy(xpath = "//span[@class='icon-box-icon icon-addresses']")
    public WebElement myAccountPageAddressesIcon;

    @FindBy(xpath = "//span[@class='icon-box-icon icon-account']")
    public WebElement myAccountPageAccountDetailsIcon;

    @FindBy(xpath = "//span[@class='icon-box-icon icon-wishlist']")
    public WebElement myAccountPageAccountWishListIcon;

    @FindBy(xpath = "//span[@class='icon-box-icon icon-logout']")
    public WebElement myAccountPageAccountLogoutIcon;

    // 003

    @FindBy(xpath = "//*[text()='Store Manager']")
    public WebElement myAccountPageDashBoardStoreManagerMenu;

    @FindBy(xpath = "(//*[text()='Orders'])[1]")
    public WebElement myAccountPageDashBoardOrdersMenu;

    @FindBy(xpath = "(//*[text()='Downloads'])[1]")
    public WebElement myAccountPageDashBoardDownloadsMenu;

    @FindBy(xpath = "(//*[text()='Addresses'])[1]")
    public WebElement myAccountPageDashBoardAddressesMenu;

    /*@FindBy(xpath = "(//*[text()='Account details'])[1]")
    public WebElement ;

    @FindBy(xpath = "(//*[text()='Wishlist'])[2]")
    public WebElement ;*/

    // 004

    @FindBy(xpath = "//*[text()='Support Tickets']")
    public WebElement myAccountPageDashBoardSupportsTicketsMenu;

    @FindBy(xpath = "//*[text()='Followings']")
    public WebElement myAccountPageDashBoardFollowingsMenu;

    @FindBy(xpath = "(//*[text()='Logout'])[1]")
    public WebElement myAccountPageDashBoardLogoutMenu;







}
