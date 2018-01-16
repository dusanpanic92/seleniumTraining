package dummyTest;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class ContactFormTest extends AbstractWebDriverTest {

	@Test
	public void shouldPopulateForm() {
		// Navigate to Zoo site
		driver.navigate().to("http://www.thetestroom.com/webapp/");

		// Click on Contact form
		driver.findElement(By.cssSelector("#contact_link")).click();

		// Populate Contact form
		driver.findElement(By.name(property.contactFormNameField)).sendKeys(property.contactNameValue);
		driver.findElement(By.name("address_field")).sendKeys("address test");
		driver.findElement(By.name("postcode_field")).sendKeys("18000");
		driver.findElement(By.name("email_field")).sendKeys("test@mail.com");

		// Submit Contact form
		driver.findElement(By.cssSelector("#submit_message")).click();

		// Check Contact form has been submited
		Assert.assertTrue(driver.findElement(By.tagName("p")).getText().contains("Many thanks for your message."));
	}

}
