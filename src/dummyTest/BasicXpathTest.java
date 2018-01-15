package dummyTest;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BasicXpathTest {
	
	@Test
	public void xpathTest() {
		System.setProperty("webdriver.gecko.driver", "driver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://www.thetestroom.com/webapp/");
		
		driver.findElement(By.xpath("//a[contains (@id, 'contact_link')]")).click();
		driver.findElement(By.xpath("//input[contains (@name, 'name_field')]")).sendKeys("test name");
		
		driver.close();
	}

}
