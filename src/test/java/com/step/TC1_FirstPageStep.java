package com.step;

import com.base.BaseClassBook;
import com.object.ObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC1_FirstPageStep extends BaseClassBook {

	ObjectManager manager = new ObjectManager();

	@Given("User select to the chrome browser")
	public void user_select_to_the_chrome_browser() {
		launchBrowser();

	}

	@When("User navigate to the URL")
	public void user_navigate_to_the_url() {
		loadUrl();

	}

	@Then("User should verify the message {string}")
	public void user_should_verify_the_message(String string) throws InterruptedException {

		manager.getFirstPage().FirstMsgDispaly();
		Thread.sleep(1500);

		System.out.println("**************************************");

	}

	@Then("User should verify the message  for {string}")
	public void user_should_verify_the_message_for(String string) throws InterruptedException {
		manager.getFirstPage().FirstMsg2Dispaly();
	}

	@When("User click the add cart option")
	public void user_click_the_add_cart_option() {

		manager.getFirstPage().AddCartClickMethod();

	}

	@Then("User should verify the message after click addcart option {string}")
	public void user_should_verify_the_message_after_click_addcart_option(String string) throws InterruptedException {
		manager.getFirstPage().addCardMsg();
	}

	@When("User click the continue option after add cart is empty")
	public void user_click_the_continue_option_after_add_cart_is_empty() throws InterruptedException {
		manager.getFirstPage().continueClick();

	}

	
}
