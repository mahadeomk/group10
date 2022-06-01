package com.Sauce.Demo.TestClasses;

import java.io.IOException;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.Sauce.Demo.POMClasses.HomepagePOMClass;
import com.Sauce.Demo.POMClasses.LoginpagePOMClass;
import com.Sauce.Demo.Utility.ScreenShotClass;

public class TestBaseClass
{
	WebDriver driver;
	Logger log;
	
	@BeforeMethod
	@Parameters("browserName")
	public void loginsetup(String browserName) throws IOException 
	{
		if(browserName.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Java selenium\\chrome\\chromedriver.exe");
		driver=new ChromeDriver();
	}
		else
    {
		System.setProperty("webdriver.gecko.driver", "C:\\Java selenium\\chrome\\geckodriver.exe");
		driver=new FirefoxDriver();
    }
		
		driver.manage().window().maximize();
		System.out.println("Browser Open");
		driver.get("https://www.saucedemo.com/");
		System.out.println("Url Entered");
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		log.getLogger("sauceDemov1");
		PropertyConfigurator.configure("log4j.properties");
		log.info("log 4j is used");
	
		LoginpagePOMClass lp = new LoginpagePOMClass(driver);
		lp.sendusername();
		System.out.println("User name entered");
		lp.sendpassword();
		System.out.println("password entered");
		lp.loginbutton();
		System.out.println("click on login button");
		ScreenShotClass.screenshot(driver);
	}
		
	@AfterMethod
	     public void tearDown() throws IOException
	  {
	        //logout
	     driver.quit();
	     System.out.println("End of program");
	  }
	}

	
	
	
	
	
	
	
	
	
	