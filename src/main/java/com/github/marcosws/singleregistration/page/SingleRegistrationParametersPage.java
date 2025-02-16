package com.github.marcosws.singleregistration.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.github.marcosws.singleregistration.core.BasePage;
import com.github.marcosws.singleregistration.core.DriverFactory;

public class SingleRegistrationParametersPage extends BasePage {
	
	public SingleRegistrationParametersPage() {
		super(DriverFactory.getDriver());
		PageFactory.initElements(DriverFactory.getDriver(), this);
	}
	
	@FindBy(id="aba2")
	private WebElement parametersTab;

	@FindBy(xpath = "//label[contains(text(),'Apresentar caixa de dialogo')]")
	private WebElement displayDialogBox;
	
	@FindBy(xpath = "//label[contains(text(),'Apresentar label informativa')]")
	private WebElement displayInformativeLabel;
	
	@FindBy(xpath = "//label[contains(text(),'Apresentar mensagem de confirmação de Cadastro')]")
	private WebElement displaysRegistrationConfirmationMessage;
	
	@FindBy(xpath = "//label[contains(text(),'Apresentar mensagem de confirmação antes de limpar o campos)]")
	private WebElement displaysConfirmationMessageBeforeClearingFields;
	
	public void clickRegistrationTab() {
		this.clickElement(parametersTab);
	}
	
	public void clickDisplayDialogBox() {
		this.clickElement(displayDialogBox);
	}
	
	public void clickDisplayInformativeLabel() {
		this.clickElement(displayInformativeLabel);
	}
	
	public void clickDisplaysRegistrationConfirmationMessage() {
		this.clickElement(displaysRegistrationConfirmationMessage);
	}
	
	public void clickDisplaysConfirmationMessageBeforeClearingFields() {
		this.clickElement(displaysConfirmationMessageBeforeClearingFields);
	}

}
