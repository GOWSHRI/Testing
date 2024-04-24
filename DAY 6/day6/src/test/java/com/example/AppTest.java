package com.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void ExceptionExample()
    {
        WebDriver driver=new ChromeDriver();
        driver .get("https://www.google.com/");
    }
}
