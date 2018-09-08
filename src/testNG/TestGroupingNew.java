/*	To understand this whole java project "edureka_Selenium_TestNG"
	open this video https://www.youtube.com/watch?v=_sWcXaic-bw&list=PL9ooVrP1hQOFP9H8Y15DVGCA6GavhgJ8a&index=8*/
package testNG;

import org.testng.annotations.Test;

public class TestGroupingNew {

	@Test(groups = { "A" })
	public void f1() {
	}

	@Test(groups = { "B" })
	public void f2() {
	}

	@Test(groups = { "C" })
	public void f3() {
	}

	@Test(groups = { "A" })
	public void f4() {
	}

	@Test(groups = { "C" })
	public void f5() {
	}

	@Test(groups = { "A" })
	public void f6() {
	}
}
