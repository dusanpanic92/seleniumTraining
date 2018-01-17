package dummyTest;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

public class AdobtionTest extends AbstractWebDriverTest {
	
	@Test
	public void shouldSelectFromDropDown() {
		driver.navigate().to("http://www.thetestroom.com/webapp/");
		driver.findElement(By.cssSelector("#adoption_link")).click();
		
		Select startDropDwn = new Select(driver.findElement(By.cssSelector("#start_select")));
		startDropDwn.selectByValue("fmonth");
	}

}
