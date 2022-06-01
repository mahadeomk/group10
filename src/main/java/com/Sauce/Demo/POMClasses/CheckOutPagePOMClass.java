package com.Sauce.Demo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckOutPagePOMClass 
{
	    private WebDriver driver;
	 

		@FindBy(xpath="//div[@id='shopping_cart_container']")
		private WebElement cartbutton;
		public void clickoncartbutton()
		{
		cartbutton.click();
		}
	
	@FindBy(xpath="//button[@id='checkout']")
	private WebElement CheckOut;
	public void clickonCheckOutbutton()
	{
	CheckOut.click();	
	}
	
	@FindBy(xpath="//input[@id='first-name']")
	private WebElement fristname;
	public void sendfristname()
	{
	fristname.sendKeys("Mahadeo");	
	}
	
	@FindBy(xpath="//input[@id='last-name']")
	private WebElement lastname;
	public void sendlastname()
	{
	lastname.sendKeys("Shelke");	
	}
	
	@FindBy(xpath="//input[@id='postal-code']")
	private WebElement zipcode;
	public void sendzipcode()
	{
	zipcode.sendKeys("412142");	
	}
	
	@FindBy(xpath="//input[@id='continue']")
	private WebElement continuebutton;
	public void clickoncontinuebutton()
	{
		continuebutton.click();	
	}
	
	@FindBy(xpath="//button [text()='Finish']")
	private WebElement Finish;
	public void clickonFinishbutton()
	{
	Finish.click();	
	}
	
	@FindBy(xpath="//span [text()='Checkout: Complete!']")
	private WebElement CheckOutpage;
	public String gettextfromCheckOut()
	{
	String Expected =CheckOutpage.getText();
	return Expected ;
	}
	
	@FindBy(xpath="//button[text()='Back Home']")
	private WebElement BacktoHome;
	public void clickonBacktoHome()
	{
	BacktoHome.click();	
	}
	
	public CheckOutPagePOMClass(WebDriver driver)
	{
		
		 this.driver =  driver;
		PageFactory.initElements(driver,this);
		
	}
	

 	
}
