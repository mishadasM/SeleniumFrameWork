package com.obsqura.tests;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.obsqura.Exception.NoBrowserFoundException;
import com.obsqura.pages.ExpenseCategoryPage;
import com.obsqura.pages.HomePage;
import com.obsqura.pages.ListDeliveryBoyPage;
import com.obsqura.pages.LoginPage;
import com.obsqura.pages.ProductsPage;
import com.obsqura.utilities.TestProperties;

public class BaseTest {
	WebDriver driver;
	Properties prop;

	@BeforeClass
	public void InitializeDriver() throws IOException  {
		prop = TestProperties.GetProperties(); 
		String browserName=prop.getProperty("browser");
		String Environment = prop.getProperty("Environment");
		String Url = prop.getProperty(Environment);
			
		if (browserName.equals("Chrome")) {
			driver = new ChromeDriver();
			
		}

		else if (browserName.equals("Edge")) {
			driver = new EdgeDriver();
		} else if (browserName.equals("Firefox")) {
			driver = new FirefoxDriver();
		} else {
//			System.out.println("Please Choose Correct BrowserName");
			throw new NoBrowserFoundException("Please choose Correct browserName");
		}

		InitializePages();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get(Url);

	}
	
	public LoginPage lp;
	public HomePage hp ;
	public ProductsPage pp;
	public  ExpenseCategoryPage ecp;
	public ListDeliveryBoyPage ldp;
	/**
	 * Intialize Globally
	 */
	public void InitializePages() {
		 lp = new LoginPage(driver);
		 hp = new HomePage(driver);
		 pp = new ProductsPage(driver);
	    ecp = new ExpenseCategoryPage(driver);
	    ldp=new ListDeliveryBoyPage(driver);
	}
	

	
	@AfterClass
	public void TearDown() {

		driver.quit();
	}
}