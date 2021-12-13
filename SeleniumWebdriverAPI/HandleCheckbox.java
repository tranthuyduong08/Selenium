package SeleniumWebdriverAPI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckbox {
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
		//Go to Leave List
		    WebElement list = driver.findElement(By.xpath("//span[normalize-space()='Leave List']"));
		    list.click();
		    Thread.sleep(1000);
		    
		//Find element checkbox
		    WebElement checkAll = driver.findElement(By.xpath("//input[@id='leaveList_chkSearchFilter_checkboxgroup_allcheck']"));
		    WebElement checkBox1 = driver.findElement(By.xpath("//input[@id='leaveList_chkSearchFilter_-1']"));
		    WebElement checkBox2 = driver.findElement(By.xpath("//input[@id='leaveList_chkSearchFilter_0']"));
		    

        //Checkbox1
			if (checkBox1.isSelected() == true) {
				System.out.println("The checkbox was selected before");
				
			} else {
				System.out.println("The checkbox is not selected");
				checkBox1.click();
				System.out.println("The checkbox is selected");				
			}
	 //Checkbox2 
			if (checkBox2.isDisplayed() == true) {
				System.out.println("The checkbox is displayed");
				checkBox2.click();
				
			} else {
				System.out.println("The checkbox is not displayed");			
			}
			
	//Check All
			if (checkAll.isEnabled() == true) {
				System.out.println("The checkbox is enabled");
				checkAll.click();
			} else {
				System.out.println("The checkbox is not enabled");			
			}
			
	//Uncheck All
			
			
}
}
