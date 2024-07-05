package selday8.ap29;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdownAllOption {
	
	static WebDriver driver;

	public static void main(String[] args) {

		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/en/contact-sales/");

		By country = By.id("Form_getForm_Country");
		By employee = By.id("Form_getForm_NoOfEmployees");
		
//		Select select_country = new Select(driver.findElement(country));
//		
//		List<WebElement> countryOptions = select_country.getOptions();
//		System.out.println(countryOptions.size());
//		
//		for(WebElement e: countryOptions) {
//			
//			String text = e.getText();
//			System.out.println(text);
//		}
		
		List<String> countryList = getDropdownOptionsTextList(country);
		System.out.println(countryList);
		List<String> employeeList = getDropdownOptionsTextList(employee);
		System.out.println(employeeList);
		
		System.out.println(getDropdownOptionsCount(country));
		System.out.println(getDropdownOptionsCount(employee));
		

	}
	
	public static int getDropdownOptionsCount(By locator) {
		
		Select select = new Select(getElement(locator));
		return select.getOptions().size();	
		
	}
	
	public static WebElement getElement(By locator) {
		
		return driver.findElement(locator);
	}
	
	public static List<String> getDropdownOptionsTextList(By locator) {
		
    Select select = new Select(getElement(locator));
		
		List<WebElement> optionsList = select.getOptions();
		List<String> optionsTextList= new ArrayList<String>();
		
		for(WebElement e: optionsList) {
			
			String text = e.getText();
			optionsTextList.add(text);
		}
		
		return optionsTextList;
		
	}

}
