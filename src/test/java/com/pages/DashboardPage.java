package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BasePage{

    @FindBy(partialLinkText = " Plans")
    public WebElement plans;

    @FindBy(xpath = "//button[@ng-click='addPlan()']")
    public WebElement newPlan;

    @FindBy(css = ".glyphicon.glyphicon-record")
    public WebElement keywords;

    @FindBy(xpath = "//button[@ng-click='addFunction()']")
    public WebElement newKeyword;

    @FindBy(css = ".glyphicon.glyphicon-list-alt")
    public WebElement parameters;

    @FindBy(xpath = "//button[@ng-click='addParameter()']")
    public WebElement newParameter;



}
