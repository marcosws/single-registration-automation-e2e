package com.github.marcosws.singleregistration.steps;

import com.github.marcosws.singleregistration.rules.SingleRegistrationHomeRules;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class SingleRegistationHomeSteps {
	
	SingleRegistrationHomeRules singleRegistrationHomeRules = new SingleRegistrationHomeRules();
			
	@Dado("que acesso a pagina inicial do Cadastro Único")
	public void que_acesso_a_pagina_inicial_do_cadastro_único() {
		singleRegistrationHomeRules
			.waitTitleSingleRegistration()
			.clickRegistrationTab()
			.waitTitleCustomerRegistration();
	}

	@Quando("preencher o cadastro de cliente para pessoa física com os dados e enviar o formulário")
	public void preencher_o_cadastro_de_cliente_para_pessoa_fisica_com_os_dados_e_enviar_o_formulario() {
		singleRegistrationHomeRules
			.selectRegistrationType()
			.editName()
			.editCpf()
			.editTelephone()
			.editCellPhone()
			.editEmail()
			.selectCustomerAuthorizesSendingOfInformationByEmail()
			.clickRegister();
	}

	@Então("valido a proxima pagina com os dados enviados do cadastro de pessoa física")
	public void valido_a_proxima_pagina_com_os_dados_enviados_do_cadastro_de_pessoa_fisica() {
	  
	}
	
	@Então("valido a mensagem Nome é obrigatório! na caixa de dialogo")
	public void valido_a_mensagem_nome_é_obrigatório_na_caixa_de_dialogo() {

	}

}
