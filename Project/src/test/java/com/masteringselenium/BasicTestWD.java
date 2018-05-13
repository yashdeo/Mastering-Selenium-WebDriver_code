package com.masteringselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class BasicTestWD extends DriverFactory{

    private void googleExampleThatSearchesFor(final String searchString) {


/*
        System.setProperty("webdriver.chrome.driver","C:\\Users\\yashadatta.deo\\Softwares\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();*/

        WebDriver driver = DriverFactory.getWebdriver();

        driver.get("http://www.google.com");

        WebElement searchField = driver.findElement(By.name("q"));

        searchField.clear();
        searchField.sendKeys(searchString);

        System.out.println("Page title is: " + driver.getTitle());

        searchField.submit();

        (new WebDriverWait(driver, 10)).until(new ExpectedCondition<Boolean>() {
            public Boolean apply(WebDriver driverObject) {
                return driverObject.getTitle().toLowerCase().startsWith(searchString.toLowerCase());
            }
        });

        System.out.println("Page title is: " + driver.getTitle());

    }

    @Test
    public void googleCheeseExample() {
        googleExampleThatSearchesFor("Cheese!");
    }

    @Test
    public void googleMilkExample1() {
        googleExampleThatSearchesFor("Milk!");
    }

    @Test
    public void googleCheeseExample11() {
        googleExampleThatSearchesFor("butter!");
    }

    @Test
    public void googleMilkExample2111() {
        googleExampleThatSearchesFor("arteta");
    }

    @Test
    public void googleCheeseExample111() {
        googleExampleThatSearchesFor("arsenal");
    }

    @Test
    public void googleMilkExample1111() {
        googleExampleThatSearchesFor("how to start your own business");
    }

    @Test
    public void googleCheeseExample1111231() {
        googleExampleThatSearchesFor("qqwwqw!");
    }

    @Test
    public void googleMilkExample1111151111() {
        googleExampleThatSearchesFor("sdsd");
    }

    @Test
    public void googleCheeseExample111141111() {
        googleExampleThatSearchesFor("mark weins");
    }

    @Test
    public void googleMilkExample11131111() {
        googleExampleThatSearchesFor("chapala");
    }





}
