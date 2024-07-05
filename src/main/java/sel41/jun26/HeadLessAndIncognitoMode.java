package sel41.jun26;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class HeadLessAndIncognitoMode {

	public static void main(String[] args) {
		
		//headless mode
		// no browser blocking the browser visibility
		// faster
		// not recommended - no user exp
		// when to use?-- headless based OS- Linux, docker, VM
		// FOR SIMPLE AND SMALL TESTCASES
		// it might not work with complex html components
		
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--headless");
		
		FirefoxOptions fo = new FirefoxOptions();
		fo.addArguments("--headless");
		
		// WebDriver driver = new ChromeDriver(co);
		WebDriver driver = new FirefoxDriver(fo);
		
		driver.get("https://www.google.com/");
		System.out.println(driver.getTitle());
		
		driver.quit();

	}

}
