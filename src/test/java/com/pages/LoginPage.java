package com.pages;

import com.Utilities.ConfigurationReader;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage {

    @FindBy(name = "username")
    public WebElement userName;

    @FindBy(name = "password")
    public WebElement passwd;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement loginButton;

    @FindBy(id = "sessionDropdown")
    public WebElement admin;

    public void login(){
        userName.sendKeys(ConfigurationReader.get("username"));
        passwd.sendKeys(ConfigurationReader.get("password"));
        loginButton.click();
   }



}
