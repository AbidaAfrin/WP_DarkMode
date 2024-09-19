package testcases;

import org.testng.annotations.Test;
import pages.CustomizationPage;
import utilities.BrowserSetup;

public class TestCustomization extends BrowserSetup {
    CustomizationPage customizationPage = new CustomizationPage();

@Test
    public void testFloatingSwitchSettings(){
        customizationPage.customizeSwitchStyles();
        customizationPage.addScreenshot("Change the “Floating Switch Style” from the default selections");
    }


    @Test

    public void testFloatingSwitchSize()  {
    customizationPage.customSwitchSize();
    customizationPage.addScreenshot("Selecting Custom Switch size & Scale it to 220");
    }

    @Test

    public void testSwitchPosition()  {
    customizationPage.customSwitchPosition();
    customizationPage.addScreenshot("Change the Floating Switch Position (Left).");
    }


    @Test
    public void testAccessibilitySettings()  {
    customizationPage.accessibilitySettings();
    customizationPage.addScreenshot("Disable the Keyboard Shortcut from the Accessibility Settings");
    }
@Test
    public void testSiteAnimationSettings() {
    customizationPage.siteAnimationSettings();
    customizationPage.addScreenshot("change the Animation Effect from the default selection");
}

}
