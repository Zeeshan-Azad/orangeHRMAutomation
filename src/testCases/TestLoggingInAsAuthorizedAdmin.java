package testCases;

import generic.BaseTest;
import pompages.OHRMLoginPage;

public class TestLoggingInAsAuthorizedAdmin extends BaseTest{
	
	public void logginInAsAuthorizedAdminTest() {
		launchBrowser();
		navigateToFirstPage();
		
		OHRMLoginPage loginPage = new OHRMLoginPage(driver);
		loginPage.enterUserName("Admin");
		loginPage.enterPassword("admin123");
		loginPage.clickLoginButton();	
		driver.quit();
	}
	
	public static void main(String[] args) {
		TestLoggingInAsAuthorizedAdmin tla = new TestLoggingInAsAuthorizedAdmin();
		tla.logginInAsAuthorizedAdminTest();
		
	}
}
