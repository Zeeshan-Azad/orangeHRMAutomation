package generic;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BasePage extends BaseTest{
	
	WebDriver driver;
	Actions actions;
	Robot robot;
	Select select;
	Alert alert;
	JavascriptExecutor js;
	
	
	//constructor
	public BasePage(WebDriver driver) {
		this.driver = driver;	
	}	
	
	
	//initializing the instance members
	
	private void initializeActions() {
		actions = new Actions(driver);
	}
	
	private void initializeRobot() {
		try {
			robot = new Robot();
		}
		catch (Exception e) {
			System.out.println("Cannot start Robot class object");
			e.printStackTrace();
		}
	}
	
	private void initializeJavaScriptExecutor() {
		js = (JavascriptExecutor)driver;
	}
	
	
	// all mouse operations
	public void leftClick() {
		if(actions==null) {
			initializeActions();
		}
		actions.click().perform();
	}
	
	public void leftClickOnElement(WebElement element) {
		if(actions==null) {
			initializeActions();
		}
		actions.click(element).perform();
	}
	
	public void rightClick() {
		if(actions==null) {
			initializeActions();
		}
		actions.contextClick().perform();
	}
	
	public void rightClickOnElement(WebElement element) {
		if(actions==null) {
			initializeActions();
		}
		actions.contextClick(element).perform();
	}
	
	public void hoverMouse(WebElement element) {
		if(actions==null) {
			initializeActions();
		}
		actions.moveToElement(element).perform();
	}
	
	public void doubleClick() {
		if(actions==null) {
			initializeActions();
		}
		actions.doubleClick().perform();
	}
	
	public void doubleClickOnElement(WebElement element) {
		if(actions==null) {
			initializeActions();
		}
		actions.doubleClick(element).perform();
	}
	
	public void dragAndDrop(WebElement sourceElement, WebElement targetElement) {
		if(actions==null) {
			initializeActions();
		}
		actions.dragAndDrop(sourceElement, targetElement).perform();
	}
	
	
	//javaScript operations
	public void scrollDown() {
		if(js==null) {
			initializeJavaScriptExecutor();
		}
		js.executeScript("window.scrollBy(0,500)");	
	}
	
	public void scrollUp() {
		if(js==null) {
			initializeJavaScriptExecutor();
		}
		js.executeScript("window.scrollBy(0,-500)");	
	}
	
	public void forceClick(WebElement element) {
		if(js==null) {
			initializeJavaScriptExecutor();
		}
		js.executeScript("arguments[0].click()", element);
	}
	
//	public void forceSendText(WebElement element, String givenValue) {
//		js = (JavascriptExecutor)driver;
//		js.executeScript("arguments[0].value=''", element);
//	}
	
	//all keyboard operations
	
	public void hitEnter() {
		if(robot==null) {
			initializeRobot();
		}
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}
	
	public void hitDelete() {
		if(robot==null) {
			initializeRobot();
		}
		robot.keyPress(KeyEvent.VK_DELETE);
		robot.keyRelease(KeyEvent.VK_DELETE);
	}
	
	public void hitTab() {
		if(robot==null) {
			initializeRobot();
		}
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
	}
	
	public void hitBackSpace() {
		if(robot==null) {
			initializeRobot();
		}
		robot.keyPress(KeyEvent.VK_BACK_SPACE);
		robot.keyRelease(KeyEvent.VK_BACK_SPACE);
	}
	
	public void hitSpace() {
		if(robot==null) {
			initializeRobot();
		}
		robot.keyPress(KeyEvent.VK_SPACE);
		robot.keyRelease(KeyEvent.VK_SPACE);
	}
	
	public void typeKey(char keyStroke) {
		
		if(robot==null) {
			initializeRobot();
		}
		
		Integer keyCode = KeyMapUtil.getKeyCode(keyStroke);
		if(keyCode != null) {
			robot.keyPress(keyCode);
			robot.keyRelease(keyCode);
		}
		else {
			System.out.println("Invalid key selection");
		}
	}
	
}
