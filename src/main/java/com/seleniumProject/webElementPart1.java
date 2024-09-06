package com.seleniumProject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.ui.Select;

public class webElementPart1 {
    public void handleIframe(String browser) {
        WebDriver driver = Browser.getBrowser(browser);
        //open iframe page
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe");

        //switch to the parent iframe
        driver.switchTo().frame("iframeResult");
        //find child iframe
        WebElement childIframe = driver.findElement(By.tagName("iframe"));
        //switch to the child iframe
        driver.switchTo().frame(childIframe);
        // Click on html link
        driver.findElement(By.linkText("Learn HTML")).click();

        //switch to parent frame
        driver.switchTo().parentFrame();

        // switch to default content
        driver.switchTo().defaultContent();
    }

    public void handleCheckbox(String browser) {
        WebDriver driver = Browser.getBrowser(browser);
        //open iframe page
        driver.get("https://www.w3schools.com/TAGS/tryit.asp?filename=tryhtml5_input_type_checkbox");

        //switch to the parent iframe
        driver.switchTo().frame("iframeResult");
        //find child iframe
        /*WebElement childIframe = driver.findElement(By.tagName("iframe"));
        //switch to the child iframe
        driver.switchTo().frame(childIframe);
        // Click on html link
        driver.findElement(By.linkText("Learn HTML")).click();

        //switch to parent frame
        driver.switchTo().parentFrame();

        // switch to default content
        driver.switchTo().defaultContent();*/

        //find first checkbox, select it
        driver.findElement(By.name("vehicle1")).click();

        //sleep time
        try {
            Thread.sleep(300);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        // deselect checkbox
        driver.findElement(By.name("vehicle1")).click();

    }

    public void handleRadioButton(String browser) {
        WebDriver driver = Browser.getBrowser(browser);

        // Open iframe page
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_input_type_radio");
        System.out.println("Opened iframe page.");

        // Switch to the parent iframe
        driver.switchTo().frame("iframeResult");
        System.out.println("Switched to parent iframe 'iframeResult'.");

        // Find first radio button and click over it
        try {
            // Corrected selector to match exact value
            driver.findElement(By.cssSelector("input[value='JavaScript']")).click();
            System.out.println("Clicked on JavaScript radio button.");

            // Sleep time
            Thread.sleep(300); // Not recommended, but kept as requested
        } catch (Exception e) {
            System.err.println("Error clicking JavaScript radio button: " + e.getMessage());
            return;
        }

        // Select the second radio button and click over it
        try {
            driver.findElement(By.cssSelector("input[value='HTML']")).click();
            System.out.println("Clicked on HTML radio button.");
        } catch (Exception e) {
            System.err.println("Error clicking HTML radio button: " + e.getMessage());
        }

        // Close the driver after execution
        //driver.quit();
        //System.out.println("Closed the browser.");
    }

    public void handleAlert(String browser) {
        WebDriver driver = Browser.getBrowser(browser);
        //open iframe page
        driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_alert");

        //switch to the parent iframe
        driver.switchTo().frame("iframeResult");

        //find and click over the button
        driver.findElement(By.tagName("button")).click();

        //switch to the alert and get text
        Alert alert = driver.switchTo().alert();

        //print alert text
        System.out.println("Alert text is " + alert.getText());

        //accept alert
        alert.accept();

    }

    public void handleDropDown(String browser) {
        WebDriver driver = Browser.getBrowser(browser);

        // Open iframe page
        driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_select");

        // Switch to the parent iframe
        driver.switchTo().frame("iframeResult");

        // Find select element
        WebElement select = driver.findElement(By.tagName("select"));

        // Initialize Select object
        Select dropdown = new Select(select);  // Corrected from <Select> to Select
        dropdown.selectByVisibleText("Audi");  // Corrected method usage
    }

}
