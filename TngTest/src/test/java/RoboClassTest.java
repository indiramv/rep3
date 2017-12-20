import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;



public class RoboClassTest {
	WebDriver driver;
  @Test
  public void f() throws Exception {
	  
	  driver.findElement(By.xpath(".//span[@id='exp_new'][@class='classicTxt']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.xpath(".//a[text()='CONTINUE TO LOGIN']")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.linkText("Forgot Username")).click();
	  Thread.sleep(3000);
	  
	  String Parent_Win=driver.getWindowHandle();
	  Set<String> child_win=driver.getWindowHandles();
	  
	  Iterator<String> it=child_win.iterator();
	  
	  while(it.hasNext())
	  {
		  String child=it.next();
	   if(!Parent_Win.equalsIgnoreCase(child))
		  {
			 driver.switchTo().window(child);
			 Thread.sleep(2000);
			 driver.findElement(By.xpath(".//input[@id='cifno']")).sendKeys("2345678");
			 
			 Thread.sleep(2000);
			 
			 Scanner scan= new Scanner(System.in);
			 System.out.println("enter captcha");
			 String Str=scan.nextLine();
			 
			 Thread.sleep(5000);
			 driver.findElement(By.name("captchaValue")).sendKeys(Str);
			 Thread.sleep(1000);
			 driver.findElement(By.name("Submit")).click();
			 
			 driver.close();
			 
			 
		  }
		  
	  }
	  driver.switchTo().window(Parent_Win);	  
	  
  }
  @BeforeTest
  public void beforeTest() {
	  
	  System.setProperty("webdriver.chrome.driver", "C:\\SelDrive\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://www.onlinesbi.com/");
	  driver.manage().window().maximize();
	  
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
