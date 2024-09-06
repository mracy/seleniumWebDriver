package com.seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class webElementPart2 {

    public void openWebPageUsingNavigation(String browser) {
        WebDriver driver = Browser.getBrowser(browser);
        //open facebook page using navigation class
        driver.navigate().to("https://www.facebook.com");
    }

    public void handleBackwardNavigation(String browser) throws InterruptedException {
        WebDriver driver = Browser.getBrowser(browser);
        //open facebook page using navigation class
        driver.navigate().to("https://www.facebook.com");
        //open w3 school
        driver.navigate().to("https://www.w3schools.com");

        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // backward navigation
        driver.navigate().back();
    }

    /*public void handleForwardNavigation(String browser) throws InterruptedException {
        WebDriver driver = Browser.getBrowser(browser);
        //open facebook page using navigation class
        driver.navigate().to("https://www.facebook.com");
        //open w3 school
        driver.navigate().to("https://www.w3schools.com");

        try {
            Thread.sleep(300);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        // backward navigation
        driver.navigate().back();

        try {
            Thread.sleep(300);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        //forward navigation
        driver.navigate().forward();
    }*/

    public void handleForwardNavigation(String browser) {
        WebDriver driver = Browser.getBrowser(browser);
        //open facebook

        driver.navigate().to("https://facebook.com");
        //open about page
        driver.findElement(By.linkText("About")).click();

        //move back
        driver.navigate().back();


        // click on login button
        driver.findElement(By.name("login")).click();

        //move back
        driver.navigate().back();

        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //forward navigation
        driver.navigate().forward();

        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //navigate backward
        driver.navigate().back();

        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //forward navigation
        driver.navigate().forward();

    }

    public void handlePageRefresh(String browser) {
        WebDriver driver = Browser.getBrowser(browser);
        //open facebook

        driver.navigate().to("https://facebook.com");

        //refresh page
        driver.navigate().refresh();
    }

    public void handleMultipleWindows(String browser) {
        WebDriver driver = Browser.getBrowser(browser);
        //open w3 schools
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_win_open");
        //print title of this page
        System.out.println("Parent title is " + driver.getTitle());
        // switch to iframe
        driver.switchTo().frame("iframeResult");
        //capture window id
        String parentWindowId = driver.getWindowHandle();

        System.out.println("Parent window id is " + parentWindowId);
        //click over the button

        driver.findElement(By.tagName("button")).click();
        //get all window ids
        Set<String> windIdsSet = driver.getWindowHandles();
        //convert to list
        List<String> windIdsList = new ArrayList<String>(windIdsSet);
        //switch to the child window
        driver.switchTo().window(windIdsList.get(1));
        //print tile of child page
        System.out.println("Child Parent title is " + driver.getTitle());

        //switch to parent page
        driver.switchTo().window(parentWindowId);
        System.out.println("Parent title is " + driver.getTitle());

        //maximize
        driver.manage().window().maximize();

    }
}
