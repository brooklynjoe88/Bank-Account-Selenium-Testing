package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AccountOverviewPage 
{


	private WebDriver driver;
	private By BillPayLink = By.linkText("Bill Pay");
	
	//Constructor
	public AccountOverviewPage(WebDriver driver)
	 {
		this.driver = driver;
 
	 }
	
	public BillPayPage clickLink()
	{
		driver.findElement(BillPayLink).click();
		
		return new BillPayPage(driver); 
	}
	
	public void AccountOverviewt()
	{
		System.out.println("Success");
	}

}
