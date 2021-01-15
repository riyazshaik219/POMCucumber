package StepDefs;



import org.testng.Assert;

import Pages.HomePage;
import Pages.LoginPage;
import Utils.TestBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class LoginPageTest extends TestBase{
	LoginPage loginpage;
	HomePage homepage;
	
	@Given("^user opens browser$")
	public void user_opens_browser() throws Throwable {
		TestBase.intilization();
	}

	@Then("^user is on login page$")
	public void user_is_on_login_page() throws Throwable {
		loginpage=new LoginPage();
		String title=loginpage.validateLoginPageTitle();
		System.out.println(title);
		Assert.assertEquals("Cogmento CRM", title);
}

	@Then("^user logs into application$")
	public void user_logs_into_application() throws Throwable {
		homepage=loginpage.login(prop.getProperty("username"), prop.getProperty("password"));
	}

	@Then("^validate homepage title$")
	public void validate_homepage_title() throws Throwable {
		String title=homepage.verifyHomePageTitle();
		System.out.println(title);


	}

	@Then("^validate logged in username$")
	public void validate_logged_in_username() throws Throwable {
		boolean flag=homepage.verifyuserlabel();
		Assert.assertTrue(flag);

	
	}
}
