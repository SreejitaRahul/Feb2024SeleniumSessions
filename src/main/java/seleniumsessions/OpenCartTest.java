package seleniumsessions;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class OpenCartTest {

	public static void main(String[] args) {
		
		//String browser ="chrome";
		
		ReadProperty propReader = new ReadProperty();
		
		Properties prop = propReader.initProp();
		
		BrowserUtil brUtil = new BrowserUtil();
		
	    brUtil.launchBrowser(prop.getProperty("browser"));
		
		brUtil.launchUrl(prop.getProperty("url"));
		
		String actTitle = brUtil.getPageTitle();
		
		System.out.println("Page title :" + actTitle);
		
		
		// validation point/ checkpoint
    	if(actTitle.equals("Your Store")) {
			
			System.out.println("title is correct");
		}
		else
		{
			System.out.println("title is not correct");
		}
    	
    	
    	
    	String appUrl = brUtil.getPageCurrentURL();
    	System.out.println(appUrl);
    	
    	if(appUrl.contains("opencart")) {
    		
    		System.out.println("url is correct");
       	}
    	else {
    		System.out.println("URL is not correct");
    	}
    	
    	brUtil.quitBrowser();
    	
		
		
		

	}

}
