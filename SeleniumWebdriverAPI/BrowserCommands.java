package SeleniumWebdriverAPI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {
public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chorme driver\\chromedriver.exe");
		// Create a new instance of the Chrome Driver
		 WebDriver driver = new ChromeDriver();

		// Open web site
		 driver.navigate().to("https://opensource-demo.orangehrmlive.com/");

		 String Title = driver.getTitle();
		 if (Title.contains("OrangeHRM")) {
			 System.out.println("You opened the web");
		 } else {
			 System.out.println ("You are at wrong website");
		 }
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
	    
	    //Get page source
	    
	    String PageSource = driver.getPageSource();
	    System.out.println(PageSource);
	    
	    //close
	    driver.close();

}
}
