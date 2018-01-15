package dummyTest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebAppPageTitleTest {

	WebDriver driver;

	@Before
	public void testSetup() {
		// Create and instance of webdriver
		System.setProperty("webdriver.gecko.driver", "driver/geckodriver.exe");
		driver = new FirefoxDriver();
		// Go to web page
		driver.navigate().to("http://www.thetestroom.com/webapp/");
	}

	@After
	public void testShutDown() {
		// Close the driver
		driver.close();
	}

	@Test
	public void shouldHavePageTitleOfAboutZoo() {
		// Click on the about link
		driver.findElement(By.id("about_link")).click();

		// Check that the about page has the about zoo title
		Assert.assertTrue(driver.getTitle().equals("About Zoo"));
	}

	@Test
	public void shouldHavePageTitleOfAboutContact() {
		// Click on the about link
		driver.findElement(By.id("contact_link")).click();

		// Check that the about page has the about zoo title
		Assert.assertTrue(driver.getTitle().equals("Contact"));
	}

}
