package SeleniumWebdriverAPI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleRadioButton {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chorme driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);

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

		// Set myInfor page
		WebElement myInfo = driver.findElement(By.xpath("//a[@id='menu_pim_viewMyDetails']"));
		myInfo.click();
		Thread.sleep(1000);

		boolean myInfoPage = driver.findElement(By.xpath("//h1[normalize-space()='Personal Details']")).isDisplayed();
		if (myInfoPage == true) {
			System.out.println("You are at My Info");
		} else {
			System.out.println("No result found");
		}
		Thread.sleep(2000);

		WebElement edit = driver.findElement(By.id("btnSave"));
		edit.click();
		Thread.sleep(1000);

		WebElement gender1 = driver.findElement(By.id("personal_optGender_1"));
		if (gender1.isSelected() == true) {
			System.out.println("Choose gender = male");
		} else {
			gender1.click();
		}
		Thread.sleep(2000);

		WebElement gender2 = driver.findElement(By.id("personal_optGender_2"));
		if (gender2.isSelected() == true) {
			System.out.println("Choose gender = female");
		} else {
			gender2.click();
		}
		Thread.sleep(2000);

		edit.click();
		Thread.sleep(1000);

		driver.close();

	}
}
