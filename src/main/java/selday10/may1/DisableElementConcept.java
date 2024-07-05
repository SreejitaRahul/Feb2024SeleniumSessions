package selday10.may1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisableElementConcept {
	 static WebDriver driver;

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			driver = new ChromeDriver ();
			driver.get("https://seleniumpractise.blogspot.com/2016/09/how-to-work-with-disable-textbox-or.html");
			
//			By submitButton = By.id("submitButton");
//			
//			driver.findElement(submitButton).click();
//			
			driver.findElement(By.id("pass")).click(); // Nothing will happen with no exception
			driver.findElement(By.id("passnew")).sendKeys("Naveen");//ElementNotInteractableException:
			//element not interactable
			
			driver.findElement(By.id("passnew")).sendKeys("testing");
			//Element not interactable exception in case of sendkeys for disabled element
			
			
			
			
			
			
			
		}

}