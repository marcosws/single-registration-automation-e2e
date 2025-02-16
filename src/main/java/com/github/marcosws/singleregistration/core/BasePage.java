package com.github.marcosws.singleregistration.core;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	
	/*
	 *	((JavascriptExecutor) DriverFactory.getDriver()).executeScript("window.open()");
		ArrayList<String> tabs = new ArrayList<String>(DriverFactory.getDriver().getWindowHandles());
		DriverFactory.getDriver().switchTo().window(tabs.get(1));
		DriverFactory.getDriver().get("https://www.google.com");
		DriverFactory.getDriver().switchTo().window(tabs.get(0));
		System.out.println("H: " + DriverFactory.getDriver().getWindowHandles().size());
	 */
	

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
	
	public void executeJavaScript(String script) {
		 JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
		 javascriptExecutor.executeScript(script);
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
	
	protected String getTextElementFromAttribute(WebElement element, String attribute) {
		try {
			this.highLight(element);
			return element.getAttribute(attribute);
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
	
	public boolean waitPageLoad() {
		
		return new WebDriverWait(driver, Duration.ofSeconds(60L)).until(input ->{
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
	
	protected By getByFromElement(WebElement element) {
		
		By by = null;    
		String elementStr = element.toString().split("->")[1];
		elementStr = elementStr.substring(0, elementStr.length() - 1);
		String selector = elementStr.split(":")[0].trim();
		String value = elementStr.split(":")[1].trim();
		
		if(selector.equals("id"))
			by = By.id(value);
		else if(selector.equals("className"))
			by = By.className(value);
		else if(selector.equals("tagName"))
			by = By.tagName(value);
		else if(selector.equals("xpath"))
			by = By.xpath(value);
		else if(selector.equals("cssSelector"))
			by = By.cssSelector(value);
		else if(selector.equals("linkText"))
			by = By.linkText(value);
		else if(selector.equals("name"))
			by = By.name(value);
		else if(selector.equals("partialLinkText"))
			by = By.partialLinkText(value);
		else
			throw new IllegalStateException("locator : " + selector + " not found!!!");
		
		return by;
		
	}
	
	protected String dialogBox(boolean confirm, String inputText){
		String textDialogBox = "";
		try {
			driver.switchTo().alert().sendKeys(inputText);
			textDialogBox = driver.switchTo().alert().getText();
			sleep(3000);
			if(confirm){
				driver.switchTo().alert().accept();
			}
			else{
				driver.switchTo().alert().dismiss();
			}
		}
		catch(Exception e) {
			return "";
		}
		return textDialogBox;
	}
	protected String dialogBox(boolean confirm){
		String textDialogBox = "";
		try {
			new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.alertIsPresent());
			textDialogBox = driver.switchTo().alert().getText();
			sleep(3000);
			if(confirm){
				driver.switchTo().alert().accept();
			}
			else{
				driver.switchTo().alert().dismiss();
			}
		}
		catch(Exception e) {
			return "";
		}
		return textDialogBox;
	}
	
	 public void scrollDownToElement(WebElement element) {
	    	
	    	int yLocation = element.getLocation().getY();
	    	int heightScreen = driver.manage().window().getSize().getHeight();
	    	int heightFinal = Math.abs((heightScreen / 3) - yLocation);
	    	scrollDown(heightFinal);
	    	highLight(element);
	  
	    }
	    
	    public void scrollUpToElement(WebElement element) {
	    	
	    	int yLocation = element.getLocation().getY();
	    	executeJavaScript("window.scrollTo(0," + yLocation + ");");
	    	scrollUp(yLocation);
	    	highLight(element);
	  
	    }
	    public void scrollDown() {
	    	executeJavaScript("window.scrollTo(0, document.documentElement.scrollHeight); ");
	    }
	    public void scrollDown(int y) {
	    	executeJavaScript("window.scrollTo(0, window.scrollY + " + y + ");");
	    }
	    public void scrollUp() {
	    	executeJavaScript("window.scrollTo(0, 0);");
	    }
	    public void scrollUp(int y) {
	    	executeJavaScript("window.scrollTo(0, window.scrollY - " + y + ");");
	    }
	    
	    public boolean waitElementVisibilityOf(WebElement element, int seconds) {
	    	return new WebDriverWait(driver, Duration.ofSeconds(seconds)).until(ExpectedConditions.visibilityOf(element)) != null;
	    }
	    
	    public boolean waitElementToBeClickable(WebElement element, int seconds) {
	    	return new WebDriverWait(driver, Duration.ofSeconds(seconds)).until(ExpectedConditions.elementToBeClickable(element)) != null;
	    }
	    
	
}
