package com.SauceDemo.Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(com.SauceDemo.utilityClasses.Listeners.class) //Import krtana 2nd line import kra //Path dila package cha 
public class SampleClass  //Sample class for LISTNERS
{
	public WebDriver driver;

//    @Test
//    public void verifyLoginUrl()
//    {
//    System.out.println("Url test is passed");
//     Assert.assertTrue(true);	
//    }
//    
//	@Test
//	public void verifLoginTitle()
//	{
//	System.out.println("Title test is passed");	
//	Assert.assertTrue(false);
//	}

      @Test
      public void verifyTitle()
      {
    	  System.setProperty("webdriver.Mozilla Firefox.driver",
					"./drivers/C:\\Program Files\\Mozilla Firefox");
		 
			driver=new FirefoxDriver();
       
       //WebDriver driver=new ChromeDriver();  sChrome nahi chalt so firefix use karu
       driver.get("https://www.saucedemo.com/v1/");
       Assert.assertTrue(false);
       }
       }
