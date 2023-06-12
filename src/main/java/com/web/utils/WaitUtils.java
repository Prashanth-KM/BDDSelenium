package com.web.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class WaitUtils {

    public void explicitStaleElementException(WebDriver driver, Duration duration, WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(ExpectedConditions.refreshed(ExpectedConditions.stalenessOf(element)));
    }

    public void implicitWait(WebDriver driver, long timeInSeconds){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(timeInSeconds));
    }

    public void explicitElementVisibility(WebDriver driver, Duration duration, WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public void explicitPresenceOfElementLocated(WebDriver driver, Duration duration, WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(ExpectedConditions.presenceOfElementLocated((By) element));
    }


    public void explicitElementToBeClickable(WebDriver driver, Duration duration, WebElement element){
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public void explicitPresenceOfAllElementsLocatedBy(WebDriver driver, Duration duration, List<WebElement> element){
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy((By) element));
    }

    public void explicitVisibilityOfAllElements(WebDriver driver, Duration duration, List<WebElement> element){
        WebDriverWait wait = new WebDriverWait(driver, duration);
        wait.until(ExpectedConditions.visibilityOfAllElements(element));
    }

}
