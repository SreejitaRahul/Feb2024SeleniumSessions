package selday5.apr23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsConcept {

	static WebDriver driver;

	public static void main(String[] args) {
	
		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		// create a webelement+ perform an action(click, sendkeys, gettext, isdisplayed...etc)
		
		// 1. id
//		driver.findElement(By.id("input-email")).sendKeys("naveen@gmail.com");
//		driver.findElement(By.id("input-password")).sendKeys("test@123");
//		
//		//2. name: can ne duplicate
//		driver.findElement(By.name("email")).sendKeys("naveen@gmail.com");
//		driver.findElement(By.name("password")).sendKeys("test@123");
		
		//3. classname : can be duplicate
		
		//driver.findElement(By.className("form-control")).sendKeys("naveen@gmail.com");
		
//		//4. xpath : it not an attribute , xpath is address of element in html dom
//		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("naveen@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("test@123");
//		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
		
		// 5. CSS selector: its not an attribute
		// CSS : Cascaded style sheet
//		driver.findElement(By.cssSelector("#input-email")).sendKeys("naveen@gmail.com");
//		driver.findElement(By.cssSelector("#input-password")).sendKeys("test@123");
//		driver.findElement(By.cssSelector("#content > div > div:nth-child(2) > div > form > input")).click();
//		
		
		// 6. linkText: only for links <html> a
//		driver.findElement(By.linkText("Register")).click();
		
		// 7. partial link text : only for links
		//driver.findElement(By.partialLinkText("Delivery")).click();
		
		//8. tagname : html tag
		String header = driver.findElement(By.tagName("h2")).getText();
		System.out.println(header);
		
		
		
		
//		

	}

}
