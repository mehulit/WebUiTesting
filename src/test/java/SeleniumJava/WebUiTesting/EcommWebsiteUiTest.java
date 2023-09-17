package SeleniumJava.WebUiTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class EcommWebsiteUiTest
{
	
	public static void main(String[] args)
	{
		System.setProperty("webdriver.driver.chrome", "E:/Mehul/Software/drivers/chromedriver.exe");
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("headless");
		WebDriver driver = new ChromeDriver(options);
		
		
	}
	
	public void websiteUiTest(WebDriver driver)
	{
		
		driver.get("https://www.selenium.dev/");
		System.out.println(driver.getTitle());
	}
	
	public void tearDown(WebDriver driver)
	{
		driver.quit();
	}
	
}
