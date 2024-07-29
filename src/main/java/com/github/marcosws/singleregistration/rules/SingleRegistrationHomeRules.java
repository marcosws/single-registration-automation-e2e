package com.github.marcosws.singleregistration.rules;

import org.junit.Assert;

import com.github.marcosws.singleregistration.core.BaseRules;
import com.github.marcosws.singleregistration.core.Utils;
import com.github.marcosws.singleregistration.data.SingleRegistration;
import com.github.marcosws.singleregistration.data.SingleRegistrationSingleton;
import com.github.marcosws.singleregistration.data.enums.RegistrationType;
import com.github.marcosws.singleregistration.page.SingleRegistrationHomePage;

public class SingleRegistrationHomeRules extends BaseRules {
	
	SingleRegistrationHomePage singleRegistrationHomePage = new SingleRegistrationHomePage();
	SingleRegistration singleRegistration = SingleRegistrationSingleton.getInstance();
 	
	public SingleRegistrationHomeRules waitTitleSingleRegistration() {
		singleRegistrationHomePage.waitTitleSingleRegistration();
		return this;
	}
	
	public SingleRegistrationHomeRules clickRegistrationTab() {
		singleRegistrationHomePage.clickRegistrationTab();
		return this;
	}
	
	public SingleRegistrationHomeRules waitTitleCustomerRegistration() {
		singleRegistrationHomePage.waitCustomerRegistration();
		return this;
	}
	
	public SingleRegistrationHomeRules selectRegistrationType() {
		
		if(singleRegistration.getRegistrationType().equals(RegistrationType.PHYSICAL_PERSON.toString())) {
			singleRegistrationHomePage.selectRegistrationTypePhysicalPerson();
		}
		else if(singleRegistration.getRegistrationType().equals(RegistrationType.LEGAL_PERSON.toString())) {
			singleRegistrationHomePage.selectRegistrationTypeLegalPerson();
		}
		return this;
		
	}
	
	public SingleRegistrationHomeRules editName() {
		singleRegistrationHomePage.editName(singleRegistration.getName());
		return this;
	}
	
	public SingleRegistrationHomeRules editCpf() {
		singleRegistrationHomePage.editCpf(singleRegistration.getCpf());
		return this;
	}
	
	public SingleRegistrationHomeRules editFantasyName() {
		singleRegistrationHomePage.editFantasyName(singleRegistration.getFantasyName());
		return this;
	}
	
	public SingleRegistrationHomeRules editCorporateName() {
		singleRegistrationHomePage.editCorporateName(singleRegistration.getCorporateName());
		return this;
	}
	
	public SingleRegistrationHomeRules editCnpj() {
		singleRegistrationHomePage.editCnpj(singleRegistration.getCnpj());
		return this;
	}

	public SingleRegistrationHomeRules editTelephone() {
		singleRegistrationHomePage.editTelephone(singleRegistration.getTelephone());
		return this;
	}
	
	public SingleRegistrationHomeRules editCellPhone() {
		singleRegistrationHomePage.editCellPhone(singleRegistration.getCellPhone());
		return this;
	}
	
	public SingleRegistrationHomeRules editEmail() {
		singleRegistrationHomePage.editEmail(singleRegistration.getEmail());
		return this;
	}
	
	public SingleRegistrationHomeRules selectCustomerAuthorizesSendingOfInformationByEmail() {
		singleRegistrationHomePage.selectCustomerAuthorizesSendingOfInformationByEmail(Utils.stringToBoolean(singleRegistration.getCustomerAuthorizesSendingOfInformationByEmail()));
		return this;
	}
	
	public SingleRegistrationHomeRules clickRegister() {
		singleRegistrationHomePage.clickRegister();
		return this;
	}
	public SingleRegistrationHomeRules clickClean() {
		singleRegistrationHomePage.clickClean();
		return this;
	}
	
	public SingleRegistrationHomeRules validateName() {
		String expected = singleRegistrationHomePage.getTextName();
		String actual = singleRegistration.getName();
		System.out.println(" - :[" + expected + "]:[" + actual + "]");
		//Assert.assertTrue(singleRegistrationHomePage.getTextName().contains(singleRegistration.getName()));
		return this;
	}
	
	public SingleRegistrationHomeRules validateCpf() {
		String expected = Utils.removeMask(singleRegistrationHomePage.getTextCpf());
		String actual = singleRegistration.getCpf();
		System.out.println(" - :[" + expected + "]:[" + actual + "]");
		Assert.assertTrue(expected.contains(actual));
		return this;
	}
	
	public SingleRegistrationHomeRules validateFantasyName() {
		String expected = singleRegistrationHomePage.getTextFantasyName();
		String actual = singleRegistration.getFantasyName();
		System.out.println(" - :[" + expected + "]:[" + actual + "]");
		Assert.assertTrue(expected.contains(actual));
		return this;
	}
	
	public SingleRegistrationHomeRules validateCorporateName() {
		String expected = singleRegistrationHomePage.getTextCorporateName();
		String actual = singleRegistration.getCorporateName();
		System.out.println(" - :[" + expected + "]:[" + actual + "]");
		Assert.assertTrue(expected.contains(actual));
		return this;
	}
	
	public SingleRegistrationHomeRules validateCnpj() {
		String expected = Utils.removeMask(singleRegistrationHomePage.getTextCnpj());
		String actual = singleRegistration.getCnpj();
		System.out.println(" - :[" + expected + "]:[" + actual + "]");
		Assert.assertTrue(expected.contains(actual));
		return this;
	}
	
	public SingleRegistrationHomeRules validateTelephone() {
		String expected = Utils.removeMask(singleRegistrationHomePage.getTextTelephone());
		String actual = singleRegistration.getTelephone();
		System.out.println(" - :[" + expected + "]:[" + actual + "]");
		Assert.assertTrue(expected.contains(actual));
		return this;
	}
	
