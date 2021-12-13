package SeleniumWebdriverAPI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tooltip {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chorme driver\\chromedriver.exe");
		// Create a new instance of the Chrome Driver
		WebDriver driver = new ChromeDriver();

		String baseUrl = "http://demo.guru99.com/test/social-icon.html";
		driver.get(baseUrl);
		String expectedTooltip = "Github";

		// Find the Github icon at the top right of the header
		WebElement github = driver.findElement(By.xpath(".//*[@class='soc-ico show-round']/a[4]"));

		// get the value of the "title" attribute of the github icon
		String actualTooltip = github.getAttribute("title");

		// Assert the tooltip's value is as expected
		System.out.println("Actual Title of Tool Tip is " + actualTooltip);
		if (actualTooltip.equals(expectedTooltip)) {
			System.out.println("Passed");
		}
		driver.close();
	}
}
