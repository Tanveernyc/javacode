package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {
	
	static WebDriver driver;
	
	public static WebDriver StartBrowser(String BrowserName, String url) {
		
		if (BrowserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver");
			driver = new ChromeDriver();
		}
		
		driver.get(url);
		return driver;
		
	}
	
	
	
	
	
	

}
