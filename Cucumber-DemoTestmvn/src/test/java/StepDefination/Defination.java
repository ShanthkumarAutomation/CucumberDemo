package StepDefination;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Defination {


	WebDriver driver;

	@Given("Login page")
	public void login_page() {
		System.setProperty("webdriver.chrome.driver", "C://Users//ShanthkumarMunavalli//Desktop//SDET//JARs//chromedriver_win32//chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");	 
	}

	@When("Enter Valid Name {string}")
	public void enter_valid_name(String name) {
		System.out.println("Enter name block");
		driver.findElement(By.id("txtUsername")).sendKeys(name);
	}


	@When("Enter Valid password {string}")
	public void enter_valid_password(String pwd) {
		System.out.println("Enter pwd block");
		driver.findElement(By.id("txtPassword")).sendKeys(pwd);
	}

	@When("click submit")
	public void click_submit() {
		System.out.println("Submit block");
		driver.findElement(By.id("btnLogin")).click();
	}





	@Then("I should see username as {string}")
	public void i_should_see_user_username_as(String LoginName) throws InterruptedException {
		System.out.println("Last block");
		String actualName = driver.findElement(By.id("welcome")).getText();
		String expectedName = LoginName;
		Assert.assertEquals(expectedName, actualName);

		driver.findElement(By.id("welcome")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='welcome-menu']/ul/li[3]")).click();
		System.out.println("Logged Out");			
		driver.close();
		Thread.sleep(3000);

	}


	@When("I enter Invalid UserName {string}")
	public void i_enter_invalid_user_name(String Invalidname) {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("txtUsername")).sendKeys(Invalidname);
	}

	@When("I enter Invalid Password {string}")
	public void i_enter_invalid_password(String Inpwd) {
		driver.findElement(By.id("txtPassword")).sendKeys(Inpwd);
	}

	@Then("I should see user name as {string}")
	public void i_should_see_Invalid_credentail_as(String UserName) throws InterruptedException {
		String actualName = driver.findElement(By.xpath("//*[@id='spanMessage']")).getText();
		String expectedName = UserName;
		Assert.assertEquals(expectedName, actualName);
		System.out.println("Invalid Data");
		Thread.sleep(3000);
		driver.close();


	}
}
