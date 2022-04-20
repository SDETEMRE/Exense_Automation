package com.tests;


import com.Utilities.ConfigurationReader;
import com.Utilities.Driver;
import com.pages.LoginPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class LoginTest {

    LoginPage loginPage = new LoginPage();
    WebDriver driver;
    WebDriverWait wait;

    @Before
    public void setUp(){
        driver = Driver.get();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get(ConfigurationReader.get("url"));
        wait = new WebDriverWait(driver,10);
    }
    @Test
    public void LoginTest() throws InterruptedException {

        loginPage.userName.clear();
        loginPage.passwd.clear();
        Thread.sleep(1000);
        loginPage.login();
        Assert.assertTrue(loginPage.admin.isDisplayed());
    }

    @After
    public void tearDown(){
        driver.close();
    }

}