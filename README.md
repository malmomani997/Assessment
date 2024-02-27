# DM Task

## Overview
This project contains automated tests for the DM web application. The tests are implemented using Selenium and TestNG.

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
-  mvn test

# TestNG Configuration
- `chromeRun.xml` file is used to configure the TestNG test suite.

# Browser Configuration
- Chrome browser is configured by default. You can switch browsers by changing the `env_browser_param` value.

# Project Structure
- `src`: Contains the main source code.
- `pom.xml`: Maven project configuration.
- `chromeRun.xml`: TestNG suite XML for Chrome browser.

# Test Classes
- `DMTestCases`: Contains various test scenarios for the DM web application.

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
