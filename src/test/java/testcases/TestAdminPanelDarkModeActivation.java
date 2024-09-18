package testcases;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AdminPanelPage;
import utilities.BrowserSetup;

public class TestAdminPanelDarkModeActivation extends BrowserSetup {

    AdminPanelPage adminPanelPage = new AdminPanelPage();
@Test
    public void testAdminPanelDarkMode()  {
        adminPanelPage.enableDarkMode();
        adminPanelPage.addScreenshot("After Enabling Admin Dark Mode");
        //Thread.sleep(2000);
        Assert.assertTrue(adminPanelPage.displayStatus(adminPanelPage.lightDarkIcon));
        adminPanelPage.navigateDarkMode();
        adminPanelPage.addScreenshot("Navigate Dark Mode");



    }
}
