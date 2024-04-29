package com.remindly.fw;

import com.google.common.io.Files;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class BaseHelper {

    AppiumDriver driver;

    public BaseHelper(AppiumDriver driver) {
        this.driver = driver;
    }

    public boolean isElementPresent(By locator){
        return !driver.findElements(locator).isEmpty();
    }

    public void tap(By locator) {
        driver.findElement(locator).click();
    }

    public void type(By locator, String text) {
        if(text != null){
            tap(locator);
            driver.findElement(locator).clear();
            driver.findElement(locator).sendKeys(text);
        }
        driver.navigate().back();
    }

    public void pause(int mills){
        try {
            Thread.sleep(mills);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
