package com.Sauce.Demo.Utility;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

public class ScreenShotClass 
{
	public static void  screenshot(WebDriver driver) throws IOException
	{
		Date d =new Date();
		String date = d.toString().replaceAll(":", "-");
	    TakesScreenshot ms=(TakesScreenshot)driver;
	    File source = ms.getScreenshotAs(OutputType.FILE);
	    File dest = new File("C:\\Users\\Jitu\\Desktop\\Screenshot\\"+date+".jpg");
	    FileHandler.copy(source, dest);
	    System.out.println("We taken screenshot");
	}
	     // Constructor declared;
	
//	
//	    public ScreenShotClass(WebDriver driver)
//	 {
//	    
//		PageFactory.initElements(driver,this);
//		 
//	 }	
}