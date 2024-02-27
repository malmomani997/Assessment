package DmTask.PagesHelper;

import DmTask.SharedElements.SharedElementsHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DmServicesPageHelper extends SharedElementsHelper {

    WebDriver driver;

    public DmServicesPageHelper(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    private @FindBy(xpath = "//div//h1[@class='mx-title mx-name-pageTitle3 text-white background-text']")
    WebElement servicePageTitle;

    private @FindBy(xpath = "//h3[text()='Individual Services']")
    WebElement individualServicesSection;

    private @FindBy(xpath = "//h3[text()='Business Services']")
    WebElement businessServicesSection;

    private @FindBy(xpath = "//h3[text()='Government Services']")
    WebElement governmentServicesSection;

    private @FindBy(xpath = "//h3[text()='Emirati']")
    WebElement emaratiSection;

    public WebElement getIndividualServicesSection() {
        return individualServicesSection;
    }

    public WebElement getBusinessServicesSection() {
        return businessServicesSection;
    }

    public WebElement getGovernmentServicesSection() {
        return governmentServicesSection;
    }

    public WebElement getEmaratiSection() {
        return emaratiSection;
    }

    public WebElement getServicePageTitle() {
        waitForElementToAppearWithFindElement(servicePageTitle);
        return servicePageTitle;
    }

}
