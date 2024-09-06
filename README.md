# Selenium WebDriver with Java - Chrome and Safari

This project demonstrates browser automation testing using Selenium WebDriver with Java for Chrome and Safari browsers. It provides a basic setup for creating automated test scripts to interact with web elements, perform user actions, and validate results.

## Prerequisites

- **Java Development Kit (JDK)** 8 or higher
- **Maven** for dependency management
- **ChromeDriver** for Chrome browser automation
- **SafariDriver** for Safari browser automation
- **Selenium WebDriver** library

## Installation

1. **Clone the Repository:**

   ```bash
   git clone  git@github.com:mracy/seleniumWebDriver.git

   cd seleniumWebDriver
Install Dependencies:

Ensure that you have Maven installed. Run the following command to install required dependencies:


mvn clean install
Download ChromeDriver:

Download the compatible version of ChromeDriver from ChromeDriver Downloads.
Add the ChromeDriver executable to your system's PATH.
Enable SafariDriver:

For Safari, enable the Allow Remote Automation option in Safari's Developer menu.

safaridriver --enable
Project Structure
src/test/java: Contains test scripts for Chrome and Safari.
pom.xml: Maven configuration file with dependencies.
Dependencies
Add the following dependencies to your pom.xml file:

xml

<?xml version="1.0" encoding="UTF-8"?>
<project xmlns="http://maven.apache.org/POM/4.0.0"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
         xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
    <modelVersion>4.0.0</modelVersion>

    <dependencies>
        <!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->

        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-api</artifactId>
            <version>4.17.0</version>
        </dependency>
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-chrome-driver</artifactId>
            <version>4.17.0</version>
        </dependency>
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-safari-driver</artifactId>
            <version>4.17.0</version>
        </dependency>
        <dependency>
            <groupId>org.seleniumhq.selenium</groupId>
            <artifactId>selenium-support</artifactId>
            <version>4.17.0</version>
        </dependency>

    </dependencies>

    <groupId>org.example</groupId>
    <artifactId>SeleniumProject</artifactId>
    <version>1.0-SNAPSHOT</version>

    <properties>
        <maven.compiler.source>17</maven.compiler.source>
        <maven.compiler.target>17</maven.compiler.target>
        <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    </properties>

</project>

Usage
Run Tests on Chrome:

Make sure ChromeDriver is set up correctly, then run the test with:


mvn test -Dwebdriver.chrome.driver=/path/to/chromedriver
Run Tests on Safari:

Ensure that SafariDriver is enabled, then run the test with:


mvn test -Dwebdriver.safari.driver=/usr/bin/safaridriver
Writing Test Cases
Example test for Chrome and Safari:

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class TestExample {
    public static void main(String[] args) {
        // Example for Chrome
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.example.com");
        // Your test logic here
        driver.quit();
        
        // Example for Safari
        WebDriver safariDriver = new SafariDriver();
        safariDriver.get("https://www.example.com");
        // Your test logic here
        safariDriver.quit();
    }
}

Contributing
Feel free to open issues or submit pull requests for any features or improvements.

License
This project is licensed under the HIT License - see the LICENSE file for details.


### Explanation:

1. **Prerequisites**: Covers everything needed before starting.
2. **Installation**: Provides steps to set up the project locally.
3. **Usage**: Includes instructions to run tests on both Chrome and Safari.
4. **Dependencies**: Lists Maven dependencies required for the project.
5. **Example Code**: Shows a basic example to run tests on both Chrome and Safari.

Feel free to modify the README further to suit any specific needs for your project.
