package TngJut.TngTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FlipkartTestCase {
	
	WebDriver driver;
	
	@BeforeTest
	public void launch()
	{
		  
		System.setProperty("webdriver.gecko.driver", "C:\\SelDrive\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
	}
	
	@Test
	public void business_Scripts() throws Exception
	{
		Actions act=new Actions(driver);
		
		//WebElement ele=driver.findElement(By.xpath("//a[@title='Electronics'"));
		driver.findElement(By.xpath("//a[@class='_1QZ6fC'][@title='Electronics']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='_3ZgIXy'][@title='Mobiles']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_1dPkhG']/div/div/a[@href='/offers-list/new-launches?screen=dynamic&pk=themeViews%3DNewLaunches%3ADesktopView~widgetType%3DdealCard~contentType%3Dneo&wid=6.dealCard.OMU&otracker=clp_omu_New+Launches_mobile-phones-store_5']")).click();;
	}
	
	@AfterTest
	public void clse() throws Exception
	{
		
		System.out.println("closing");
		Thread.sleep(1000);
		driver.quit();
		
	}

}