	public SingleRegistrationHomeRules validateCellPhone() {
		String expected = Utils.removeMask(singleRegistrationHomePage.getTextCellPhone());
		String actual = singleRegistration.getCellPhone();
		System.out.println(" - :[" + expected + "]:[" + actual + "]");
		Assert.assertTrue(expected.contains(actual));
		return this;
	}
	
	public SingleRegistrationHomeRules validateEmail() {
		String expected = singleRegistrationHomePage.getTextEmail();
		String actual = singleRegistration.getEmail();
		System.out.println(" - :[" + expected + "]:[" + actual + "]");
		Assert.assertTrue(expected.contains(actual));
		return this;
	}
	
	public SingleRegistrationHomeRules validateCustomerAuthorizesSendingOfInformationByEmail() {
		String expected = singleRegistrationHomePage.getTextCustomerAuthorizesSendingOfInformationByEmail();
		String actual = singleRegistration.getCustomerAuthorizesSendingOfInformationByEmail();
		System.out.println(" - :[" + expected + "]:[" + actual + "]");
		Assert.assertTrue(expected.contains(actual));
		return this;
	}
	
	public SingleRegistrationHomeRules validateMessageBoxNameRequired() {
		String expected = "Pendências no cadastro:  - Nome é obrigatório!";
		String actual = singleRegistrationHomePage.getTextMessageBox().replace("\n", "");
		System.out.println(" - :[" + expected + "]:[" + actual + "]");
		Assert.assertEquals(expected, actual);
		return this;
	}
	public SingleRegistrationHomeRules validateMessageBoxCpfRequired() {
		String expected = "Pendências no cadastro:  - CPF é obrigatório!";
		String actual = singleRegistrationHomePage.getTextMessageBox().replace("\n", "");
		System.out.println(" - :[" + expected + "]:[" + actual + "]");
		Assert.assertEquals(expected, actual);
		return this;
	}
	public SingleRegistrationHomeRules validateMessageBoxInvalidCPF() {
		String expected = "Pendências no cadastro:  - CPF Inválido!";
		String actual = singleRegistrationHomePage.getTextMessageBox().replace("\n", "");
		System.out.println(" - :[" + expected + "]:[" + actual + "]");
		Assert.assertEquals(expected, actual);
		return this;
	}
	public SingleRegistrationHomeRules validateMessageBoxFantasyNameIsRequired() {
		String expected = "Pendências no cadastro:  - Nome Fantasia é obrigatório!";
		String actual = singleRegistrationHomePage.getTextMessageBox().replace("\n", "");
		System.out.println(" - :[" + expected + "]:[" + actual + "]");
		Assert.assertEquals(expected, actual);
		return this;
	}
	public SingleRegistrationHomeRules validateMessageBoxCorporateNameIsRequired() {
		String expected = "Pendências no cadastro:  - Razão Social é obrigatória!";
		String actual = singleRegistrationHomePage.getTextMessageBox().replace("\n", "");
		System.out.println(" - :[" + expected + "]:[" + actual + "]");
		Assert.assertEquals(expected, actual);
		return this;
	}
	public SingleRegistrationHomeRules validateMessageBoxCNPJIsRequired() {
		String expected = "Pendências no cadastro:  - CNPJ é obrigatório!";
		String actual = singleRegistrationHomePage.getTextMessageBox().replace("\n", "");
		System.out.println(" - :[" + expected + "]:[" + actual + "]");
		Assert.assertEquals(expected, actual);
		return this;
	}
	public SingleRegistrationHomeRules validateMessageBoxInvalidCNPJ() {
		String expected = "Pendências no cadastro:  - CNPJ inválido!";
		String actual = singleRegistrationHomePage.getTextMessageBox().replace("\n", "");
		System.out.println(" - :[" + expected + "]:[" + actual + "]");
		Assert.assertEquals(expected, actual);
		return this;
	}
	public SingleRegistrationHomeRules validateMessageBoxPhoneFormatIsInvalid() {
		String expected = "Pendências no cadastro:  - Formato de telefone é inválido!";
		String actual = singleRegistrationHomePage.getTextMessageBox().replace("\n", "");
		System.out.println(" - :[" + expected + "]:[" + actual + "]");
		Assert.assertEquals(expected, actual);
		return this;
	}
	public SingleRegistrationHomeRules validateMessageBoxCellPhoneFormatIsInvalid() {
		String expected = "Pendências no cadastro:  - Formato de celular é inválido!";
		String actual = singleRegistrationHomePage.getTextMessageBox().replace("\n", "");
		System.out.println(" - :[" + expected + "]:[" + actual + "]");
		Assert.assertEquals(expected, actual);
		return this;
	}
	public SingleRegistrationHomeRules validateMessageBoxEmailFormatIsInvalid() {
		String expected = "Pendências no cadastro:  - Formato de e-mail é inválido!";
		String actual = singleRegistrationHomePage.getTextMessageBox().replace("\n", "");
		System.out.println(" - :[" + expected + "]:[" + actual + "]");
		Assert.assertEquals(expected, actual);
		return this;
	}
	public SingleRegistrationHomeRules validateMessageBoxAtLeastOneFormOfContactIsRequired() {
		String expected = "Pendências no cadastro:  - É obrigatório pelo menos uma forma de contato! (Telefone, Celular ou E-mail)";
		String actual = singleRegistrationHomePage.getTextMessageBox().replace("\n", "");
		System.out.println(" - :[" + expected + "]:[" + actual + "]");
		Assert.assertEquals(expected, actual);
		return this;
	}
	
}
