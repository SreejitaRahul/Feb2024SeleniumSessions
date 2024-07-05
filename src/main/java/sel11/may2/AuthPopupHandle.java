 package sel11.may2;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AuthPopupHandle {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		String username="admin";
		String password ="admin";
		
		// Basic authentication popup..here we cannot use any password with @ sign..this method will
		//not work
		driver.get("https://"+username+":"+ password+"@"+"the-internet.herokuapp.com/basic_auth");
		

	}

}
