package com.antonio.fw;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {

	@Given("^I open login page$")
	public void i_open_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.print("open login page url\n");
	}
	
	@Given("^I am on login page$")
	public void i_am_on_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.print("Verify login page is open url\n");
	}

	@When("^I enter username as \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void i_enter_username_as_and_password(String username, String password) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.print("type username and password\n");
	}

	@When("^I submit login page$")
	public void i_submit_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.print("submit login page\n");

	}

	@Then("^I redirect to user home page$")
	public void i_redirect_to_user_home_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    System.out.print("Verify: current page is user home");

	}

	

	

	
}
