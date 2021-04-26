package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.Base_Init;
import pages.LoginPage;


public class MergeLeadTest extends Base_Init {
	
	@BeforeClass
	public void setSheetName() {
		this.sheetname = "MergeLead";
	}
	
	@Test (dataProvider = "GetData")
	public void mergeLeadTest(String firstLead, String secondLead) throws InterruptedException {
		
		new LoginPage(driver)
		.enterUserName().enterPassword().clickLoginButton()
		.clickCRMSFALink()
		.clickLeadsButton()
		.clickMergeLeadsButton()
		.clickFromLeadLookup().switchToFindLeadsWindow()
		.enterFirstName(firstLead).clickFindLeadsButton().getLeadId().selectFirstLeadInFindLeadLookupWindow()
		.switchToMainWindow().clickToLeadLookup().switchToFindLeadsWindow()
		.enterFirstName(secondLead).clickFindLeadsButton().selectFirstLeadInFindLeadLookupWindow()
		.switchToMainWindow().clickMergeButton().acceptMergeAlert()
		.clickFindLeadsButton()
		.enterLeadId().clickFindLeadsButton().getNoOfRecordsFound();
	}
}
