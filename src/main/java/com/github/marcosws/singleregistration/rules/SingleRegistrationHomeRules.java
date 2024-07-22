package com.github.marcosws.singleregistration.rules;

import com.github.marcosws.singleregistration.core.Utils;
import com.github.marcosws.singleregistration.model.SingleRegistration;
import com.github.marcosws.singleregistration.model.enums.RegistrationType;
import com.github.marcosws.singleregistration.page.SingleRegistrationHomePage;

public class SingleRegistrationHomeRules {
	
	SingleRegistrationHomePage singleRegistrationHomePage = new SingleRegistrationHomePage();
	SingleRegistration singleRegistration = SingleRegistration.getInstance();
 	
	
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

}
