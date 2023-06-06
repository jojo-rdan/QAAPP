package org.exerciseQAAPP.configuration.mobile;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public abstract class MobileDriverManager {

    /**
     * The driver
     */
    protected final AndroidDriver <AndroidElement> driver;

    public MobileDriverManager(AndroidDriver<AndroidElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(
                driver, Duration.ofSeconds(0)), this);
    }

    public void click (AndroidElement element){
        WebDriverWait wait = new WebDriverWait(driver, 15);
        wait.until(ExpectedConditions.visibilityOf(element));
        element.click();
    }

    public boolean isElementAvailable(AndroidElement element){
        WebDriverWait wait = new WebDriverWait(driver, 3);
        try{
            wait.until(ExpectedConditions.visibilityOf(element));
            return true;
        } catch (NoSuchElementException | TimeoutException e) {
            return false;
        }
    }

    public boolean isElementAvailable (AndroidElement element, int timeout){
        WebDriverWait wait = new WebDriverWait(driver, timeout);
        try{
            wait.until(ExpectedConditions.visibilityOf(element));
            return true;
        } catch (NoSuchElementException | TimeoutException e) {
            return false;
        }
    }

}
