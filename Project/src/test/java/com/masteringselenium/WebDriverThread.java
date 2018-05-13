package com.masteringselenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverThread {
    private WebDriver webDriver;

    public WebDriver getWebDriver(){

        if(null==webDriver){
            System.setProperty("webdriver.chrome.driver","C:\\Users\\yashadatta.deo\\Softwares\\chromedriver_win32\\chromedriver.exe");
            webDriver = new ChromeDriver();
        }
        return webDriver;
    }

    public void quitDriver(){

        webDriver.quit();
        webDriver=null;
    }
}
