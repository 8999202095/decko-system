package com.amazon.testclasses;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import com.amazon.pomclasses.HomePage_POMClass;
import com.amazon.pomclasses.SignInPage_POM_Class;

public class Test_Base_Class 
{
	WebDriver driver;
	
//	Logger log = Logger.getLogger("Amazon_Project");
//	
//	PropertyConfigurator.configure("log4j.properties");
	
	@BeforeClass
	
	public void browserOpen() 
	{	
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	
	driver = new ChromeDriver();
	
	System.out.println("Browser is opened.");
	
	driver.manage().window().maximize();
	System.out.println("Browser is maximized.");
	
	driver.get("https://www.amazon.in/");
	
	System.out.println("URL is opened.");
	
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	}
	
	
	@BeforeMethod
	
	public void SignIn()
	{
		SignInPage_POM_Class SP = new SignInPage_POM_Class(driver);
		
		SP.clickOnSignInButton();
		
		SP.sendEmailId();
		System.out.println("email id passed");
		
		SP.clickOnContinueButton();
		System.out.println("clicked on continue");
		
		SP.sendPassword();
		System.out.println("password send");
		
		SP.clickOnSignInSubmitButton();
		System.out.println("signed in");
		
		System.out.println("went on home page");
		
	}
	
	@AfterMethod
	
	public void SignOut()
	{
	HomePage_POMClass HP = new HomePage_POMClass(driver);
	HP.moveToAccountButton();
	HP.clickOnSignOut();
	System.out.println("Clicked on signout");

	}
	
	@AfterClass
	
	public void browserClose()
	{
		driver.quit();
		
		System.out.println("Browser closed.");
		
	}
	
	
	
	
}
