package project;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Project{
	
	@Test
	
	public void runCreateLead() {

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		//get url
		driver.get("https://www.amazon.in/");
		
		// entering the product name and click search button
		driver.findElementById("twotabsearchtextbox").sendKeys("iphone 11");
		driver.findElementById("nav-search-submit-button").click();
		
		// helps us to identify that we are in which window
		System.out.println(driver.getTitle());
		
		// clicking the particular product
		driver.findElementByLinkText("Apple iPhone 11 (64GB) - Black").click();
		
		// clicking buy now
		driver.findElementByXPath("//input[@id='buy-now-button']").click();
		WebElement email = driver.findElementByXPath("//input[@id='ap_email']");
		email.sendKeys("9063586354");
		driver.findElementById("continue").click();
		
		driver.close();
		}
	}	

		
		
	
		
		
	


									