package com.testhtml.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class LoginPage {

	WebDriver driver;
	// this class contains all the web elements
	
	By FirstName=By.xpath(".//*[@id='fname']");
	By LastName=By.xpath(".//*[@id='lname']");
	By PhoneNum=By.xpath(".//*[@id='phone']");
	
	
	String Str;
	public LoginPage(WebDriver driver)
	{
		
		this.driver=driver;
		
	}
	
	public void typeFirstName(String Fname)
	{
		driver.findElement(FirstName).sendKeys(Fname);
	}
	
	public void typeLastName(String Lname)
	{
		driver.findElement(LastName).sendKeys(Lname);
	}
	
	public void typePassword(String Pwd)
	{
		driver.findElement(PhoneNum).sendKeys(Pwd);
	}
	public void clickOnSubmit()
	{
		
	}
	public void clickOnPassword()
	{
		
	}
}
