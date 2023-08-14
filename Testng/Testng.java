package com.example.ebaysearchproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class eBaySearchProductTest {
    private WebDriver driver;

    @BeforeMethod
    @Parameters("browser")
    public void setup(String browser) {
        // Set the path to the driver executable based on the specified browser
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "/path/to/geckodriver");
            driver = new FirefoxDriver();
        }
        
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void searchProductOnEbay() {
        driver.get("https://in.ebay.com/");
        
        WebElement searchBox = driver.findElement(By.id("gh-ac"));
        searchBox.sendKeys("Apple Watches");
        
        WebElement categoryDropdown = driver.findElement(By.id("gh-cat"));
        // Select the desired category from the dropdown
        // For example, to select "Electronics":
        // categoryDropdown.sendKeys("Electronics");
        
        WebElement searchButton = driver.findElement(By.id("gh-btn"));
        searchButton.click();
        
        // Method to print the result of the product
        printProductResult();
        
        // Method to print the nth product
        printNthProduct(10);
        
        // Method to print all products from 1st page
        printAllProductsFromFirstPage();
        
        // Method to print all products with scroll down
        printAllProductsWithScrollDown();
    }
    
    // Method to print the result of the product
    private void printProductResult() {
        // Implement your logic to print the product result here
    }
    
    // Method to print the nth product
    private void printNthProduct(int n) {
        // Implement your logic to print the nth product here
    }
    
    // Method to print all products from 1st page
    private void printAllProductsFromFirstPage() {
        // Implement your logic to print all products from the 1st page here
    }
    
    // Method to print all products with scroll down
    private void printAllProductsWithScrollDown() {
        // Implement your logic to print all products with scroll down here
    }
}