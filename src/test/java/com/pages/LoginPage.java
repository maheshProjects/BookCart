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

	@FindBy(xpath = "//mat-label[text()='First name']")
	private WebElement fnameElement;

	@FindBy(xpath = "//mat-label[text()='Last name']")
	private WebElement lnameElement;

	@FindBy(xpath = "//mat-label[text()='User name']")
	private WebElement unameElement;
	@FindBy(xpath = "//mat-label[text()='Password']")
	private WebElement passwordElement;

	@FindBy(xpath = "//mat-label[text()='Confirm Password']")
	private WebElement confirmPaasElement;

	public WebElement getLoginclick() {
		return loginclick;
	}

	public void setLoginclick(WebElement loginclick) {
		this.loginclick = loginclick;

	}

	public WebElement getNewUser() {
		return newUser;
	}

	public void setNewUser(WebElement newUser) {
		this.newUser = newUser;
	}

	public WebElement getRegisterElement() {
		return registerElement;
	}

	public void setRegisterElement(WebElement registerElement) {
		this.registerElement = registerElement;
	}

	public WebElement getClick2() {
		return click2;
	}

	public void setClick2(WebElement click2) {
		this.click2 = click2;
	}

	public WebElement getErroMessge1() {
		return erroMessge1;
	}

	public void setErroMessge1(WebElement erroMessge1) {
		this.erroMessge1 = erroMessge1;
	}

	public WebElement getErroMessge2() {
		return erroMessge2;
	}

	public void setErroMessge2(WebElement erroMessge2) {
		this.erroMessge2 = erroMessge2;
	}

	public WebElement getRegisterButton() {
		return registerButton;
	}

	public void setRegisterButton(WebElement registerButton) {
		this.registerButton = registerButton;
	}

	public WebElement getFnameElement() {
		return fnameElement;
	}

	public void setFnameElement(WebElement fnameElement) {
		this.fnameElement = fnameElement;
	}

	public WebElement getLnameElement() {
		return lnameElement;
	}

	public void setLnameElement(WebElement lnameElement) {
		this.lnameElement = lnameElement;
	}

	public WebElement getUnameElement() {
		return unameElement;
	}

	public void setUnameElement(WebElement unameElement) {
		this.unameElement = unameElement;
	}

	public WebElement getPasswordElement() {
		return passwordElement;
	}

	public void setPasswordElement(WebElement passwordElement) {
		this.passwordElement = passwordElement;
	}

	public WebElement getConfirmPaasElement() {
		return confirmPaasElement;
	}

	public void setConfirmPaasElement(WebElement confirmPaasElement) {
		this.confirmPaasElement = confirmPaasElement;
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

	public void registrationBlock(String fName, String lName, String uName, String passWord, String confirmPass) {

		inpuKeys(getFnameElement(), fName);

		inpuKeys(getLnameElement(), lName);

		inpuKeys(getUnameElement(), uName);

		inpuKeys(getPasswordElement(), passWord);

		inpuKeys(getConfirmPaasElement(), confirmPass);

	}

}
