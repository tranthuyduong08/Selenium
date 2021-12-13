package ControllingTestFlow;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAlert {
	public static void main(String[] args) throws NoAlertPresentException,InterruptedException  {									
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chorme driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
        driver.get("http://demo.guru99.com/test/delete_customer.php");			
                            		   	      	
        driver.findElement(By.name("cusid")).sendKeys("53920");					
        driver.findElement(By.name("submit")).submit();			
        		
        // Switching to Alert
        Alert alert = driver.switchTo().alert();		
        		
        // Capturing alert message
        String alertMessage= driver.switchTo().alert().getText();		
        		
        // Displaying alert message
        System.out.println(alertMessage);	
        Thread.sleep(2000);
        		
        // Accepting alert		
        alert.accept();
        
        Thread.sleep(2000);
        driver.quit();
    }	
}


