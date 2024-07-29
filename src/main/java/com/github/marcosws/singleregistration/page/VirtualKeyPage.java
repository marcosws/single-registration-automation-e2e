package com.github.marcosws.singleregistration.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.github.marcosws.singleregistration.core.BasePage;
import com.github.marcosws.singleregistration.core.DriverFactory;

public class VirtualKeyPage extends BasePage {
	
	public VirtualKeyPage() {
		super(DriverFactory.getDriver());
		PageFactory.initElements(DriverFactory.getDriver(), this);
	}
	
	
	@FindBy(xpath="//h1[contains(text(),'Teclado Virtual')]")
	private WebElement h1TitleVirtualKey;
	
	@FindBy(id="gerar-senha")
	private WebElement buttonGeneratePassword;
	
	@FindBy(id="result-senha")
	private WebElement inputTextPassword;
	
	@FindBy(id="btn1")
	private WebElement buttonKeyOne;
	
	@FindBy(id="btn2")
	private WebElement buttonKeyTwo;
	
	@FindBy(id="btn3")
	private WebElement buttonKeyThree;
	
	@FindBy(id="btn4")
	private WebElement buttonKeyFour;
	
	@FindBy(id="btn5")
	private WebElement buttonKeyFive;
	
	@FindBy(id="btn-entrar")
	private WebElement buttonKeyEnter;
	
	public void waitH1TitleVirtualKey() {
		this.waitPageLoad();
		this.waitShowElement(h1TitleVirtualKey, 15);
	}
	
	public void clickButtonGeneratePassword() {
		this.clickElement(buttonGeneratePassword);
	}
	
	public String getTextInputTextPassword() {
		return this.getTextElementFromAttribute(inputTextPassword, "value");
	}
	
	public String getTextButtonKeyOne() {
		return this.getTextElementFromAttribute(buttonKeyOne, "value");
	}
	
	public String getTextButtonKeyTwo() {
		return this.getTextElementFromAttribute(buttonKeyTwo, "value");
	}
	
	public String getTextButtonKeyThree() {
		return this.getTextElementFromAttribute(buttonKeyThree, "value");
	}
	
	public String getTextButtonKeyFour() {
		return this.getTextElementFromAttribute(buttonKeyFour, "value");
	}
	
	public String getTextButtonKeyFive() {
		return this.getTextElementFromAttribute(buttonKeyFive, "value");
	}
	
	public void clickButtonKeyOne() {
		this.clickElement(buttonKeyOne);
	}
	
	public void clickButtonKeyTwo() {
		this.clickElement(buttonKeyTwo);
	}
	
	public void clickButtonKeyThree() {
		this.clickElement(buttonKeyThree);
	}
	
	public void clickButtonKeyFour() {
		this.clickElement(buttonKeyFour);
	}
	
	public void clickButtonKeyFive() {
		this.clickElement(buttonKeyFive);
	}
	
	public void clickButtonKeyEnter() {
		this.clickElement(buttonKeyEnter);
	}
	
	public String getTextMessageBox() {
		return this.dialogBox(true);
	}

}
