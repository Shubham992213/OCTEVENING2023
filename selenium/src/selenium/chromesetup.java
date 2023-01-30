package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromesetup {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\visiest program files\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		
	}

}
 