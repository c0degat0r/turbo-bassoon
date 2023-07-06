package stepDefinition;

import org.junit.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class LoginPage {
	@Given("^I open chrome browser$")
	public void i_open_chrome_browser() {
	   System.out.println("1");
	}

	@When("^I visit the qa environment$")
	public void i_visit_the_qa_environment()  {
		   System.out.println("2");
	}

	@Then("^I should be on the login page$")
	public void i_should_be_on_the_login_page() {
		   System.out.println("3");
	}

	@Then("^I enter \"([^\"]*)\" username$")
	public void i_enter_username(String arg1) {
		   System.out.println("4");
	}

	@Then("^I enter \"([^\"]*)\" password$")
	public void i_enter_password(String arg1) {
		   System.out.println("5");
	}

	@When("^I click the login button$")
	public void i_click_the_login_button()  {
		   System.out.println("6");
	}

	@Then("^I should see the home page$")
	public void i_should_see_the_home_page() {
		   System.out.println("7");
	}
	
	@Then("^It should fail$")
	public void it_should_fail()  {
	    Assert.assertTrue(false);
	}


}
