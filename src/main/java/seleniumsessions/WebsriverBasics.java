package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebsriverBasics {

	public static void main(String[] args) {
		
	//	WebDriver driver = new ChromeDriver();
	// WebDriver driver = new FirefoxDriver();
		WebDriver driver = new EdgeDriver();
		
		
		driver.get("https://www.google.com");
		
		//get the title
		String title = driver.getTitle();
		System.out.println("page title:" + title);
		
		if(title.equals("Google")) {
			
			System.out.println("title is correct");
		}
		else
		{
			System.out.println("title is not correct");
		}
		
		
		// get the url:
		String url = driver.getCurrentUrl();
		System.out.println("Page url is" + url);
		
		if(url.contains("google.com")) {
			System.out.println("url is correct");
		}
		else
		{
			System.out.println("url is not correct");
		}
		
		
		//close the browser
		driver.close();
		

	}

}
