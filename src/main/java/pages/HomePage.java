package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;

public class HomePage extends TestBase{

	//public WebDriver driver;

//	public HomePage() {
//
//		//		this.driver=driver;
//
//		PageFactory.initElements(driver, this);
//	}


	//
	//	public HomePage(WebDriver driver) {
	//		super(driver);
	//		// TODO Auto-generated constructor stub
	//	}

	@FindBy(css = ".oxd-userdropdown-icon")
	private WebElement dropdown_arrow;


	@FindBy(xpath ="//li[4]/a[@role='menuitem']")
	private WebElement btn_logout;



	public void clickOnUserdropdown() {
		dropdown_arrow.click();

	}

	public void clickOnLogout() {

		btn_logout.click();
	}











}
