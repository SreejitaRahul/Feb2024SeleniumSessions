package sel11.may2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		
		//type=file if type not file then this will not work,  windows/mac/linux machines it will work
		driver.findElement(By.name("upfile")).sendKeys("D:\\Sreejita\\Ability to write clear.txt");
		
		// 1. aUTOit : Tool : windows -- not recommended
		// 2. Sikuli : lib: images , not compatible with selenium
		//3. Robot class : Java: windows machine
		
		
		//cookies popup 
		//adv popup
		//browser window popup
		
		
		

	}

}
