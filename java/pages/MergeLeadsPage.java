package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import base.Base_Init;


public class MergeLeadsPage extends Base_Init {
	
	public static List<String> allhandles;
	
	public MergeLeadsPage(ChromeDriver driver) {
		this.driver = driver;
	}
	
	public MergeLeadsPage clickFromLeadLookup() {
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		return this;
	}
	
	public MergeLeadsPage clickToLeadLookup() {
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		return this;
	}
	
	public MergeLeadsPage clickMergeButton() {
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		return this;
	}

	public MyLeadsPage acceptMergeAlert() {
		driver.switchTo().alert().accept();
		return new MyLeadsPage(driver);
	}
	
	public FindLeadsPage switchToFindLeadsWindow() {
		Set<String> allWindows = driver.getWindowHandles();
		allhandles = new ArrayList<String>(allWindows);
		driver.switchTo().window(allhandles.get(1));
		return new FindLeadsPage(driver);
	}
	
	public MergeLeadsPage switchToMainWindow() {
		driver.switchTo().window(allhandles.get(0));
		return this;
	}

}
