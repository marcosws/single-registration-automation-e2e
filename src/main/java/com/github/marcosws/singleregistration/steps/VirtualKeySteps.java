package com.github.marcosws.singleregistration.steps;

import com.github.marcosws.singleregistration.method.VirtualKeyMethod;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class VirtualKeySteps {
	
	VirtualKeyMethod virtualKeyRules = new VirtualKeyMethod();
	
	@Dado("que que acesso a pagina inicial do Teclado Virtual.")
	public void queQueAcessoAPaginaInicialDoTecladoVirtual() {
		virtualKeyRules.waitVirtualKeyPage();
	}

	@Quando("recuperar a senha informada no campo sua senha e teclar numero por numero na tecla corespondente.")
	public void recuperarASenhaInformadaNoCampoSuaSenhaETeclarNumeroPorNumeroNaTeclaCorespondente() {
		virtualKeyRules
			.clickGeneratePassword()
			.getPasswordAndEnterVirtualKey()
			.clickKeyEnter();
	}

	@Então("valido valido a mensagem Acesso Permitido na Caixa de Dialogo")
	public void validoValidoAMensagemAcessoPermitidoNaCaixaDeDialogo() {
		virtualKeyRules.validateMessageAccessAllowed();
	}

}
