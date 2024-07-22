package com.github.marcosws.singleregistration.suite;

import com.github.marcosws.singleregistration.suite.testng.TestNGCucumberTests;

import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		plugin = { 
				"pretty", 
				"html:target/cucumber.html", 
				"json:target/cucumber.json" }, 
		features = {
				"src/main/resources/features/" }, 
		glue = { 
				"com.github.marcosws.singleregistration.steps",
				"com.github.marcosws.singleregistration.hooks" }, 
		tags = "@Global")
public class TestSuite extends TestNGCucumberTests {

}
