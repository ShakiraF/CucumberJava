package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage{
	WebDriver driver=null;

	@FindBy(xpath = "//h1[text()='TestProject Example page']")
	 WebElement header_label;

	@FindBy(id="name")
	 WebElement username_txt;

	@FindBy(id="password")
	 WebElement password_txt;

	@FindBy(id="login")
	 WebElement login_btn;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, LoginPage.class);
	}	

	public void enterUsername(String username) {
		username_txt.sendKeys(username);
		System.out.println("Username entered:"+username);
		
	}
	public void enterPassword(String password) {
		password_txt.sendKeys(password);
		System.err.println("Pssword entered:"+password);
		
	}
	
	public void verifyHeader() {
		header_label.isDisplayed();
		System.out.println("header verified");
		
	}
	public void login() {
		login_btn.click();
		System.out.println("Clicked on login button");
		
	}
}
