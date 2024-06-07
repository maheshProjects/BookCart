package com.pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.base.BaseClassBook;

public class LoginPage extends BaseClassBook {

	public LoginPage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[text()=' Login ']")
	private WebElement loginclick;

	@FindBy(xpath = "//span[@class='mat-h4']")
	private WebElement newUser;

	@FindBy(xpath = "//span[text()='Register']")
	private WebElement registerElement;

	@FindBy(xpath = "//span[@class='mat-mdc-button-touch-target']/preceding-sibling::span[text()='Login']")
	private WebElement click2;

	@FindBy(xpath = "//label[@id='mat-mdc-form-field-label-0']")
	private WebElement erroMessge1;

	@FindBy(xpath = "//label[@id='mat-mdc-form-field-label-2']")
	private WebElement erroMessge2;

	@FindBy(xpath = "//span[text()='Register']")
	private WebElement registerButton;

	@FindBy(xpath = "//input[@formcontrolname='firstname']")
	private WebElement fnameElement;

	@FindBy(xpath = "//input[@formcontrolname='lastname']")
	private WebElement lnameElement;

	@FindBy(xpath = "//input[@formcontrolname='username']")
	private WebElement unameElement;

	@FindBy(xpath = "//input[@formcontrolname='password']")
	private WebElement passwordElement;

	@FindBy(xpath = "//input[@formcontrolname='confirmPassword']")
	private WebElement confirmPaasElement;

	@FindBy(xpath = "//input[@value='Male']")
	private WebElement maleButton;

	@FindBy(xpath = "//input[@value='Female']")
	private WebElement femamaleButton;

	@FindBy(xpath = "//span[text()='Register']")
	private WebElement registerBtn;

	public WebElement getRegisterBtn() {
		return registerBtn;
	}

	public WebElement getFemamaleButton() {
		return femamaleButton;
	}

	public WebElement getMaleButton() {
		return maleButton;

	}

	public WebElement getLoginclick() {
		return loginclick;
	}

	public WebElement getNewUser() {
		return newUser;
	}

	public WebElement getRegisterElement() {
		return registerElement;
	}

	public WebElement getClick2() {
		return click2;
	}

	public WebElement getErroMessge1() {
		return erroMessge1;
	}

	public WebElement getErroMessge2() {
		return erroMessge2;
	}

	public WebElement getRegisterButton() {
		return registerButton;
	}

	public WebElement getFnameElement() {
		return fnameElement;
	}

	public WebElement getLnameElement() {
		return lnameElement;
	}

	public WebElement getUnameElement() {
		return unameElement;
	}

	public WebElement getPasswordElement() {
		return passwordElement;
	}

	public WebElement getConfirmPaasElement() {
		return confirmPaasElement;
	}

	public void clickMethod() {
		click(getLoginclick());

	}

	public void newUserMsg() {
		String textMessage4 = getTextMessage(getNewUser());

		printMessage(textMessage4);

	}

	public void registerMessage() {
		String textMessage5 = getTextMessage(getRegisterElement());

		printMessage(textMessage5);

	}

	public void loginCLickmethod() {

		click(getClick2());

	}

	public void errorMessage1() {
		String textMessage6 = getTextMessage(getErroMessge1());

		printMessage(textMessage6);
		String a = "Username";
		Assert.assertEquals(a, textMessage6);

	}

	public void errorMessage2() {
		String textMessage7 = getTextMessage(getErroMessge2());

		printMessage(textMessage7);
		String b = "Password";
		Assert.assertEquals(b, textMessage7);
	}

	public void registrationClick() {
		click(getRegisterButton());

	}

	public void registrationBlock(String fName, String lName, String uName, String passWord, String confirmPass)
			throws InterruptedException {

		Thread.sleep(1500);

		inpuKeys(getFnameElement(), fName);

		Thread.sleep(3500);

		inpuKeys(getLnameElement(), lName);

		Thread.sleep(3500);

		inpuKeys(getUnameElement(), uName);

		Thread.sleep(3500);

		inpuKeys(getPasswordElement(), passWord);

		Thread.sleep(3500);

		inpuKeys(getConfirmPaasElement(), confirmPass);

		Thread.sleep(3500);

		click(maleButton);

	}

	public void registrationConfirmation() {
		click(registerBtn);

	}

}
