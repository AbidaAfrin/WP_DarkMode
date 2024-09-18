package pages;

import io.qameta.allure.Allure;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.BrowserSetup;

import java.io.ByteArrayInputStream;
import java.time.Duration;

import static utilities.BrowserSetup.getBrowser;

public class BasePage {

    public WebElement getElement(By locator){
        return getBrowser().findElement(locator);
    }




    public void clickOnElement(By locator){
        getElement(locator).click();
    }


    public void writeOnElement(By locator, String text ){
        getElement(locator).clear();
        getElement(locator).sendKeys(text);
    }


    public Boolean displayStatus(By locator){
        try {
            return getElement(locator).isDisplayed();
        }catch(NoSuchElementException e){
            return false;
        }

    }

    public void scroll(By locator){
        WebElement scrollElement = getElement(locator);
        Actions actions = new Actions(getBrowser());
        actions.scrollToElement(scrollElement).build().perform();

    }

    public void scrollUp(){
        JavascriptExecutor js = (JavascriptExecutor) getBrowser();
        js.executeScript("window.scrollTo(0, 0);");
    }


    public void sendText(By locator,String value){
        getElement(locator).clear();
        getElement(locator).sendKeys(value);
    }


    public void hover(By locator){
        WebElement hoverElement = getElement(locator);
        Actions actions = new Actions(getBrowser());
        actions.clickAndHold(hoverElement).build().perform();
    }

    public void waitForVisibility(By locator){

        WebDriverWait wait = new WebDriverWait(getBrowser(), Duration.ofSeconds(120));
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

    }


    public void addScreenshot(String name){
        Allure.addAttachment(name, new ByteArrayInputStream(((TakesScreenshot)getBrowser()).getScreenshotAs(OutputType.BYTES)))  ;
    }





}
