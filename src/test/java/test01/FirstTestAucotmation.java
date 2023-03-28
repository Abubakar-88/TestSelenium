package test01;

import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


@Test
public class FirstTestAucotmation {
	static WebDriver driver;
	public void OpenBrowser {
	    System.setProperty("webdriver.chrome.driver", "/usr/bin/chromedriver");
	      
	      // Set Chrome options
	      ChromeOptions options = new ChromeOptions();
	      options.addArguments("--start-maximized");
	      
	      // Initialize the ChromeDriver with options
	   driver = new ChromeDriver(options);
	      
	      // Launch the Chrome browser
	      driver.get("https://it.microtechlimited.com/index.html");
	     // navigateURL("https://it.microtechlimited.com/index.html");
			String s = getText(By.xpath("//div//h1['Welcome to MicroTech NA.']"));
			assertEquals("Welcome to MicroTech NA.", s);
	      // Close the browser
	      driver.quit();
	}

	public static String getText(By by){
		return driver.findElement(by).getText();
	}

}
