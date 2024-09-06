package com.seleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class webTables {

    public void getSingleElementFromWebTable(String browser) {
        WebDriver driver = Browser.getBrowser(browser);

        //open time and date
        driver.get("https://www.timeanddate.com/worldclock/");

        //get data of p79 element
        String elementText = driver.findElement(By.id("p79")).getText();

        // print date and time
        System.out.println("Text from the web table is " + elementText);
    }

    public void getAllElements(String browser) {
        WebDriver driver = Browser.getBrowser(browser);

        //open time and date
        driver.get("https://www.w3schools.com/html/tryit.asp?filename=tryhtml_table_intro");

        /*//get data of p79 element
        String elementText = driver.findElement(By.id("p79")).getText();

        // print date and time
        System.out.println("Text from the web table is " + elementText);*/
        //switch to iframe
        driver.switchTo().frame("iframeResult");
        //get table element
        WebElement table = driver.findElement(By.tagName("table"));

        //get all row elements
        List<WebElement> rowList = table.findElements(By.tagName("tr"));
        //run through each row and retreive data
        for (WebElement row : rowList) {
            //get all data elements
            List<WebElement> dataList = row.findElements(By.tagName("td"));
            //run through each data and print data
            for (WebElement data : dataList) {
                System.out.print(data.getText() + "\t");
            }
            System.out.println();
        }

    }

}
