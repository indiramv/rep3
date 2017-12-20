package TngJut.TngTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NewTest2 {
	WebDriver driver;
  @Test(description="after launching")
  public void afterLaunch() {
	  driver.findElement(By.id("src")).sendKeys("h");
	  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	  driver.findElement(By.xpath(".//*[@id='search']/div/div[1]/div/ul/li[1]")).click();
	  
  }
  
  @BeforeTest(description="before test")
  public void launch()
  {
	  System.setProperty("webdriver.chrome.driver", "C:\\SelDrive\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.navigate().to("https://www.redbus.in/");
	  driver.manage().window().maximize();
	  
  }
  @AfterTest(description="closeing browser")
  public void close()
  {
	  driver.close();
  }
}
