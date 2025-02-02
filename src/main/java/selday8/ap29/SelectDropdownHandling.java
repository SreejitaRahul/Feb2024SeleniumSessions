package selday8.ap29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdownHandling {

	// htmltag = select
	// select class in Selenium

	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/contact-sales/");

		By country = By.id("Form_getForm_Country");
		By employee = By.id("Form_getForm_NoOfEmployees");

	//	Select select_country = new Select(driver.findElement(country));
//		select_country.selectByIndex(5);
//		select_country.selectByIndex(15);
//		
//		select_country.selectByVisibleText("Belgium");
//		
//		select_country.selectByValue("Angola"); // give the value attribute
//		
//		select_country.selectByValue("naveen"); // give the value attribute

//		Select select_employee = new Select(driver.findElement(employee));
//
//		select_employee.selectByVisibleText("76 - 100");
		
		doSelectByVisibleText(country, "India");
		doSelectByValue(employee, "101 - 150");
		

	}

	public static WebElement getElement(By locator) {

		return driver.findElement(locator);
	}

	public static void doSelectByIndex(By locator, int index) {

		Select select = new Select(getElement(locator));
		select.selectByIndex(index);

	}
	
	
	public static void doSelectByVisibleText(By locator, String text) {

		Select select = new Select(getElement(locator));
		select.selectByVisibleText(text);

	}
	
	public static void doSelectByValue(By locator, String value) {

		Select select = new Select(getElement(locator));
		select.selectByValue(value);

	}
	
	

}
