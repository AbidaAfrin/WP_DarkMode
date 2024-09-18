package testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePageWordPress;
import pages.LogInPage;
import pages.WPDarkMode;
import utilities.BrowserSetup;

public class TestDarkModeValidation extends BrowserSetup {
    HomePageWordPress homePageWordPress = new HomePageWordPress();
    LogInPage logInPage = new LogInPage();
    WPDarkMode wpDarkMode = new WPDarkMode();

//    @BeforeMethod
//
//    public void loadSignInPage() {
//        getBrowser().get(homePageWordPress.url);
//        homePageWordPress.clickOnElement(homePageWordPress.logInButton);
//        logInPage.writeOnElement(logInPage.usernameInputBox, logInPage.username);
//        logInPage.writeOnElement(logInPage.passwordInputBox, logInPage.password);
//        logInPage.clickOnElement(logInPage.logInButton);
//    }








//    @Test
//    public void testDarkMode(){
//
//        wpDarkMode.darkMode();
//        // Assert that the background color has changed
//        Assert.assertNotEquals(wpDarkMode.bgColorBefore,wpDarkMode.bgColorAfter,"Dark mode is not applied!");
//    }


    @Test
    public void testDarkMode() throws InterruptedException {
        // Get the background color before enabling dark mode
        String bgColorBefore = wpDarkMode.getBackgroundColor();
        System.out.println("before color:"+bgColorBefore);
        wpDarkMode.addScreenshot("Background color before");

        // Enable dark mode
        wpDarkMode.darkMode();
     //   Thread.sleep(2000);

        // Allow time for the UI to update
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Get the background color after enabling dark mode
        String bgColorAfter = wpDarkMode.getBackgroundColor();
        System.out.println("After color:"+bgColorAfter);
        wpDarkMode.addScreenshot("Background color after");

        // Assert that the background color has changed
        Assert.assertNotEquals(bgColorBefore, bgColorAfter, "Dark mode is not applied!");
    }

}
