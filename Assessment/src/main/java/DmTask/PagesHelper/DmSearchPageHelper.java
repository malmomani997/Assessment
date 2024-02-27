package DmTask.PagesHelper;

import DmTask.SharedElements.SharedElementsHelper;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DmSearchPageHelper extends SharedElementsHelper {

    WebDriver driver;

    public DmSearchPageHelper(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    private @FindBy(xpath = "//div//h2")
    WebElement searchedNewsTitle;

    public WebElement getSearchedNewsTitle() {
        waitForElementToAppearWithFindElement(searchedNewsTitle);
        return searchedNewsTitle;
    }
}
