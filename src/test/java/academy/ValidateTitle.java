package academy;


import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObject.LandingPage;
import pageObject.LoginPage;
import resources.base;

public class ValidateTitle extends base
{
	public static Logger log=LogManager.getLogger(base.class.getName());
	@BeforeTest
	public void initialize() throws IOException
	{
		driver=initializeDriver();
		log.info("driver is inatialize");
		driver.get(prop.getProperty("url"));
		log.info("Navigate to home page");
		
	}
	@Test
	public void validateAppTitle() throws IOException
	{
		
		LandingPage l=new LandingPage(driver);
		Assert.assertEquals(l.getTitle().getText(), "Rediff.com: News | Rediffmail | Stock Quotes | Shopping");
		
		log.info("Successifully validated text massage");
		
		
	}
	@AfterTest
	public void teardown()
	{
		driver.close();
		driver=null;
	}
	
}
