package dummyTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {

	public static void main(String[] args) {

		// Create and instance of webdriver
		System.setProperty("webdriver.gecko.driver", "driver/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		// Go to web page
		driver.navigate().to("http://www.thetestroom.com/webapp/");
		
		// Click on the about link
		driver.findElement(By.id("about_link")).click();
		
		// Check that the about page has the about zoo title
		String title = driver.getTitle();
		
		if (title.equals("About Zoo")) {
			System.out.println("Found the about page with the value of " + title);
		} else {
			System.out.println("Instead found page with " + title);
		}
		
		// Close the driver
		driver.close();

	}

}
