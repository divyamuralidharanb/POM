package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.Base_Init;
import pages.LoginPage;


public class DeleteLeadTest extends Base_Init {
	
	@BeforeClass
	public void setSheetName() {
		this.sheetname = "DeleteLead";
	}
	
	@Test (dataProvider = "GetData")
	public void deleteLeadTest(String phoneNo) throws InterruptedException {
		
		new LoginPage(driver)
		.enterUserName().enterPassword().clickLoginButton()
		.clickCRMSFALink()
		.clickLeadsButton()
		.clickFindLeadsButton()
		.clickFindByPhoneButton().enterPhoneNumber(phoneNo).clickFindLeadsButton().getLeadId().selectFirstLeadFromResults()
		.clickDeleteButton()
		.clickFindLeadsButton()
		.enterLeadId().clickFindLeadsButton().getNoOfRecordsFound();
	}
}
