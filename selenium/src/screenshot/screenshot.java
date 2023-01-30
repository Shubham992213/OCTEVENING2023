package screenshot;

import java.io.File;

import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class screenshot {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\visiest program files\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login");
		driver.manage().window().maximize();
		Object outputType;
		File src=((TakesScreenshot)driver).getScreenshotAs(outputType.FILE);
		
}
}


