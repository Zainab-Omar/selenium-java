package Section05;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.junit.Assert;

public class L09_Assertion_pt1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/zainabomar/Desktop/selenium/driver_v1/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationtesting.co.uk");
		
		String pageTitle = driver.getTitle();
		
		Assert.assertEquals("Homepage", pageTitle);
		
	}

}
