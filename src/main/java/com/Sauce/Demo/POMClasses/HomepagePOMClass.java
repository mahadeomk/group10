package com.Sauce.Demo.POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomepagePOMClass
{
	private WebDriver driver;
	 private Select s;
	
	@FindBy(xpath="(//button[text()='Add to cart'])[1]")
	private WebElement product1;
	
	public void clickproduct1()
	{
		product1.click();
	}
	
	@FindBy(xpath="(//button[text()='Add to cart'])[2]")
	private WebElement product2;
	
	public void clickproduct2()
	{
		product2.click();
	}
	
	
	@FindBy(xpath="(//button[text()='Add to cart'])[3]")
	private WebElement product3;
	
	public void clickproduct3()
	{
		product3.click();
	}
	
	@FindBy(xpath="//select[@class='product_sort_container']")
	private WebElement dropdown;
	public void dropdown()
	{
		dropdown.click();
		//initialize globaly ...
		 s = new Select(dropdown);
		s.selectByVisibleText("Name (A to Z)");
	}
	
	@FindBy(xpath="//div [@id='shopping_cart_container']")
	private WebElement Addcart;   
	public String gettextfromkonaddcart()
	{
		
	String allproduct=	Addcart.getText();
		return allproduct;
	}
	
	@FindBy(xpath="//div [@id='shopping_cart_container']")
	private WebElement cartbutton;
	public void clickoncartbutton()
	{
	cartbutton.click();
	}
	
	@FindBy(xpath="//button [@id='continue-shopping']")
	private WebElement continueshopping;
	public void clickoncontinueshopping()
	{
	continueshopping.click();	
	}


	@FindBy(xpath="//button [@id='react-burger-menu-btn']")
	private WebElement Menubutton;
	public void clickonMenubutton()
	{
		Menubutton.click();
	}

	@FindBy(xpath="//a[@id='logout_sidebar_link']")
	private WebElement Logoutbutton;
	public void clickonLogoutbutton()
	{
		Logoutbutton.click();
	}
	
	public HomepagePOMClass(WebDriver driver)
	{
		
		 this.driver =  driver;
		PageFactory.initElements(driver,this);
		
	}
	
}
