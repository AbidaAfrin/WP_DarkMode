package testcases;


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

       plugins.clickOnPlugins();
       plugins.addScreenshot("After clicking plugins button");

       plugins.checkWPDarkModePluginStatus(); //Check if "WP Dark Mode" plugin is active,if not install & activate

    }






}
