package com.github.marcosws.singleregistration.data.enums;

public enum InconsistenceMessage {
	
	DISPLAY_DIALOG_BOX("Apresentar caixa de dialogo"),
	DISPLAY_INFORMATIVE_LABEL("Apresentar label informativa"),
	EMPTY("");
	
	private String inconsistenceMessage;
	
	InconsistenceMessage(final String inconsistenceMessage){
		this.inconsistenceMessage = inconsistenceMessage;
	}
	
	@Override
	public String toString() {
		return this.inconsistenceMessage;
	}

}
