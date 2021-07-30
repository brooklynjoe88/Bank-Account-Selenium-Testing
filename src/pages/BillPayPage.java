package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BillPayPage 
{
	
	private WebDriver driver;
	private By payee = By.name("payee.name");
	private By address = By.name("payee.address.street");
	private By city = By.name("payee.address.city");
	private By state = By.name("payee.address.state");
	private By zip = By.name("payee.address.zipCode");
	private By phone = By.name("payee.phoneNumber");
	private By accountnum = By.name("payee.accountNumber");
	private By accountnumV= By.name("verifyAccount");
	private By amount = By.name("amount");
	private By submit= By.className("button");

													
													
													//Send Payment
	//constructor
	
	public BillPayPage(WebDriver driver)
	{
		this.driver = driver;
	}
	
	public void setPayee(String payeeName) 
	{
		driver.findElement(payee).sendKeys(payeeName);
	}
	
	public void setAddress (String AddressField)
	{
		driver.findElement(address).sendKeys(AddressField);
	}

	public void setCity(String cityField)
	{
		driver.findElement(city).sendKeys(cityField);
	}

	public void setState(String stateField) 
	{
		driver.findElement(state).sendKeys(stateField);
				
	}
	
	public void setZip (String zipField)
	{
		driver.findElement(zip).sendKeys(zipField);
	}
	
	public void setPhone (String phoneField)
	{
		driver.findElement(phone).sendKeys(phoneField);
	}
	
	public void setAccountv (String accountVField)
	{
		driver.findElement(accountnumV).sendKeys(accountVField);
	}
	
	public void setAccount (String accountField)
	{
		driver.findElement(accountnum).sendKeys(accountField);
	}
	
	
	public void setAmount (String amountField)
	{
		driver.findElement(amount).sendKeys(amountField);
	}
	
	public void submitButton ()
	{
		driver.findElement(submit).click();
	}
	

	
	
	
	}
