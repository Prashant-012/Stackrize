package TestCase;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test2 {

	@Test
	public void tc1() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Actions a= new Actions(driver);
		WebElement ele1 = driver.findElement(By.id("APjFqb"));
	   // ele1.sendKeys("selenium");
	    
	    //String s=Keys.chord(Keys.SHIFT,"selenium");
	    
	    a.sendKeys(Keys.SEMICOLON).perform();
	}
}
