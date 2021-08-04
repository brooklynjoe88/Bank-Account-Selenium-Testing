package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import pages.HomePage;


public class driver 
{
	
	private WebDriver driver; 
	protected HomePage homePage;
	
	@BeforeClass
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://parabank.parasoft.com/");
		
		homePage = new HomePage(driver);
	}

	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	
}
 