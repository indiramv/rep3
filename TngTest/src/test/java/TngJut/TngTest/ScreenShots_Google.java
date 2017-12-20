package TngJut.TngTest;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class ScreenShots_Google {
	
	WebDriver driver;
	
	public void takesScreenShots(String str) throws Exception
	{
		
		File Src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(Src, new File("C:\\Users\\Hemchand\\workspace\\TngTest\\SCREENSHOTS\\"+str+".png"));
		
	}

	
	
	@BeforeTest
	public void launch()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\SelDrive\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		}
	
	
	@Test
	public void amazonIndiaTest() throws Exception
	{
		
		
		//dr.click();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Actions act= new Actions(driver);
		act.moveToElement(driver.findElement(By.id("nav-link-shopall"))).build().perform();
		takesScreenShots("shopall");
		driver.findElement(By.xpath(".//*[@id='nav-flyout-shopAll']/div[2]/span[8]/span")).click();
		//act.moveToElement(target)
		takesScreenShots("women fashion");
		
	}
}
