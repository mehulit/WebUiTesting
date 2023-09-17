package SeleniumJava.WebUiTesting;

import java.awt.Window;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import net.bytebuddy.asm.Advice.Enter;

//import dev.failsafe.internal.util.Assert;

public class UiTest {

	/**
	 * @param args
	 * @throws InterruptedException
	 */
	/**
	 * @param args
	 * @throws InterruptedException
	 */
	/**
	 * @param args
	 * @throws InterruptedException
	 */
	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException
	{
		// TODO Auto-generated method stub

		System.setProperty("webdriver.driver.chrome", "E:/Mehul/Software/drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// ChromeDriver cd =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		//Code to handle auto suggestive drop down
		driver.findElement(By.id("autosuggest")).sendKeys("ind");
		Thread.sleep(5);
		List<WebElement> liitem = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		for (WebElement liitems : liitem) {
			if (liitems.getText().equalsIgnoreCase("India")) {
				liitems.click();
				break;
			}
		}
		
		//Code to handle From and To city drop down (parent child relationship xpath) 
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='AMD']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='AMD']")).getText());
		Thread.sleep(3);
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BOM']")).click();
		System.out.println(driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='BOM']")).getText());
		
		//Code to select checkbox
		List<WebElement> chekbox = driver.findElements(By.cssSelector("div[class='row1 padding-bottom-3 home-dis-checkboxes']"));
		for(WebElement chekboxs:chekbox)
		{
			if(chekboxs.getText().equalsIgnoreCase(" Family and Friends"))
			{
				
			}
		}
		
		
		
		/* login fail and click on forget password link
		driver.findElement(By.id("inputUsername")).sendKeys("selenium");
		driver.findElement(By.name("inputPassword")).sendKeys("selenium");
		//driver.findElement(By.className("submit")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Sign In']")).click();
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
		//driver.findElement(By.cssSelector("button[type='submit']")).click();
		//driver.findElement(By.cssSelector("button.submit")).click();
		//System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		//System.out.println(driver.findElement(By.cssSelector("*[class='error']")).getText());
		//String LoginFailMsg=driver.findElement(By.cssSelector("*[class='error']")).getText();
		Assert.assertEquals(driver.findElement(By.cssSelector("*[class='error']")).getText(), "* Incorrect username or password");
		driver.findElement(By.partialLinkText("Forgot your pass")).click();
		//driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[2]")).click(); //click on reset login
		 */

		/* fetching password from text
		String PasswordMsg=driver.findElement(By.cssSelector("p[class='infoMsg']")).getText();
		//Please use temporary password 'rahulshettyacademy' to Login.
		String[] PasswordArray=PasswordMsg.split("'");
		String ActualPasswordText=PasswordArray[1].split("'")[0];
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		driver.findElement(By.id("inputUsername")).sendKeys("test123");
		driver.findElement(By.name("inputPassword")).sendKeys(ActualPasswordText);
		 */


		/* static drop down
		  WebElement webElement = driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency"));
		  Select dropdownstatic = new Select(webElement); 
		  dropdownstatic.selectByIndex(3);
		  System.out.println(dropdownstatic.getFirstSelectedOption().getText());

		  dropdownstatic.selectByVisibleText("AED");
		  System.out.println(dropdownstatic.getFirstSelectedOption().getText());

		  dropdownstatic.selectByValue("INR");
		  System.out.println(dropdownstatic.getFirstSelectedOption().getText());
		 */

		/*static drop down different way
		  driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency")).click();
		  String options = "AED";
		  WebElement dd = driver.findElement(By.xpath("//select/option[contains(text(), '"+options+"')]"));
		  dd.click();
		  System.out.println(dd.getText());
		 */

		/* javascriptexecutor  
		  String options = "AED";
		WebElement dd = driver.findElement(By.xpath("//select/option[contains(text(), '"+options+"')]"));

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value="AED", dd);
		 */


		/* click three times in dropdown to get 4 adult, 1 adult bydefault selected
		  driver.findElement(By.id("divpaxinfo")).click();
		  Thread.sleep(3000);
		  for(int i =1 ; i < 4 ; i++)
		  {
			  driver.findElement(By.id("hrefIncAdt")).click();  
		  }
		  driver.findElement(By.id("btnclosepaxoption")).click();
		  System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

		  Assert.assertEquals(driver.findElement(By.id("divpaxinfo")).getText(), "4 Adult");
		 */

		/*
			 // Code to handle From and To city drop down
			  driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
			  driver.findElement(By.xpath("//a[@value='AMD']")).click();
			  System.out.println(driver.findElement(By.xpath("//a[@value='AMD']")).getText());
			  Thread.sleep(3);
			  driver.findElement(By.xpath("(//a[@value='BOM'])[2]")).click();
			  System.out.println(driver.findElement(By.xpath("(//a[@value='BOM'])[2]")).getText());//index xpath
		 */

		




	}

}
