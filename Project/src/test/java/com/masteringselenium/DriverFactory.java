package com.masteringselenium;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DriverFactory {

//    private static ThreadLocal<WebDriverThread> driverThread;

    /*@BeforeSuite
    public static void instantiateDriverObject() {
        driverThread = new ThreadLocal<WebDriverThread>() {
            @Override
            protected WebDriverThread initialValue() {
                WebDriverThread webDriverThread = new WebDriverThread();
                return webDriverThread;
            }
        };
    }
*/
    private static List<WebDriverThread> webDriverThreadsPool = Collections.synchronizedList(new ArrayList<WebDriverThread>());
    private static ThreadLocal<WebDriverThread> driverThread;


    @BeforeSuite

    public static void instantiateDriverObject() {
        driverThread = new ThreadLocal<WebDriverThread>() {
            @Override
            protected WebDriverThread initialValue() {
                WebDriverThread webDriverThread = new WebDriverThread();
                webDriverThreadsPool.add(webDriverThread);
                return webDriverThread;
            }
        };
    }

                public static WebDriver getWebdriver(){
                    return driverThread.get().getWebDriver();
    }

    @AfterMethod
    public static void quitWebDriver(){
        getWebdriver().manage().deleteAllCookies();
    }

    @AfterSuite
    public static void closeDriverObjects(){

        for (WebDriverThread webDriverThread:webDriverThreadsPool){
            webDriverThread.quitDriver();
        }
    }

}
