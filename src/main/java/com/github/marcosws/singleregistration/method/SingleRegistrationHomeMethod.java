package com.github.marcosws.singleregistration.method;

import org.junit.Assert;

import com.github.marcosws.singleregistration.core.BaseMethod;
import com.github.marcosws.singleregistration.core.Utils;
import com.github.marcosws.singleregistration.data.SingleRegistration;
import com.github.marcosws.singleregistration.data.enums.RegistrationType;
import com.github.marcosws.singleregistration.page.SingleRegistrationHomePage;

public class SingleRegistrationHomeMethod extends BaseMethod {
	
	SingleRegistrationHomePage singleRegistrationHomePage = new SingleRegistrationHomePage();
	SingleRegistration singleRegistration = SingleRegistration.getInstance();
 	
	public SingleRegistrationHomeMethod waitTitleSingleRegistration() {
		singleRegistrationHomePage.waitTitleSingleRegistration();
		return this;
	}
	
	public SingleRegistrationHomeMethod clickRegistrationTab() {
		singleRegistrationHomePage.clickRegistrationTab();
		return this;
	}
	
	public SingleRegistrationHomeMethod waitTitleCustomerRegistration() {
		singleRegistrationHomePage.waitCustomerRegistration();
		return this;
	}
	
	public SingleRegistrationHomeMethod selectRegistrationType() {
		
		if(singleRegistration.getRegistrationType().equals(RegistrationType.PHYSICAL_PERSON.toString())) {
			singleRegistrationHomePage.selectRegistrationTypePhysicalPerson();
		}
		else if(singleRegistration.getRegistrationType().equals(RegistrationType.LEGAL_PERSON.toString())) {
			singleRegistrationHomePage.selectRegistrationTypeLegalPerson();
		}
		return this;
		
	}
	
	public SingleRegistrationHomeMethod editName() {
		singleRegistrationHomePage.editName(singleRegistration.getName());
		return this;
	}
	
	public SingleRegistrationHomeMethod editCpf() {
		singleRegistrationHomePage.editCpf(singleRegistration.getCpf());
		return this;
	}
	
	public SingleRegistrationHomeMethod editFantasyName() {
		singleRegistrationHomePage.editFantasyName(singleRegistration.getFantasyName());
		return this;
	}
	
	public SingleRegistrationHomeMethod editCorporateName() {
		singleRegistrationHomePage.editCorporateName(singleRegistration.getCorporateName());
		return this;
	}
	
	public SingleRegistrationHomeMethod editCnpj() {
		singleRegistrationHomePage.editCnpj(singleRegistration.getCnpj());
		return this;
	}

	public SingleRegistrationHomeMethod editTelephone() {
		singleRegistrationHomePage.editTelephone(singleRegistration.getTelephone());
		return this;
	}
	
	public SingleRegistrationHomeMethod editCellPhone() {
		singleRegistrationHomePage.editCellPhone(singleRegistration.getCellPhone());
		return this;
	}
	
	public SingleRegistrationHomeMethod editEmail() {
		singleRegistrationHomePage.editEmail(singleRegistration.getEmail());
		return this;
	}
	
	public SingleRegistrationHomeMethod selectCustomerAuthorizesSendingOfInformationByEmail() {
		singleRegistrationHomePage.selectCustomerAuthorizesSendingOfInformationByEmail(Utils.stringToBoolean(singleRegistration.getCustomerAuthorizesSendingOfInformationByEmail()));
		return this;
	}
	
	public SingleRegistrationHomeMethod clickRegister() {
		singleRegistrationHomePage.clickRegister();
		return this;
	}
	public SingleRegistrationHomeMethod clickClean() {
		singleRegistrationHomePage.clickClean();
		return this;
	}
	
	public SingleRegistrationHomeMethod validateName() {
		String expected = singleRegistrationHomePage.getTextName();
		String actual = singleRegistration.getName();
		System.out.println(" - :[" + expected + "]:[" + actual + "]");
		//Assert.assertTrue(singleRegistrationHomePage.getTextName().contains(singleRegistration.getName()));
		return this;
	}
	
	public SingleRegistrationHomeMethod validateCpf() {
		String expected = Utils.removeMask(singleRegistrationHomePage.getTextCpf());
		String actual = singleRegistration.getCpf();
		System.out.println(" - :[" + expected + "]:[" + actual + "]");
		Assert.assertTrue(expected.contains(actual));
		return this;
	}
	
	public SingleRegistrationHomeMethod validateFantasyName() {
		String expected = singleRegistrationHomePage.getTextFantasyName();
		String actual = singleRegistration.getFantasyName();
		System.out.println(" - :[" + expected + "]:[" + actual + "]");
		Assert.assertTrue(expected.contains(actual));
		return this;
	}
	
	public SingleRegistrationHomeMethod validateCorporateName() {
		String expected = singleRegistrationHomePage.getTextCorporateName();
		String actual = singleRegistration.getCorporateName();
		System.out.println(" - :[" + expected + "]:[" + actual + "]");
		Assert.assertTrue(expected.contains(actual));
		return this;
	}
	
	public SingleRegistrationHomeMethod validateCnpj() {
		String expected = Utils.removeMask(singleRegistrationHomePage.getTextCnpj());
		String actual = singleRegistration.getCnpj();
		System.out.println(" - :[" + expected + "]:[" + actual + "]");
		Assert.assertTrue(expected.contains(actual));
		return this;
	}
	
	public SingleRegistrationHomeMethod validateTelephone() {
		String expected = Utils.removeMask(singleRegistrationHomePage.getTextTelephone());
		String actual = singleRegistration.getTelephone();
		System.out.println(" - :[" + expected + "]:[" + actual + "]");
		Assert.assertTrue(expected.contains(actual));
		return this;
	}
	
