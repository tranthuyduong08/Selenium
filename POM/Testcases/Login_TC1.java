package POM.Testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import POM.pages.*;

public class Login_TC1 {
public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chorme driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		
		//Creating object of Login page
		Login login = new Login(driver);
		
		//Creating object of Dashboard
		DashBoard dashboard = new DashBoard(driver);
		
	
		//Enter username & password
		login.enterUsername("Admin");
		login.enterPassword("admin123");
		
		//Click on login button
		login.clickLogin();
		Thread.sleep(3000);
		
		
		//Capture the page heading and print on console
		System.out.println("The page heading is --- " +dashboard.getHeading());
		
	}

}


