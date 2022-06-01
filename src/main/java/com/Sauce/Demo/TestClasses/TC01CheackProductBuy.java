package com.Sauce.Demo.TestClasses;

import org.testng.annotations.Test;

import com.Sauce.Demo.POMClasses.HomepagePOMClass;

public class TC01CheackProductBuy extends TestBaseClass 
{
	   @Test
	   public void cheakproductbuy()
	{
	   HomepagePOMClass hp =new HomepagePOMClass(driver);
	   hp.clickproduct2();
	   hp.clickoncartbutton();
	   hp.clickoncontinueshopping();
	   hp.clickproduct3();
	   hp.clickoncartbutton();
	   hp.clickoncontinueshopping();
	   hp.clickonMenubutton();
	   hp.clickonLogoutbutton();
	}

}
