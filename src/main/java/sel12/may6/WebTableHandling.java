package sel12.may6;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableHandling {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
	
		driver= new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Thread.sleep(3000);
		
	//	driver.findElement(By.xpath("//a[text()='Joe.Root']/parent::td/preceding-sibling::td/input[@type='checkbox']"))
	//			.click();
		
	// 	driver.findElement(By.xpath("//a[text()='Joe.Root']/ancestor::tr//input[@type='checkbox']")).click();
		

		selectUserName("Joe.Root");
		selectUserName("Jordan.Mathews");

		System.out.println(getUserData("Joe.Root"));
		System.out.println(getUserData("Jordan.Mathews"));
		
	}
	
	public static List<String> getUserData(String userName) {
	
		List<WebElement> userDataList = driver.findElements(By.xpath("//a[text()='"+userName+"']/parent::td/following-sibling::td"));
		List<String> dataList = new ArrayList<String>();
		for(WebElement e: userDataList) {
			
			String userData = e.getText();
			dataList.add(userData);
		}
		return dataList;
	}
	
	public static void selectUserName(String userName) {
		
		driver.findElement(By.xpath("//a[text()='"+userName+"']/parent::td/preceding-sibling::td/input[@type='checkbox']")).click();
	}

}
