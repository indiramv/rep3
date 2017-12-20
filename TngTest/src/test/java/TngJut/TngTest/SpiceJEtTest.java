package TngJut.TngTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class SpiceJEtTest {
	WebDriver driver;
  @Test
  public void f() throws Exception {
	  System.setProperty("webdriver.chrome.driver", "C:\\SelDrive\\chromedriver.exe");	  
driver=new ChromeDriver();

driver.get("http://spicejet.com/");
driver.manage().window().maximize();
Actions act = new Actions(driver);
act.moveToElement(driver.findElement(By.linkText("ADD-ONS"))).build().perform();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.findElement(By.linkText("Hot Meals")).click();
act.keyDown(Keys.CONTROL).sendKeys(Keys.END).build().perform();
Thread.sleep(2000);
act.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).build().perform();
	  
  }
}
