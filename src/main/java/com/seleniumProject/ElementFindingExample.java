package com.seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementFindingExample {

    public void findElementByName(String browser) {
        // get webdriver object as per browser name
        //open facebook
        //find email element

        WebDriver driver = Browser.getBrowser(browser);


        //open facebook
        driver.get("https://www.facebook.com/");
        // find email web element
        WebElement emailElement = driver.findElement(By.name("email"));

        //perform any action on the emailElement
        emailElement.sendKeys("e.vibe3@gmail.com");

    }

    public void findElementById(String browser) {
        // get webdriver object as per browser name
        //open facebook
        //find email element

        WebDriver driver = Browser.getBrowser(browser);


        //open facebook
        driver.get("https://www.facebook.com/");
        // find email web element
        WebElement emailElement = driver.findElement(By.id("id"));

        //perform any action on the emailElement
        emailElement.sendKeys("password");

    }

    public void findElementByLinkText(String browser) {
        // get webdriver object as per browser name
        //open facebook
        //find email element

        WebDriver driver = Browser.getBrowser(browser);


        //open facebook
        driver.get("https://www.facebook.com/");
        // find email web element
        WebElement emailElement = driver.findElement(By.linkText("Forgot password?"));

        //perform any action on the emailElement
        emailElement.click();

    }

    public void findElementByPartialLinkText(String browser) {
        // get webdriver object as per browser name
        //open facebook
        //find email element

        WebDriver driver = Browser.getBrowser(browser);


        //open facebook
        driver.get("https://www.facebook.com/");
        // find email web element
        WebElement emailElement = driver.findElement(By.partialLinkText("Fund"));

        //perform any action on the emailElement
        emailElement.click();

    }

    public void findElementByXPath(String browser) {
        // get webdriver object as per browser name
        //open facebook
        //find email element

        WebDriver driver = Browser.getBrowser(browser);


        //open facebook
        driver.get("https://www.facebook.com/");
        // find email web element
        WebElement emailElement = driver.findElement(By.xpath("//*[@name='email']"));

        //perform any action on the emailElement
        //emailElement.click();

        emailElement.sendKeys("e.vibe3@gmail.com");

    }

    public void findElementByCss(String browser) {
        // get webdriver object as per browser name
        //open facebook
        //find email element

        WebDriver driver = Browser.getBrowser(browser);


        //open facebook
        driver.get("https://www.facebook.com/");
        // find email web element
        WebElement emailElement = driver.findElement(By.cssSelector("input[id='pass']"));

        //perform any action on the emailElement
        //emailElement.click();

        emailElement.sendKeys("e.vibe3@gmail.com");

    }
}
