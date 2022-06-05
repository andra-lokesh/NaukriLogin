package stepDefinition;

import core.TestUtility;
import cucumber.api.java.After;
import cucumber.api.java.Before;


public class hooks extends TestUtility {
	@Before
	public void intiateBrowser1() {
		
		TestUtility t = new TestUtility();
		t.intiateBrowser();
	}
	@After
	public void closeBrowser() {
	//	tearDown();
	}
	
		
	
}
