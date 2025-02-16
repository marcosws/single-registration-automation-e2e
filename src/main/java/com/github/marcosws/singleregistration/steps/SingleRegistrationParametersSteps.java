package com.github.marcosws.singleregistration.steps;

import com.github.marcosws.singleregistration.method.SingleRegistrationHomeMethod;
import com.github.marcosws.singleregistration.method.SingleRegistrationParametersMethod;

import io.cucumber.java.pt.E;

public class SingleRegistrationParametersSteps {
	
	SingleRegistrationParametersMethod singleRegistrationParametersMethod = new SingleRegistrationParametersMethod();
	SingleRegistrationHomeMethod singleRegistrationHomeMethod = new SingleRegistrationHomeMethod();
	
	@E("realizo a parametrização do formulário")
	public void realizoAParametrizaçãoDoFormulário() {
		singleRegistrationParametersMethod
			.clickParametersTab()
			.selectInconsistencyMessage()
			.clickDisplaysConfirmationMessageBeforeClearingFields()
			.clickDisplaysRegistrationConfirmationMessage();
		singleRegistrationHomeMethod
			.clickRegistrationTab();
	}

}
