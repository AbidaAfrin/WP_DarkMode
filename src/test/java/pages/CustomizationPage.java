package pages;

import org.openqa.selenium.By;

public class CustomizationPage extends BasePage{


    public By customizationButton = By.xpath("//h4[text()='Customization']");
    public By switchSettings = By.xpath("//a[text()='Switch Settings']");
    public By scrollDown1 = By.xpath("//body//div//div[10]");
    public By floatingSwitchStyle = By.cssSelector("body > div:nth-child(3) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(5) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > section:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(3) > div:nth-child(1)");
    public By saveChangesButton1 = By.xpath("//button[text()='Save Changes']");
    public By scrollDown2 = By.cssSelector("#switch-animation");
    public By switchSizeCustom = By.cssSelector("body > div:nth-child(3) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(5) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > section:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(4) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(6) > span:nth-child(1)");
    public By switchSizeScale = By.xpath("//input[@type='number' and contains(@class, 'px-2.5')]");
    public String switchSize ="220";
  //  public By saveChangesButton2 = By.xpath("//button[text()='Save Changes']")
    public By switchPositionLeft = By.cssSelector("body > div:nth-child(3) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > div:nth-child(5) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1) > section:nth-child(1) > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > div:nth-child(4) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > div:nth-child(2) > div:nth-child(1)");
    public By scrollDown3 = By.xpath("//section[@class=\"w-full border border-purple-400 sm:border-gray-100 shadow shadow-gray-100 px-8 sm:px-16 py-6 sm:py-10 flex gap-4 rounded-lg after:content-[''] relative after:absolute after:top-0 after:right-0 after:w-1/2 after:h-full overflow-hidden bg-white after:bg-gradient-to-r after:from-white after:to-purple-800 after:z-0 after:opacity-30\"]");
    public By accessibility = By.xpath("//a[normalize-space()='Accessibility']");
    public By scrollDown4 = By.cssSelector(".rounded.text-base.flex.flex-col.gap-3.bg-white.py-5.px-6.gap-5");
    public By keyboardShortcut = By.cssSelector("div[class='rounded text-base flex flex-col gap-3 bg-white py-5 px-6 gap-5'] div:nth-child(1) label:nth-child(1) div:nth-child(1) div:nth-child(1)");
    public By siteAnimation = By.xpath("//a[text()='Site Animation']");
    public By enableAnimation = By.cssSelector(".relative.w-10.h-full.rounded-full.transition.duration-100.bg-slate-200");
    public By animationPlus =By.cssSelector("div[class='rounded text-base flex flex-col gap-3 bg-gray-50 py-5 px-6 w-full max-w-xs'] div:nth-child(2) span:nth-child(1)");
    public By scrollDown5= By.xpath("//section[@class=\"w-full border border-purple-400 sm:border-gray-100 shadow shadow-gray-100 px-8 sm:px-16 py-6 sm:py-10 flex gap-4 rounded-lg after:content-[''] relative after:absolute after:top-0 after:right-0 after:w-1/2 after:h-full overflow-hidden bg-white after:bg-gradient-to-r after:from-white after:to-purple-800 after:z-0 after:opacity-30\"]");
    public By switchAnimationEffectLink = By.xpath("//a[text()='Switch Attention Effect']");
    public By switchAnimationEffect = By.cssSelector("div[class='relative w-10 h-full rounded-full transition duration-100 bg-slate-200'] span[class='w-5 h-5 flex rounded-full mt-0.5 ml-0.5 transition duration-100 border-4 border-white bg-slate-200']");
    public By vibrateEffect = By.cssSelector("div[class='flex items-center gap-2 cursor-pointer text-base leading-6 font-medium hover:opacity-75'] span[class='flex w-4 h-4 border rounded-full border-gray-400']");




// Change switch style
    public void customizeSwitchStyles(){
        clickOnElement(customizationButton);
        clickOnElement(switchSettings);
        scroll(scrollDown1);
        clickOnElement(floatingSwitchStyle);
        clickOnElement(saveChangesButton1);
    }
// change switch size
    public void customSwitchSize() {
//        clickOnElement(customizationButton);
//        clickOnElement(switchSettings);
        scroll(scrollDown2);
       // Thread.sleep(2000);
        clickOnElement(switchSizeCustom);
       // Thread.sleep(2000);
        clickOnElement(switchSizeScale);
        writeOnElement(switchSizeScale, switchSize);
     //   Thread.sleep(2000);
        clickOnElement(saveChangesButton1);
     //   Thread.sleep(2000);

    }
// change switch position
    public void customSwitchPosition()  {
//        clickOnElement(customizationButton);
//        clickOnElement(switchSettings);
      //  scroll(scrollDown3);
       // Thread.sleep(2000);
        scroll(switchAnimationEffect);
        clickOnElement(switchPositionLeft);
     // Thread.sleep(2000);
        clickOnElement(saveChangesButton1);
     //  Thread.sleep(2000);

    }
//Keyboard Shortcut from the Accessibility Settings
    public void accessibilitySettings() {
        scroll(scrollDown3);
        clickOnElement(accessibility);
        scroll(scrollDown4);
        clickOnElement(keyboardShortcut);
        clickOnElement(saveChangesButton1);



    }

// From Customization → Site Animation → “Enable Page-Transition Animation”
// & change the Animation Effect from the default selections.
    public void siteAnimationSettings()  {

        clickOnElement(siteAnimation);
        System.out.println("Click:siteAnimation");
        scrollUp();
        System.out.println("scrollUp");
        clickOnElement(enableAnimation);
        System.out.println("Click:enableAnimation");
        clickOnElement(animationPlus);
        System.out.println("Click:animationPlus");
        clickOnElement(saveChangesButton1);
        System.out.println("Click:saveChangesButton1");
        scroll(scrollDown5);
        System.out.println("scrollDown5");
        clickOnElement(switchAnimationEffectLink);
        System.out.println("Click:switchAnimationEffectLink");
        scroll(switchAnimationEffect);
        clickOnElement(switchAnimationEffect);
        System.out.println("Click:switchAnimationEffect");
        clickOnElement(saveChangesButton1);
        System.out.println("Click:saveChangesButton1");
        clickOnElement(vibrateEffect);
        System.out.println("Click:vibrateEffect");
        clickOnElement(saveChangesButton1);
        System.out.println("Click:saveChangesButton1");



    }
}
