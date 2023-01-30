package launch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefoxLaunch{
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","C:\\visiest program files\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.facebook.in/");
	driver.manage().window().maximize();
	
	
	

		
	}


}
