package pages;

import org.openqa.selenium.By;

public class HomePageWordPress extends BasePage {

    public String url="http://localhost/mywordpress/wp-admin/";

    public By logInButton = By.xpath("//a[contains(text(),'Log in')]");
    public By userIcon= By.cssSelector(".avatar.avatar-26.photo");

    public By myWordPress = By.xpath("//a[@role='menuitem'][text()='My Wordpress']");
    public By plugins = By.xpath("//a[text()='Plugins']");


}
