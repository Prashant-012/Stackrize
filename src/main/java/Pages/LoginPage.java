package Pages;

import Base.TestBase;

public class LoginPage extends TestBase{

	public String getUrl() {
		return driver.getCurrentUrl();
	}
	
	public String getTitle() {
		return driver.getTitle();
	}
}
