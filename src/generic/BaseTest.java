package generic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {
	
	public WebDriver driver;
	
	private void setWebDriverValue(WebDriver driver) {
		this.driver = driver;
		setBrowserProperties();
	}
	
	private void setBrowserProperties() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	
	public void launchBrowser(){
		String browserName = getBrowserName();
		setWebDriverValue(BrowserFactory.launchBrowser(browserName));
	}
	
	private String getBrowserName() {
		return ReadPropertyFile.initiatializeProperteisObjectAndDefinePage("browser");
	}
	
	public void navigateToFirstPage() {
		String url = ReadPropertyFile.initiatializeProperteisObjectAndDefinePage("baseurl");
		driver.navigate().to(url);
	}
	
	public String giveRandomStringData() {
		return RandomDataGenerator.generateString();
	}
	
	public void waitForElementPresenece(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void waitForAlert() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.alertIsPresent());
	}
	
	public WebElement findElement(String locator) {
		return driver.findElement(By.xpath(locator));
	}
	
	public String getTextFromElement(String locator) {
		String textInsideElement = findElement(locator).getText();
		if(!textInsideElement.isEmpty()) {
			return textInsideElement;
		}
		else {
			return "No String";
		}
	}
	
	public String getTextFromElement(WebElement element) {
		String textInsideElement = element.getText();
		if(!textInsideElement.isEmpty()) {
			return textInsideElement;
		}
		else {
			return "No String";
		}
	}
	
}
