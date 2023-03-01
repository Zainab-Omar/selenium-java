package Section05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class L08_RadioButtons {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/zainabomar/Desktop/selenium/driver_v1/chromedriver");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://automationtesting.co.uk/dropdown.html");
		
		driver.findElement(By.cssSelector("[for='demo-priority-low']")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.cssSelector("[for='demo-priority-normal']")).click();
		
		Thread.sleep(3000);
		
		
		driver.findElement(By.cssSelector("[for='demo-priority-high']")).click();
		
		Thread.sleep(3000);
			

	}

}
