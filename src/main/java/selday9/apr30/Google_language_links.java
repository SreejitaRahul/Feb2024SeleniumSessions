package selday9.apr30;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import seleniumsessions.WebElementConcept;

public class Google_language_links {
	
	static WebDriver driver;

	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		
//		List<WebElement> langLinks = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));
//		System.out.println(langLinks.size());
//		
//		for(WebElement e: langLinks) {
//			
//			String text = e.getText();
//			System.out.println(text);
//			if(text.equals("मराठी")) {
//				e.click();
//				break;
//			}
//			
//		}
		
		
		// Assignment : to access footer links on the google page
		
		List<WebElement> footerLinks = driver.findElements(By.xpath("//div[@class='KxwPGc SSwjIe']//a[contains(@class,'pHiOh')]"));
		System.out.println(footerLinks.size());
		for(WebElement e: footerLinks) {
			String text = e.getText();
			System.out.println(text);
		}
		

	}

}
