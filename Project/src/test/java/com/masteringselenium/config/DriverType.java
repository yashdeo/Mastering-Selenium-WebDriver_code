package com.masteringselenium.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public enum DriverType implements DriverSetup{

    CHROME{
        public DesiredCapabilities getDesiredCapabilities(){

            DesiredCapabilities capabilities = DesiredCapabilities.chrome();
            return capabilities;
        }

        public WebDriver getWebDriverObject(DesiredCapabilities capabilities) {
            return new ChromeDriver(capabilities);
        }
    },

    FIREFOX {
        public DesiredCapabilities getDesiredCapabilities() {
            DesiredCapabilities capabilities = DesiredCapabilities.firefox();
            return capabilities;
        }

        public WebDriver getWebDriverObject(DesiredCapabilities capabilities) {
            return new FirefoxDriver(capabilities);
        }
    },

        IE{
            public DesiredCapabilities getDesiredCapabilities() {
                DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
                return capabilities;
            }

            public WebDriver getWebDriverObject(DesiredCapabilities capabilities) {

                return new InternetExplorerDriver(capabilities);
            }
            },

            OPERA{
                public DesiredCapabilities getDesiredCapabilities() {
                    DesiredCapabilities capabilities = DesiredCapabilities.operaBlink();
                    return capabilities;
                }

                public WebDriver getWebDriverObject(DesiredCapabilities capabilities) {
                    return new OperaDriver(capabilities);
                }
            }
    }



