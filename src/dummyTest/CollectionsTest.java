package dummyTest;

import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CollectionsTest extends AbstractWebDriverTest {

	@Test
	public void collectionTest() {
		driver.navigate().to("http://www.thetestroom.com/webapp/");
		List<WebElement> links = driver.findElements(By.tagName("a"));

		for (WebElement link : links) {
			if (link.getText().equals("CONTACT")) {
				link.click();
				break;
			}
		}

		List<WebElement> fields = driver.findElements(By.tagName("input"));

		fields.get(0).sendKeys("Test name");
		fields.get(6).sendKeys("Test address");
		fields.get(7).sendKeys("18000");
		fields.get(8).sendKeys("test@mail.com");

	}

}
