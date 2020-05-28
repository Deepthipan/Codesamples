package module3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class commonwaits {

	public static void main(String[] args) throws InterruptedException {
		
		//Open Browser
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWork\\ExeFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Open AUT
		driver.get("https://www.facebook.com/");

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("Deepthi");
		driver.findElement(By.xpath("//*[@name='lastname']")).sendKeys("P");
		
	}

}
