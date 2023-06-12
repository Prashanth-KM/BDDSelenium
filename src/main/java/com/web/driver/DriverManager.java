package com.web.driver;

import com.web.utils.PropertyUtils;
import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

import java.time.Duration;

public class DriverManager {

    public static WebDriver driver;
    public WebDriver initializeDriver() {

        String browserName = PropertyUtils.getValue("browser");

        if (browserName.equalsIgnoreCase("chrome")){
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver(options);
        }else if (browserName.equalsIgnoreCase("safari")){
            SafariOptions options = new SafariOptions();
            WebDriverManager.safaridriver().setup();
            driver = new SafariDriver();
        }

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        return driver;
    }

    public void tearDown(){
        driver.close();
    }

}
