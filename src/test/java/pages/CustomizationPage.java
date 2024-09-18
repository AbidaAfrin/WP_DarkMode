package pages;

import org.openqa.selenium.By;

public class CustomizationPage extends BasePage{


    public By customizationButton = By.xpath("//h4[text()='Customization']");
    public By switchSettings = By.xpath("//a[text()='Switch Settings']");
    public By scrollDown1 = By.xpath("//body//div//div[10]");
    public By floatingSwitchStyle = By.cssSelector("body > div:nth-child(3) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(5) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > section:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > div:nth-child(1)");
    public By saveChangesButton1 = By.xpath("//button[text()='Save Changes']");
    public By scrollDown2 = By.cssSelector("#switch-animation");
  //  public By scrollDown2 = By.cssSelector("body > div:nth-child(3) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(5) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > section:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(4) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(1)");

    public By switchSizeCustom = By.cssSelector("body > div:nth-child(3) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(5) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > section:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(4) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(6) > span:nth-child(1)");
    public By switchSizeScale = By.xpath("//input[@type='number' and contains(@class, 'px-2.5')]");
    public String switchSize ="220";
  //  public By saveChangesButton2 = By.xpath("//button[text()='Save Changes']")
    public By switchPositionLeft = By.cssSelector("body > div:nth-child(3) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(5) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > section:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(4) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1)");
    public By scrollDown3 = By.xpath("//section[@class=\"w-full border border-purple-400 sm:border-gray-100 shadow shadow-gray-100 px-8 sm:px-16 py-6 sm:py-10 flex gap-4 rounded-lg after:content-[''] relative after:absolute after:top-0 after:right-0 after:w-1/2 after:h-full overflow-hidden bg-white after:bg-gradient-to-r after:from-white after:to-purple-800 after:z-0 after:opacity-30\"]");
    public By accessibility = By.xpath("//a[normalize-space()='Accessibility']");
    public By keyboardShortcut = By.cssSelector(".relative.w-10.h-full.rounded-full.transition.duration-100.bg-blue-600");
    public By siteAnimation = By.xpath("//a[text()='Site Animation']");
    public By enableAnimation = By.cssSelector(".relative.w-10.h-full.rounded-full.transition.duration-100.bg-slate-200");
    public By switchAnimationEffectLink = By.xpath("//a[text()='Switch Attention Effect']");
    public By switchAnimationEffect = By.cssSelector("div[class='relative w-10 h-full rounded-full transition duration-100 bg-slate-200'] span[class='w-5 h-5 flex rounded-full mt-0.5 ml-0.5 transition duration-100 border-4 border-white bg-slate-200']");






    public void customizeSwitchStyles(){
        clickOnElement(customizationButton);
        clickOnElement(switchSettings);
        scroll(scrollDown1);
        clickOnElement(floatingSwitchStyle);
        clickOnElement(saveChangesButton1);
    }

    public void customSwitchSize() throws InterruptedException {
        clickOnElement(customizationButton);
        clickOnElement(switchSettings);
        scroll(scrollDown2);
        Thread.sleep(2000);
        clickOnElement(switchSizeCustom);
        Thread.sleep(2000);
        clickOnElement(switchSizeScale);
        writeOnElement(switchSizeScale, switchSize);
        Thread.sleep(2000);
        clickOnElement(saveChangesButton1);
        Thread.sleep(2000);

    }

    public void customSwitchPosition() throws InterruptedException {
//        clickOnElement(customizationButton);
//        clickOnElement(switchSettings);
      //  scroll(scrollDown3);
       // Thread.sleep(2000);
        clickOnElement(switchPositionLeft);
        Thread.sleep(2000);
        clickOnElement(saveChangesButton1);
        Thread.sleep(2000);

    }

    public void accessibilitySettings() throws InterruptedException {
        scroll(scrollDown3);
        Thread.sleep(2000);
        clickOnElement(accessibility);
        Thread.sleep(2000);
        clickOnElement(keyboardShortcut);
        Thread.sleep(2000);
        clickOnElement(saveChangesButton1);
        Thread.sleep(2000);


    }


    public void siteAnimationSettings() throws InterruptedException {
//        clickOnElement(customizationButton);
        scroll(siteAnimation);
        Thread.sleep(2000);
        clickOnElement(siteAnimation);
        Thread.sleep(2000);
       // scroll(enableAnimation);
        scrollUp();
        Thread.sleep(2000);
        clickOnElement(enableAnimation);
        Thread.sleep(2000);
        clickOnElement(saveChangesButton1);
        Thread.sleep(2000);
        clickOnElement(switchAnimationEffectLink);
        Thread.sleep(2000);
        clickOnElement(switchAnimationEffect);
        Thread.sleep(2000);
        clickOnElement(saveChangesButton1);


    }
}
