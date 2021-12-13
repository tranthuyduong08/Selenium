package SeleniumWebdriverAPI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationCommands {
	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chorme driver\\chromedriver.exe");
		// Create a new instance of the Chrome Driver
		WebDriver driver = new ChromeDriver();

		// Open web site
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");

		// Login
		WebElement username = driver.findElement(By.id("txtUsername"));
		username.sendKeys("Admin");
		Thread.sleep(1000);

		WebElement password = driver.findElement(By.id("txtPassword"));
		password.sendKeys("admin123");
		Thread.sleep(1000);

		WebElement btnLogin = driver.findElement(By.id("btnLogin"));
		btnLogin.click();
		Thread.sleep(1000);

		// Get current URL

		String url = driver.getCurrentUrl();

		// Go to Admin page
		driver.findElement(By.xpath("//b[normalize-space()='Admin']")).click();

		// Go back to Dashboard
		driver.navigate().back();

		// Go forward to Registration page
		driver.navigate().forward();

		// Go back to Home page
		driver.navigate().to(url);

		// Refresh browser
		driver.navigate().refresh();

	}
}
