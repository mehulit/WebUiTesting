package SeleniumJava.WebUiTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class EcommWebsiteUiTest
{
	//System.setProperty("webdriver.driver.chrome", "E:/Mehul/Software/drivers/chromedriver.exe")
	WebDriver driver = new ChromeDriver();
	@Test
	public void websiteUiTest()
	{
		System.setProperty("webdriver.driver.chrome", "E:/Mehul/Software/drivers/chromedriver.exe");
		//WebDriver driver = new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		System.out.println(driver.getTitle());
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
}
