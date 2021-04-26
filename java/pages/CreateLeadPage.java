package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.Base_Init;

public class CreateLeadPage extends Base_Init {

	public CreateLeadPage(ChromeDriver driver) {
		this.driver = driver;
	}
	
	public CreateLeadPage enterFirstName(String firstname) {
		driver.findElement(By.id(prop.getProperty("CreateLeadPage.firstname.id"))).sendKeys(firstname);
		return new CreateLeadPage(driver);	
	}
	
	public CreateLeadPage enterLastName(String lastname) {
		driver.findElement(By.id(prop.getProperty("CreateLeadPage.lastname.id"))).sendKeys(lastname);
		return new CreateLeadPage(driver);	
	}
	
	public CreateLeadPage enterCompanyName(String company) {
		driver.findElement(By.id(prop.getProperty("CreateLeadPage.company.id"))).sendKeys(company);
		return new CreateLeadPage(driver);	
	}
	
	public ViewLeadPage clickCreateLeadSubmit() {
		driver.findElement(By.name(prop.getProperty("CreateLeadPage.submit.name"))).click();
		return new ViewLeadPage(driver);	
	}
}
