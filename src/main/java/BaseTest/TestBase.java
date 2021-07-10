package BaseTest;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.MuviContent;


public abstract class TestBase {
	static protected WebDriver driver;
	protected MuviContent muviContent;
	
	public static void initialization(){
		System.setProperty("webdriver.chrome.driver","C:\\Selenium Setup\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();	
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		driver.get("https://www.muvi.com");
		
	}
	public void initializePOM(){
		muviContent=new MuviContent();
	}

}
