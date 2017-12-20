package com.testhtml.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginPageTestSuite {

	@Test
	public void VerifytestForm()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\SelDrive\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Hemchand/Downloads/QA%20Test%20(1).html");
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.findElement(By.xpath(".//*[@id='fname']")).sendKeys("indira");;
		driver.findElement(By.xpath(".//*[@id='lname']")).sendKeys("priya");;
		driver.findElement(By.xpath(".//*[@id='phone']")).sendKeys("234345456");;
		
	}

	}


//Scanner scanner = new Scanner( System.in );
//11        System.out.println( "Please enter first name:" );
//12        String firstName = scanner.nextLine();
//13        System.out.println( "Please enter last name:" );
//14        String lastName = scanner.nextLine();
//15        System.out.println( "Please enter address:" );


/*public class ValidateInput  
5  {
6     // validate first name
7     public static boolean validateFirstName( String firstName )
8     {
9        return firstName.matches( "[A-Z][a-zA-Z]*" );
10     } // end method validateFirstName
11  
12     // validate last name
13     public static boolean validateLastName( String lastName )
14     {
15        return lastName.matches( "[a-zA-z]+([ '-][a-zA-Z]+)*" );
16     } // end method validateLastName
17  
18     // validate address
19     public static boolean validateAddress( String address )
20     {
21        return address.matches(                          
22           "\\d+\\s+([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)" );
23     } // end method validateAddress
24  
25     // validate city
26     public static boolean validateCity( String city )
27     {
28        return city.matches( "([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)" );
29     } // end method validateCity
30  
31     // validate state
32     public static boolean validateState( String state )
33     {
34        return state.matches( "([a-zA-Z]+|[a-zA-Z]+\\s[a-zA-Z]+)" ) ;
35     } // end method validateState
36  
37     // validate zip
38     public static boolean validateZip( String zip )
39     {
40        return zip.matches( "\\d{5}" );
41     } // end method validateZip
42  
43     // validate phone
44     public static boolean validatePhone( String phone )
45     {
46        return phone.matches( "[1-9]\\d{2}-[1-9]\\d{2}-\\d{4}" );
47     } // end method validatePhone
48  } // e*/