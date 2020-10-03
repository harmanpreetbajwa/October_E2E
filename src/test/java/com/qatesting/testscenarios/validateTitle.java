package com.qatesting.testscenarios;

import java.io.IOException;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qatesting.pageobjects.LandingPage;
import com.qatesting.pageobjects.LoginPage;
import com.qatesting.utilities.base;

public class validateTitle extends base{
	public WebDriver driver;
	LandingPage l;
	 public static Logger log =LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void initialize() throws IOException
	{
	
		 driver =initializeDriver();
		 log.info("Driver is initialized");
			
		driver.get(prop.getProperty("url"));
		 log.info("Navigated to Home page");
	}
	@Test
	
	public void validateAppTitle() throws IOException
	{
		
		//one is inheritance
		// creating object to that class and invoke methods of it
		 l=new LandingPage(driver);
		//compare the text from the browser with actual text.- Error..
		Assert.assertEquals(l.getTitle().getText(), "FEATURED COURSES");
		 log.info("Successfully validated Text message");
		 System.out.println("Test completed");
		 System.out.println("The title is validated .......no error exists");
		 
	
		
		}
@Test
	
	public void validateHeader() throws IOException
	{
		
System.out.println("am i going inside it");
Assert.assertEquals(l.getHeader().getText(), "AN ACADEMY TO LEARN EVERYTHING ABOUT TESTING");
		}

	@AfterClass
	public void teardown()
	{
		
		driver.quit();
	
		
	}

	

	
}
