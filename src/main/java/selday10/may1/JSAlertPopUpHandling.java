package selday10.may1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JSAlertPopUpHandling {

	public static void main(String[] args) throws InterruptedException {
		
		// JS Alerts
		// alert
		//prompt
		//confirm
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
//		driver.switchTo().alert(); // NoAlertPresentException
//		
//		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
//		Thread.sleep(3000);
//		
//		Alert alert = driver.switchTo().alert(); // Alert is an interface
//		
//		String text = alert.getText();
//		System.out.println(text);
//		
//		alert.accept(); //ok button
	//	alert.dismiss(); //remove the alert
		
		//2
		
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Thread.sleep(3000);
		Alert alert = driver.switchTo().alert();
		
		String text = alert.getText();
		System.out.println(text);
		alert.sendKeys("testing"); //ElementNotInteractableException: element not interactable:
		alert.accept();
	//	System.out.println(alert.getText()); //NoAlertPresentException: no such alert
		
		
		
		alert.dismiss();

		//3.prompt
		
//		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
//		Thread.sleep(3000);
//	
//		Alert alert = driver.switchTo().alert(); // Alert is an interface
//		String text = alert.getText();
//		System.out.println(text);
//		Thread.sleep(5000);
//		alert.sendKeys("I am sreejita");
//		
//		alert.accept();
////	alert.dismiss();
		
		
		
	}

}
