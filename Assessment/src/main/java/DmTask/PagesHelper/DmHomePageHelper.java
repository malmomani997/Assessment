package DmTask.PagesHelper;

import DmTask.SharedElements.SharedElementsHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DmHomePageHelper extends SharedElementsHelper {

    WebDriver driver;

    public DmHomePageHelper(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    private @FindBy(id = "selectEntity")
    WebElement dmHeader;

    private @FindBy(id = "loginForm")
    WebElement loginForm;

    private @FindBy(id = "profileBtn")
    WebElement loginButton;

    private @FindBy(id = "loginForm:username")
    WebElement usernameField;

    private @FindBy(id = "loginForm:password")
    WebElement passwordField;

    private @FindBy(id = "Button_cust")
    WebElement confirmLoginButton;

    private @FindBy(xpath = "(//input[@class='icon'])[3]")
    WebElement searchFiled;

    private @FindBy(css = "li.autocomplete-item:first-child")
    WebElement searchAutoCompleteFirstResult;

    private @FindBy(css = "li[id='menu-item-302295']")
    WebElement servicesTabButton;

    private @FindBy(css = "a[title='Click to go to Arabic page']:first-child")
    WebElement arabicLanguageButton;

    private @FindBy(css = "[title='الصفحة الرئيسية']")
    WebElement mainPageTab;

    private @FindBy(css = "[title='عن بلدية دبي']")
    WebElement aboutDm;

    private @FindBy(css = "[title='تغيير إلى اللغة الإنجليزية']:first-child")
    WebElement englishLanguageButton;

    public WebElement getEnglishLanguageButton() {
        waitForElementToBeClickable(englishLanguageButton);
        return englishLanguageButton;
    }

    public WebElement getAboutDm() {
        return aboutDm;
    }

    public WebElement getMainPageTab() {
        return mainPageTab;
    }

    public WebElement getArabicLanguageButton() {
        return arabicLanguageButton;
    }

    public WebElement getServicesTabButton() {
        return servicesTabButton;
    }

    public WebElement getSearchAutoCompleteFirstResult() {
        waitForElementToAppearWithFindElement(searchAutoCompleteFirstResult);
        return searchAutoCompleteFirstResult;
    }

    public WebElement getSearchFiled() {
        return searchFiled;
    }

    public WebElement getConfirmLoginButton() {
        return confirmLoginButton;
    }

    public WebElement getPasswordField() {
        return passwordField;
    }

    public WebElement getUsernameField() {
        return usernameField;
    }

    public WebElement getDmHeader() {
        waitForElementToBeClickable(dmHeader);
        return dmHeader;
    }

    public WebElement getLoginForm() {
        return loginForm;
    }

    public WebElement getLoginButton() {
        waitForElementToAppearWithFindElement(loginButton);
        return loginButton;
    }
}
