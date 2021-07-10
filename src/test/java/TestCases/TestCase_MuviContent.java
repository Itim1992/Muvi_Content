package TestCases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BaseTest.TestBase;

public class TestCase_MuviContent extends TestBase {
	
	@BeforeMethod
	public void setup(){
		TestBase.initialization();	
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@AfterMethod
	public void CloseSession() {
		driver.close();
		driver.quit();
	}
	
	@Test
	public void TestMuviContent() throws InterruptedException {
		initializePOM();
		muviContent.signUp();
		muviContent.navigation();
		muviContent.createContent();
		muviContent.searchContent();
	}

}
