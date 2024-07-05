package selday6.apr24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeVal {

	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By forgotpwdLink = By.linkText("Forgotten Password");
		By emailid = By.id("input-email");
		
		
//		String hrefVal = driver.findElement(forgotpwdLink).getAttribute("href");
//		System.out.println(hrefVal);
//		
//		String placeholderVal = driver.findElement(id).getAttribute("placeholder");
//		System.out.println(placeholderVal);
//		
//		driver.findElement(emailid).sendKeys("naveen@gmail.com");
//		String emailVal = driver.findElement(emailid).getAttribute("value");
//		System.out.println(emailVal);
//		
		
		String p = doGetAttribute(emailid, "placeholder");
		System.out.println(p);
		
		driver.findElement(emailid).sendKeys("naveen@gmail.com");
		String emailVal = doGetAttribute(emailid, "value");
		System.out.println(emailVal);	
		
	}
	
	
	public static WebElement getElement(By locator) {
		
		return driver.findElement(locator);
	}
	
	
	public static String doGetAttribute(By locator, String attrName) {
		
		return getElement(locator).getAttribute(attrName);
		
	}

}
