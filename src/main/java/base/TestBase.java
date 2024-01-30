package base;

import java.time.Duration;
import java.util.ResourceBundle;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class TestBase {

	public static WebDriver driver; // initialize the webdriver  as static always 
	
	public ResourceBundle rb;


	public TestBase() {

		//		this.driver=driver;
		PageFactory.initElements(driver, this);
		rb=ResourceBundle.getBundle("config");
	}


	
	public  void setup() throws InterruptedException {
		
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(rb.getString("URL"));
		driver.manage().window().maximize();
		Thread.sleep(5000);
	}
	
	
//	@After
//	public void closethebrowser() {
//		
//		driver.quit();
//	}
	
	
}
