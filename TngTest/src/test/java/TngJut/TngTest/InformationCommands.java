package TngJut.TngTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class InformationCommands {
	
	WebDriver driver;
	
	@Test
	public void businessScripts()
	{
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.name("firstname")).sendKeys("hellotest");
		
	}

	
	@BeforeTest
	public void browser_launch()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\SelDrive\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
	}
}
