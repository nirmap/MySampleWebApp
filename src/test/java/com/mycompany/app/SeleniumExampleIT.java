package com.mycompany.app;

import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Selenium test for simple App.
 */
public class SeleniumExampleIT
{
    //spec char
    
   

    @Test
    public void googleCheeseExample() throws Exception {

        System.setProperty("webdriver.chrome.driver", "/var/lib/jenkins/workspace/ySampleWebApp_bitwiseman-patch-1/src/test/resources/webdriver/binaries/linux/googlechrome/64bit/chromedriver");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("headless");
        options.addArguments("no-sandbox");
        // Must maximize Chrome by `start-maximized`
        options.addArguments("start-maximized");
        options.addArguments("disable-gpu");
        options.addArguments("window-size=1420,1080");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(options);
        

        // And now use this to visit Google
      //  driver.get("http://www.google.com");




        // Check the title of the page
        System.out.println("Page title is: " + driver.getTitle());
        
        driver.close();
       


    }


}
