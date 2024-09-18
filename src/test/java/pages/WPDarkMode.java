package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static utilities.BrowserSetup.getBrowser;

public class WPDarkMode extends BasePage {

 //   WebElement body = getBrowser().findElement(By.tagName("body"));
//   public By body = By.tagName("body");
//
//   WebElement bodyProperty = getElement(body);
//
//  public  String bgColorBefore = bodyProperty.getCssValue("background");
//
//    // Enable dark mode
//   public By darkModeToggle = By.cssSelector("._track.wp-dark-mode-ignore");
//
//
//    // Get background color after enabling dark mode
//    public String bgColorAfter = bodyProperty.getCssValue("background");
//
//
//
//public void darkMode(){
//
//    clickOnElement(darkModeToggle);
//}



    public By body = By.tagName("body");
    public By darkModeToggle = By.cssSelector("._track.wp-dark-mode-ignore");

    public void darkMode() {
        // Click to toggle dark mode
        clickOnElement(darkModeToggle);
    }

    public String getBackgroundColor() {
        // Retrieve the background color after toggling dark mode
        return getElement(body).getCssValue("background-color");
    }

}
