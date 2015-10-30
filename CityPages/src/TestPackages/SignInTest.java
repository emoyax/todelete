package TestPackages;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import CityPages.ConnectPage;

public class SignInTest {
	
	WebDriver driver;
	ConnectPage cp;
	
	@Before
	public void setup(){
		driver = new FirefoxDriver();
		driver.get("http://www.citypages.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	}
	
	@After
	public void teardown(){
		driver.quit();
	}
	@Test
	public void SignInTest(){
		cp = new ConnectPage(driver);
		cp.AccesstoSignIn();
	}

}
