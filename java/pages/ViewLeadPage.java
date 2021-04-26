package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.Base_Init;

public class ViewLeadPage extends Base_Init {

	public ViewLeadPage(ChromeDriver driver) {
		this.driver = driver;
	}
	
	public ViewLeadPage verifyPageTitle() {
		if(driver.getTitle().contentEquals("View Lead | opentaps CRM")) {
			System.out.println("View Lead Page displayed as expected");
		}
		else {
			System.out.println("View Lead Page is NOT displayed");
		}
		return this;
	}
	
	public ViewLeadPage verifyFirstName(String fname) {
		String firstName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		if(firstName.contentEquals(fname)) {
			System.out.println("Lead created successfully with first name: "+firstName);
		}
		else {
			System.out.println("Lead not created");
		}
		return this;
	}
	
	public ViewLeadPage verifyCompanyName() {
		String companyName = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if(companyName.contains("ADP")) {
			System.out.println("Lead updated successfully with company name: "+companyName);
		}
		else {
			System.out.println("Lead not updated");
		}
		return this;
	}
	
	public EditLeadPage clickEditButton() {
		driver.findElement(By.linkText("Edit")).click();
		return new EditLeadPage(driver);
	}
	
	public DuplicateLeadPage clickDuplicateLeadButton() {
		driver.findElement(By.linkText("Duplicate Lead")).click();
		return new DuplicateLeadPage(driver);
	}
	
	public MyLeadsPage clickDeleteButton() {
		driver.findElement(By.linkText("Delete")).click();
		return new MyLeadsPage(driver);
	}
	
}
