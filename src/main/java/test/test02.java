package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class test02 {
	@Test
	public void tc() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		List<WebElement> links=driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		Thread.sleep(2000);
		for(int i=0;i<links.size();i++) {
			String openLink=Keys.chord(Keys.CONTROL, Keys.ENTER);
			Thread.sleep(2000);
			links.get(i).sendKeys(openLink);
		}
		driver.quit();
		
	}
}
