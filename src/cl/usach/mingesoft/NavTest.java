package cl.usach.mingesoft;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class NavTest {

public WebDriver driver;
	
	@Test(priority=1)
	public void crearPostulanteFront() {
		driver.get("http://165.227.193.242/postulant/create");
		driver.manage().window().setSize(new Dimension(721, 697));
		driver.findElement(By.id("rut")).click();
		driver.findElement(By.id("rut")).sendKeys("123456789");
		driver.findElement(By.id("name")).sendKeys("Juanito Perez");
		driver.findElement(By.id("birth_date")).sendKeys("1990-01-01");
		driver.findElement(By.id("Course")).click();
		{
			WebElement dropdown = driver.findElement(By.id("Course"));
			dropdown.findElement(By.xpath("/html/body/div/div[2]/div/div/div/form/div[4]/select/option[27]")).click();
		}
		driver.findElement(By.cssSelector(".btn")).click();
		driver.findElement(By.xpath("/html/body/div/div[1]/a[1]")).click();
	}
	
	@Test(priority=2)
	public void iraCrear() {
		driver.get("http://165.227.193.242/");
		driver.manage().window().setSize(new Dimension(721, 697));
		driver.findElement(By.xpath("/html/body/div/div[1]/a[2]")).click();
	}
	
	@Test(priority=3)
	public void iraListado() {
		driver.get("http://165.227.193.242/postulant/create");
		driver.manage().window().setSize(new Dimension(721, 697));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("/html/body/div/div[1]/a[1]")).click();
	}
	
	@BeforeTest
	public void beforeTest() {
	}
	
	@AfterTest
	public void afterTest() {
		driver.close();
		driver.quit();
	}
}
