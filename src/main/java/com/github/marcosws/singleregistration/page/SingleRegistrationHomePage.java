package com.github.marcosws.singleregistration.page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.github.marcosws.singleregistration.core.BasePage;
import com.github.marcosws.singleregistration.core.DriverFactory;

public class SingleRegistrationHomePage extends BasePage {
	
	
	public SingleRegistrationHomePage() {
		super(DriverFactory.getDriver());
		PageFactory.initElements(DriverFactory.getDriver(), this);
	}

	@FindBy(xpath="//h1[contains(text(),'Cadastro Único')]")
	private WebElement h1SingleRegistration;
	
	@FindBy(id="aba1")
	private WebElement registrationTab;
	
	@FindBy(xpath="//h2[contains(text(),'Cadastro de Cliente')]")
	private WebElement h2CustomerRegistration;
	
	@FindBy(id="radio1")
	private WebElement radioRegistrationTypePhysicalPerson;
	
	@FindBy(id="radio2")
	private WebElement radioRegistrationTypeLegalPerson;
	
	@FindBy(id="nome")
	private WebElement inputTextName;
	
	@FindBy(id="nome-fantasia")
	private WebElement inputTextFantasyName;
	
	@FindBy(id="razao-social")
	private WebElement inputTextCorporateName;
	
	@FindBy(id="razao-social")
	private WebElement inputTextCnpj;
	
	@FindBy(id="cpf")
	private WebElement inputTextCpf;
	
	@FindBy(id="telefone")
	private WebElement inputTextTelephone;
	
	@FindBy(id="celular")
	private WebElement inputTextCellPhone;
	
	@FindBy(id="email")
	private WebElement inputTextEmail;
	
	@FindBy(id="autorizacao")
	private WebElement inputCheckboxcustomerAuthorizesSendingOfInformationByEmail;
	
	@FindBy(id="cadastrar")
	private WebElement buttonRegister;
	
	@FindBy(id="limpar")
	private WebElement buttonClean;
	
	@FindBy(id="label-nome")
	private WebElement labelName;
	
	@FindBy(id="label-cpf")
	private WebElement labelCpf;
	
	@FindBy(id="label-nome-fantasia")
	private WebElement labelFantasyName;
	
	@FindBy(id="label-razao-social")
	private WebElement labelCorporateName;
	
	@FindBy(id="label-cnpj")
	private WebElement labelCnpj;
	
	@FindBy(id="label-telefone")
	private WebElement labelTelephone;
	
	@FindBy(id="label-celular")
	private WebElement labelCellPhone;
	
	@FindBy(id="label-email")
	private WebElement labelEmail;
	
	@FindBy(id="label-autorizacao")
	private WebElement labelCustomerAuthorizesSendingOfInformationByEmail;
	
	public void waitTitleSingleRegistration() {
		this.waitPageLoad();
		this.waitShowElement(h1SingleRegistration, 10);
	}
	
	public void clickRegistrationTab() {
		this.clickElement(registrationTab);
	}
	
	public void waitCustomerRegistration() {
		this.waitShowElement(h2CustomerRegistration, 5);
	}
	
	public void selectRegistrationTypePhysicalPerson() {
		this.clickElement(radioRegistrationTypePhysicalPerson);
	}
	
	public void selectRegistrationTypeLegalPerson() {
		this.clickElement(radioRegistrationTypeLegalPerson);
	}
	
	public void editName(String text) {
		this.editElement(inputTextName, text);
	}
	
	public void editFantasyName(String text) {
		this.editElement(inputTextFantasyName, text);
	}
	
	public void editCorporateName(String text) {
		this.editElement(inputTextCorporateName, text);
	}
	
	public void editCnpj(String text) {
		this.editElement(inputTextCnpj, text);
	}
	
	public void editCpf(String text) {
		this.editElement(inputTextCpf, text);
	}
	
	public void editTelephone(String text) {
		this.editElement(inputTextTelephone, text);
	}
	
	public void editCellPhone(String text) {
		this.editElement(inputTextCellPhone, text);
	}
	
	public void editEmail(String text) {
		this.editElement(inputTextEmail, text);
	}
	
	public void selectCustomerAuthorizesSendingOfInformationByEmail(Boolean check) {
		if(check)
			this.clickElementViaJS(inputCheckboxcustomerAuthorizesSendingOfInformationByEmail);
	}
	
	public void clickRegister() {
		this.clickElement(buttonRegister);
	}
	
	public void clickClean() {
		this.clickElement(buttonClean);
	}
	
	public String getTextName() {
		return this.getTextElement(labelName);
	}
	
	public String getTextCpf() {
		return this.getTextElement(labelCpf);
	}
	
	public String getTextFantasyName() {
		return this.getTextElement(labelFantasyName);
	}
	
	public String getTextCorporateName() {
		return this.getTextElement(labelCorporateName);
	}
	
	public String getTextCnpj() {
		return this.getTextElement(labelCnpj);
	}
	
	public String getTextTelephone() {
		return this.getTextElement(labelTelephone);
	}
	
	public String getTextCellPhone() {
		return this.getTextElement(labelCellPhone);
	}
	
	public String getTextEmail() {
		return this.getTextElement(labelEmail);
	}
	
	public String getTextCustomerAuthorizesSendingOfInformationByEmail() {
		return this.getTextElement(labelCustomerAuthorizesSendingOfInformationByEmail);
	}
	
	public String getTextMessageBox() {
		return this.dialogBox(true);
	}
	

}
