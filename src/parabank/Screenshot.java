package parabank;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

public class Screenshot extends Transfer
{

	public void screenshot(String filename) 
	{
		//quick pause for page to load before taking a screenshot (replace with wait until element loads in future)
		 try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		 //Take a screenshot
	    try {
	          File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	          //Save screen shot in destination directory 
	          FileHandler.copy(scrFile, new File("C:/Users/dev/Desktop/" + filename + ".png"));
	         } catch (IOException ex) {
	             ex.printStackTrace();
	            }
		
	}
	
}
