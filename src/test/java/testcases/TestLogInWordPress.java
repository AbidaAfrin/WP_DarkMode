package testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePageWordPress;
import pages.LogInPage;
import utilities.BrowserSetup;

public class TestLogInWordPress extends BrowserSetup {

    HomePageWordPress homePageWordPress = new HomePageWordPress();
    LogInPage logInPage = new LogInPage();




    @BeforeMethod
    public void loadSignInPage() {
        getBrowser().get(homePageWordPress.url);
        homePageWordPress.clickOnElement(homePageWordPress.logInButton);
    }


    @Test
    public void testLoginWithValidCredentials() {

        logInPage.addScreenshot("Before adding data");
        logInPage.writeOnElement(logInPage.usernameInputBox, logInPage.username);
        logInPage.writeOnElement(logInPage.passwordInputBox, logInPage.password);
        logInPage.addScreenshot("After add data");
        logInPage.clickOnElement(logInPage.logInButton);
        logInPage.addScreenshot("After login");
        Assert.assertTrue(homePageWordPress.displayStatus(homePageWordPress.userIcon));

    }



}
