package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.Base_Init;

public class EditLeadPage extends Base_Init {

	public EditLeadPage(ChromeDriver driver) {
		this.driver = driver;
	}
	
	public EditLeadPage updateCompanyName(String company) {
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(company);
		return new EditLeadPage(driver);
	}
	
	public ViewLeadPage clickUpdateButton() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage(driver);
	}
	
}
