package StepDefintions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps {
	
	@Given("I launch Url")
	public void i_launch_url() {
	  System.out.println("Inside : Launch url");
	}

	@When("I enter username and password")
	public void i_enter_username_and_password() {
		 System.out.println("Inside : username and password");
	}

	@And("I click on Login button")
	public void i_click_on_login_button() {
		System.out.println("Inside : Login button");
	}

	@Then("I verify Home page is  displayed")
	public void i_verify_home_page_is_displayed() {
		System.out.println("Inside : Home page");
	}
	
	
}
