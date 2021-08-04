package StepDefintions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v84.indexeddb.model.Key;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class GoogleSteps {
WebDriver driver;


	@Given("I launch Browser")
	public void luanch_browser()
	{
		
		String path=System.getProperty("user.dir");
		System.out.println(path);
		System.setProperty("webdriver.chrome.driver",path+"/src/test/Drivers/chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		System.out.println("Launch Browser");	
	}
	
	@When("I enter Automation step by step")
	public void Enter_text() throws InterruptedException
	{
		driver.findElement(By.name("q")).sendKeys("Automation step by step");
		System.out.println("Enter text, Automation step by step");
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(3000);
	}
	
	@Then("I Verify Header")
	public void veify_header() throws InterruptedException {
		System.out.println("Verify Header");
		driver.findElement(By.xpath("//h3[contains(text(),'Automation Step by Step - YouTube')]"));		
	Thread.sleep(2000);
	boolean pagesource = driver.getPageSource().contains("Automation Step by Step - YouTube");
	System.out.println(pagesource);
	Thread.sleep(2000);
		
		driver.close();
		driver.quit();
		
		
		
	}
	

}
