package parabank;

import org.openqa.selenium.By;

public class AccountOverview extends Screenshot
{


	
	

	 public void accountOverview()
	 {
		
		//Click account overview
		 driver.findElement(By.xpath("//*[@id=\'leftPanel\']/ul/li[2]/a")).click();
		 
 
	 }
	


}
