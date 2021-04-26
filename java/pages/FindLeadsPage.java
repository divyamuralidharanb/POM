package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.Base_Init;

public class FindLeadsPage extends Base_Init {
	
	public static String leadId;
	
	public FindLeadsPage(ChromeDriver driver) {
		this.driver = driver;
	}
	
	public FindLeadsPage enterLeadId() {
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadId);
		return this;
	}
	
	public FindLeadsPage enterFirstName(String firstname) {
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys(firstname);
		return this;
	}
	
	public FindLeadsPage clickFindByPhoneButton() {
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		return this;
	}
	
	public FindLeadsPage enterPhoneNumber(String phoneNo) {
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(phoneNo);
		return this;
	}
	
	public FindLeadsPage clickFindLeadsButton() throws InterruptedException {
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		return this;
	}
	
	public FindLeadsPage getNoOfRecordsFound() {
		String noOfRecords = driver.findElement(By.className("x-paging-info")).getText();
		if (noOfRecords.equals("No records to display")) {
			System.out.println("Delete/Merge successful - "+noOfRecords);
		} else {
			System.out.println("Delete/Merge unsuccessful - "+noOfRecords);
		}
		return this;
	}
	
	public ViewLeadPage selectFirstLeadFromResults() {
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		return new ViewLeadPage(driver);
	}
	
	public FindLeadsPage getLeadId() {
		leadId = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		return this;
	}
	
	public MergeLeadsPage selectFirstLeadInFindLeadLookupWindow() {		
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		return new MergeLeadsPage(driver);
	}
	
}
