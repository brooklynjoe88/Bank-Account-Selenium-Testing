package Tests;


import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import base.driver;
import pages.AboutPage;
import pages.AccountOverviewPage;
import pages.BillPayPage;

public class Login_BillPay_Test extends driver

{
	@Test
	public void testlogin()
	{
		homePage.setUsername("john");
		homePage.setPassword("demo");
		AccountOverviewPage accountOverviewPage = homePage.clickLogin();
		BillPayPage billPayPage = accountOverviewPage.clickLink();
				
		
		billPayPage.setPayee("John Doe");
		billPayPage.setAddress("329 south St Denver, co");
		billPayPage.setCity("Brooklyn");
		billPayPage.setState("NY");
		billPayPage.setZip("11122");
		billPayPage.setPhone("718-222-2222");
		billPayPage.setAccount("555222333111");
		billPayPage.setAccountv("555222333111");
		billPayPage.setAmount("5000");
		
		AboutPage aboutPage = billPayPage.submitButton();
		assertEquals(aboutPage.getUrl(),"https://parabank.parasoft.com/parabank/about.htm","Alert test incorrect");
		
	}
	
}
