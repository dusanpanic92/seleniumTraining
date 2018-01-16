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
		System.setProperty("webdriver.gecko.driver", "driver/geckodriver.exe");
		driver = new FirefoxDriver();
		
		property = new PropertyManager();
		property.genereateProperty();
	}

	@After
	public void shutDown() {
		System.out.println("after in abstract");
		driver.close();
	}

}
