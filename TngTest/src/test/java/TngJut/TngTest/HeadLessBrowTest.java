package TngJut.TngTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class HeadLessBrowTest {

	WebDriver driver;
	
	@Test
	public void login()
	{
		driver.findElement(By.className("inputtext")).sendKeys("hello");
		System.out.println("email");
	}
	
	@BeforeTest
	public void beforeLogin()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\SelDrive\\chromedriver.exe");
		ChromeOptions opts= new ChromeOptions();
		opts.addArguments("headless");
		driver=new ChromeDriver(opts);
		driver.get("https://www.facebook.com/");
		
	}

}
