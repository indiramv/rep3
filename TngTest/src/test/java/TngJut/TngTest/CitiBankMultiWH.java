package TngJut.TngTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class CitiBankMultiWH {
	public static void main(String[] args) {
		
	
	int a[]={10,20,40,50,70};
	
	//int max=getMax(a);
	//System.out.println("max value"+max);

	int min=getMin(a);
	System.out.println("minvalue"+min);
}

	public static int getMax(int ab[])
	{
		int max1=ab[0];
		
		for (int i = 0; i < ab.length; i++) {
			if(ab[i]>max1)
			{
				max1=ab[i];
			}
		}
		return max1;
		//return max1;
		
	}
	public static int getMin(int ab[])
	{
		int min1=ab[0];
		
		for (int i = 0; i < ab.length; i++) {
			if(ab[i]<min1)
			{
				min1=ab[i];
			}
		}
		return min1;
}
}