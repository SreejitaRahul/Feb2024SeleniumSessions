package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementConceptWithException {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		try {
		driver.findElement(By.id("input-email")).sendKeys("naveen@gmail.com");
		}
		
		catch(NoSuchElementException e) {
			System.out.println("Element is not present on the page...");
			e.printStackTrace();
			
		}
		
		
		// driver.findElement(By.id("input-password")).sendKeys(null); null keys are not allowed
		

	}

}
