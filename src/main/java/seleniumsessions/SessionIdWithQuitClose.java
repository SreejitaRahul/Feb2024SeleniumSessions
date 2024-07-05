package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class SessionIdWithQuitClose {

	public static void main(String[] args) {
		   
		   WebDriver driver = new ChromeDriver();
					
			
			driver.get("https://www.google.com");
			
			//get the title:
			String title = driver.getTitle();
			System.out.println("page title:" + title);
			
				
			
			// get the url:
			String url = driver.getCurrentUrl();
			System.out.println("Page url is" + url);	
				
			
			//close the browser
			//driver.quit();
			
			driver.close(); //org.openqa.selenium.NoSuchSessionException: invalid session id
			
			System.out.println(driver.getTitle()); 
			//quit(); ////Session ID is null. Using WebDriver after calling quit()?
			
			//close(); // org.openqa.selenium.NoSuchSessionException: invalid session id

	}

}
