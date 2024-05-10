package com.object;

import com.pages.FirstPage;
import com.pages.LoginPage;

public class ObjectManager {

	private FirstPage firstPage;
	private LoginPage loginPage;

	public FirstPage getFirstPage() {

		return (firstPage == null) ? firstPage = new FirstPage() : firstPage;

	}

	public LoginPage getLoginPage() {

		return (loginPage == null) ? loginPage = new LoginPage() : loginPage;

	}
}