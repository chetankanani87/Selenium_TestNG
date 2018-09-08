/*	To understand this whole java project "edureka_Selenium_TestNG"
	open this video https://www.youtube.com/watch?v=_sWcXaic-bw&list=PL9ooVrP1hQOFP9H8Y15DVGCA6GavhgJ8a&index=8*/
package testNG;

import org.testng.annotations.Test;

public class TestTestNGAttributes {
  @Test(priority=0)
  public void d() {
  }
  
  @Test(dependsOnMethods= {"f"})
  public void e() {
  }
  
  @Test(priority=89)
  public void o() {
  }
  
  @Test(enabled=false)
  public void h() {
  }
  
  @Test(priority=34)
  public void f() {
  }
  @Test(priority=12)
  public void m() {
  }
}
