package parabank;

import org.openqa.selenium.By;

public class Login extends driver
{



	 public void login()
	 {
		
		//Navigate to URL
		driver.get("https://parabank.parasoft.com/");
		
		//enter username and pass
		driver.findElement(By.name("username")).sendKeys("john");
		driver.findElement(By.name("password")).sendKeys("demo");
		
		//Click buttion by xpath
		driver.findElement(By.xpath("//*[@id='loginPanel']/form/div[3]/input")).click();
	 }
	

}
