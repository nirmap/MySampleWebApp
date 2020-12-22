package com.mycompany.app;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

/**
 * Selenium test for simple App.
 */
public class SeleniumExampleTest
{   
   WebDriver driver = new ChromeDriver();
    //testng

    @Test
    public void googleCheeseExample() throws Exception {
       
        // And now use this to visit Google
        driver.get("http://www.google.com");
        // Alternatively the same thing can be done like this
        // driver.navigate().to("http://www.google.com");

     

        // Check the title of the page
        System.out.println("Page title is: " + driver.getTitle());

       
       
    }


}
