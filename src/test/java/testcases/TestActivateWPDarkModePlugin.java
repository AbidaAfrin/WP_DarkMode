package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePageWordPress;
import pages.LogInPage;
import pages.Plugins;
import utilities.BrowserSetup;

public class TestActivateWPDarkModePlugin extends BrowserSetup {

    HomePageWordPress homePageWordPress = new HomePageWordPress();
    LogInPage logInPage= new LogInPage();
    Plugins plugins = new Plugins();


   @Test
    public void testCheckWPDarkModeStatus(){
//        getBrowser().get(homePageWordPress.url);
//       homePageWordPress.clickOnElement(homePageWordPress.logInButton);
//       logInPage.writeOnElement(logInPage.usernameInputBox, logInPage.username);
//       logInPage.writeOnElement(logInPage.passwordInputBox, logInPage.password);
//       logInPage.clickOnElement(logInPage.logInButton);
       plugins.clickOnPlugins();
       plugins.addScreenshot("After clicking plugins button");

       plugins.checkWPDarkModePluginStatus();
   //    Assert.assertTrue(homePageWordPress.displayStatus(homePageWordPress.userIcon));




    }






}
