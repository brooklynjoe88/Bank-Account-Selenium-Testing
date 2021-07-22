package parabank;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class driver 
{
	
	public WebDriver driver; 
	
	
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\dev\\Documents\\chromedriver.exe");
		driver = new ChromeDriver();
		
	}

}
