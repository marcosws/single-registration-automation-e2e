package com.github.marcosws.singleregistration.steps;

import com.github.marcosws.singleregistration.method.SingleRegistrationHomeMethod;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;

public class SingleRegistationHomeSteps {
	
	SingleRegistrationHomeMethod singleRegistrationHomeMethod = new SingleRegistrationHomeMethod();
			
	@Dado("que acesso a pagina inicial do Cadastro Único")
	public void que_acesso_a_pagina_inicial_do_cadastro_único() {
		singleRegistrationHomeMethod
			.waitTitleSingleRegistration()
			.clickRegistrationTab()
			.waitTitleCustomerRegistration();
	}

	@Quando("preencher o cadastro de cliente para pessoa física com os dados e enviar o formulário")
	public void preencher_o_cadastro_de_cliente_para_pessoa_fisica_com_os_dados_e_enviar_o_formulário() {
		singleRegistrationHomeMethod
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
		singleRegistrationHomeMethod
			.validateName()
			.validateCpf()
			.validateTelephone()
			.validateCellPhone()
			.validateEmail()
			.validateCustomerAuthorizesSendingOfInformationByEmail();
	}
	
	@Então("valido a mensagem Nome é obrigatório! na caixa de dialogo")
	public void valido_a_mensagem_nome_é_obrigatório_na_caixa_de_dialogo() {
		singleRegistrationHomeMethod.validateMessageBoxNameRequired();
	}
	
	@Então("valido a mensagem CPF é obrigatório! na caixa de dialogo")
	public void valido_a_mensagem_cpf_é_obrigatório_na_caixa_de_dialogo() {
		singleRegistrationHomeMethod.validateMessageBoxCpfRequired();
	}

	@Então("valido a mensagem CPF inválido! na caixa de dialogo")
	public void valido_a_mensagem_cpf_inválido_na_caixa_de_dialogo() {
		singleRegistrationHomeMethod.validateMessageBoxInvalidCPF();
	}
	
	@Então("valido a mensagem É obrigatório pelo menos uma forma de contato! na caixa de dialogo")
	public void valido_a_mensagem_é_obrigatório_pelo_menos_uma_forma_de_contato_na_caixa_de_dialogo() {
		singleRegistrationHomeMethod.validateMessageBoxAtLeastOneFormOfContactIsRequired();
	}

	@Então("valido a mensagem Formato de telefone é inválido! na caixa de dialogo")
	public void valido_a_mensagem_formato_de_telefone_e_inválido_na_caixa_de_dialogo() {
		singleRegistrationHomeMethod.validateMessageBoxPhoneFormatIsInvalid();
	}

	@Então("valido a mensagem Formato de celular é inválido! na caixa de dialogo")
	public void valido_a_mensagem_formato_de_celular_e_inválido_na_caixa_de_dialogo() {
		singleRegistrationHomeMethod.validateMessageBoxCellPhoneFormatIsInvalid();
	}

	@Então("valido a mensagem Formato de e-mail é inválido! na caixa de dialogo")
	public void valido_a_mensagem_formato_de_e_mail_e_invalido_na_caixa_de_dialogo() {
		singleRegistrationHomeMethod.validateMessageBoxEmailFormatIsInvalid();
	}
	
	@Quando("preencher o cadastro de cliente para pessoa jurídica com os dados e enviar o formulário")
	public void preencherOCadastroDeClienteParaPessoaJurídicaComOsDadosEEnviarOFormulário() {
		singleRegistrationHomeMethod
		.selectRegistrationType()
		.editFantasyName()
		.editCorporateName()
		.editCnpj()
		.editTelephone()
		.editCellPhone()
		.editEmail()
		.selectCustomerAuthorizesSendingOfInformationByEmail()
		.clickRegister();
	}

	@Então("valido a proxima pagina com os dados enviados do cadastro de pessoa jurídica")
	public void validoAProximaPaginaComOsDadosEnviadosDoCadastroDePessoaJurídica() {
		singleRegistrationHomeMethod
		.validateFantasyName()
		.validateCorporateName()
		.validateCnpj()
		.validateTelephone()
		.validateCellPhone()
		.validateEmail()
		.validateCustomerAuthorizesSendingOfInformationByEmail();
	}

}
