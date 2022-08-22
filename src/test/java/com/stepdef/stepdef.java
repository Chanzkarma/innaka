package com.stepdef;

import demoCucumber.BaseClass;
import demoCucumber.PageObjectManager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdef extends BaseClass {
	PageObjectManager p = new PageObjectManager();
	
	@Given("The Browser should open")
	public void the_Browser_should_open() {
		launchBrowser();
		loadURL("https://example.testproject.io/web/");
		maximizeWindow();
	}

	@When("Enter the {string} and {string}")
	public void enter_the_and(String username, String password) {
		type
		
	}

	@When("Click the Login page")
	public void click_the_Login_page() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User Verify success message")
	public void user_Verify_success_message() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User select \"{int}, main street Hill bunk\"and\"Test123@gmail.com\"and\"{int}\"")
	public void user_select_main_street_Hill_bunk_and_Test123_gmail_com_and(Integer int1, Integer int2) {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@When("User click on save button")
	public void user_click_on_save_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}

	@Then("User Click the logout button")
	public void user_Click_the_logout_button() {
	    // Write code here that turns the phrase above into concrete actions
	    throw new io.cucumber.java.PendingException();
	}


}
