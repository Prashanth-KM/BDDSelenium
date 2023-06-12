package com.web.pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

    public WebDriver driver;

    public Login(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@*='username']")
    public WebElement userName;

    @FindBy(xpath = "//*[@*='password']")
    public WebElement password;

    @FindBy(xpath = "//*[contains(@class,'orangehrm-login-button')]")
    public WebElement logInBtn;

    @FindBy(xpath = "(//*[text()='Dashboard'])[2]")
    public WebElement dashboard;

    @FindBy(xpath = "//*[text()='Invalid credentials']")
    public WebElement errorMessage;


}
