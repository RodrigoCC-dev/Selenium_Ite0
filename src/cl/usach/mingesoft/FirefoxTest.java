package cl.usach.mingesoft;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

public class FirefoxTest extends NavTest {

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "\\drivers\\geckodriver.exe");
		driver = new FirefoxDriver();
	}
	
}
