package DmTask.PagesHelper;

import DmTask.SharedElements.SharedElementsHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserDashboardPageHelper extends SharedElementsHelper {

    WebDriver driver;

    public UserDashboardPageHelper(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    private @FindBy(xpath = "//h2[@class='mx-text mx-name-text2']")
    WebElement dashboardUsernameWelcomeMessage;

    private @FindBy(css = "[data-button-id=\"176.LoginModule.Home.actionButton117\"]")
    WebElement myDashboard;

    private @FindBy(css = "[data-button-id='176.LoginModule.Home.actionButton119']")
    WebElement myProfile;

    private @FindBy(css = "[data-button-id='176.LoginModule.Home.actionButton115']")
    WebElement myPayments;

    private @FindBy(css = "[data-button-id='176.LoginModule.Home.actionButton2']")
    WebElement allServices;

    private @FindBy(css = "[data-button-id='176.LoginModule.Home.actionButton3']")
    WebElement favoriteServices;

    private @FindBy(css = "[data-button-id='308.DM_UI.HeaderMenu.actionButton6']")
    WebElement profileButton;

    private @FindBy(css = "[data-button-id='308.DM_UI.DropdownProfile.actionButton4.127']")
    WebElement logoutButton;

    public WebElement getLogoutButton() {
        return logoutButton;
    }

    public WebElement getProfileButton() {
        return profileButton;
    }

    public WebElement getFavoriteServices() {
        return favoriteServices;
    }

    public WebElement getAllServices() {
        return allServices;
    }

    public WebElement getMyPayments() {
        return myPayments;
    }

    public WebElement getMyProfile() {
        return myProfile;
    }

    public WebElement getMyDashboard() {
        return myDashboard;
    }

    public WebElement getDashboardUsernameWelcomeMessage() {
        waitForElementToAppearWithFindElement(dashboardUsernameWelcomeMessage);
        return dashboardUsernameWelcomeMessage;
    }


}
