package ControllingTestFlow;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlePopUpWindow {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chorme driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/popup.php");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[contains(@href,'popup.php')]")).click();

		// Save main window
		String MainWindow = driver.getWindowHandle();
		System.out.println(MainWindow);

		// Get all new opened window.
		Set<String> windows = driver.getWindowHandles();
		for (String window : windows) {
			System.out.println(window);
			if (!MainWindow.equalsIgnoreCase(window)) {
				// Switch to Child window
				driver.switchTo().window(window);
				Thread.sleep(2000);
				System.out.println("Go to window child");
				driver.findElement(By.name("emailid")).sendKeys("abc@gmail.com");
				driver.findElement(By.name("btnLogin")).click();
				// Closing the Child Window.
				Thread.sleep(2000);
				driver.close();
			}
		}
		// Switching to Parent window (Main Window)
		driver.switchTo().window(MainWindow);
		System.out.println("Go to main window: " + driver.getTitle());

		Thread.sleep(2000);
		driver.quit();
	}
}
