package com.seleniumProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Browser {
    /* public static void main(String[] args) {
         System.out.println("Select browser: 1. Chrome, 2. Safari ");

         // Get user input
         Scanner scanner = new Scanner(System.in);
         String browser = scanner.next();

         invokeBrowser(browser);
         scanner.close();
     }
     */
    public static WebDriver getBrowser(String browser) {
        WebDriver driver = null;

        // Open browser
        if (browser.equalsIgnoreCase("chrome")) {
            // Set the path to the ChromeDriver executable
            System.out.println("Browser not supported: " + browser); // Replace with your actual path
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("safari")) {
            // SafariDriver does not require setting a system property; you can just instantiate it.
            driver = new SafariDriver();
        } else {
            System.out.println("Browser not supported: " + browser);
            driver.manage().timeouts().pageLoadTimeout(120, TimeUnit.SECONDS);
            driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
            // Exit the method if the browser is not supported
        }
        return driver;
        /*
       // Navigate to Google
        driver.get("http://www.google.com");*/
    }
}



