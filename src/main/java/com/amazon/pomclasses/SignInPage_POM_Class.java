package com.amazon.pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage_POM_Class 
{
	WebDriver driver;
	
	@FindBy(xpath="(//span[contains(text(), 'Sign in')])[1]")
	WebElement SignInButton;
	
	public void clickOnSignInButton()
	{
		SignInButton.click();
	}
	
	@FindBy(xpath="//input[@id='ap_email']")
	WebElement EmailId;
	
	public void sendEmailId()
	{
		EmailId.sendKeys("gaurav.bhor97@gmail.com");
	}
	
	@FindBy(xpath="//input[@id='continue']")
	WebElement ContinueButton;
	
	public void clickOnContinueButton()
	{
		ContinueButton.click();
	}
	
	@FindBy(xpath="//input[@id='ap_password']")
	WebElement Password;
	
	public void sendPassword()
	{
		Password.sendKeys("Gaurav@7776");
	}
	
	@FindBy(xpath="//input[@id='signInSubmit']")
	WebElement SignInSubmitButton;
	
	public void clickOnSignInSubmitButton()
	{
		SignInSubmitButton.click();
	}
	
	public SignInPage_POM_Class(WebDriver driver)
	{
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
		
		
	}
	
	
	
	
	
	
	
	
	
}
