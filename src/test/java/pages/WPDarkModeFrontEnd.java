package pages;

import org.openqa.selenium.By;


public class WPDarkModeFrontEnd extends BasePage {



    public By myWebPage = By.xpath("//a[text()='My Wordpress']");
    public By body = By.tagName("body");
    public By darkModeToggle = By.cssSelector("._track.wp-dark-mode-ignore");


    public void goToWebpage(){
        clickOnElement(myWebPage);

    }

    public void enableDarkMode() {
        // Click to toggle dark mode
        clickOnElement(darkModeToggle);
    }

    public String getBackgroundColor() {
        // Retrieve the background color after toggling dark mode
        return getElement(body).getCssValue("background-color");
    }



}
