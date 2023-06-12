package com.web.utils;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.Iterator;
import java.util.Set;

public class SeleniumUtils {

    public void windowMaximize(WebDriver driver){
        driver.manage().window().maximize();
    }

    public void switchToChildWindows(WebDriver driver){
        String mainWindowHandle = driver.getWindowHandle();
        Set<String> allWindowHandles = driver.getWindowHandles();
        Iterator<String> iterator = allWindowHandles.iterator();
        // Here we will check if child window has other child windows and will fetch the heading of the child window
        while (iterator.hasNext()) {
            String ChildWindow = iterator.next();
            if (!mainWindowHandle.equalsIgnoreCase(ChildWindow)) {
                driver.switchTo().window(ChildWindow);
                driver.manage().window().maximize();
            }
        }
    }

    public void closeParentWindow(WebDriver driver){
        driver.switchTo().defaultContent().close();
    }

    public void createNewWindow(WebDriver driver){
        driver.switchTo().newWindow(WindowType.WINDOW);
    }

    public void createNewWindowAndLaunchBrowser(WebDriver driver){
        driver.switchTo().newWindow(WindowType.WINDOW);
    }

    public void createNewTab(WebDriver driver){
        driver.switchTo().newWindow(WindowType.TAB);
    }

    public void mouseHover(WebDriver driver, WebElement element){
        Actions actions = new Actions(driver);
        actions.moveToElement(element).click().build();
    }

    public void moveToElement(WebDriver driver, WebElement element){
        Actions action = new Actions(driver);
        action.moveToElement(element).click().perform();
    }

    public Boolean checkTextFieldIsEditable(WebDriver driver, WebElement element){
        boolean checkTextFieldIsEditable = element.isEnabled();
        return checkTextFieldIsEditable;
    }

    public void handleDynamicFrames(WebDriver driver, int index){
        driver.switchTo().defaultContent();
        driver.switchTo().frame(driver.findElement(By.tagName("frameset")).findElements(By.tagName("frame")).get(index));
    }

    public void handleDropdownByVisibleText(WebDriver driver,WebElement element, String value) {
        Select selectByVisibleText = new Select(element);
        selectByVisibleText.selectByVisibleText(value);

    }

    public boolean isElementDisplayed(WebElement locator) {
        try {
            if (locator.isDisplayed())
                System.out.println("Element present on screen ***********" + locator);
            return true;
        } catch (NoSuchElementException e) {
            System.out.println("Element not present on screen **************" + locator);
            return false;
        }
    }
}
