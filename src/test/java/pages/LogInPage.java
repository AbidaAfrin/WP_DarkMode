package pages;

import io.github.cdimascio.dotenv.Dotenv;
import org.openqa.selenium.By;

public class LogInPage extends BasePage{

    Dotenv dotenv = Dotenv.load();
    public String username =dotenv.get("username");
    public String password =dotenv.get("password");

    

    public By usernameInputBox = By.id("user_login");
    public By passwordInputBox = By.id("user_pass");
    public By logInButton = By.id("wp-submit");


}
