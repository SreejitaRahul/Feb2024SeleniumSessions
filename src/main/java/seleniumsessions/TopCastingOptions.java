package seleniumsessions;

import org.openqa.selenium.Capabilities;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class TopCastingOptions {

	public static void main(String[] args) {
		
		//1. Valid and recommended --Local execution
	//	WebDriver driver = new ChromeDriver();
		
		
		//2. valid but not recommended
	//	SearchContext driver = new ChromeDriver();
		
		//3. valid and recommended
	//	RemoteWebDriver driver = new ChromeDriver();
		
		//4. valid and recommended-- for remote execution
		//(AWS,Cloud,Server, VM machine)
		
		//WebDriver driver = new RemoteWebDriver(remoteaddress, capabilities);
		
		//5. valid but not recommended 
		
		//SearchContext driver= new RemoteWebDriver(remoteAddress, capabilities);
		
		//6. valid but not recommended (only for 2 browsers: edge/chrome)
		//ChromiumDriver driver = new ChromeDriver();
		//driver = new EdgeDriver();
		
		//7. not valid
		//RemoteWebdriver driver= new ChromiumDriver();
		
		
		
		

	}

}
