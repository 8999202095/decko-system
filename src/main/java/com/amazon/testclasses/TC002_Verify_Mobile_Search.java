package com.amazon.testclasses;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC002_Verify_Mobile_Search extends Test_Base_Class
{

	@Test
	
	public void mobileSearchMethod()
	{
		String ExpectedURL = "https://www.amazon.in/s?k=mobile&crid=2GQ44KCJ9E99O&sprefix=mobil%2Caps%2C273&ref=nb_sb_noss_2";
		
		String ActualURL = driver.getCurrentUrl();
		
		Assert.assertEquals(ActualURL, ExpectedURL);
		
	}
	
	
	
	
	
	
	
	
}
