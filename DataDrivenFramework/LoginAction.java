package DataDrivenFramework;

import org.openqa.selenium.WebDriver;

import POM.pages.*;

import DataDrivenFramework.ExcelUtils;

// Now this method does not need any arguments

public class LoginAction {

public static void Execute(WebDriver driver) throws Exception{

	//This is to get the values from Excel sheet, passing parameters (Row num & Col num)to getCellData method

	String sUserName = ExcelUtils.getCellData(1, 1);

	String sPassword = ExcelUtils.getCellData(1, 2);
	
	Login log = new Login(driver);

	log.enterUsername(sUserName);
	log.enterPassword(sPassword);
	
	//Click on login button
	log.clickLogin();
	Thread.sleep(3000);
	

}

}
