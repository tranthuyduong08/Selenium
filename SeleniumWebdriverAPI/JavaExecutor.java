package SeleniumWebdriverAPI;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaExecutor {
	public static void main(String[] args) throws Exception {
    System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chorme driver\\chromedriver.exe");
	 
    WebDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
    Thread.sleep(2000);
    
    boolean screen = driver.findElement(By.xpath("//div[@id='logInPanelHeading']")).isDisplayed(); 		
    if(screen == true) {
    	System.out.println("You are at login page");
    } else {
    	System.out.println("No result found");
    }
    
    JavascriptExecutor js = (JavascriptExecutor) driver;
   
    js.executeScript("document.getElementById('txtUsername').value='Admin';");
    Thread.sleep(1000);
    
    js.executeScript("document.getElementById('txtPassword').value='admin123';");
    Thread.sleep(1000);
    
    WebElement btnLogin = driver.findElement(By.id("btnLogin"));
    js.executeScript("arguments[0].click();", btnLogin);
    Thread.sleep(1000);
    
	// Get page title and Domain using JavascriptExecutor
	String titleText = js.executeScript("return document.title;").toString();
	System.out.println("Page Title is: " + titleText);

	String domainName = js.executeScript("return document.domain;").toString();
	System.out.println("Domain is: " + domainName);

	driver.quit();
    
	}  

}
