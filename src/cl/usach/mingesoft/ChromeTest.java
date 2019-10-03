package cl.usach.mingesoft;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class ChromeTest extends NavTest {
	
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\drivers\\chromedriver.exe");
		driver= new ChromeDriver();
	}
	
}
