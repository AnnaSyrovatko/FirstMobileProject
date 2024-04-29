package com.remindly.tests;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LicenceTest extends TestBase{

    @BeforeMethod
    public void precondition(){
        app.getMainScreen().confirm();
    }
    @Test
    public void isLicencesPresentPositiveTest(){
        app.getMainScreen().openKebabMenu();
        app.getLicences().tapReadLicences();
        Assert.assertTrue(app.getLicences().isLicencesTextPresent());
    }

    @AfterMethod
    public void exit(){
        app.getLicences().getBackToMainPage();
    }
}
