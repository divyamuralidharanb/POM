package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.Base_Init;

public class LoginPage extends Base_Init{

	public LoginPage(ChromeDriver driver) {
		this.driver = driver;
	}
	
	public LoginPage enterUserName() {
		driver.findElement(By.id(prop.getProperty("LoginPage.username.id"))).sendKeys(prop.getProperty("username"));
		return this;
	}
	
	public LoginPage enterPassword() {
		driver.findElement(By.id(prop.getProperty("LoginPage.password.id"))).sendKeys(prop.getProperty("password"));
		return this;
	}

	public HomePage clickLoginButton() {
		driver.findElement(By.className(prop.getProperty("LoginPage.login.classname"))).click();
		return new HomePage(driver);
	}
}
