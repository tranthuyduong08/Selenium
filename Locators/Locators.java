package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String[] args) throws Exception {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chorme driver\\chromedriver.exe");
		// Create a new instance of the Chrome Driver
		WebDriver driver = new ChromeDriver();

		// Open web site
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");

		String Title = driver.getTitle();
		if (Title.contains("OrangeHRM")) {
			System.out.println("You opened the web");
		} else {
			System.out.println("You are at wrong website");
		}

		// Find by Id

		WebElement usernameID = driver.findElement(By.id("txtUsername"));
		System.out.println("The ID of username fied is" + usernameID);

		WebElement passwordID = driver.findElement(By.id("txtPassword"));
		System.out.println("The ID of password fied is" + passwordID);

		// Find by name
		WebElement usernameName = driver.findElement(By.name("txtUsername"));
		System.out.println("The name of username fied is" + usernameName);

		WebElement passwordName = driver.findElement(By.name("txtPassword"));
		System.out.println("The name of password fied is" + passwordName);

		// Find by Rel xpath
		WebElement usernameRelXpath = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		System.out.println("The RelXpath of username fied is" + usernameRelXpath);

		WebElement passwordRelXpath = driver.findElement(By.xpath("//input[@id='txtPassword']"));
		System.out.println("The RelXpath of password fied is" + passwordRelXpath);

		// Find by Abs xpath
		WebElement usernameXpath = driver
				.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[2]/form[1]/div[2]/input[1]"));
		System.out.println("The Abs xpath of username fied is" + usernameXpath);

		WebElement passwordXpath = driver
				.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[2]/div[2]/form[1]/div[3]/input[1]"));
		System.out.println("The Abs xpath of password fied is" + passwordXpath);

		// Find by cssSelector
		WebElement usernameCss = driver.findElement(By.cssSelector("#txtUsername"));
		System.out.println("The cssSelector of username fied is" + usernameCss);

		WebElement passwordCss = driver.findElement(By.cssSelector("#txtPassword"));
		System.out.println("The cssSelector of password fied is" + passwordCss);

		// Find by Tagname
		// Field user name và password đều có tag name giống nhau nên ở đây em chỉ demo
		// 1 field
		WebElement usernameTagname = driver.findElement(By.tagName("input"));
		System.out.println("The Tagname of username fied is" + usernameTagname);

		driver.quit();

	}
}
