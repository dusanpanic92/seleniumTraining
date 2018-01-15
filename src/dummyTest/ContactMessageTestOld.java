package dummyTest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ContactMessageTestOld {

	WebDriver driver;

	@Before
	public void testSetUp() {
		// Create and instance of webdriver
		System.setProperty("webdriver.gecko.driver", "driver/geckodriver.exe");
		driver = new FirefoxDriver();
		// Go to web page
		driver.navigate().to("http://www.thetestroom.com/webapp/");
	}

	@After
	public void testTearDown() {
		// Close the driver
		driver.close();
	}

	@Test
	public void shouldSendValidMessage() {
		// Click on 'Contact' nav bar
		driver.findElement(By.id("contact_link")).click();
		// Check if title is 'Contact'
		Assert.assertTrue(driver.getTitle().equals("Contact"));
		// Enter name
		driver.findElement(By.name("name_field")).sendKeys("Test name");
		// Enter address
		driver.findElement(By.name("address_field")).sendKeys("Test address");
		// Enter Postcode
		driver.findElement(By.name("postcode_field")).sendKeys("12345");
		// Enter Email
		driver.findElement(By.name("email_field")).sendKeys("test@mail.com");
		// Check if name field is not empty
		Assert.assertFalse("Field was empty", !(driver.findElement(By.name("name_field")).getText().isEmpty()));
		// Click on 'Send' button
		driver.findElement(By.id("submit_message")).click();
		// Check if title is 'Contact Confirmation'
		Assert.assertEquals(driver.getTitle(), "Contact Confirmation");
	}

}
