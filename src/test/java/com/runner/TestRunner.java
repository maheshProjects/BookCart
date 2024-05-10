package com.runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags = "@Run",dryRun=false, features = { "src/test/resources/Features" }, glue = { "com.step" },

		plugin = { "pretty", "html:target/htmlreport.html" })
public class TestRunner extends AbstractTestNGCucumberTests {

}

