package pages;

import net.bytebuddy.implementation.bind.MethodDelegationBinder;
import org.openqa.selenium.By;
import org.testng.annotations.BeforeMethod;

public class Plugins extends BasePage{
    HomePageWordPress homePageWordPress = new HomePageWordPress();

    public String url="http://localhost/mywordpress/wp-admin/plugins.php?plugin_status=all&paged=1&s";
    public By searchBox = By.id("search-plugins");
    public String plugins_name = "WP Dark Mode";
    public By installWPDarkModeButton = By.xpath("//a[@aria-label='Install WP Dark Mode – WordPress Dark Mode Plugin for Improved Accessibility, Dark Theme, Night Mode, and Social Sharing 5.1.0 now']");
    public By activateWPDarkModeButton = By.xpath("//a[text()='Activate']");
   // public By dark_mode_plugin = By.xpath("//strong[text()='WooCommerce']");
    public By dark_mode_plugin = By.xpath("//tr[contains(@class, 'active') and contains(., 'WP Dark Mode')]");
  //  public By WooCommerce = By.xpath("//tr[contains(@class, 'active') and contains(., 'WooCommerce')]");
    public By addNewPlugInButton = By.xpath("//a[@href='plugin-install.php']");
    public By scrollDown = By.cssSelector("table[class='wp-list-table widefat plugins'] tfoot tr");






    public void clickOnPlugins(){

        homePageWordPress.hover(homePageWordPress.myWordPress);
        homePageWordPress.clickOnElement((homePageWordPress.plugins));

    }


//
//            clickOnElement(searchIcon);
//            clickOnElement(writerName);
//        }

        //Check if "WP Dark Mode" plugin is active
    public void checkWPDarkModePluginStatus(){
        scroll(scrollDown);
        try{
        getElement(dark_mode_plugin);
        System.out.println("WP Dark Mode Plugin is Active.");
    } catch (Exception e) {
        System.out.println("WP Dark Mode Plugin is NOT Active,need to install");
        searchPlugins();
        installWPDarkModePlugIn();
        activateWPDarkModePlugIn();
        System.out.println("WP Dark Mode Plugin Activated Successfully");


    }

    }

    public void searchPlugins(){
        clickOnElement(addNewPlugInButton);
        clickOnElement(searchBox);
        sendText(searchBox,plugins_name);
    }

    public void installWPDarkModePlugIn(){
        clickOnElement(installWPDarkModeButton);

    }

    public void activateWPDarkModePlugIn(){
        waitForVisibility(activateWPDarkModeButton);
        clickOnElement(activateWPDarkModeButton);

    }

}
