package parabank;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class Transfer extends Login
{

	 public void transfer()
	 {
		
		//Click transfer button via xpath
		 driver.findElement(By.xpath("//*[@id=\'leftPanel\']/ul/li[3]/a")).click();

		 //insert a quick wait. Immediate input causes the account field to be undefined. (Will put a wait until element loads in future)
		 
		 try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
		 
		 driver.findElement(By.name("input")).sendKeys("300");
		 //driver.findElement(By.xpath("//*[@id=\'fromAccountId\']")).
		 
		 Select dropdown1 = new Select(driver.findElement(By.id("fromAccountId")));
		 Select dropdown2 = new Select(driver.findElement(By.id("toAccountId")));
		 
		 
		 //select accounts #s from dropdown
		 dropdown1.selectByValue("54081");
		 dropdown2.selectByValue("54192");
		 
		 //click transfer button via xpath
		 driver.findElement(By.xpath("//*[@id=\'rightPanel\']/div/div/form/div[2]/input")).click();
		 
		
		 
	 }
	


}
