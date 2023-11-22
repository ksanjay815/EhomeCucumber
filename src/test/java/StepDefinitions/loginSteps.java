package StepDefinitions;

import org.openqa.selenium.WebDriver;

import com.empire.qa.base.BaseTest;
import com.empire.qa.pages.LoginPage;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;


public class loginSteps extends BaseTest{
	public loginSteps() throws Throwable {
		super();
		
	}

	public static WebDriver driver;
	public LoginPage loginpage;

	@Before
	public void setup() throws Throwable {
		initialization();
		loginpage = new LoginPage();
		Thread.sleep(2000);
	}
	
	@Given("browser is open")
	public void browser_is_open() {
		System.out.println("Inside step: Browser is open");
	}

	@When("user enters username as {string} and password as {string}")
	public void user_enters_username_as_and_password_as(String uname, String pwd) {
		loginpage.setusername(uname);
		loginpage.setpassword(pwd);
	}

	@And("user clicks on login button")
	public void clicks_on_login_button() {
		loginpage.clickLoginBtn();
		System.out.println("Inside step: user clicks on login button");
	}

	@Then("user is navigated to homepage")
	public void user_is_navigated_to_homepage() throws InterruptedException {
		System.out.println("Inside step: user is navigated to te homepage");
	}

	@After
	public void close_browser() {
		driver.close();
	}

}
