package TngJut.TngTest;

import org.openqa.selenium.By;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;


public class HeadLessDriver {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

HtmlUnitDriver driver= new HtmlUnitDriver();
driver.get("https://www.google.com");
driver.findElement(By.id("lst-ib")).sendKeys("hello");
System.out.println(driver.getTitle());
		
	}

}
