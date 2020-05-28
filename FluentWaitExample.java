package module3;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import com.google.common.base.Function;

import org.openqa.selenium.support.ui.FluentWait;
	
public class FluentWaitExample {

	public static void main(String[] args) {
	
		System.setProperty("webdriver.chrome.driver", "C:\\SeleniumWork\\ExeFiles\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.pollingEvery(200, TimeUnit.MILLISECONDS);
		wait.withTimeout(1, TimeUnit.MINUTES);
		wait.ignoring(NoSuchElementException.class); // We need to ignore this
														// exception.

		Function<WebDriver, WebElement> function = new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver arg0) {
				System.out.println("Checking for the object!!");
				//wait till the sign in  button is loaded
				WebElement element = arg0.findElement(By.linkText("Sign in"));
			
				if (element != null) {
					System.out.println("A new dynamic object is found.");
				}
				return element;
			}
		};

		wait.until(function);
		
		driver.close();
	}
}
