package SeleniumWebdriverAPI;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {

	public static void main(String[] args) throws InterruptedException {

		// specify the driver location
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chorme driver\\chromedriver.exe");

		// instantiate the driver
		WebDriver driver = new ChromeDriver();

		// maximise the window
		driver.manage().window().maximize();

		// specify the URL of the webpage
		driver.get("https://www.google.com/");

		// specify the locator of the search box
		WebElement element = driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[1]/div[2]/div[2]/input[1]"));

		// create an object for the Actions class and pass the driver argument
		Actions action = new Actions(driver);

		// pass the product name that has to be searched in the website
		action.sendKeys(element, "gmo-z.com runsystem").build().perform();

		action.sendKeys(Keys.ENTER).build().perform();

		// Get element title of page
		WebElement elementTitlePage = driver.findElement(By.xpath("//h3[contains(text(),'GMO-Z.com RUNSYSTEM Joint Stock Company')]"));

		// perform a mouse click on the search button
		action.click(elementTitlePage).build().perform();

		Thread.sleep(2000);
		driver.quit();

	}
}


