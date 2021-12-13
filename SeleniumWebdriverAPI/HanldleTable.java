package SeleniumWebdriverAPI;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HanldleTable {
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
	    Thread.sleep(2000);
	    
	    WebElement username = driver.findElement(By.id("txtUsername"));
	    username.sendKeys("Admin");
	    Thread.sleep(1000);
	    
	    WebElement password = driver.findElement(By.id("txtPassword"));
	    password.sendKeys("admin123");
	    Thread.sleep(1000);
	    
	    WebElement btnLogin = driver.findElement(By.id("btnLogin"));
	    btnLogin.click();
	    Thread.sleep(1000);
	    
	    boolean dashboard = driver.findElement(By.xpath("//h1[normalize-space()='Dashboard']")).isDisplayed(); 		
	    if(dashboard == true) {
	    	System.out.println("You are at dashboard");
	    } else {
	    	System.out.println("No result found");
	    }
	    Thread.sleep(2000);
	    

	    WebElement adminPage = driver.findElement(By.xpath("//b[contains(text(),'Admin')]"));
	    adminPage.click();
	    Thread.sleep(1000);
	    
	    boolean userManagement = driver.findElement(By.cssSelector("#menu_admin_UserManagement")).isDisplayed(); 		
	    if(userManagement == true) {
	    	System.out.println("You are at Admin Page");
	    } else {
	    	System.out.println("No result found");
	    }
	    Thread.sleep(2000);
	    
	    String innerText = driver.findElement(
	    		By.xpath("//table/tbody/tr[2]/td[2]")).getText(); 	
	            System.out.println(innerText); 
        driver.quit(); 
	     
	    }

    }



