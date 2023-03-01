package Section08;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class L07_BrowserTabs {

	public static void main(String[] args) throws InterruptedException {
		

	System.setProperty("webdriver.chrome.driver", "/Users/zainabomar/Desktop/selenium/driver_v1/chromedriver");
			
			WebDriver driver = new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://automationtesting.co.uk/browserTabs.html");
			
			
			for(int i = 0; i < 3; i++) {
				driver.findElement(By.xpath("//input[@value='Open Tab']")).click();
			}
			
			ArrayList<String> windowHandles = new ArrayList<String>(driver.getWindowHandles());
			
			System.out.println("There are " + windowHandles.size() + " tabs open");
			
			for(String tab:windowHandles) {
				Thread.sleep(2000);
				driver.switchTo().window(tab);
			}
			
			Thread.sleep(2000);
			
			driver.switchTo().window(windowHandles.get(0));		
			
	}
}
