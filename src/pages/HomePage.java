package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	
	private WebDriver driver;
	
	private By usernameField = By.name("username");
	private By passwordField = By.name("password");
	private By accountOverviewLink = By.xpath("//*[@id='loginPanel']/form/div[3]/input");

	//Constructor to pass driver
	public HomePage(WebDriver driver)
	{
		this.driver = driver; 
	}
	
	public void  setUsername(String username)
	{
		driver.findElement(usernameField).sendKeys(username);
	}

	public void  setPassword(String password)
	{
		driver.findElement(passwordField).sendKeys(password);
	}
	
	public AccountOverviewPage clickLogin() 
	{
		driver.findElement(accountOverviewLink).click();
		
		return new AccountOverviewPage(driver); 
	}

}
