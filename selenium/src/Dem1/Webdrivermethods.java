package Dem1;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Webdrivermethods{
	public static void main(String[] args) {
		System.setProperty("Webdriver.chrome.driver","C:\\visiest program files\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		String t=driver.getTitle();
		System.out.println(t);
		String url=driver.getCurrentUrl();
		System.out.println(url);
		driver.close();
		driver.manage().window().maximize();
		driver.navigate().to("https://www.youtube.com/");
			driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	Dimension d=new Dimension (300,200);
	driver.manage().window().setSize(d);
	
		
		
		
	}
	
	
	
}