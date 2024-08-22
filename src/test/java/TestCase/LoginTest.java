package TestCase;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Base.TestBase;
import Pages.LoginPage;

public class LoginTest extends TestBase {

	LoginPage login;
	@BeforeClass
	public void setup() {
		
		initilize();
		login=new LoginPage();
				
	}
	@Test
	public void Test1() {
		String actUrl=login.getUrl();
		System.out.println(actUrl);
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
