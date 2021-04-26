package tests;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import base.Base_Init;
import pages.LoginPage;


public class CreateNewLeadTest extends Base_Init {

	@BeforeClass
	public void setSheetName() {
		this.sheetname = "CreateLead";
	}
	
	@Test (dataProvider = "GetData")
	public void createNewLeadTest(String firstname, String lastname, String company) {
		new LoginPage(driver)
		.enterUserName().enterPassword().clickLoginButton()
		.clickCRMSFALink()
		.clickLeadsButton()
		.clickCreateLeadButton()
		.enterFirstName(firstname).enterLastName(lastname).enterCompanyName(company).clickCreateLeadSubmit()
		.verifyFirstName(firstname);
	}
}
