package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class ProjectPages {
    public ProjectPages() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[text()='Sign Out']")
    public WebElement signOutButton;

    @FindBy(xpath = "//h2[text()='My Account']")
    public WebElement myAccountPageTitle;

    @FindBy(xpath = "//*[text()='Store Manager']")
    public WebElement myAccountPageStoreManagerMenu;

    @FindBy(xpath = "//h2[text()='Store Manager']")
    public WebElement storeManagerPageTitle;

    @FindBy(xpath = "//span[contains(text(),'Products')]")
    public WebElement storeManagerPageProductsMenu ;

    @FindBy(xpath = "//span[@class='wcfm-page-heading-text']")
    public WebElement storeManagerPageProductsSubPage;

    @FindBy(xpath = "//span[text()='Add New']")
    public WebElement storeManagerPageProductsSubPageAddNewButton ;

    @FindBy(xpath = "//span[@class='wcfm-page-heading-text']")
    public WebElement storeManagerPageManageProductSubPage;

    @FindBy(xpath = "(//*[text()='Toptan Ürün Gösterme Ayarları'])[1]")
    public WebElement storeManagerPageManageProductSubPageToptanUrunGostermeButton;

    @FindBy(xpath = "(//*[text()='Piece Type'])[1]")
    public WebElement storeManagerPageManageProductSubPagePieceTypeTitle;

    @FindBy(xpath = "(//*[text()='Units Per Piece'])[1]")
    public WebElement storeManagerPageManageProductSubPageUnitsPerPieceTitle;

    @FindBy(xpath = "(//*[text()='Min Order Quantity?'])[1]")
    public WebElement storeManagerPageManageProductSubPageMinOrderQuantityTitle;

    @FindBy(xpath = "//span[@class='icon-box-icon icon-orders']")
    public WebElement myAccountPageOrdersIcon;

    @FindBy(xpath = "//span[@class='icon-box-icon icon-downloads']")
    public WebElement myAccountPageDownloadsIcon;

    @FindBy(xpath = "//span[@class='icon-box-icon icon-addresses']")
    public WebElement myAccountPageAddressesIcon;

    @FindBy(xpath = "//span[@class='icon-box-icon icon-account']")
    public WebElement myAccountPageAccountDetailsIcon;

    @FindBy(xpath = "//label[@for='account_first_name']")
    public WebElement myAccountPageAccountDetailsSubPageFirstNameText;

    @FindBy(xpath = "//label[@for='account_last_name']")
    public WebElement myAccountPageAccountDetailsSubPageLastNameText;

    @FindBy(xpath = "//label[@for='account_display_name']")
    public WebElement myAccountPageAccountDetailsSubPageDisplayNameText;

    @FindBy(xpath = "//label[@for='account_email']")
    public WebElement myAccountPageAccountDetailsSubPageEmailText;

    @FindBy(xpath = "//label[@for='user_description']")
    public WebElement myAccountPageAccountDetailsSubPageBiografyText;

    @FindBy(xpath = "//body[@id='tinymce']")
    public WebElement myAccountPageAccountDetailsSubPageBiografyBox;

    @FindBy(xpath = "//button[@name='save_account_details']")
    public WebElement myAccountPageAccountDetailsSubPageSaveChangesButton;

    @FindBy(xpath = "//*[text()='Account details changed successfully.']")
    public WebElement myAccountPageAccountDetailsSubPageSuccessChangesText;


}
