package com.Sauce.Demo.TestClasses;

import static org.testng.Assert.assertEquals;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Sauce.Demo.POMClasses.HomepagePOMClass;
import com.Sauce.Demo.Utility.ScreenShotClass;

public class TC03AddmultipleproductPOMClasses extends TestBaseClass
{   
	@Test
	public void addmultiprod() throws IOException, InterruptedException
	{
		HomepagePOMClass hp =new HomepagePOMClass(driver);
		hp.clickproduct1();
		hp.clickproduct2();
		hp.clickproduct3();
		System.out.println("Add multiple product");
		
		ScreenShotClass.screenshot(driver);
		
		 //Apply validation
		String ActualText = hp.gettextfromkonaddcart();
		String ExpectedText ="3";
		Assert.assertEquals(ActualText, ExpectedText);
		
	}

}
