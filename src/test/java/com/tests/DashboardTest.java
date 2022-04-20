package com.tests;

import com.Utilities.ConfigurationReader;
import com.Utilities.Driver;
import com.pages.DashboardPage;
import com.pages.LoginPage;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class DashboardTest {

    LoginPage loginPage = new LoginPage();
    DashboardPage dashboardPage = new DashboardPage();
    WebDriver driver;
    WebDriverWait wait;

    @Before
    public void setUp() {
        driver = Driver.get();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get(ConfigurationReader.get("url"));
        wait = new WebDriverWait(driver, 10);
    }

    @Test
    public void DashboardTest() throws InterruptedException {
        loginPage.userName.clear();
        loginPage.passwd.clear();
        loginPage.login();
        Thread.sleep(1000);
        Assert.assertTrue(dashboardPage.newPlan.isDisplayed());

        dashboardPage.keywords.click();
        Thread.sleep(1000);
        Assert.assertTrue(dashboardPage.newKeyword.isDisplayed());

        dashboardPage.parameters.click();
        Thread.sleep(1000);
        Assert.assertTrue(dashboardPage.newParameter.isDisplayed());
    }

    @After
    public void tearDown(){
        driver.close();
    }
}