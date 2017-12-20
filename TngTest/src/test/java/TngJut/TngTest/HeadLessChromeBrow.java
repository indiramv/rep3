package TngJut.TngTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HeadLessChromeBrow {
	
	WebDriver driver;
	
	@Test
	public void launch()
	{
		driver.findElement(By.id("lst-ib")).sendKeys("hello");
		System.out.println(driver.getTitle());
		
	}
	
	@BeforeTest
	public void prepare()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\SelDrive\\chromedriver.exe");
		
		ChromeOptions opt= new ChromeOptions();
		//opt.addArguments("window-size=1400,800");
		opt.addArguments("Headless");
		
		driver=new ChromeDriver(opt);	
		driver.get("https://www.google.com");
		
	}

}
