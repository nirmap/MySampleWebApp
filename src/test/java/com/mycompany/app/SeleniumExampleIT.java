package com.mycompany.app;


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


        WebDriverManager.chromedriver().setup();
        private WebDriver driver = new ChromeDriver();

        // And now use this to visit Google
        driver.get("http://www.google.com");




        // Check the title of the page
        System.out.println("Page title is: " + driver.getTitle());
        
        driver.close();



    }


}
