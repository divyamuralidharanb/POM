package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.Base_Init;
import pages.LoginPage;

public class EditLeadTest extends Base_Init {
	
	@BeforeClass
	public void setSheetName() {
		this.sheetname = "EditLead";
	}
	
	@Test (dataProvider = "GetData")
	public void editLeadTest(String phoneNo, String company) throws InterruptedException {
		new LoginPage(driver)
		.enterUserName().enterPassword().clickLoginButton()
		.clickCRMSFALink()
		.clickLeadsButton()
		.clickFindLeadsButton()
		.clickFindByPhoneButton().enterPhoneNumber(phoneNo).clickFindLeadsButton().selectFirstLeadFromResults()
		.clickEditButton()
		.updateCompanyName(company).clickUpdateButton()
		.verifyCompanyName();
		
	}
}
