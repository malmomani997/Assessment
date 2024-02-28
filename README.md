# Assessment

## Overview
This project contains automated tests for a web application. The tests are implemented using Selenium and TestNG.

## Prerequisites
- Java JDK 8 or higher
- Maven
- Docker (if running in a Docker container)

## Dependencies
- Selenium WebDriver
- TestNG
- WebDriverManager
- Extent Reports
- Lombok
- SLF4J
- Apache POI

## Running the Tests Locally
-  prerequisite :- make sure to comment the following code when you run it locally as the following options are only enabled when you want to run your docker file
- comment all the Chrome options

        options.addArguments("--headless"); 
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-gpu"); 
        options.setBinary("/usr/bin/google-chrome");
        options.addArguments("--remote-allow-origins=*"); 
        options.addArguments("--user-agent=Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.3");

- comment all the Firefox options

        options.addArguments("--headless");
        options.addArguments("--window-size=1920,1080");
        profile.setPreference("general.useragent.override", "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/58.0.3029.110 Safari/537.3");
        System.setProperty("webdriver.firefox.bin", "/usr/bin/firefox");
  
-  Navigate to the project directory on CMD
-  Run the following command :- mvn test

# TestNG Configuration
- `chromeRun.xml` file is used to configure the TestNG test suite.

# Browser Configuration
- Chrome browser is configured by default. You can switch browsers by changing the `env_browser_param` value.

# Project Structure
- `src`: Contains the main source code.
- `pom.xml`: Maven project configuration.
- `chromeRun.xml`: TestNG suite XML for Chrome browser.

# Test Classes
- `DMTestCases`: Contains various test scenarios for a web application.

# Helper Classes
- `BaseTest`: Sets up WebDriver, manages test setup and teardown, and provides helper methods.
- `DmHomePageHelper`, `UserDashboardPageHelper`, `DmSearchPageHelper`, `DmServicesPageHelper`: Page helper classes for corresponding pages.

# Data Providers
- `userData`: Provides test data for user-related tests.
- `searchData`: Provides test data for search-related tests.

# Extent Reports
- Test reports are generated using Extent Reports and stored in the `reports` directory.

# Docker Configuration
- The project includes a Dockerfile for containerization.
- Steps to run the dockerfile 
1- install docker on your machine
  
2- Navigate to the project on intilij 

3- Run the docker file 
