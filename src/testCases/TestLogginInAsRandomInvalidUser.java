package testCases;

import org.openqa.selenium.By;

import generic.BaseTest;
import pompages.OHRMLoginPage;

public class TestLogginInAsRandomInvalidUser extends BaseTest {
	
	public void loginAsInvalidUserTest() throws InterruptedException {	
		
		launchBrowser();
		navigateToFirstPage();
		
		OHRMLoginPage loginPage = new OHRMLoginPage(driver);
		loginPage.enterUserName(giveRandomStringData());
		loginPage.enterPassword(giveRandomStringData());
		Thread.sleep(3000);
		loginPage.clickLoginButton();
		waitForElementPresenece(driver.findElement(By.xpath("//div[@role='alert']")));
		verifyErrorMessage();
	}
	
	public void verifyErrorMessage() {
		String expectedMessage = "Invalid credentials";
		String actualMessage = getTextFromElement(findElement("//div[@role='alert']//p"));
		if(actualMessage.equalsIgnoreCase(expectedMessage)) {
			System.out.println("Message matched");
			driver.quit();
		}
		else {
			System.out.println("Message did not match");
			throw new RuntimeException("Wrong message show error");
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		TestLogginInAsRandomInvalidUser tlr = new TestLogginInAsRandomInvalidUser();
		tlr.loginAsInvalidUserTest();
	}
	

}
