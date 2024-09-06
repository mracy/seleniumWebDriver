package com.seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.function.Function;

public class WebDriverWaits {
    public void fluentWait(String browser) {
        WebDriver driver = Browser.getBrowser(browser);
        // Open W3Schools
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");

        // Switch to iframe
        driver.switchTo().frame("iframeResult");

        // Wait till a condition
        Wait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofMillis(5000))
                .pollingEvery(Duration.ofMillis(500))
                .ignoring(NoSuchElementException.class);

        // Implement wait condition
        WebElement button = wait.until(new Function<WebDriver, WebElement>() {
            public WebElement apply(WebDriver driver) {
                return driver.findElement(By.tagName("button"));
            }
        });

        // Find and click
        button.click();
        // Switch to the alert
        driver.switchTo().alert().accept();
    }

    public void webDriverWait(String browser) {
        WebDriver driver = Browser.getBrowser(browser);
        // Open W3Schools
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");

        // Switch to iframe
        driver.switchTo().frame("iframeResult");

        //use webdriver wait
        //find and click
        driver.findElement(By.tagName("button")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //wait condition
        wait.until(ExpectedConditions.alertIsPresent());


        //switch to the alert
        driver.switchTo().alert().accept();
    }
}
