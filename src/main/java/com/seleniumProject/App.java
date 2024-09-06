package com.seleniumProject;


import java.util.Scanner;

public class App {
    public static void main(String[] args) throws InterruptedException {
        /*WebDriver driver = new ChromeDriver();
        driver.get("https:www.google.com");*/
        //Ask user for it's browser
        //Validate user input
        // run example on user provided browser

        System.out.println("Please enter browser of your choice: Chrome or Safari");
        Scanner scanner = new Scanner(System.in);
        String browser = scanner.next();
        // example class
        // ElementFindingExample examples = new ElementFindingExample();
        //webElementPart1 examples = new webElementPart1();
        // webElementPart2 examples = new webElementPart2();
        //webTables examples = new webTables();
        //WebDriverWaits examples = new WebDriverWaits();
        JavaScriptExamples examples = new JavaScriptExamples();

        if (browser.equalsIgnoreCase("chrome") || browser.equalsIgnoreCase("safari")) {
            // code to be executed
            //examples.findElementByName(browser);
            // examples.findElementById(browser);
            //examples.findElementByLinkText(browser);
            //examples.findElementByPartialLinkText(browser);
            //examples.findElementByXPath(browser);
            //examples.findElementByCss(browser);
            //examples.handleIframe(browser);
            //examples.handleCheckbox(browser);
            //examples.handleRadioButton(browser);
            //examples.handleAlert(browser);
            //examples.handleDropDown(browser);
            //examples.openWebPageUsingNavigation(browser);
            //examples.handleBackwardNavigation(browser);
            //examples.handleForwardNavigation(browser);
            //examples.handlePageRefresh(browser);
            //examples.handleMultipleWindows(browser);
            //examples.getSingleElementFromWebTable(browser);
            //examples.getAllElements(browser);
            //examples.fluentWait(browser);
            //examples.webDriverWait(browser);
            //examples.invokeAlert(browser);
            //examples.sendTextToAnElement(browser);
            //examples.refreshBrowser(browser);
            //examples.getTitleOfWebPage(browser);
            examples.verticalScroll(browser);


        } else
            System.out.println("Browser" + browser + " you entered not supported");
    }
}
