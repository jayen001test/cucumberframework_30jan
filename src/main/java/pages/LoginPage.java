package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class LoginPage extends TestBase{

//	public WebDriver driver;
//
//	public LoginPage() {
//
//		//	   this.driver=driver;
//		PageFactory.initElements(driver, this);
//
//	}

	//	
	//   public LoginPage(WebDriver driver) {
	//		super(driver);
	//		// TODO Auto-generated constructor stub
	//	}


	@FindBy(xpath ="//input[@name='username']")
	private WebElement txtbox_username;


	@FindBy(xpath = "//input[@name='password']")
	private WebElement txtbox_pw;

	@FindBy(xpath = "//form[@class='oxd-form']//button")
	private WebElement btn_login;



	//   public void openthebrowser() throws InterruptedException {
	//	   
	//	    driver=new ChromeDriver();
	//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	//		driver.manage().window().maximize();
	//		 Thread.sleep(3000);
	//   }

	public void enterusernameandpassword (String username, String pw) throws InterruptedException {
        Thread.sleep(3000);
		txtbox_username.sendKeys(username);
		txtbox_pw.sendKeys(pw);
		Thread.sleep(5000);

	}


	public void userenterValidUsernameandpassword() {

		txtbox_username.sendKeys(rb.getString("username"));
		txtbox_pw.sendKeys(rb.getString("password"));
	}


	public HomePage clickOnLoginbtn() throws InterruptedException {

		Thread.sleep(3000);

		btn_login.click();
		
		return new HomePage();
		
	}


		public void tear_down() {
			
			driver.quit();
		}

}
