/*	To understand this whole java project "edureka_Selenium_TestNG"
	open this video https://www.youtube.com/watch?v=_sWcXaic-bw&list=PL9ooVrP1hQOFP9H8Y15DVGCA6GavhgJ8a&index=8*/
package testNG;

import org.testng.annotations.Test;

public class TestGrouping {
  @Test(groups = { "B" })
  public void m1() {
  }
  
  @Test(groups = { "D" })
  public void m2() {
  }
  
  @Test(groups = { "D" })
  public void m3() {
  }
  
  @Test(groups = { "D" })
  public void m4() {
  }
}
