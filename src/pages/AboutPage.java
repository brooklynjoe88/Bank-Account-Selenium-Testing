package pages;

import org.openqa.selenium.WebDriver;

public class AboutPage 

{

	WebDriver driver;
	
	public AboutPage (WebDriver driver)
	{
		this.driver = driver;
	}

	public String getUrl()
	{
		return driver.getCurrentUrl();
	}
	
}
