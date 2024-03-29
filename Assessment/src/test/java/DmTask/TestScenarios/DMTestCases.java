package DmTask.TestScenarios;

import DmTask.TestHelpers.BaseTest;
import DmTask.TestHelpers.Retry;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DMTestCases extends BaseTest {

    @Test(dataProvider = "userData" , retryAnalyzer = Retry.class)
    public void LoginToDMTest(String username , String password , String fullName){
        Assert.assertTrue(getDmHomePageHelper().elementIsDisplayed(getDmHomePageHelper().getDmHeader()) , "the header in the home page wasn't displayed");
        getDmHomePageHelper().getLoginButton().click();
        Assert.assertTrue(getDmHomePageHelper().elementIsDisplayed(getDmHomePageHelper().getLoginForm()) , "login form wasn't displayed");
        getDmHomePageHelper().getUsernameField().sendKeys(username);
        getDmHomePageHelper().getPasswordField().sendKeys(password);
        getDmHomePageHelper().getConfirmLoginButton().click();
        Assert.assertEquals(getUserDashboardPageHelper().getDashboardUsernameWelcomeMessage().getText(), fullName+"!" , "the correct full name wasn't displayed correctly");
        Assert.assertTrue(getUserDashboardPageHelper().elementIsDisplayed(getUserDashboardPageHelper().getMyDashboard()) , "my dashboard option wasn't displayed");
        Assert.assertTrue(getUserDashboardPageHelper().elementIsDisplayed(getUserDashboardPageHelper().getMyProfile()) , "my profile option wasn't displayed");
        Assert.assertTrue(getUserDashboardPageHelper().elementIsDisplayed(getUserDashboardPageHelper().getMyPayments()) , "my payments option wasn't displayed");
        Assert.assertTrue(getUserDashboardPageHelper().elementIsDisplayed(getUserDashboardPageHelper().getAllServices()) , "all services option wasn't displayed");
        Assert.assertTrue(getUserDashboardPageHelper().elementIsDisplayed(getUserDashboardPageHelper().getFavoriteServices()) ,"favorite services option wasn't displayed");

    }


    @Test(dataProvider = "userData" , retryAnalyzer = Retry.class)
    public void LogoutFromDMTest(String username , String password , String fullName) {
        Assert.assertTrue(getDmHomePageHelper().elementIsDisplayed(getDmHomePageHelper().getDmHeader()) , "the header in the home page wasn't displayed");
        getDmHomePageHelper().getLoginButton().click();
        Assert.assertTrue(getDmHomePageHelper().elementIsDisplayed(getDmHomePageHelper().getLoginForm()) , "login form wasn't displayed");
        getDmHomePageHelper().getUsernameField().sendKeys(username);
        getDmHomePageHelper().getPasswordField().sendKeys(password);
        getDmHomePageHelper().getConfirmLoginButton().click();
        Assert.assertEquals(getUserDashboardPageHelper().getDashboardUsernameWelcomeMessage().getText(), fullName+"!" , "the correct full name wasn't displayed correctly");
        getUserDashboardPageHelper().getProfileButton().click();
        getUserDashboardPageHelper().getLogoutButton().click();
        Assert.assertTrue(getDmHomePageHelper().elementIsDisplayed(getDmHomePageHelper().getDmHeader()) , "the header logo wasn't displayed that means the logout wasn't successful");
    }


    @Test(dataProvider = "searchData" , retryAnalyzer = Retry.class)
    public void searchEngineNewsTest(String searchText){
        Assert.assertTrue(getDmHomePageHelper().elementIsDisplayed(getDmHomePageHelper().getDmHeader()) , "the header in the home page wasn't displayed");
        getDmHomePageHelper().getSearchFiled().click();
        getDmHomePageHelper().getSearchFiled().sendKeys(searchText);
        Assert.assertTrue(getDmSearchPageHelper().elementIsDisplayed(getDmSearchPageHelper().getSearchResultBox()) , "Search results box wasn't displayed");
        getDmHomePageHelper().getSearchAutoCompleteFirstResult(searchText).click();
        Assert.assertEquals(getDmSearchPageHelper().getSearchedNewsTitle().getText() , searchText , "the searched result doesn't equals the expected result");
    }

    @Test(retryAnalyzer = Retry.class)
    public void dmServicesSectionTest(){
        Assert.assertTrue(getDmHomePageHelper().elementIsDisplayed(getDmHomePageHelper().getDmHeader()) , "the header in the home page wasn't displayed");
        getDmHomePageHelper().getServicesTabButton().click();
        Assert.assertEquals(getDmServicesPageHelper().getServicePageTitle().getText() , "Services" ,"page title isn't correct");
        Assert.assertTrue(getDmServicesPageHelper().elementIsDisplayed(getDmServicesPageHelper().getIndividualServicesSection()) , "Individual service section wasn't displayed");
        Assert.assertTrue(getDmServicesPageHelper().elementIsDisplayed(getDmServicesPageHelper().getBusinessServicesSection()) ,"Business service section wasn't displayed");
        Assert.assertTrue(getDmServicesPageHelper().elementIsDisplayed(getDmServicesPageHelper().getGovernmentServicesSection()) ,"Government section wasn't displayed");
        Assert.assertTrue(getDmServicesPageHelper().elementIsDisplayed(getDmServicesPageHelper().getEmaratiSection()) ,"Emarati section wasn't displayed");

    }

    @Test(retryAnalyzer = Retry.class)
    public void dmInterfaceInArabicTest(){
        Assert.assertTrue(getDmHomePageHelper().elementIsDisplayed(getDmHomePageHelper().getDmHeader()) , "the header in the home page wasn't displayed");
        getDmHomePageHelper().getArabicLanguageButton().click();
        Assert.assertEquals(getDmHomePageHelper().getEnglishLanguageButton().getText() , "English" , "the expected translation wasn't displayed");
        Assert.assertEquals(getDmHomePageHelper().getMainPageTab().getText() , "الصفحة الرئيسية" , "the expected translation wasn't displayed");
        Assert.assertEquals(getDmHomePageHelper().getAboutDm().getText() , "عن بلدية دبي" , "the expected translation wasn't displayed");
    }


    @Test(retryAnalyzer = Retry.class)
    public void verifySocialMediaIconsInFooter(){
        Assert.assertTrue(getDmHomePageHelper().elementIsDisplayed(getDmHomePageHelper().getDmHeader()) , "the header in the home page wasn't displayed");
        getDmHomePageHelper().scrollToElement(getDmHomePageHelper().getFooterSection());
        Assert.assertTrue(getDmHomePageHelper().elementIsDisplayed(getDmHomePageHelper().getFooterSection()), "Footer section isn't displayed");
        Assert.assertTrue(getDmHomePageHelper().elementIsDisplayed(getDmHomePageHelper().getFacebookIcon()), "Facebook icon wasn't displayed in the footer section");
        Assert.assertTrue(getDmHomePageHelper().elementIsDisplayed(getDmHomePageHelper().getTwitterIcon()), "Twitter icon wasn't displayed in the footer section");
        Assert.assertTrue(getDmHomePageHelper().elementIsDisplayed(getDmHomePageHelper().getYoutubeIcon()), "Youtube icon wasn't displayed in the footer section");
        Assert.assertTrue(getDmHomePageHelper().elementIsDisplayed(getDmHomePageHelper().getInstagramIcon()), "Instagram icon wasn't displayed in the footer section");
    }


    @Test
    public void verifyMissionAndValueSectionInAboutUs(){
        Assert.assertTrue(getDmHomePageHelper().elementIsDisplayed(getDmHomePageHelper().getDmHeader()) , "the header in the home page wasn't displayed");
        getDmHomePageHelper().getAboutUsTopNav().click();
        Assert.assertTrue(getDmHomePageHelper().elementIsDisplayed(getDmHomePageHelper().getSubMenu()) , "Submenu wasn't displayed");
        String optionTitle = getDmHomePageHelper().getSecondOptionInSubMenu().getText();
        getDmHomePageHelper().getSecondOptionInSubMenu().click();
        Assert.assertTrue(getDmHomePageHelper().elementIsDisplayed(getDmHomePageHelper().getDmHeader()) , "the header in the home page wasn't displayed");
        Assert.assertEquals(optionTitle , getDmHomePageHelper().getSubmenuPageTitle().getText(), "the name of the option in the submenu and the title page aren't equal");
    }

}