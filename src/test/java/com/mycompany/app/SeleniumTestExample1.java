package com.mycompany.app;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Selenium test for simple App.
 */
public class SeleniumTestExample1
{   
    public static void main(String args[]){
      WebDriver driver = new ChromeDriver();
      driver.get("https://selenium.dev");
      System.out.println("Title"+driver.getTitle());
      driver.quit();
    }

}
