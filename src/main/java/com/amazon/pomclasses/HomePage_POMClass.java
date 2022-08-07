package com.amazon.pomclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_POMClass 
{
	WebDriver driver;
	
	@FindBy(xpath="(//body//header//div//a[1])[1]")
	private WebElement AmazonLogo;
	
	public void clickOnAmazonLogo()
	{
		AmazonLogo.click();
	}
	
	@FindBy(xpath="//input[@id='twotabsearchtextbox']")
	private WebElement SearchBox;
	
	public void sendInSearchBox()
	{
		SearchBox.sendKeys("Mobile");
	}
	
	@FindBy(xpath="//input[@id='nav-search-submit-button']")
	private WebElement SearchButton;
	
	public void clickOnSearchButton()
	{
		SearchButton.click();
	}
	
	@FindBy(xpath="//a[@id='nav-link-accountList']")
	private WebElement AccountButton;
	
	public void moveToAccountButton()
	{
		Actions act = new Actions(driver);
		act.moveToElement(AccountButton).perform();
	}
	
	@FindBy(xpath="//span[text()='Sign Out']")
	private WebElement SignOut;
	
	public void clickOnSignOut()
	{
		SignOut.click();
	}
	
	public HomePage_POMClass(WebDriver driver)
	{
		
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
}
