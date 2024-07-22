package com.github.marcosws.singleregistration.core;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	private WebDriver driver;
	public BasePage(WebDriver driver) {
		this.driver = driver;
	}
	
	protected void executeJavaScript(String script, WebElement webElement, String arguments) {
		 JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
		 javascriptExecutor.executeScript(script, webElement, arguments);
	}
	
	protected void executeJavaScript(String script, WebElement webElement) {
		 JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
		 javascriptExecutor.executeScript(script, webElement);
	}
	protected void highLight(WebElement webElement) {
    	
		String script = "arguments[0].setAttribute('style', arguments[1]);";
		String arguments = "color: white; border: 2px solid rgb(109,254,48); text-shadow: 1px 1px rgb(48,156,1);";
		for (int i = 0; i < 3; i++) {
			this.executeJavaScript(script, webElement, arguments);
			this.sleep(150);
			this.executeJavaScript(script, webElement);
			this.sleep(150);           
		}
	
    }
	
	protected void clickElement(WebElement element) {
		try {
			this.highLight(element);
			element.click();
		}
		catch(NoSuchElementException e) {
			System.err.println("Elemento não encontrado");
			e.printStackTrace();
		}
		catch(ElementNotInteractableException e) {
			System.err.println("Elemento não é clicavel (Verifique se o elemento não está oculto)");
			e.printStackTrace();
		}
		catch(Exception e) {
			System.err.println("Não foi possivel clicar no elemento");
			e.printStackTrace();
		}
	}
	
	protected void clickElementViaJS(WebElement element) {
		this.highLight(element);
		this.executeJavaScript("arguments[0].click();", element);
	}
	
	protected String getTextElement(WebElement element) {
		try {
			this.highLight(element);
			return element.getText();
		}
		catch(NoSuchElementException e) {
			System.err.println("Elemento não encontrado");
			e.printStackTrace();
		}
		catch(Exception e) {
			System.err.println("Não foi possivel recuperar o texto no elemento");
			e.printStackTrace();
		}
		return "";
	}
	
	protected void editElement(WebElement element, String text) {
		try {
			this.highLight(element);
			element.sendKeys(text);
		}		
		catch(NoSuchElementException e) {
			System.err.println("Elemento não encontrado");
			e.printStackTrace();
		}
		catch(ElementNotInteractableException e) {
			System.err.println("Elemento não é editavel (Verifique se o elemento não está oculto)");
			e.printStackTrace();
		}
		catch(Exception e) {
			System.err.println("Não foi possivel editar/digitar texto no elemento");
			e.printStackTrace();
		}
	}
	
	protected boolean waitShowElement(WebElement element, int tempoSegundos) {
		
		int segundos = 0;
		boolean visivel = false;
		do {
			segundos++;
			sleep(1000);
			if(segundos > tempoSegundos) break;
			try {
				visivel = element.isDisplayed();
			}
			catch(StaleElementReferenceException e) {}
		}
		while(!visivel);
		return visivel;
		
	}
	protected boolean waitHideElement(WebElement element, int tempoSegundos) {
		
		int segundos = 0;
		boolean visivel = false;
		waitShowElement(element, 5);
		do {
			segundos++;
			sleep(1000);
			if(segundos > tempoSegundos) break;
			try {
				visivel = element.isDisplayed();
			}
			catch(StaleElementReferenceException e) {}
		}
		while(visivel);
		return !visivel;
		
	}
	
	protected void sleep(long millis) {
		try {
			Thread.sleep(millis);
		} 
		catch (InterruptedException e) {}
	}
	
	public boolean waitLoadPage() {
		
		return new WebDriverWait(driver, Duration.ofSeconds(30L)).until(input ->{
			boolean resultado = false;
			String status = "";
			try {
				JavascriptExecutor js = (JavascriptExecutor) driver;
				status = js.executeScript("return document.readyState;").toString();
				resultado = status.equals("complete");
			}
			catch(Exception ignore) {}
			return resultado;
		});
		
	}
	
}
