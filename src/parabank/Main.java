package parabank;

public class Main {

	public static void main(String[] args) {
		

		AccountOverview x = new AccountOverview();
		//Creates driver
		x.setup();
		//Navigates to site and logs in
		x.login();
		//Takes a screenshot before the transfer 
		x.screenshot("Before_xfer");
		//Makes a transfer
		x.transfer();
		//Naviagtes to accoint overview screen
		x.accountOverview();
		//Takes screenshot of account balance after transfer
		x.screenshot("After_xfer");
		//closes browser
		x.driver.close();

		
		
	}

}
