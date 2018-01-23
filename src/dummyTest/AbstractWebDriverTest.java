package dummyTest;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageObjects.HomePage;
import util.PropertyManager;

public class AbstractWebDriverTest {

	protected WebDriver driver;
	protected HomePage onHomePage;
	protected PropertyManager property;

	@Before
	public void setUp() {
		System.out.println("before in abstract");
		System.setProperty("webdriver.gecko.driver", "driver/geckodriver.exe");
		System.setProperty(FirefoxDriver.SystemProperty.BROWSER_LOGFILE,"/dev/null");
		driver = new FirefoxDriver();
		
		property = new PropertyManager();
		property.genereateProperty();
	}

	@After
	public void shutDown() {
		System.out.println("after in abstract");
		driver.quit();
	}

}
