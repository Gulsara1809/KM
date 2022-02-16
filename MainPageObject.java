package lib.ui;

import io.appium.java_client.AppiumDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.regex.Pattern;

public class MainPageObject {
    protected AppiumDriver driver;
    protected Logger logger = LoggerFactory.getLogger(MainPageObject.class);

    public MainPageObject(AppiumDriver driver) {
        this.driver = driver;
    }


    public WebElement waitForElementPresent(By by, String error_message, long timeoutInSeconds) {
        try {
            WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
            //By by = By.xpath(xpath);
            wait.withMessage(error_message + "\n");
            return wait.until(ExpectedConditions.presenceOfElementLocated(by));
        } catch (TimeoutException e) {
            logger.error("Object not found: " + error_message);
            e.printStackTrace();
            throw new TimeoutException();
        }
    }


    public WebElement waitForElementPresent(By by, String error_message) {
        return waitForElementPresent(by, error_message, 5);

    }

    public WebElement waitForElementAndClick(By by, String error_message, long timeoutInSeconds) {
        WebElement element = this.waitForElementPresent(by, error_message, timeoutInSeconds);
        element.click();
        return element;
    }

    public WebElement waitForElementAndClear(By by, String error_message, long timeoutInSeconds) {
        WebElement element = this.waitForElementPresent(by, error_message, timeoutInSeconds);
        element.clear();
        return element;
    }
   /* public WebElement waitForElementPresentByXpath (By by, String error_message,long timeoutInSeconds){
        WebElement element = this.waitForElementPresent(by,error_message,timeoutInSeconds);
        element.clear();
        return element;
    }*/


    public WebElement waitForElementAndSendKeys(By by, String value, String error_message, long timeoutInSeconds) {

        WebElement element = this.waitForElementPresent(by, error_message, timeoutInSeconds);
        element.sendKeys(value);
        return element;


    }

    public boolean waitForElementNotPresent(By by, String error_message, long timeoutInSeconds) {
        WebDriverWait wait = new WebDriverWait(driver, timeoutInSeconds);
        wait.withMessage(error_message + "\n");
        return wait.until(ExpectedConditions.invisibilityOfElementLocated(by));
    }


}



