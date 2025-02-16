package com.github.marcosws.singleregistration.data;

import com.github.marcosws.singleregistration.core.Utils;

public class SingleRegistration {
	
	private static ThreadLocal<SingleRegistration> instance = new ThreadLocal<SingleRegistration>();
	
	public static synchronized SingleRegistration getInstance() {
		if(instance.get() == null) {
			SingleRegistration singleRegistration = new SingleRegistration();
			Utils.setEmptyIfStringFieldIsNull(instance);
			instance.set(singleRegistration);
		}
		return instance.get();
	}

	public static void setInstance(SingleRegistration instance) {
		SingleRegistration.instance.set(instance);
	}
	
	private String registrationType;
	private String name;
	private String fantasyName;
	private String corporateName;
	private String cnpj;
	private String cpf;
	private String telephone;
	private String cellPhone;
	private String email;
	private String customerAuthorizesSendingOfInformationByEmail;
	private String inconsistencyMessage;
	private String displaysRegistrationConfirmationMessage;
	private String displaysConfirmationMessageBeforeClearingFields;
	
	public String getRegistrationType() {
		return registrationType;
	}
	public void setRegistrationType(String registrationType) {
		this.registrationType = registrationType;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getCellPhone() {
		return cellPhone;
	}
	public void setCellPhone(String cellPhone) {
		this.cellPhone = cellPhone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCustomerAuthorizesSendingOfInformationByEmail() {
		return customerAuthorizesSendingOfInformationByEmail;
	}
	public void setCustomerAuthorizesSendingOfInformationByEmail(String customerAuthorizesSendingOfInformationByEmail) {
		this.customerAuthorizesSendingOfInformationByEmail = customerAuthorizesSendingOfInformationByEmail;
	}

	public String getInconsistencyMessage() {
		return inconsistencyMessage;
	}

	public void setInconsistencyMessage(String inconsistencyMessage) {
		this.inconsistencyMessage = inconsistencyMessage;
	}

	public String getDisplaysRegistrationConfirmationMessage() {
		return displaysRegistrationConfirmationMessage;
	}

	public void setDisplaysRegistrationConfirmationMessage(String displaysRegistrationConfirmationMessage) {
		this.displaysRegistrationConfirmationMessage = displaysRegistrationConfirmationMessage;
	}

	public String getDisplaysConfirmationMessageBeforeClearingFields() {
		return displaysConfirmationMessageBeforeClearingFields;
	}

	public void setDisplaysConfirmationMessageBeforeClearingFields(String displaysConfirmationMessageBeforeClearingFields) {
		this.displaysConfirmationMessageBeforeClearingFields = displaysConfirmationMessageBeforeClearingFields;
	}

	public String getFantasyName() {
		return fantasyName;
	}

	public void setFantasyName(String fantasyName) {
		this.fantasyName = fantasyName;
	}

	public String getCorporateName() {
		return corporateName;
	}

	public void setCorporateName(String corporateName) {
		this.corporateName = corporateName;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
}
