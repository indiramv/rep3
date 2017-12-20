package TngJut.TngTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AmazonPracTest {
	
	WebDriver driver;
  @Test
  public void f() {
	  
	  Actions act = new Actions(driver);
	  act.moveToElement(driver.findElement(By.xpath(".//a[@id='nav-link-shopall']/span[text()='Shop by']"))).build().perform();
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	  act.moveToElement(driver.findElement(By.xpath(".//*[@id='nav-flyout-shopAll']/div[2]/span[5]/span"))).build().perform();
	  act.keyDown(Keys.CONTROL).sendKeys(Keys.END).build().perform();
	  act.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).build().perform();
  }
  @BeforeTest
  public void launch()
  
  {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\SelDrive\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.amazon.in");
	  driver.manage().window().maximize();
  }
  
}
