package DmTask.PagesHelper;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DmSearchPageHelper extends AbstractPageHelper {

    WebDriver driver;

    public DmSearchPageHelper(WebDriver driver) {
        super(driver);
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    private @FindBy(xpath = "//div//h2")
    WebElement searchedNewsTitle;

    private @FindBy(id = "scrollable")
    WebElement searchResultBox;

    public WebElement getSearchResultBox() {
        waitForElementToAppearWithFindElement(searchResultBox);
        return searchResultBox;
    }

    public WebElement getSearchedNewsTitle() {
        waitForElementToAppearWithFindElement(searchedNewsTitle);
        return searchedNewsTitle;
    }
}