	public SingleRegistrationHomeMethod validateCellPhone() {
		String expected = Utils.removeMask(singleRegistrationHomePage.getTextCellPhone());
		String actual = singleRegistration.getCellPhone();
		System.out.println(" - :[" + expected + "]:[" + actual + "]");
		Assert.assertTrue(expected.contains(actual));
		return this;
	}
	
	public SingleRegistrationHomeMethod validateEmail() {
		String expected = singleRegistrationHomePage.getTextEmail();
		String actual = singleRegistration.getEmail();
		System.out.println(" - :[" + expected + "]:[" + actual + "]");
		Assert.assertTrue(expected.contains(actual));
		return this;
	}
	
	public SingleRegistrationHomeMethod validateCustomerAuthorizesSendingOfInformationByEmail() {
		String expected = singleRegistrationHomePage.getTextCustomerAuthorizesSendingOfInformationByEmail();
		String actual = singleRegistration.getCustomerAuthorizesSendingOfInformationByEmail();
		System.out.println(" - :[" + expected + "]:[" + actual + "]");
		Assert.assertTrue(expected.contains(actual));
		return this;
	}
	
	public SingleRegistrationHomeMethod validateMessageBoxNameRequired() {
		String expected = "Pendências no cadastro:  - Nome é obrigatório!";
		String actual = singleRegistrationHomePage.getTextMessageBox().replace("\n", "");
		System.out.println(" - :[" + expected + "]:[" + actual + "]");
		Assert.assertEquals(expected, actual);
		return this;
	}
	public SingleRegistrationHomeMethod validateMessageBoxCpfRequired() {
		String expected = "Pendências no cadastro:  - CPF é obrigatório!";
		String actual = singleRegistrationHomePage.getTextMessageBox().replace("\n", "");
		System.out.println(" - :[" + expected + "]:[" + actual + "]");
		Assert.assertEquals(expected, actual);
		return this;
	}
	public SingleRegistrationHomeMethod validateMessageBoxInvalidCPF() {
		String expected = "Pendências no cadastro:  - CPF Inválido!";
		String actual = singleRegistrationHomePage.getTextMessageBox().replace("\n", "");
		System.out.println(" - :[" + expected + "]:[" + actual + "]");
		Assert.assertEquals(expected, actual);
		return this;
	}
	public SingleRegistrationHomeMethod validateMessageBoxFantasyNameIsRequired() {
		String expected = "Pendências no cadastro:  - Nome Fantasia é obrigatório!";
		String actual = singleRegistrationHomePage.getTextMessageBox().replace("\n", "");
		System.out.println(" - :[" + expected + "]:[" + actual + "]");
		Assert.assertEquals(expected, actual);
		return this;
	}
	public SingleRegistrationHomeMethod validateMessageBoxCorporateNameIsRequired() {
		String expected = "Pendências no cadastro:  - Razão Social é obrigatória!";
		String actual = singleRegistrationHomePage.getTextMessageBox().replace("\n", "");
		System.out.println(" - :[" + expected + "]:[" + actual + "]");
		Assert.assertEquals(expected, actual);
		return this;
	}
	public SingleRegistrationHomeMethod validateMessageBoxCNPJIsRequired() {
		String expected = "Pendências no cadastro:  - CNPJ é obrigatório!";
		String actual = singleRegistrationHomePage.getTextMessageBox().replace("\n", "");
		System.out.println(" - :[" + expected + "]:[" + actual + "]");
		Assert.assertEquals(expected, actual);
		return this;
	}
	public SingleRegistrationHomeMethod validateMessageBoxInvalidCNPJ() {
		String expected = "Pendências no cadastro:  - CNPJ inválido!";
		String actual = singleRegistrationHomePage.getTextMessageBox().replace("\n", "");
		System.out.println(" - :[" + expected + "]:[" + actual + "]");
		Assert.assertEquals(expected, actual);
		return this;
	}
	public SingleRegistrationHomeMethod validateMessageBoxPhoneFormatIsInvalid() {
		String expected = "Pendências no cadastro:  - Formato de telefone é inválido!";
		String actual = singleRegistrationHomePage.getTextMessageBox().replace("\n", "");
		System.out.println(" - :[" + expected + "]:[" + actual + "]");
		Assert.assertEquals(expected, actual);
		return this;
	}
	public SingleRegistrationHomeMethod validateMessageBoxCellPhoneFormatIsInvalid() {
		String expected = "Pendências no cadastro:  - Formato de celular é inválido!";
		String actual = singleRegistrationHomePage.getTextMessageBox().replace("\n", "");
		System.out.println(" - :[" + expected + "]:[" + actual + "]");
		Assert.assertEquals(expected, actual);
		return this;
	}
	public SingleRegistrationHomeMethod validateMessageBoxEmailFormatIsInvalid() {
		String expected = "Pendências no cadastro:  - Formato de e-mail é inválido!";
		String actual = singleRegistrationHomePage.getTextMessageBox().replace("\n", "");
		System.out.println(" - :[" + expected + "]:[" + actual + "]");
		Assert.assertEquals(expected, actual);
		return this;
	}
	public SingleRegistrationHomeMethod validateMessageBoxAtLeastOneFormOfContactIsRequired() {
		String expected = "Pendências no cadastro:  - É obrigatório pelo menos uma forma de contato! (Telefone, Celular ou E-mail)";
		String actual = singleRegistrationHomePage.getTextMessageBox().replace("\n", "");
		System.out.println(" - :[" + expected + "]:[" + actual + "]");
		Assert.assertEquals(expected, actual);
		return this;
	}
	
}
