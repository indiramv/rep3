package TngJut.TngTest;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ScreenShots {
	WebDriver driver;
	//ScreenShots ss=new ScreenShots();
	
	public void sshots(String Str) throws Exception
	{
		File f= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\Users\\Hemchand\\workspace\\TngTest\\SCREENSHOTS\\+Str+.png"));
		
	}
	 
	 @Test(description="test")
	 
	  public void launch() throws Exception
	  {
		 //ScreenShots ss=new ScreenShots();
		 
		  System.setProperty("webdriver.chrome.driver", "C:\\SelDrive\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.navigate().to("http://www.spicejet.com/");
		  sshots("spicejet");
		  driver.manage().window().maximize();
		  sshots("spicejet");
		  
	  }


}
