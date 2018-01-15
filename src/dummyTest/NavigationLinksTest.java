package dummyTest;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class NavigationLinksTest {

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
	public void shouldNavigateLinkUsingLocators() {
		// click on contact link on left side of page
		driver.findElement(By.id("contact_link")).click();
		// check if heading is 'Contact Form'
		Assert.assertTrue(driver.findElement(By.className("subhead")).getText().equals("Contact Form"));
		// type sth in address input field
		driver.findElement(By.name("address_field")).sendKeys("This is address field");
		// click on adoption link on left side of page
		driver.findElement(By.cssSelector("[id=adoption_link]")).click();
		// click on home link on left side of page
		driver.findElement(By.linkText("HOME")).click();
		// click on about link on left side of page
		driver.findElement(By.partialLinkText("ABO")).click();
		// check if paragraph text contains 'animals'
		Assert.assertTrue(driver.findElement(By.tagName("p")).getText().contains("animals"));
		// click on contact link on left side of page
		driver.findElement(By.xpath("//*[@id=\"contact_link\"]")).click();
	}

}
