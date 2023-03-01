import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.edge.driver", "/Users/zainabomar/Desktop/selenium/driver_v1/msedgedriver");
		
		WebDriver driver = new EdgeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://automationtesting.co.uk/");
		
//		driver.close();
		
	}

}
