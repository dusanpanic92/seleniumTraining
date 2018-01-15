package dummyTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

public class AlertWindowTest extends AbstractWebDriverTest {
	
	@Before
	public void navigate() {
		driver.navigate().to("http://www.thetestroom.com/webapp/");
	}
	
	@Test
	public void alertTest() {
		driver.findElement(By.cssSelector("#contact_link")).click();
		driver.findElement(By.cssSelector("#submit_message")).click();
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		Assert.assertTrue(alert.getText().contains("Name"));
		alert.accept();
	}
	
	@Test
	public void windowTest() {
		String parentWindow = driver.getWindowHandle();
		driver.findElement(By.cssSelector("#footer_term")).click();
		
		for (String currentWindow : driver.getWindowHandles()) {
			driver.switchTo().window(currentWindow);
		}
		
		System.out.println(driver.getCurrentUrl());
		
		driver.close();
		driver.switchTo().window(parentWindow);
		System.out.println(driver.getCurrentUrl());
	}

}
