package com.step;

import com.base.BaseClassBook;
import com.object.ObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC2_LoginPageStep extends BaseClassBook {

	ObjectManager manager = new ObjectManager();

	@When("User to click the login option")
	public void user_to_click_the_login_option() throws InterruptedException {

		Thread.sleep(3000);
		manager.getLoginPage().clickMethod();

	}

	@Then("User should verify the success messge after click the login button {string}")
	public void user_should_verify_the_success_messge_after_click_the_login_button(String string)
			throws InterruptedException {
		manager.getLoginPage().newUserMsg();
		Thread.sleep(3000);

	}

	@Then("User should verify the success messge after click the login button for Registration\"Register\"")
	public void user_should_verify_the_success_messge_after_click_the_login_button_for_registration_register()
			throws InterruptedException {

		Thread.sleep(3000);
		manager.getLoginPage().registerMessage();

	}

	@When("User to click the login button")
	public void user_to_click_the_login_button() throws InterruptedException {
		Thread.sleep(3000);
		manager.getLoginPage().loginCLickmethod();

	}

	@Then("User should verify the error message after click login button {string} and {string}")
	public void user_should_verify_the_error_message_after_click_login_button_and(String string, String string2)
			throws InterruptedException {
		Thread.sleep(3000);
		manager.getLoginPage().errorMessage1();
		Thread.sleep(3000);
		Thread.sleep(3000);
		manager.getLoginPage().errorMessage2();
	}

	@When("User to click the register option")
	public void user_to_click_the_register_option() {
		manager.getLoginPage().registrationClick();
	}

	@When("User enter the value of required fields {string},{string},{string},{string} and {string}")
	public void user_enter_the_value_of_required_fields_and(String fName, String lName, String uName, String passWord,
			String confirmPass) {
		manager.getLoginPage().registrationBlock(fName, lName, uName, passWord, confirmPass);

	}

}