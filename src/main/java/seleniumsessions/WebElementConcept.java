package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementConcept {
	
	static WebDriver driver;

	public static void main(String[] args) {
	
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		// create a webelement + perform an action(cick sendkeys, getText, isDisplayed....etc)
		
//		// 1.
//		driver.findElement(By.id("input-email")).sendKeys("naveen@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("test@123");
//		
		//2. first maintain the webelement and then perform action on it
//		WebElement emailId = driver.findElement(By.id("input-email"));
//		WebElement password = driver.findElement(By.id("input-password"));
//		
//		emailId.sendKeys("naveen@gmail.com");
//		password.sendKeys("test@123");
//		
		
//		//3. By locator approach
//		By emailId = By.id("input-email");
//		By password = By.id("input-password");
//		
//		WebElement emailId_ele = driver.findElement(emailId);
//		WebElement pwd_ele = driver.findElement(password);
//		
//		emailId_ele.sendKeys("naveen@gmail.com");
//		pwd_ele.sendKeys("input-password");
//		
//		
		// 4 . By locator +generic function for webelemnts
		
//		By emailId = By.id("input-email");
//        By password = By.id("input-password");
//        
//        getElement(emailId).sendKeys("naveen@gmail.com");
//        getElement(password).sendKeys("input-password");
		
		
		// 5. By locator + generic function for webelements and sendkeys

//		By emailId = By.id("input-email");
//		By password = By.id("input-password");

//		doSendKeys(emailId, "naveen@gmail.com");
//		doSendKeys(password, "input-password");
		
		
		//6. By locator + generic function for webelements and sendkeys : ElementUtil
		
//		By emailId = By.id("input-email");
//		By password = By.id("input-password");
//		
//		ElementUtil eleUtil = new ElementUtil(driver);
//		eleUtil.doSendKeys(emailId, "naveen@gmail.com");
//		eleUtil.doSendKeys(password, "test@123");
		
		
		// 7. By locator + BrowserUtil+ ElementUtil

		
	}
	
	public static void doSendKeys(By locator, String value) {

		getElement(locator).sendKeys(value);

	}

	public  static WebElement getElement(By locator) {

		return driver.findElement(locator);

	}
	
	
	
	
	

}
