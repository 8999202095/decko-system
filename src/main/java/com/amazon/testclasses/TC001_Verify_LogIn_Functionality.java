package com.amazon.testclasses;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TC001_Verify_LogIn_Functionality extends Test_Base_Class
{
	
	@Test
	
	public void logInMethod()
	{
		String Expectedtitle = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		
		String ActualTitle = driver.getTitle();
		
		Assert.assertEquals(ActualTitle, Expectedtitle);
		
	}
	
	
	
	
	
	
}
