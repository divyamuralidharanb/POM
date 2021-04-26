package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.Base_Init;

public class DuplicateLeadPage extends Base_Init {

	public DuplicateLeadPage(ChromeDriver driver) {
		this.driver = driver;
	}
	
	public ViewLeadPage clickCreateLeadButton() {
		driver.findElement(By.name("submitButton")).click();
		return new ViewLeadPage(driver);
	}
}
