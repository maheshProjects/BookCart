package com.step;

import java.io.IOException;

import com.base.BaseClassBook;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class TC_HookClass extends BaseClassBook {

	@Before
	public void beforeScenario() {
		System.out.println("Automation Started");
		System.out.println(" Started");
	}

	@After
	public void afterScenario() throws IOException, InterruptedException {

		System.out.println(" Scenario Complete");
		Thread.sleep(1500);
		screenShot();
		Thread.sleep(1500);
		quiteWindow();

		System.out.println(" Scenario Complete");
	}
}
