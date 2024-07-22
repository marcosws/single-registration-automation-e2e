package com.github.marcosws.singleregistration.hooks;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import com.github.marcosws.singleregistration.core.Context;
import com.github.marcosws.singleregistration.core.DataManager;
import com.github.marcosws.singleregistration.core.DriverFactory;
import com.github.marcosws.singleregistration.core.DriverFactory.Browser;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

	@Before
	public void beforeScenario(Scenario s) {
		
		List<String> listOfTags = new ArrayList<String>(s.getSourceTagNames());
		DataManager.loadData(listOfTags.get(1), listOfTags.get(2));
		
		DriverFactory.setDriver(Browser.CHROME);
		DriverFactory.getDriver().manage().window().maximize();
		System.out.println(Context.APP_SINGLE_REGISTRATION);
		DriverFactory.getDriver().get(Context.APP_SINGLE_REGISTRATION);
		DriverFactory.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		
	}
	
	@After
	public void afterScenario(Scenario s) {
		
		DriverFactory.quitDriver();
		
	}
	
}
