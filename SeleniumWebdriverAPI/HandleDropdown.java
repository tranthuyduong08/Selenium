package SeleniumWebdriverAPI;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropdown {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chorme driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);

		// Login
		WebElement username = driver.findElement(By.id("txtUsername"));
		username.sendKeys("Admin");

		WebElement password = driver.findElement(By.id("txtPassword"));
		password.sendKeys("admin123");

		WebElement btnLogin = driver.findElement(By.id("btnLogin"));
		btnLogin.click();

		// Set myInfor page
		WebElement myInfo = driver.findElement(By.xpath("//a[@id='menu_pim_viewMyDetails']"));
		myInfo.click();

		boolean myInfoPage = driver.findElement(By.xpath("//h1[normalize-space()='Personal Details']")).isDisplayed();
		if (myInfoPage == true) {
			System.out.println("You are at My Info");
		} else {
			System.out.println("No result found");
		}

		// Set up element
		WebElement edit = driver.findElement(By.id("btnSave"));
		edit.click();

		WebElement nation = driver.findElement(By.xpath("//select[@id='personal_cmbNation']"));

		// Handle dropdown tĩnh

		Select select = new Select(nation);
		List<WebElement> lst = select.getOptions();
		System.out.println("The dropdown options are:");
		for (WebElement options : lst)
			System.out.println(options.getText());
		Thread.sleep(2000);

		// Selecting an option by its index
		System.out.println("Select the Option by Index ");
		select.selectByIndex(4);
		System.out.println("Select value is: " + select.getFirstSelectedOption().getText());
		Thread.sleep(2000);

		// Selecting an option by text
		System.out.println("Select the Option by Text");
		select.selectByVisibleText("Vietnamese");
		System.out.println("Select value is: " + select.getFirstSelectedOption().getText());
		Thread.sleep(2000);

		// Selecting an option by its value
		System.out.println("Select the Option by value ");
		select.selectByValue("6");
		System.out.println("Select value is: " + select.getFirstSelectedOption().getText());
		Thread.sleep(2000);

		// Check multiple select

		if (select.isMultiple() == true) {
			System.out.println("The dropdown can be multiple");
		} else {
			System.out.println("The dropdown can not be multiple");
		}

		driver.quit();

	}
}
