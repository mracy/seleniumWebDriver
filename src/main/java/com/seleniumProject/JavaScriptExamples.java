package com.seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class JavaScriptExamples {
    public void invokeAlert(String browser) {
        //driver object
        WebDriver driver = Browser.getBrowser(browser);
        //open facebook
        driver.get("https://www.facebook.com");

        //create object of javaScript executor
        JavascriptExecutor executer = (JavascriptExecutor) driver;

        // execute alert() function
        executer.executeScript("alert('This alert is injected by webdriver');");

    }

    public void sendTextToAnElement(String browser) {
        // Driver object
        WebDriver driver = Browser.getBrowser(browser);
        // Open Facebook
        driver.get("https://www.facebook.com");

        // Create object of JavaScript executor
        JavascriptExecutor executer = (JavascriptExecutor) driver;

        // Enter email
        executer.executeScript("document.getElementById('email').value='e.vibe3@gmail.com';");
        // Enter password
        executer.executeScript("document.getElementsByName('pass')[0].value='password';");

        // Click on button
        executer.executeScript("document.getElementsByName('login')[0].click();");
    }

    public void refreshBrowser(String browser) {
        // Driver object
        WebDriver driver = Browser.getBrowser(browser);
        // Open Facebook
        driver.get("https://www.facebook.com");

        // Create object of JavaScript executor
        JavascriptExecutor executer = (JavascriptExecutor) driver;

        //refresh the page
        executer.executeScript("history.go(0);");
    }

    public void getTitleOfWebPage(String browser) {
        // Driver object
        WebDriver driver = Browser.getBrowser(browser);
        // Open Facebook
        driver.get("https://www.facebook.com");

        // Create object of JavaScript executor
        JavascriptExecutor executer = (JavascriptExecutor) driver;

        //refresh the page
        String pageTitle = executer.executeScript("return document.title;").toString();

        //print title
        System.out.println("Page title is " + pageTitle);
    }

    public void verticalScroll(String browser) {
        // Driver object
        WebDriver driver = Browser.getBrowser(browser);
        // Open Facebook
        driver.get("https://www.facebook.com");

        // Create object of JavaScript executor
        JavascriptExecutor executer = (JavascriptExecutor) driver;

        //vertical scroll
        executer.executeScript("window.scrollBy(0,750)");

        /*//upward scroll
        executer.executeScript("window.scrollBy(0,-750)");*/
    }

}
