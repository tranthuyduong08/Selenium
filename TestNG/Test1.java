package TestNG;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Test1 {
	public WebDriver driver = null;
  @Test
  public void Demo1() {
	  driver.navigate().to("https://www.facebook.com/");
  }
  @Test
  public void Demo2() {
	  driver.navigate().to("https://github.com/");
  }
  @Test
  public void Demo3() {
	  driver.navigate().to("https://www.google.com/");
  }
  @BeforeTest
  public void beforeTest() {
	    System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\Chorme driver\\chromedriver.exe");
	    driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
  }

  @AfterTest
  public void afterTest() throws Exception {
		Thread.sleep(3000);
		driver.quit();
  }

}
