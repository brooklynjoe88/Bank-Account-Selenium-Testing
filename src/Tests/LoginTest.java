package Tests;



import org.testng.annotations.Test;

import base.driver;
import pages.AccountOverviewPage;
import pages.BillPayPage;

public class LoginTest extends driver

{
	@Test
	public void testlogin()
	{
		homePage.setUsername("john");
		homePage.setPassword("demo");
		AccountOverviewPage accountOverviewPage = homePage.clickLogin();
//		accountOverviewPage.AccountOverviewt();
		BillPayPage billPayPage = accountOverviewPage.clickLink();
		billPayPage.setPayee("John Doe");
		billPayPage.setAddress("329 south St Denver, co");
	}
	
}
