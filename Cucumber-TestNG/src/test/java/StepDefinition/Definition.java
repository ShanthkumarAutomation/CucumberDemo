package StepDefinition;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class Definition {

	WebDriver driver;
	
	@Given("login page")
	public void login_page() {
		//System.setProperty("webdriver.chrome.driver", "C://Users//ShanthkumarMunavalli//Desktop//SDET//JARs//chromedriver_win32//chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	}
	@When("I enter valid UserName {string}")
	public void i_enter_valid_user_name(String name) {
		System.out.println("Enter name block");
		driver.findElement(By.id("txtUsername")).sendKeys(name);
	}
	
	@When("I enter valid Password {string}")
	public void i_enter_valid_password(String pwd) {
		System.out.println("Enter pwd block");
		driver.findElement(By.id("txtPassword")).sendKeys(pwd);
	}
	
	@When("click Submit")
	public void click_submit() {
		System.out.println("Submit block");
		driver.findElement(By.id("btnLogin")).click();
	    
	}
	
	

		@Then("Login Successfull")
		public void login_successfull() {
			System.out.println("Login Successfull");
			
			driver.close();
			
		}


	
}