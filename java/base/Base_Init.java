package base;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ReadExcel;

public class Base_Init {

	public ChromeDriver driver;
	public static Properties prop;
	public String sheetname;
	
	@BeforeTest
	public void readPropertyFile() throws IOException {
		FileInputStream fis = new FileInputStream("./src/main/resources/english.properties");
	    prop = new Properties();
		prop.load(fis);
	}
	
	@BeforeMethod
	public void preCondition() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(7));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(prop.getProperty("url"));
	}
	
	@DataProvider(name = "GetData", indices = 0)
	public String[][] getData() throws IOException {
		return ReadExcel.readExcelData(sheetname);
	}
	
	@AfterMethod
	public void postCondition() {
		driver.close();
	}
}
