package com.web.pages;

import com.web.pageobjects.Login;

import com.web.utils.PropertyUtils;
import com.web.utils.SeleniumUtils;
import com.web.utils.WaitUtils;
import org.openqa.selenium.WebDriver;

import java.time.Duration;

public class LoginPage extends Login {
    SeleniumUtils seleniumUtils = new SeleniumUtils();
    WaitUtils waitUtils = new WaitUtils();

    public LoginPage(WebDriver driver) {
        super(driver);
    }


    public void loginWithCredentials() {
        userName.sendKeys(PropertyUtils.getPropertyValue("username"));
        password.sendKeys(PropertyUtils.getPropertyValue("password"));
        logInBtn.click();
    }

    public void isLoginPageDisplayed(){
        waitUtils.explicitElementToBeClickable(driver,Duration.ofSeconds(10),userName);
        seleniumUtils.isElementDisplayed(logInBtn);
    }

    public void enterCredentials(String usernameData, String passwordData) {
        userName.sendKeys(usernameData);
        password.sendKeys(passwordData);
    }

  public void clickLogin(){
      logInBtn.click();
  }

    public void isDashboardDisplayed(){
        waitUtils.explicitElementToBeClickable(driver,Duration.ofSeconds(10),dashboard);
        seleniumUtils.isElementDisplayed(dashboard);
    }

    public void isErrorMessageDisplayed(){
        waitUtils.explicitElementToBeClickable(driver,Duration.ofSeconds(10),logInBtn);
        seleniumUtils.isElementDisplayed(errorMessage);
    }
}



