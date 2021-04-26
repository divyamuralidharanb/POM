package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.Base_Init;

public class MyLeadsPage extends Base_Init {

	public MyLeadsPage(ChromeDriver driver) {
		this.driver = driver;
	}
	
	public CreateLeadPage clickCreateLeadButton() {
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage(driver);	
	}
	
	public FindLeadsPage clickFindLeadsButton() {
		driver.findElement(By.linkText("Find Leads")).click();
		return new FindLeadsPage(driver);	
	}
	
	public MergeLeadsPage clickMergeLeadsButton() {
		driver.findElement(By.linkText("Merge Leads")).click();
		return new MergeLeadsPage(driver);
	}

}
