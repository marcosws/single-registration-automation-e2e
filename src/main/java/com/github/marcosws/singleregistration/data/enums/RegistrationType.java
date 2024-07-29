package com.github.marcosws.singleregistration.data.enums;

public enum RegistrationType {
	
	PHYSICAL_PERSON("Pessoa Física"),
	LEGAL_PERSON("Pessoa Jurídica"),
	EMPTY("");
	
	private String registrationType;
	
	RegistrationType(final String registrationType){
		this.registrationType = registrationType;
	}
	
	@Override
	public String toString() {
		return this.registrationType;
	}
	
}
