package com.github.marcosws.singleregistration.method;

import org.testng.Assert;

import com.github.marcosws.singleregistration.core.Utils;
import com.github.marcosws.singleregistration.data.SingleRegistration;
import com.github.marcosws.singleregistration.data.enums.InconsistenceMessage;
import com.github.marcosws.singleregistration.page.SingleRegistrationParametersPage;

public class SingleRegistrationParametersMethod {
	
	SingleRegistrationParametersPage singleRegistrationParametersPage = new SingleRegistrationParametersPage();
	SingleRegistration singleRegistration = SingleRegistration.getInstance();
	
	public SingleRegistrationParametersMethod clickParametersTab() {
		singleRegistrationParametersPage.clickRegistrationTab();
		return this;
	}
	
	public SingleRegistrationParametersMethod selectInconsistencyMessage() {
		if(Utils.normalize(singleRegistration.getInconsistencyMessage())
				.equals(Utils.normalize(InconsistenceMessage.DISPLAY_DIALOG_BOX.toString()))) {
			
			singleRegistrationParametersPage.clickDisplayDialogBox();
			
		}
		else if(Utils.normalize(singleRegistration.getInconsistencyMessage())
				.equals(Utils.normalize(InconsistenceMessage.DISPLAY_INFORMATIVE_LABEL.toString()))) {
			
			singleRegistrationParametersPage.clickDisplayInformativeLabel();
			
		}
		else {
			Assert.fail("Erro ao selecionar tipo de cadastro informar valor na massa " 
					+ InconsistenceMessage.DISPLAY_DIALOG_BOX.toString() + " ou " 
					+ InconsistenceMessage.DISPLAY_INFORMATIVE_LABEL.toString());
		}
		return this;
	}
	
	public SingleRegistrationParametersMethod clickDisplaysRegistrationConfirmationMessage() {
		if(Utils.stringToBoolean(singleRegistration.getDisplaysRegistrationConfirmationMessage()))
			this.clickDisplaysRegistrationConfirmationMessage();
		return this;
	}
	
	public SingleRegistrationParametersMethod clickDisplaysConfirmationMessageBeforeClearingFields() {
		if(Utils.stringToBoolean(singleRegistration.getDisplaysConfirmationMessageBeforeClearingFields()))
			this.clickDisplaysConfirmationMessageBeforeClearingFields();
		return this;
	}



}
