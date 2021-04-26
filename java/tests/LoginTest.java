package tests;

import org.testng.annotations.Test;

import base.Base_Init;
import pages.LoginPage;

public class LoginTest extends Base_Init {
	
	@Test
	public void logIntoMyHomePageTest() {
		
		/* LoginPage lp = new LoginPage();
		lp.enterUserName();
		lp.enterPassword();
		lp.clickLoginButton(); */
		
		new LoginPage(driver)
		.enterUserName()
		.enterPassword()
		.clickLoginButton()
		.clickCRMSFALink()
		.verifyHomePage();
	
	}
	
}
