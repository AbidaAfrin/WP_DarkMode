package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminPanelPage;
import utilities.BrowserSetup;

public class TestAdminPanelDarkModeActivation extends BrowserSetup {

    AdminPanelPage adminPanelPage = new AdminPanelPage();

@Test
    public void testAdminPanelDarkMode() {
    adminPanelPage.enableDarkMode();
    adminPanelPage.addScreenshot("After Enabling Admin Dark Mode");
    //Thread.sleep(2000);
    Assert.assertTrue(adminPanelPage.displayStatus(adminPanelPage.lightDarkIcon));

}
@Test
    public void testDarkModeValidationFromAdminDashboard() throws InterruptedException {
        // Get the background color before enabling dark mode
        String bgColorBefore = adminPanelPage.getBackgroundColor();
        System.out.println("before color:"+bgColorBefore);
        adminPanelPage.addScreenshot("Background color before");

        // Enable dark mode
        adminPanelPage.darkMode();
        //   Thread.sleep(2000);

        // Allow time for the UI to update
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Get the background color after enabling dark mode
        String bgColorAfter = adminPanelPage.getBackgroundColor();
        System.out.println("After color:"+bgColorAfter);
        adminPanelPage.addScreenshot("Background color after");

        // Assert that the background color has changed
        Assert.assertNotEquals(bgColorBefore, bgColorAfter, "Dark mode is not applied!");

    }


    @Test
            public void testNavigateDarkMode(){

        adminPanelPage.navigateDarkMode();
        adminPanelPage.addScreenshot("Navigate Dark Mode");
        adminPanelPage.navigateDarkMode();
        adminPanelPage.addScreenshot("Navigate Dark Mode");


    }

}
