package com.Sauce.Demo.TestClasses;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.Sauce.Demo.POMClasses.CheckOutPagePOMClass;

public class TC02CheckOutOrderPOMClass extends TestBaseClass
{
	
	@Test
	public void checkOutFunctionality()
	{
		CheckOutPagePOMClass cp = new CheckOutPagePOMClass(driver);

	  // cp.clickproduct();
	   System.out.println("Click on product");
	   
	   cp.clickoncartbutton();
	   System.out.println("click on cart button");
	   
	   cp.clickonCheckOutbutton();
	   System.out.println("click on checkOut button");
	   
	   cp.sendfristname();
	   cp.sendlastname();
	   cp.sendzipcode();
	   cp.clickoncontinuebutton();
	   System.out.println("click on contenue button");
	   
	   cp.clickonFinishbutton();
	   System.out.println("click on Finish button");
	   
	   String Expectedtext = cp.gettextfromCheckOut();
	   String  ActualText = "CHECKOUT: COMPLETE!";
	   // validation
	   Assert.assertEquals(ActualText, Expectedtext);
	   
	   cp.clickonBacktoHome();
	   System.out.println("click on BacktoHome button");
		
	}
}
