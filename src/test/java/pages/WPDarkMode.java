package pages;

import org.openqa.selenium.By;



public class WPDarkMode extends BasePage {




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
