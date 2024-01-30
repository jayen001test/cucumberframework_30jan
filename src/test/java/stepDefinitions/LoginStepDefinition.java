package stepDefinitions;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import base.TestBase;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.LoginPage;

public class LoginStepDefinition extends TestBase{

		//public WebDriver driver;
	//
	//	public LoginStepDefinition(WebDriver driver) {
	//		super(driver);
	//		// TODO Auto-generated constructor stub
	//	}

	LoginPage login;

	HomePage HP;

	TestBase TB;


	// Global hooks 

	/*
	 * @BeforeAll public static void databasesetup() {
	 * 
	 * System.out.println("Database setup is done globally");
	 * 
	 * }
	 * 
	 * @AfterAll public static void closeDatabse() {
	 * 
	 * System.out.println("Database has been closed globally"); }
	 * 
	 * @Before public void setup() throws InterruptedException { driver=new
	 * ChromeDriver();
	 * driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	 * driver.get(
	 * "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	 * driver.manage().window().maximize(); //login=new LoginPage(driver);
	 * //login.openthebrowser(); Thread.sleep(5000);
	 * 
	 * 
	 * }
	 */
//	@After
//	public void teardown() {
//
//		driver.quit();
//
//	}

	// ===========================


	//tagged hooks======================================== These are local hooks which works specifically on the tagged scenario

	/*
	 * @Before("@second") public void checkdatabseconnectivity() {
	 * 
	 * System.out.println("Database is connected properly for second scenarion");
	 * 
	 * }
	 * 
	 * @After("@second") public void closeagain() {
	 * 
	 * System.out.println("Database is disconnected properly for second scenarion");
	 * }
	 */
	@Given("User is on login page")
	public void user_is_on_login_page() throws InterruptedException {

		//		driver=new ChromeDriver();
		//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//		driver.manage().window().maximize();
		//		//login=new LoginPage(driver);
		//		//login.openthebrowser();
		//		Thread.sleep(5000);
		TB=new TestBase();
		TB.setup();
		Assert.assertEquals(driver.getTitle().equalsIgnoreCase("OrangeHRM"), true);

	}

	@When("User enters valid username and password")
	public void user_enters_valid_username_and_password() {

		//		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");

		login=new LoginPage();
		login.userenterValidUsernameandpassword();


	}

	@When("User enters valid username as {string} and password as {string}")
	public void user_enters_valid_username_as_and_password_as(String usename, String password) throws InterruptedException {
		//		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(usename);
		//		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		//		Thread.sleep(5000);
		login=new LoginPage();
		login.enterusernameandpassword(usename, password);
	}

	@And("Clicks on login button")
	public void clicks_on_login_button() throws InterruptedException {


		HP=login.clickOnLoginbtn();
		Thread.sleep(3000);
	}

	@Then("User is on home page")
	public void user_is_on_home_page() {
		System.out.println("User is on the homepage");
	}


//	@When("click on userdropdown")
//	public void click_on_userdropdown() {
//
//		//		HP=new HomePage(driver);
//		//HP=new HomePage();
//		HP.clickOnUserdropdown();
//
//	}
//
//	@Then("Click on logout button")
//	public void click_on_logout_button() throws InterruptedException {
//		HP.clickOnLogout();
//		Thread.sleep(5000);
//	}


		@And("Close the browser")
		public void close_the_browser() {
	
			//		driver.quit();
	
			login.tear_down();
	
		}


}
