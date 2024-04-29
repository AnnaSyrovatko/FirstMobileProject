package com.remindly.fw;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class LicencesHelper extends BaseHelper{
    public LicencesHelper(AppiumDriver driver) {
        super(driver);
    }

    public void tapReadLicences() {
        tap(By.id("com.blanyal.remindly:id/title"));
    }

    public boolean isLicencesTextPresent() {
        return isElementPresent(By.id("licenses_text_view"));
    }

    public void getBackToMainPage() {
        driver.navigate().back(); //android.widget.ImageButton
    }
}
