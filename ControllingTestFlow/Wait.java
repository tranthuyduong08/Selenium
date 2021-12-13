package ControllingTestFlow;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {

	public static void main(String[] args) {

		WebDriver driver = null;
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chorme driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		
		// Login
				WebElement username = driver.findElement(By.id("txtUsername"));
				username.sendKeys("Admin");
		
				WebElement password = driver.findElement(By.id("txtPassword"));
				password.sendKeys("admin123");
			
				WebElement btnLogin = driver.findElement(By.id("btnLogin"));
				btnLogin.click();
			
				WebDriverWait wait = new WebDriverWait(driver, 10);

				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[contains(text(),'Dashboard')]")));
				
				driver.findElement(By.xpath("//h1[contains(text(),'Dashboard')]")).click();
		
		

	}

}
