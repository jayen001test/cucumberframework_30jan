package stepDefinitions;

import base.TestBase;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;

public class HomeStepDefinition extends TestBase{
	
	 HomePage HP;
	
	@When("click on userdropdown")
	public void click_on_userdropdown() {

		//		HP=new HomePage(driver);
		HP=new HomePage();
		HP.clickOnUserdropdown();

	}

	@Then("Click on logout button")
	public void click_on_logout_button() throws InterruptedException {
		HP.clickOnLogout();
		Thread.sleep(5000);
	}

}
