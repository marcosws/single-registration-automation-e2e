package com.github.marcosws.singleregistration.hooks;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.github.marcosws.singleregistration.core.Context;
import com.github.marcosws.singleregistration.core.DriverFactory;
import com.github.marcosws.singleregistration.core.DriverFactory.Browser;
import com.github.marcosws.singleregistration.data.DataManager;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {
	
	private Logger logger = LoggerFactory.getLogger(Hooks.class);
	
	@Before
	public void beforeScenario(Scenario s) {
		logger.info(" ***** Before Scenario ****** ");
		List<String> listOfTags = new ArrayList<String>(s.getSourceTagNames());
		
		String testNameFeature = "";
		String testCaseNumber = "";
		String testDataSelect = "";
		
		try {
			logger.info("Verificando seleção de massa de dados");
			testNameFeature = listOfTags.get(1);
			testCaseNumber = listOfTags.get(2);
			testDataSelect = listOfTags.get(3);
			if(!testDataSelect.equalsIgnoreCase("@DataEmpty"))
				DataManager.loadData(testNameFeature, testCaseNumber);
		}
		catch(IndexOutOfBoundsException e) {
			System.err.println(e.getMessage());
			new AssertionError(e.getMessage());
		}
		
		try {
			logger.info("Verificando seleção do Browser");
			int index = 4;
			if(listOfTags.get(index).equalsIgnoreCase("@Firefox")) 
				DriverFactory.setDriver(Browser.FIREFOX);
			if(listOfTags.get(index).equalsIgnoreCase("@Edge")) 
				DriverFactory.setDriver(Browser.EDGE);
			if((listOfTags.get(index).equalsIgnoreCase("@BrowserPadrao") || listOfTags.get(index).equalsIgnoreCase("@Default")) || listOfTags.get(index).equalsIgnoreCase("@Chrome")) 
				DriverFactory.setDriver(Browser.CHROME);
			
		}
		catch(IndexOutOfBoundsException e) {
			System.err.println("Erro ao selecionar o Browser, Tags Aceitas: @BrowserPadrao (Chrome), @Default(Chrome), @Chrome, @Firefox, @Edge.\n - ERRO: " + e.getMessage());
			DriverFactory.setDriver(Browser.CHROME);
		}
		logger.info("Abrindo Browser ...");
		DriverFactory.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(7));
		DriverFactory.getDriver().manage().window().maximize();
		if(testNameFeature.equalsIgnoreCase("@CadastroUnico")) DriverFactory.getDriver().get(Context.APP_SINGLE_REGISTRATION);
		if(testNameFeature.equalsIgnoreCase("@TecladoVirtual")) DriverFactory.getDriver().get(Context.APP_VIRTUAL_KEY);
		logger.info(" ********************************* ");
	}
	
	@After
	public void afterScenario(Scenario s) {
		logger.info(" ***** After Scenario Finish ***** ");
		DriverFactory.closeDriver();
		DriverFactory.quitDriver();
		logger.info(" ********************************* ");
		
	}
	
}
