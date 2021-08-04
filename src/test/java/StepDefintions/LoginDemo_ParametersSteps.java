package StepDefintions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;
import pages.LoginPage;

public class LoginDemo_ParametersSteps {
	
	WebDriver driver;
	LoginPage login= new LoginPage(driver);
	
	@Given("I Launch URL")
	public void i_launch_url() {
		
		String path=System.getProperty("user.dir");
		System.out.println(path);
		System.setProperty("webdriver.chrome.driver",path+"/src/test/Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://example.testproject.io/web/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		System.out.println("Launch Browser");	
	}

	@Then("I verify the TestProject Example page is displayed")
	public void i_verify_the_is_displayed() throws InterruptedException {
		login.verifyHeader();
		Thread.sleep(1000);
	    
	}

	@When("^I enter (.*) and (.*)$")
	public void i_enter_user_in_field(String username ,String password) throws InterruptedException {
		login.enterUsername(username);
		login.enterPassword(password);
		Thread.sleep(1000);
	}

	@And("And I click on Login button")
	public void i_click_on_Login() throws InterruptedException {
	     login.login();
	    Thread.sleep(2000);
	}
	
	protected void finalize(){
		//finalize method
		System.gc();
	} 
}
