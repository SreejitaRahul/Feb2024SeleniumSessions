package sel12.may6;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassicCRMWebTable {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		driver = new ChromeDriver();
		driver.get("https://classic.freecrm.com/");
		Thread.sleep(3000);

		driver.findElement(By.name("username")).sendKeys("apiautomation");
		driver.findElement(By.name("password")).sendKeys("Selenium@12345");
		Thread.sleep(3000);

		driver.findElement(By.xpath("//input[@value='Login']")).click();

		driver.switchTo().frame("mainpanel");
		driver.findElement(By.linkText("CONTACTS")).click();

		// driver.findElement(By.xpath(null));
		
		selectUserName("Keerthana Vignesh");
		System.out.println(getCompanyName("Keerthana Vignesh"));
		//selectMultiUserName("Geetanjali Kalra");
		
		selectUserName("Geetanjali Kalra", 2);
		
		//get email id
		

	}

	public static void selectUserName(String userName) {

		driver.findElement(By.xpath(
				"//a[text()='" + userName + "']/parent::td/preceding-sibling::td/child::input[@type='checkbox']"))
				.click();
	}

	public static void selectUserName(String userName, int index) {
		
		if(index>0) {
		driver.findElement(By.xpath("(//a[text()='" + userName
				+ "']/parent::td/preceding-sibling::td/child::input[@type='checkbox'])[" + index + "]")).click();
		}
	}
	
	public static void selectLastUserName(String userName) {
		driver.findElement(By.xpath(
				"(//a[text()='" + userName + "']/parent::td/preceding-sibling::td/child::input[@type='checkbox'])[last()]"))
				.click();
	}

	public static String getCompanyName(String userName) {

		return(driver.findElement(
				By.xpath("//a[text()='" + userName + "']/parent::td/following-sibling::td/a[@context='company']"))
				.getText());
	}

	public static void selectMultiUserName(String userName) {

		List<WebElement> usersChecklist = driver.findElements(By.xpath(
				"//a[text()='" + userName + "']/parent::td/preceding-sibling::td/child::input[@type='checkbox']"));
		for (WebElement e : usersChecklist) {
			e.click();
		}

	}

}