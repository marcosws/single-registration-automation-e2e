package com.github.marcosws.singleregistration.core;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.manager.SeleniumManager;
import org.openqa.selenium.manager.SeleniumManagerOutput.Result;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DriverFactory {
	
	private static Logger logger = LoggerFactory.getLogger(DriverFactory.class);
	private static ThreadLocal<WebDriver> threadDriver = new ThreadLocal<>();
	private static Result driverPath;

	public enum Browser{
		CHROME, FIREFOX, EDGE;
	}
	
	public static WebDriver getDriver() {
		WebDriver driver = threadDriver.get();
		logger.info("Get Driver : " + driver.toString());
		return driver;
	}
	
	public static void setDriver(Browser browser) {
		logger.info("Set Driver : " + browser.toString());
		WebDriver driver;
		switch(browser){
		
			case CHROME:
				ChromeOptions chromeOptions = new ChromeOptions();
				driver = new ChromeDriver(chromeOptions);
				driverPath = SeleniumManager.getInstance().getDriverPath(chromeOptions, false);
				threadDriver.set(driver);
				break;
			case FIREFOX:
				FirefoxOptions firefoxOptions = new FirefoxOptions();
				driver = new FirefoxDriver(firefoxOptions);
				driverPath = SeleniumManager.getInstance().getDriverPath(firefoxOptions, false);
				threadDriver.set(driver);
				break;
			case EDGE:
			default:
				EdgeOptions edgeOptions = new EdgeOptions();
				driver = new EdgeDriver(edgeOptions);
				driverPath = SeleniumManager.getInstance().getDriverPath(edgeOptions, false);
				threadDriver.set(driver);
				break;
		}
		logger.info("Path Driver : " + driverPath.getBrowserPath());
		
	}
	
	public static void closeDriver() {
		logger.info("Fechando aba se existir ... ");
		if(threadDriver.get().getWindowHandles().size() > 1) {
			threadDriver.get().close();
			logger.info(" - Fechada");
		}
	}
	
	public static void quitDriver() {
		logger.info("Finalizando Driver ...");
		threadDriver.get().quit();
		logger.info(" - OK");
	}

}
