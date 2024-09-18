package pages;

import org.openqa.selenium.By;

public class AdminPanelPage extends BasePage{

    HomePageWordPress homePageWordPress = new HomePageWordPress();

    public By wPDarkModePlugin = By.xpath("//div[contains(text(),'WP Dark Mode')]");
    public By settingButton = By.xpath("//a[@class='wp-first-item wp-dark-mode-ignore'][text()='Settings']");

    public By adminPanelDarkMode = By.xpath("//a[text()='Admin Panel Dark Mode']");
   // public By enableDarkModeButton = By.cssSelector("div[class='rounded text-base flex flex-col gap-3 bg-transparent gap-5'] div:nth-child(1) label:nth-child(1) div:nth-child(1) div:nth-child(1)");
    public By enableDarkModeButton = By.cssSelector(".relative.w-10.h-full.rounded-full.transition.duration-100.bg-slate-200");

    public By saveChangesButton = By.xpath("//button[text()='Save Changes']");
    public By lightDarkIcon = By.xpath("//div[@class='switch wp-dark-mode-ignore']");



    public void enableDarkMode()  {

        hover(wPDarkModePlugin);
        clickOnElement(settingButton);
        clickOnElement(adminPanelDarkMode);
      //  Thread.sleep(2000);
        clickOnElement(enableDarkModeButton);
      //  Thread.sleep(2000);
        clickOnElement(saveChangesButton);

    }

    public void navigateDarkMode(){
        clickOnElement(lightDarkIcon);
    }
}
