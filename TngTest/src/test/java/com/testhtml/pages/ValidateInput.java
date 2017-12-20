package com.testhtml.pages;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;

public class ValidateInput {
	
	WebDriver driver;
	
	public static boolean validateFirstName( String firstName )
	     {
	        return firstName.matches( "[A-Z]+[a-zA-Z]*" );
	    }

	public static boolean validateLastName( String lastName )
	     {
	        return lastName.matches( "[a-zA-z]+([ '-][a-zA-Z]+)*" );
	} 
	
	public static boolean validatePhone( String phone )
	     {
	          return phone.matches( "[1-9]\\d{2}-[1-9]\\d{2}-\\d{4}" );
	       }
	
	public static void main(String[] args) {
		
	
	
	Scanner scanner = new Scanner( System.in );
	  System.out.println("Please enter first name:");
	   String firstName = scanner.nextLine();
	 System.out.println( "Please enter last name:" );
	String lastName=scanner.nextLine();
	System.out.println( "Please enter phone:" );
	  String phone = scanner.nextLine();
	  
	  
	  System.out.println( "\nValidate Result:" );
	
	if ( ValidateInput.validateFirstName( firstName ) )
	{
		 System.out.println( "Valid first name" );
	}
	else{
		
		System.out.println("Invalid fname");
		
	}
	if ( ValidateInput.validateLastName( lastName ) )
	{
		  System.out.println( "valid last name" );
	}
	else
	{
		System.out.println("Invalid input");
		
	}
	
	
	if (ValidateInput.validatePhone(phone))
	{
		    System.out.println( "valid phone number" );
	}
	
		     else
		     {
		    System.out.println( "Valid input.  Thank you." );
		     }
}
}
