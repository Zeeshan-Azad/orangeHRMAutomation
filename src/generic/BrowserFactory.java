package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;

public class BrowserFactory {
	
	public static WebDriver launchBrowser(String browserName) {
		WebDriver driver;
		
		//for chrome
		ChromeOptions optionsChrome = new ChromeOptions();
		optionsChrome.addArguments("--remote-allow-origins=*");
		optionsChrome.addArguments("--disable-notifications");
		optionsChrome.setAcceptInsecureCerts(true);
		
		//for firefox
		FirefoxOptions optionsFireFox = new FirefoxOptions();
		optionsFireFox.addArguments("--disable-notifications");
		optionsFireFox.setAcceptInsecureCerts(true);
		
		switch (browserName) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver");
			driver = new ChromeDriver(optionsChrome);
			break;
		
		case "firefox":
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver");
			driver = new FirefoxDriver();
			break;
			
		case "safari" :
			driver = new SafariDriver();
			break;
			
		default:
			driver = null;
			System.out.println("No browser selected");
			break;
		}
		
		return driver;
	}
}
