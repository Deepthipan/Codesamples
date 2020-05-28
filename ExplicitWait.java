package module3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		
		//Open Browser
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWork\\ExeFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//Open AUT
		driver.get("https://www.facebook.com/");

		WebDriverWait wait = new WebDriverWait(driver, 1);
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.name("websubmit")));
		//WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("dynamicText4")));
		element.click();
		
	
	}
}