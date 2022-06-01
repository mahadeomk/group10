package com.Sauce.Demo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginpagePOMClass
{
	// Declared webdriver globally .
	
	private WebDriver driver;
	
	// find Locator of element and declared .
	// Username
	@FindBy(xpath="//input[@id='user-name']")
	private WebElement Username;
	//create method for action perform on WebElement.
	public void sendusername()
		{
		Username.sendKeys("standard_user");	
		}
	
	//password
	@FindBy(xpath="//input[@id='password']")
	private WebElement Password;
	public void sendpassword()
	{
		Password.sendKeys("secret_sauce");	
	}
	
	
      // Login button.
	@FindBy(xpath="//input[@id='login-button']")
	private WebElement Loginbutton;
	public void loginbutton()
	{
		Loginbutton.click();	
	}
	   // Constructor Declared with Argument .
	
	public LoginpagePOMClass(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver,this);
		
	}
	
}
