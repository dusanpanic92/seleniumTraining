package dummyTest;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import pageObjects.HomePage;

public class AbstractWebDriverTest {
	
	protected WebDriver driver;
	protected HomePage onHomePage;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.gecko.driver", "driver/geckodriver.exe");
		driver = new FirefoxDriver();
		System.out.println("before in abstract");
	}
	
	@After
	public void shutDown() {
		System.out.println("after in abstract");
		driver.close();
	}

}
