package selday8.ap29;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectvalueDropdown {

	static WebDriver driver;
	
	public static void main(String[] args) {
		
		driver = new ChromeDriver();
		driver.get("https://html.com/attributes/select-multiple/");
		
		
		// multiple attribute should be there with select tag
		Select select = new Select(driver.findElement(By.xpath("//*[@id=\"post-291\"]/div/div[2]/select")));
		
		// to check if the dropdown is multiselect or not
		System.out.println(select.isMultiple());
		
		if(select.isMultiple()) {
			
			select.selectByVisibleText("American flamingo");
			select.selectByVisibleText("Greater flamingo");
			select.selectByVisibleText("Lesser flamingo");
		}
		
		select.deselectAll();
		
		select.deselectByVisibleText("Lesser flamingo");
		

	}
	
	public static void doDeselectByVisibleText(By locator, String text) {
		
		Select select = new Select(driver.findElement(locator));
		select.deselectByVisibleText(text);
		
	}

}
