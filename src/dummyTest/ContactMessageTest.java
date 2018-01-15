package dummyTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import pageObjects.ContactPage;
import pageObjects.ContactResultPage;

public class ContactMessageTest extends AbstractWebDriverTest {

	@Before
	public void testSetUp() {
		onHomePage.navigateToWebApp();
		System.out.println("before in test");
	}

	@Test
	public void shoudSendContactMessage() {
		ContactPage onContactPage = onHomePage.clickOnContact();
		ContactResultPage onResultPage = onContactPage.fillFormWithData().submitForm();

		Assert.assertTrue(onResultPage.getConfirmationMessage().contains("Many thanks for your message"));
	}

}