package POM.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.pages.Login;

public class Login_TC3 {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chorme driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");

		// Creating object of Login page
		Login login = new Login(driver);

		// Enter username & password
		login.enterUsername("abc");
		login.enterPassword("admin123");

		// Click on login button
		login.clickLogin();
		Thread.sleep(3000);

		// Capture the message and print on console
		System.out.println("The message is --- " + login.getMessage());
	}
}


