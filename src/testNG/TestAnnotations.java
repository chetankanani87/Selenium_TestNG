/*	To understand this whole java project "edureka_Selenium_TestNG"
	open this video https://www.youtube.com/watch?v=_sWcXaic-bw&list=PL9ooVrP1hQOFP9H8Y15DVGCA6GavhgJ8a&index=8*/
package testNG;

import org.testng.annotations.*;

public class TestAnnotations {
	
  @Test
  public void f1() {
	  System.out.println("Inside F1 Test");
  }
  
  @Test
  public void f2() {
	  System.out.println("Inside F2 Test");
  }
  
  @BeforeTest
  public void beforeAnyTest() {
	  System.out.println("BeforeTest");
  }
  
  @AfterTest
  public void afterAllTheTests() {
	  System.out.println("AfterTest");
  }
  
  @BeforeMethod
  public void beforeEveryMethod() {
	  System.out.println("BeforeMethod");
  }
  
  @AfterMethod
  public void afterEveryMethod() {
	  System.out.println("AfterMethod");
  }
  
  @BeforeClass
  public void beforeClass() {
	  System.out.println("BeforeClass");
  }
  
  @AfterClass
  public void afterClass() {
	  System.out.println("AfterClass");
  }
}
