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

public class DriverFactory {
	
	private static WebDriver driver;
	private static Result driverPath;
	
	public enum Browser{
		CHROME, FIREFOX, EDGE;
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
	
	public static void setDriver(Browser browser) {
		
		switch(browser){
		
			case CHROME:
				ChromeOptions chromeOptions = new ChromeOptions();
				driver = new ChromeDriver(chromeOptions);
				driverPath = SeleniumManager.getInstance().getDriverPath(chromeOptions, false);
				break;
			case FIREFOX:
				FirefoxOptions firefoxOptions = new FirefoxOptions();
				driver = new FirefoxDriver(firefoxOptions);
				driverPath = SeleniumManager.getInstance().getDriverPath(firefoxOptions, false);
				break;
			case EDGE:
			default:
				EdgeOptions edgeOptions = new EdgeOptions();
				driver = new EdgeDriver(edgeOptions);
				driverPath = SeleniumManager.getInstance().getDriverPath(edgeOptions, false);
				break;
		}
		System.out.println(driverPath.getBrowserPath());
		
	}
	
	public static void closeDriver() {
		System.out.println("close driver ...");
		driver.close();
	}
	
	public static void quitDriver() {
		System.out.println("quit driver ...");
		driver.quit();
	}

}
