package selday8.ap29;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownGetOptionsWithoutSelectClass {
	
	static WebDriver driver;

	public static void main(String[] args) {

		// 1. select a value from dropdown without using select class methods: by index,
		// by value, by visibletext
		// 2. select a value from dropdown without using select class

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/contact-sales/");

		By country = By.id("Form_getForm_Country");
		By employee = By.id("Form_getForm_NoOfEmployees");
		
//		selectValueFromDropdown(country, "Canada");
		
				
//		List<WebElement> countryList = driver.findElements(countryOptions);
//		System.out.println(countryList.size());
//		
//		for (WebElement e : countryList) {
//			String text = e.getText();
//			if(text.equals("India")) {
//				e.click();
//				break;
//			}
//				
//			
//		}
		
//		Select select_country = new Select(driver.findElement(country));
//		List<WebElement> countryOptions = select_country.getOptions();
//		for (WebElement e : countryOptions) {
//			String text = e.getText();
//			if(text.equals("Canada")) {
//				e.click();
//				break;
//			}
//		}
		
		By countryOptions = By.xpath("//select[@id='Form_getForm_Country']/option");
		selectValueFromDropdownWithoutSelectClass(countryOptions, "Brazil");

	}
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	public List<WebElement> getElements(By locator) {

		return driver.findElements(locator);

	}
	
	public static void selectValueFromDropdown(By locator, String optionText) {
		Select select = new Select(getElement(locator));
		List<WebElement> optionsList = select.getOptions();
		for (WebElement e : optionsList) {
			String text = e.getText();
			if (text.equals(optionText.trim())) {
				e.click();
				break;
			}
		}
	}
	
	public static void selectValueFromDropdownWithoutSelectClass(By locator, String optionText) {
		
		
		List<WebElement> countryList = driver.findElements(locator);
		System.out.println(countryList.size());
		
		for (WebElement e : countryList) {
			String text = e.getText();
			if(text.equals(optionText)) {
				e.click();
				break;
			}
		
		
		
	}
}
	
}
