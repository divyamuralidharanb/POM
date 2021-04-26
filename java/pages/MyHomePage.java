package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.Base_Init;

public class MyHomePage extends Base_Init {

	public MyHomePage(ChromeDriver driver) {
		this.driver = driver;
	}
	
	public MyHomePage verifyHomePage() {
		String pageTitle = driver.getTitle();
		if(pageTitle.contentEquals("My Home | opentaps CRM")) {
			System.out.println("My Home page displayed as expected");
		}
		else {
			System.out.println("Page title is not as expected - "+pageTitle);
		}
		return new MyHomePage(driver);
	}
	
	public MyLeadsPage clickLeadsButton() {	
		driver.findElement(By.linkText(prop.getProperty("MyHomePage.leads.linktext"))).click();
		return new MyLeadsPage(driver);		
	}
	
}
