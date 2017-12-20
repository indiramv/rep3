package TngJut.TngTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AlerttestPrac {

	WebDriver driver;
	@Test
	public void alerttest() throws Exception
	{
		driver.findElement(By.xpath(".//a[@class='login-new new_version']")).click();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//div[@class='continue_btn']/a[@class='login_button']")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("New User ? Register here")).click();
		
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
	}
	
	@BeforeTest
	public void login()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\SelDrive\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://retail.onlinesbi.com/");
		driver.manage().window().maximize();
		
	}
}
