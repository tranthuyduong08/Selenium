package SeleniumWebdriverAPI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class moveAndKeyBoard {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chorme driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(2000);

		boolean screen = driver.findElement(By.xpath("//div[@id='logInPanelHeading']")).isDisplayed();
		if (screen == true) {
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
		if (dashboard == true) {
			System.out.println("You are at dashboard");
		} else {
			System.out.println("No result found");
		}
		Thread.sleep(2000);

		Actions action = new Actions(driver);

		WebElement adminPage = driver.findElement(By.xpath("//b[contains(text(),'Admin')]"));

		action.moveToElement(adminPage);

		WebElement job = driver.findElement(By.xpath("//a[@id='menu_admin_Job']"));

		action.moveToElement(job);

		WebElement jobShift = driver.findElement(By.xpath("//a[@id='menu_admin_workShift']"));

		action.moveToElement(jobShift).build().perform();
		action.click();

		driver.quit();

	}
}
