package pompages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import generic.BasePage;

public class OHRMLoginPage extends BasePage {
	
	@FindBy(name="username")
	private WebElement usernameTextField;
	
	@FindBy(name="password")
	private WebElement passwordTextField;
	
	@FindBy(xpath="//button[normalize-space()='Login']")
	private WebElement loginButton;
	
	@FindBy(xpath="//p[normalize-space()='Forgot your password?']")
	private WebElement forgotYourPasswordLink;
	
	@FindBy(xpath="//a[.='OrangeHRM, Inc']")
	private WebElement orangeHRMHomePageLink;
	
	@FindBy(xpath="//a[contains(@href,'linkedin')]")
	private WebElement linkedInProfileLink;
	
	@FindBy(xpath="//a[contains(@href,'facebook')]")
	private WebElement facebookProfileLink;
	
	@FindBy(xpath="//a[contains(@href,'twitter')]")
	private WebElement twitterProfileLink;
	
	@FindBy(xpath="//a[contains(@href,'youtube')]")
	private WebElement youtubeProfileLink;
	
	public OHRMLoginPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	
	public void enterUserName(String userName) {
		usernameTextField.sendKeys(userName);
	}
	
	public void enterPassword(String password) {
		passwordTextField.sendKeys(password);
	}
	
	public void clickLoginButton() {
		loginButton.click();
	}
	
	public void forgotPasswordLink() {
		forgotYourPasswordLink.click();
	}
	
	public void goToHomePage() {
		orangeHRMHomePageLink.click();
	}
	
	public void goToFacebookPage() {
		facebookProfileLink.click();
	}
	
	public void goToTwitterPage() {
		twitterProfileLink.click();
	}
	
	public void goToYouTubePage() {
		youtubeProfileLink.click();
	}
	
	public void goToLinkedInPage() {
		linkedInProfileLink.click();
	}
	
}
