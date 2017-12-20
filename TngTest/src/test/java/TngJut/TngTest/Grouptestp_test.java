package TngJut.TngTest;

import org.testng.annotations.Test;

public class Grouptestp_test {
  @Test(priority = 0, groups="regression")
  public void f() {
	  
	  System.out.println("regression");
  }
  @Test(priority = 1, groups="sanity")
  public void g() {
	  System.out.println("sanity 1");
  }
  @Test(priority = 2, groups="sanity2")
  public void f1() {
	 System.out.println("sanity 2");
  }
  @Test(priority = 3, groups="sanity")
  public void f2() {
	  System.out.println("sanity 12");
  }
  @Test(priority = 4, groups="regression")
  public void f3() {
	  System.out.println("regression");
  }
}
