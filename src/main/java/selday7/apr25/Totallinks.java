package selday7.apr25;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Totallinks {

	static WebDriver driver;

	public static void main(String[] args) {

		// total links
		// fetch the text of each link (if text is present)
		// check the link is valid/not broken

		driver = new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/");

		List<WebElement> linksList = driver.findElements(By.tagName("a"));

//		System.out.println("total links =" + linksList.size());
//
//		for (int i = 0; i < linksList.size(); i++) {
//
//			String text = linksList.get(i).getText();
//			if (text.length() != 0) {
//				System.out.println(text);
//			}
//		}
//
//		System.out.println("---------------------------------");
//
//		for (WebElement e : linksList) {
//
//			String text = e.getText();
//			if (text.length() != 0) {
//				System.out.println(text);
//			}
//		}

		By links = By.tagName("a");
		By imgList = By.tagName("img");
		System.out.println("total links" + getElementsCount(links));
		System.out.println("total images" + getElementsCount(imgList));

		List<String> linksTextList = getElementsTextList(links);
		System.out.println(linksTextList);

	}

	public static List<WebElement> getElements(By locator) {

		return driver.findElements(locator);

	}

	public static int getElementsCount(By locator) {

		return getElements(locator).size();
	}

	// WAF to fetch the text of each link, stor it in some list and return
	// name: getElementTextList
	// param : By locator
	// return: List<String>

	public static List<String> getElementsTextList(By locator) {
		List<WebElement> elementList = getElements(locator);
		List<String> eletextList = new ArrayList<String>();

		for (WebElement e : elementList) {
			String text = e.getText();
			if (text.length() != 0) {
				eletextList.add(text);

			}
		}

		return eletextList;

	}

}
