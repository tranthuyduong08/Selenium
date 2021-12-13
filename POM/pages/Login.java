package POM.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
    WebDriver driver;
	
    public Login(WebDriver driver) {
        this.driver = driver;
	}
	
	//Locator for username field
	By username = By.id("txtUsername");
	
	//Locator for password field
	By password = By.id("txtPassword");
	
	//Locator for login button
	By btnLogin = By.id("btnLogin");
	
	//Invalid mesage
	By message = By.id("spanMessage");
	
	
	//Method to enter username
	public void enterUsername(String user) {
		driver.findElement(username).sendKeys(user);
	}

	//Method to enter password
	public void enterPassword(String pass) {
		driver.findElement(password).sendKeys(pass);
	}
	
	//Method to click on Login button
	public void clickLogin() {
		driver.findElement( btnLogin).click();
	}
	
	//Method to get message
	public void getMessage() {
		driver.findElement(message).getText();
	}
	
    
}
