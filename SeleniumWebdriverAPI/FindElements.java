package SeleniumWebdriverAPI;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;


public class FindElements {
public static void main(String[] args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chorme driver\\chromedriver.exe");
		// Create a new instance of the Chrome Driver
		 WebDriver driver = new ChromeDriver();

		// Open web site
		 driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		 
		 // Find elements using tag name
		   List<WebElement> allInputElements = driver.findElements(By.tagName("input"));
			
		   if(allInputElements.size() != 0) 
		   {
			   System.out.println(allInputElements.size() + " Elements found by TagName as input ");
		   }
		  
		   //Find element
		   WebElement element = driver.findElement(By.id("btnLogin"));	
			
			if(element != null) {
			    System.out.println("Element found by ID");
			}
		   
		// Close browser
		driver.close();
	   }
	}


