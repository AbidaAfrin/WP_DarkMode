package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.WPDarkModeFrontEnd;
import utilities.BrowserSetup;

public class TestDarkModeValidationFrontEnd extends BrowserSetup {

    WPDarkModeFrontEnd wpDarkModeFrontEnd = new WPDarkModeFrontEnd();



    @Test
    public void testDarkModeFrontEnd() throws InterruptedException {

        wpDarkModeFrontEnd.goToWebpage();
        // Get the background color before enabling dark mode
        String bgColorBefore = wpDarkModeFrontEnd.getBackgroundColor();
        System.out.println("before color:"+bgColorBefore);
        wpDarkModeFrontEnd.addScreenshot("Background color before");

        // Enable dark mode
        wpDarkModeFrontEnd.enableDarkMode();
     //   Thread.sleep(2000);

        // Allow time for the UI to update
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Get the background color after enabling dark mode
        String bgColorAfter = wpDarkModeFrontEnd.getBackgroundColor();
        System.out.println("After color:"+bgColorAfter);
        wpDarkModeFrontEnd.addScreenshot("Background color after");

        // Assert that the background color has changed
        Assert.assertNotEquals(bgColorBefore, bgColorAfter, "Dark mode is  applied!");
    }

}
