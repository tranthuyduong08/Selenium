package POM.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Maintenance {
WebDriver driver;
	
    public Maintenance(WebDriver driver) {
        this.driver = driver;
	}
	
	//Locator for verify  field
	By password_cf = By.id("confirm_password");
	
	//Locator for verify button
	By btnVerify = By.xpath("//input[@value='Verify']");
	
	
	//Method to enter password
	public void verifyPassword(String password) {
		driver.findElement(password_cf).sendKeys(password);
	}
	
	//Method to click on Login button
	public void clickVerify() {
		driver.findElement(btnVerify).click();
	}
}



