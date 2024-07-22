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
	private WebElement singleRegistration;
	
	@FindBy(id="aba1")
	private WebElement registrationTab;
	
	@FindBy(xpath="//h2[contains(text(),'Cadastro de Cliente')]")
	private WebElement customerRegistration;
	
	@FindBy(id="radio1")
	private WebElement registrationTypePhysicalPerson;
	
	@FindBy(id="radio2")
	private WebElement registrationTypeLegalPerson;
	
	@FindBy(id="nome")
	private WebElement name;
	
	@FindBy(id="nome-fantasia")
	private WebElement fantasyName;
	
	@FindBy(id="razao-social")
	private WebElement corporateName;
	
	@FindBy(id="razao-social")
	private WebElement cnpj;
	
	@FindBy(id="cpf")
	private WebElement cpf;
	
	@FindBy(id="telefone")
	private WebElement telephone;
	
	@FindBy(id="celular")
	private WebElement cellPhone;
	
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(id="autorizacao")
	private WebElement customerAuthorizesSendingOfInformationByEmail;
	
	@FindBy(id="cadastrar")
	private WebElement register;
	
	@FindBy(id="limpar")
	private WebElement clean;
	
	public void waitTitleSingleRegistration() {
		this.waitLoadPage();
		this.waitShowElement(singleRegistration, 10);
	}
	
	public void clickRegistrationTab() {
		this.clickElement(registrationTab);
	}
	
	public void waitCustomerRegistration() {
		this.waitShowElement(customerRegistration, 5);
	}
	
	public void selectRegistrationTypePhysicalPerson() {
		this.clickElement(registrationTypePhysicalPerson);
	}
	
	public void selectRegistrationTypeLegalPerson() {
		this.clickElement(registrationTypeLegalPerson);
	}
	
	public void editName(String text) {
		this.editElement(name, text);
	}
	
	public void editFantasyName(String text) {
		this.editElement(fantasyName, text);
	}
	
	public void editCorporateName(String text) {
		this.editElement(corporateName, text);
	}
	
	public void editCnpj(String text) {
		this.editElement(cnpj, text);
	}
	
	public void editCpf(String text) {
		this.editElement(cpf, text);
	}
	
	public void editTelephone(String text) {
		this.editElement(telephone, text);
	}
	
	public void editCellPhone(String text) {
		this.editElement(cellPhone, text);
	}
	
	public void editEmail(String text) {
		this.editElement(email, text);
	}
	
	public void selectCustomerAuthorizesSendingOfInformationByEmail(Boolean check) {
		if(check)
			this.clickElementViaJS(customerAuthorizesSendingOfInformationByEmail);
	}
	
	public void clickRegister() {
		this.clickElement(register);
	}
	
	public void clickClean() {
		this.clickElement(clean);
	}

}
