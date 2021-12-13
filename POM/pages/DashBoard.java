package POM.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashBoard {
	   WebDriver driver;
		
		public DashBoard(WebDriver driver) {
			 this.driver = driver;
	    }

		
		//Locator for assignLeave
		By assignLeave= By.xpath("//span[contains(text(),'Assign Leave')]");
		
		//Locator for leaveList
		By leaveList = By.xpath("//span[contains(text(),'Leave List')]");
		
		//Locator for timeSheets
		By timeSheets = By.xpath("//span[contains(text(),'Timesheets')]");
		
		//Locator for applyLeave
		By applyLeave= By.xpath("//span[contains(text(),'Apply Leave')]");
		
		//Locator for leaveList
		By myLeave = By.xpath("//span[contains(text(),'Apply Leave')]");
		
		//Locator for timeSheets
		By myTimeSheets = By.xpath("//span[contains(text(),'My Timesheet')]");
		
		//Locator for heading
		By header = By.xpath("//h1[normalize-space()='Dashboard']");
		
		
		
		
		//Method to click on assignLeave button
		public void clickAssignLeave() {
			driver.findElement(assignLeave).click();
		}
		//Method to click on leaveList button
		public void clickLeaveList() {
			driver.findElement(leaveList).click();
		}
		//Method to click on timeSheets button
		public void clickTimeSheets() {
			driver.findElement(timeSheets).click();
		}
		//Method to click on applyLeave button
		public void clickApplyLeave() {
			driver.findElement(applyLeave).click();
		}
		//Method to click on myLeave button
		public void clickMyLeave() {
			driver.findElement(myLeave).click();
		}
		//Method to click on myTimeSheets button
		public void clickMyTimeSheets() {
			driver.findElement(myTimeSheets).click();
		}
		
		public String getHeading() {
			String head = driver.findElement(header).getText();
			return head;
		}
	}
	
		
		
		


