package dummyTest;

import java.io.IOException;

import org.junit.Test;
import org.openqa.selenium.By;

public class PageHeadingTest extends AbstractWebDriverTest {
	
	@Test
	public void shouldCheckEachMainPage() throws IOException {
		
		WebDriverUtils util = new WebDriverUtils(driver);
		
		driver.navigate().to("http://www.thetestroom.com/webapp/");
		// home page screen shot
		util.takeScreenShot("homePage");
		
		driver.findElement(By.cssSelector("#adoption_link")).click();
		// adobtion page screen shot
		util.takeScreenShot("adoptionPage");
		
		driver.findElement(By.cssSelector("#about_link")).click();
		// about page screen shot
		util.takeScreenShot("aboutPage");
		
		driver.findElement(By.cssSelector("#contact_link")).click();
		// contact page screen shot
		util.takeScreenShot("contactPage");
	}

}
