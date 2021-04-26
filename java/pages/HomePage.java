package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.Base_Init;

public class HomePage extends Base_Init {
	
	public HomePage(ChromeDriver driver) {
		this.driver = driver;
	}
	
	public MyHomePage clickCRMSFALink() {
		driver.findElement(By.linkText(prop.getProperty("HomePage.crmsfa.linktext"))).click();
		return new MyHomePage(driver);
	}
	
	public LoginPage clickLogoutButton() {
		driver.findElement(By.className("decorativeSubmit")).click();
		return new LoginPage(driver);
	}
	
}
