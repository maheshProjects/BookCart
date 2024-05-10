package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClassBook;

public class FirstPage extends BaseClassBook {

	public FirstPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='brand-title']/descendant::span[@class='mdc-button__label']")
	private WebElement Mesage1;

	@FindBy(xpath = "//mat-card-title[@class='mat-mdc-card-title mat-h1']")
	private WebElement Message2;

	@FindBy(xpath = "//button[@class='mdc-icon-button mat-mdc-icon-button mat-unthemed mat-mdc-button-base']")
	private WebElement CartClick;

	@FindBy(xpath = "//mat-card-header[@class='mat-mdc-card-header']/descendant::div[@class='mat-mdc-card-header-text']")
	private WebElement addCartMsg;
	@FindBy(xpath="//span[text()=' Continue shopping ']")
	private WebElement continueBtn;
	

	public WebElement getMessage2() {
		return Message2;
	}

	public void setMessage2(WebElement message2) {
		Message2 = message2;
	}

	public WebElement getMesage1() {
		return Mesage1;
	}

	public void setMesage1(WebElement mesage1) {
		Mesage1 = mesage1;
	}

	public WebElement getCartClick() {
		return CartClick;
	}

	public void setCartClick(WebElement cartClick) {
		CartClick = cartClick;
	}

	public WebElement getAddCartMsg() {
		return addCartMsg;
	}

	public void setAddCartMsg(WebElement addCartMsg) {
		this.addCartMsg = addCartMsg;
	}
	

	public WebElement getContinueBtn() {
		return continueBtn;
	}

	public void setContinueBtn(WebElement continueBtn) {
		this.continueBtn = continueBtn;
	}

	public void FirstMsgDispaly() throws InterruptedException {

		Thread.sleep(1500);
		String textMessage = getTextMessage(getMesage1());
		Thread.sleep(1500);

		Thread.sleep(1500);
		printMessage(textMessage);

	}

	public void FirstMsg2Dispaly() throws InterruptedException {
		Thread.sleep(1500);
		String textMessage1 = getTextMessage(getMessage2());
		Thread.sleep(1500);

		Thread.sleep(1500);
		printMessage(textMessage1);
		System.out.println("#################################");

	}

	public void AddCartClickMethod() {
		click(getCartClick());
	}

	public void addCardMsg() throws InterruptedException {

		Thread.sleep(1500);
		String textMessage3 = getTextMessage(getAddCartMsg());

		printMessage(textMessage3);

	}
	
	public void continueClick() throws InterruptedException {

		Thread.sleep(1500);
		click(getContinueBtn());

	}

	
}
