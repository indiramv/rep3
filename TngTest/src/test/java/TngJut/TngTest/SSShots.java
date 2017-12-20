package TngJut.TngTest;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class SSShots {
 WebDriver driver;	
	public void sshots(String Str) throws Exception
	{
		File f= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("C:\\Users\\Hemchand\\workspace\\TngTest\\SCREENSHOTS\\"+Str+".png"));
		
	}
	 
  @Test
  public void f() throws Exception {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\SelDrive\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.navigate().to("http://www.spicejet.com/");
	  //SSShots s = new SSShots();
	  sshots("sample");
	  driver.manage().window().maximize();
	  
  }


  @AfterTest
  public void afterTest() {
  }

}
