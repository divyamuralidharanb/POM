package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.Base_Init;
import pages.LoginPage;

public class DuplicateLeadTest extends Base_Init {

	@BeforeClass
	public void setSheetName() {
		this.sheetname = "DuplicateLead";
	}
	
	@Test (dataProvider = "GetData")
	public void createDuplicateLead(String phoneNo) throws InterruptedException {
		
		new LoginPage(driver)
		.enterUserName().enterPassword().clickLoginButton()
		.clickCRMSFALink()
		.clickLeadsButton()
		.clickFindLeadsButton()
		.clickFindByPhoneButton().enterPhoneNumber(phoneNo).clickFindLeadsButton().selectFirstLeadFromResults()
		.clickDuplicateLeadButton()
		.clickCreateLeadButton()
		.verifyPageTitle();
	}
	
}
