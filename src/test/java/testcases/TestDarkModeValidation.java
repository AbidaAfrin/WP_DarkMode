package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.WPDarkMode;
import utilities.BrowserSetup;

public class TestDarkModeValidation extends BrowserSetup {

    WPDarkMode wpDarkMode = new WPDarkMode();



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
