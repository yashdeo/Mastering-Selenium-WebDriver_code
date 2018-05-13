package com.masteringselenium.config;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class testme {

    public static void main(String[] args) {


        System.setProperty("webdriver.chrome.driver", "C:\\Users\\yashadatta.deo\\Softwares\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.get("https://salmon02-alliance-prtnr-eu09-dw.demandware.net/on/demandware.store/Sites-MobileFirst-Site/en_US/Login-Show");

        WebElement we = driver.findElement(By.cssSelector("FORM[role='search']>input:nth-child(2)"));

        System.out.println(we.getText());
        we.sendKeys("sdsdsdsdsdssdsds");
        Actions actions = new Actions(driver);

        actions.keyDown(Keys.ENTER).build().perform();

    }
}
