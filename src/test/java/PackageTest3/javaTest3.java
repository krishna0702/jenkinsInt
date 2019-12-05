package PackageTest3;

import java.sql.DriverPropertyInfo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class javaTest3 {
	@Test
	public void login()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.newtours.demoaut.com/");
		driver.findElement(By.xpath("//input[@name='userName']")).sendKeys("krish");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("hi");;
		driver.findElement(By.xpath("//input[@name='login']")).click();
	}

}
