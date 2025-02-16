#language: pt
#Author: marcosws@ymail.com - Marcos Willian de Souza
#Início do Projeto: 13/07/2024

@Global @CadastroUnico
Funcionalidade: realizar o cadastro de cliente no Cadastro Único

	@CT0001 @DataJson @Chrome @Alto @Positivo
	Cenário: Realizar o cadastro de cliente para pessoa física sem parametrização (Apresentar caixa de dialogo) preenchendo todos os campos com dados válidos.
		Dado que acesso a pagina inicial do Cadastro Único
		Quando preencher o cadastro de cliente para pessoa física com os dados e enviar o formulário
		Então valido a proxima pagina com os dados enviados do cadastro de pessoa física
	
	@CT0002 @DataJson @Chrome @Alto @Negativo
	Cenário: Realizar o cadastro de cliente para pessoa física sem parametrização (Apresentar caixa de dialogo) omitindo o preenchimento do campo Nome e preenchendo demais campos com dados válidos.
		Dado que acesso a pagina inicial do Cadastro Único
		Quando preencher o cadastro de cliente para pessoa física com os dados e enviar o formulário
		Então valido a mensagem Nome é obrigatório! na caixa de dialogo
	
	@CT0003 @DataJson @Chrome @Alto @Negativo 
	Cenário: Realizar o cadastro de cliente para pessoa física sem parametrização (Apresentar caixa de dialogo) omitindo o preenchimento do campo CPF e preenchendo demais campos com dados válidos.
		Dado que acesso a pagina inicial do Cadastro Único
		Quando preencher o cadastro de cliente para pessoa física com os dados e enviar o formulário
		Então valido a mensagem CPF é obrigatório! na caixa de dialogo
	
	@CT0004 @DataJson @Chrome @Alto @Negativo
	Cenário: Realizar o cadastro de cliente para pessoa física sem parametrização (Apresentar caixa de dialogo) preenchendo com um CPF inválido e preenchendo demais campos com dados válidos.
		Dado que acesso a pagina inicial do Cadastro Único
		Quando preencher o cadastro de cliente para pessoa física com os dados e enviar o formulário
		Então valido a mensagem CPF inválido! na caixa de dialogo
	
	@CT0005 @DataJson @Chrome @Alto @Negativo 
	Cenário: Realizar o cadastro de cliente para pessoa física sem parametrização (Apresentar caixa de dialogo) omitindo o preenchimento do campo Telefone e preenchendo demais campos com dados válidos.
		Dado que acesso a pagina inicial do Cadastro Único
		Quando preencher o cadastro de cliente para pessoa física com os dados e enviar o formulário
		Então valido a mensagem É obrigatório pelo menos uma forma de contato! na caixa de dialogo
	
	@CT0006 @DataJson @Chrome @Alto @Negativo 
	Cenário: Realizar o cadastro de cliente para pessoa física sem parametrização (Apresentar caixa de dialogo) omitindo o preenchimento do campo Celular e preenchendo demais campos com dados válidos.
		Dado que acesso a pagina inicial do Cadastro Único
		Quando preencher o cadastro de cliente para pessoa física com os dados e enviar o formulário
		Então valido a mensagem É obrigatório pelo menos uma forma de contato! na caixa de dialogo
	
	@CT0007 @DataJson @Chrome @Alto @Negativo 
	Cenário: Realizar o cadastro de cliente para pessoa física sem parametrização (Apresentar caixa de dialogo) omitindo o preenchimento do campo e-mail e preenchendo demais campos com dados válidos.
		Dado que acesso a pagina inicial do Cadastro Único
		Quando preencher o cadastro de cliente para pessoa física com os dados e enviar o formulário
		Então valido a mensagem É obrigatório pelo menos uma forma de contato! na caixa de dialogo
		
	@CT0008 @DataJson @Chrome @Alto @Negativo 
	Cenário: Realizar o cadastro de cliente para pessoa física sem parametrização (Apresentar caixa de dialogo) omitindo o preenchimento do campo Telefone, Celular e e-Mail e preenchendo demais campos com dados válidos.
		Dado que acesso a pagina inicial do Cadastro Único
		Quando preencher o cadastro de cliente para pessoa física com os dados e enviar o formulário
		Então valido a mensagem É obrigatório pelo menos uma forma de contato! na caixa de dialogo
		
	@CT0009 @DataJson @Chrome @Alto @Negativo 
	Cenário: Realizar o cadastro de cliente para pessoa física sem parametrização (Apresentar caixa de dialogo) preenchendo com um Formato de Telefone inválido e preenchendo demais campos com dados válidos.
		Dado que acesso a pagina inicial do Cadastro Único
		Quando preencher o cadastro de cliente para pessoa física com os dados e enviar o formulário
		Então valido a mensagem Formato de telefone é inválido! na caixa de dialogo
		
	@CT0010 @DataJson @Chrome @Alto @Negativo 
	Cenário: Realizar o cadastro de cliente para pessoa física sem parametrização (Apresentar caixa de dialogo) preenchendo com um Formato de Celular inválido e preenchendo demais campos com dados válidos.
		Dado que acesso a pagina inicial do Cadastro Único
		Quando preencher o cadastro de cliente para pessoa física com os dados e enviar o formulário
		Então valido a mensagem Formato de celular é inválido! na caixa de dialogo
		
	@CT0011 @DataJson @Chrome @Alto @Negativo 
	Cenário: Realizar o cadastro de cliente para pessoa física sem parametrização (Apresentar caixa de dialogo) preenchendo com um Formato de e-mail inválido e preenchendo demais campos com dados válidos.
		Dado que acesso a pagina inicial do Cadastro Único
		Quando preencher o cadastro de cliente para pessoa física com os dados e enviar o formulário
		Então valido a mensagem Formato de e-mail é inválido! na caixa de dialogo
	
	@CT0012 @DataJson @Chrome @Alto @Negativo 
	Cenário: Realizar o cadastro de cliente para pessoa física sem parametrização (Apresentar caixa de dialogo) omitindo o preenchimento de todos os campos.
		Dado que acesso a pagina inicial do Cadastro Único
		Quando preencher o cadastro de cliente para pessoa física com os dados e enviar o formulário
		Então valido a mensagem É obrigatório pelo menos uma forma de contato! na caixa de dialogo
		
	@CT0013 @DataJson @Chrome @Alto @Positivo
	Cenário: Realizar o cadastro de cliente para pessoa física com parametrização selecionando Apresentar label informativa e preenchendo todos os campos com dados válidos.
		Dado que acesso a pagina inicial do Cadastro Único
		E realizo a parametrização do formulário
		Quando preencher o cadastro de cliente para pessoa física com os dados e enviar o formulário
		Então valido a proxima pagina com os dados enviados do cadastro de pessoa física
	
	@CT0014
	Cenário: Realizar o cadastro de cliente para pessoa física com parametrização selecionando Apresentar label informativa e omitindo o preenchimento do campo Nome e preenchendo demais campos com dados válidos.
		Dado que acesso a pagina inicial do Cadastro Único
		E realizo a parametrização do formulário
		Quando preencher o cadastro de cliente para pessoa física com os dados e enviar o formulário
	
	@CT0015
	Cenário: Realizar o cadastro de cliente para pessoa física com parametrização selecionando Apresentar label informativa e omitindo o preenchimento do campo CPF e preenchendo demais campos com dados válidos.
		Dado que acesso a pagina inicial do Cadastro Único
		E realizo a parametrização do formulário
		Quando preencher o cadastro de cliente para pessoa física com os dados e enviar o formulário
	
	@CT0016
	Cenário: Realizar o cadastro de cliente para pessoa física com parametrização selecionando Apresentar label informativa e preenchendo com um CPF inválido e preenchendo demais campos com dados válidos.
		Dado que acesso a pagina inicial do Cadastro Único
		E realizo a parametrização do formulário
		Quando preencher o cadastro de cliente para pessoa física com os dados e enviar o formulário
	
	@CT0017
	Cenário: Realizar o cadastro de cliente para pessoa física com parametrização selecionando Apresentar label informativa e omitindo o preenchimento do campo Telefone e preenchendo demais campos com dados válidos.
		Dado que acesso a pagina inicial do Cadastro Único
		E realizo a parametrização do formulário
		Quando preencher o cadastro de cliente para pessoa física com os dados e enviar o formulário
	
	@CT0018
	Cenário: Realizar o cadastro de cliente para pessoa física com parametrização selecionando Apresentar label informativa e omitindo o preenchimento do campo Celular e preenchendo demais campos com dados válidos.
		Dado que acesso a pagina inicial do Cadastro Único
		E realizo a parametrização do formulário
		Quando preencher o cadastro de cliente para pessoa física com os dados e enviar o formulário
	
	@CT0019
	Cenário: Realizar o cadastro de cliente para pessoa física com parametrização selecionando Apresentar label informativa e omitindo o preenchimento do campo E-mail e preenchendo demais campos com dados válidos.
		Dado que acesso a pagina inicial do Cadastro Único
		E realizo a parametrização do formulário
		Quando preencher o cadastro de cliente para pessoa física com os dados e enviar o formulário
	
	@CT0020
	Cenário: Realizar o cadastro de cliente para pessoa física com parametrização selecionando Apresentar label informativa e omitindo o preenchimento do campo Telefone, Celular e E-Mail e preenchendo demais campos com dados válidos.
		Dado que acesso a pagina inicial do Cadastro Único
		E realizo a parametrização do formulário
		Quando preencher o cadastro de cliente para pessoa física com os dados e enviar o formulário
	
	@CT0021
	Cenário: Realizar o cadastro de cliente para pessoa física com parametrização selecionando Apresentar label informativa e preenchendo com um Formato de Telefone inválido e preenchendo demais campos com dados válidos.
		Dado que acesso a pagina inicial do Cadastro Único
		E realizo a parametrização do formulário
		Quando preencher o cadastro de cliente para pessoa física com os dados e enviar o formulário
	
	@CT0022
	Cenário: Realizar o cadastro de cliente para pessoa física com parametrização selecionando Apresentar label informativa e preenchendo com um Formato de Celular inválido e preenchendo demais campos com dados válidos.
		Dado que acesso a pagina inicial do Cadastro Único
		E realizo a parametrização do formulário
		Quando preencher o cadastro de cliente para pessoa física com os dados e enviar o formulário
	
	@CT0023
	Cenário: Realizar o cadastro de cliente para pessoa física com parametrização selecionando Apresentar label informativa e preenchendo com um Formato de E-mail inválido e preenchendo demais campos com dados válidos.
		Dado que acesso a pagina inicial do Cadastro Único
		E realizo a parametrização do formulário
		Quando preencher o cadastro de cliente para pessoa física com os dados e enviar o formulário
	
	@CT0024
	Cenário: Realizar o cadastro de cliente para pessoa física com parametrização selecionando Apresentar label informativa e omitindo o preenchimento de todos os campos.
		Dado que acesso a pagina inicial do Cadastro Único
		E realizo a parametrização do formulário
		Quando preencher o cadastro de cliente para pessoa física com os dados e enviar o formulário
	
	@CT0025
	Cenário: Realizar o cadastro de cliente para pessoa física com parametrização selecionando Apresentar mensagem de confirmação de Cadastro, aceitando a mensagem e preenchendo todos os campos com dados válidos.
		Dado que acesso a pagina inicial do Cadastro Único
		E realizo a parametrização do formulário
		Quando preencher o cadastro de cliente para pessoa física com os dados e enviar o formulário
	
	@CT0026
	Cenário: Realizar o cadastro de cliente para pessoa física com parametrização selecionando Apresentar mensagem de confirmação de Cadastro, declinando o mensagem e preenchendo todos os campos com dados válidos.
		Dado que acesso a pagina inicial do Cadastro Único
		E realizo a parametrização do formulário
		Quando preencher o cadastro de cliente para pessoa física com os dados e enviar o formulário
	
	@CT0027
	Cenário: Realizar o cadastro de cliente para pessoa física com parametrização selecionando Apresentar mensagem de confirmação antes de limpar os campos preenchendo todos os campos e acionando o botão Limpar aceitando a mensagem.
		Dado que acesso a pagina inicial do Cadastro Único
		E realizo a parametrização do formulário
		Quando preencher o cadastro de cliente para pessoa física com os dados e enviar o formulário
	
	@CT0028
	Cenário: Realizar o cadastro de cliente para pessoa física com parametrização selecionando Apresentar mensagem de confirmação antes de limpar os campos preenchendo todos os campos e acionando o botão Limpar declinando a mensagem.
		Dado que acesso a pagina inicial do Cadastro Único
		E realizo a parametrização do formulário
		Quando preencher o cadastro de cliente para pessoa física com os dados e enviar o formulário
	
	@CT0029
	Cenário: Realizar o cadastro de cliente para pessoa física sem parametrização preenchendo todos os campos e acionando o botão Limpar.
		Dado que acesso a pagina inicial do Cadastro Único
		E realizo a parametrização do formulário
		Quando preencher o cadastro de cliente para pessoa física com os dados e enviar o formulário
		
	@CT0030  @DataJson @Chrome @Alto @Positivo
	Cenário: Realizar o cadastro de cliente para pessoa jurídica sem parametrização (Apresentar caixa de dialogo) preenchendo todos os campos com dados válidos.
		Dado que acesso a pagina inicial do Cadastro Único
		Quando preencher o cadastro de cliente para pessoa jurídica com os dados e enviar o formulário
		Então valido a proxima pagina com os dados enviados do cadastro de pessoa jurídica
	
	@CTA031
	Cenário: Realizar o cadastro de cliente para pessoa jurídica sem parametrização (Apresentar caixa de dialogo) omitindo o preenchimento do campo Nome Fantasia e preenchendo demais campos com dados válidos.
		Dado que acesso a pagina inicial do Cadastro Único
		Quando preencher o cadastro de cliente para pessoa jurídica com os dados e enviar o formulário
		Então valido a proxima pagina com os dados enviados do cadastro de pessoa jurídica
	
	@CTA032
	Cenário: Realizar o cadastro de cliente para pessoa jurídica sem parametrização (Apresentar caixa de dialogo) omitindo o preenchimento do campo Razão Social e preenchendo demais campos com dados válidos.
		Dado que acesso a pagina inicial do Cadastro Único
		Quando preencher o cadastro de cliente para pessoa jurídica com os dados e enviar o formulário
		Então valido a proxima pagina com os dados enviados do cadastro de pessoa jurídica
	
	@CTA033
	Cenário: Realizar o cadastro de cliente para pessoa jurídica sem parametrização (Apresentar caixa de dialogo) omitindo o preenchimento do campo CNPJ e preenchendo demais campos com dados válidos.
		Dado que acesso a pagina inicial do Cadastro Único
		Quando preencher o cadastro de cliente para pessoa jurídica com os dados e enviar o formulário
		Então valido a proxima pagina com os dados enviados do cadastro de pessoa jurídica
	
	@CTA034
	Cenário: Realizar o cadastro de cliente para pessoa jurídica sem parametrização (Apresentar caixa de dialogo) preenchendo com um CNPJ inválido e preenchendo demais campos com dados válidos.
		Dado que acesso a pagina inicial do Cadastro Único
		Quando preencher o cadastro de cliente para pessoa jurídica com os dados e enviar o formulário
		Então valido a proxima pagina com os dados enviados do cadastro de pessoa jurídica
	
	@CTA035
	Cenário: Realizar o cadastro de cliente para pessoa jurídica sem parametrização (Apresentar caixa de dialogo) omitindo o preenchimento do campo Celular, E-Mail e preenchendo demais campos com dados válidos.
		Dado que acesso a pagina inicial do Cadastro Único
		Quando preencher o cadastro de cliente para pessoa jurídica com os dados e enviar o formulário
		Então valido a proxima pagina com os dados enviados do cadastro de pessoa jurídica
	
	@CTA036
	Cenário: Realizar o cadastro de cliente para pessoa jurídica sem parametrização (Apresentar caixa de dialogo) omitindo o preenchimento do campo Celular, Telefone e preenchendo demais campos com dados válidos.
		Dado que acesso a pagina inicial do Cadastro Único
		Quando preencher o cadastro de cliente para pessoa jurídica com os dados e enviar o formulário
		Então valido a proxima pagina com os dados enviados do cadastro de pessoa jurídica
	
	@CTA037
	Cenário: Realizar o cadastro de cliente para pessoa jurídica sem parametrização (Apresentar caixa de dialogo) omitindo o preenchimento do campo E-mail, Telefone e preenchendo demais campos com dados válidos.
		Dado que acesso a pagina inicial do Cadastro Único
		Quando preencher o cadastro de cliente para pessoa jurídica com os dados e enviar o formulário
		Então valido a proxima pagina com os dados enviados do cadastro de pessoa jurídica
	
	@CTA038
	Cenário: Realizar o cadastro de cliente para pessoa jurídica sem parametrização (Apresentar caixa de dialogo) omitindo o preenchimento de todos os campos.
		Dado que acesso a pagina inicial do Cadastro Único
		Quando preencher o cadastro de cliente para pessoa jurídica com os dados e enviar o formulário
		Então valido a proxima pagina com os dados enviados do cadastro de pessoa jurídica	
	
	@CTA039
	Cenário: Realizar o cadastro de cliente para pessoa jurídica com parametrização selecionando Apresentar label informativa e preenchendo todos os campos com dados válidos.
	
	
	@CTA040
	Cenário: Realizar o cadastro de cliente para pessoa jurídica com parametrização selecionando Apresentar label informativa e omitindo o preenchimento do campo Nome Fantasia e preenchendo demais campos com dados válidos.
	
	
	@CTA041
	Cenário: Realizar o cadastro de cliente para pessoa jurídica com parametrização selecionando Apresentar label informativa e omitindo o preenchimento do campo Razão Social e preenchendo demais campos com dados válidos.
	
	
	@CTA042
	Cenário: Realizar o cadastro de cliente para pessoa jurídica com parametrização selecionando Apresentar label informativa e omitindo o preenchimento do campo CNPJ e preenchendo demais campos com dados válidos.
	
	
	@CTA043
	Cenário: Realizar o cadastro de cliente para pessoa jurídica com parametrização selecionando Apresentar label informativa e preenchendo com um CNPJ inválido e preenchendo demais campos com dados válidos.
	
	
	@CTA044
	Cenário: Realizar o cadastro de cliente para pessoa jurídica com parametrização selecionando Apresentar label informativa e omitindo o preenchimento do campo Celular, E-Mail e preenchendo demais campos com dados válidos.
	
	
	@CTA045
	Cenário: Realizar o cadastro de cliente para pessoa jurídica com parametrização selecionando Apresentar label informativa e omitindo o preenchimento do campo Celular, Telefone e preenchendo demais campos com dados válidos.
	
	
	@CTA046
	Cenário: Realizar o cadastro de cliente para pessoa jurídica com parametrização selecionando Apresentar label informativa e omitindo o preenchimento do campo E-mail, Telefone e preenchendo demais campos com dados válidos.
	
	
	@CTA047
	Cenário: Realizar o cadastro de cliente para pessoa jurídica com parametrização selecionando Apresentar label informativa e omitindo o preenchimento de todos os campos.
	
	
	@CTA048
	Cenário: Realizar o cadastro de cliente para pessoa jurídica com parametrização selecionando Apresentar mensagem de confirmação de Cadastro, aceitando a mensagem e preenchendo todos os campos com dados válidos.
	
	
	@CTA049
	Cenário: Realizar o cadastro de cliente para pessoa jurídica com parametrização selecionando Apresentar mensagem de confirmação de Cadastro, declinando o mensagem e preenchendo todos os campos com dados válidos.
	
	
	@CTA050
	Cenário: Realizar o cadastro de cliente para pessoa jurídica com parametrização selecionando Apresentar mensagem de confirmação antes de limpar os campos preenchendo todos os campos e acionando o botão Limpar aceitando a mensagem.
	
	
	@CTA051
	Cenário: Realizar o cadastro de cliente para pessoa jurídica com parametrização selecionando Apresentar mensagem de confirmação antes de limpar os campos preenchendo todos os campos e acionando o botão Limpar declinando a mensagem.
	
	@CTA052
	Cenário: Realizar o cadastro de cliente para pessoa jurídica sem parametrização preenchendo todos os campos e acionando o botão Limpar.
		
	
	
	
	
	
	
	
	
	
	
	
#CTA001 - Realizar o cadastro de cliente para pessoa física sem parametrização (Apresentar caixa de dialogo) preenchendo todos os campos com dados válidos.
#CTA002 - Realizar o cadastro de cliente para pessoa física sem parametrização (Apresentar caixa de dialogo) omitindo o preenchimento do campo Nome e preenchendo demais campos com dados válidos.
#CTA003 - Realizar o cadastro de cliente para pessoa física sem parametrização (Apresentar caixa de dialogo) omitindo o preenchimento do campo CPF e preenchendo demais campos com dados válidos.
#CTA004 - Realizar o cadastro de cliente para pessoa física sem parametrização (Apresentar caixa de dialogo) preenchendo com um CPF inválido e preenchendo demais campos com dados válidos.
#CTA005 - Realizar o cadastro de cliente para pessoa física sem parametrização (Apresentar caixa de dialogo) omitindo o preenchimento do campo Telefone e preenchendo demais campos com dados válidos.
#CTA006 - Realizar o cadastro de cliente para pessoa física sem parametrização (Apresentar caixa de dialogo) omitindo o preenchimento do campo Celular e preenchendo demais campos com dados válidos.
#CTA007 - Realizar o cadastro de cliente para pessoa física sem parametrização (Apresentar caixa de dialogo) omitindo o preenchimento do campo E-mail e preenchendo demais campos com dados válidos.
#CTA008 - Realizar o cadastro de cliente para pessoa física sem parametrização (Apresentar caixa de dialogo) omitindo o preenchimento do campo Telefone, Celular e E-Mail e preenchendo demais campos com dados válidos.
#CTA009 - Realizar o cadastro de cliente para pessoa física sem parametrização (Apresentar caixa de dialogo) preenchendo com um Formato de Telefone inválido e preenchendo demais campos com dados válidos.
#CTA010 - Realizar o cadastro de cliente para pessoa física sem parametrização (Apresentar caixa de dialogo) preenchendo com um Formato de Celular inválido e preenchendo demais campos com dados válidos.
#CTA011 - Realizar o cadastro de cliente para pessoa física sem parametrização (Apresentar caixa de dialogo) preenchendo com um Formato de E-mail inválido e preenchendo demais campos com dados válidos.
#CTA012 - Realizar o cadastro de cliente para pessoa física sem parametrização (Apresentar caixa de dialogo) omitindo o preenchimento de todos os campos.
#CTA013 - Realizar o cadastro de cliente para pessoa física com parametrização selecionando Apresentar label informativa e preenchendo todos os campos com dados válidos.
#CTA014 - Realizar o cadastro de cliente para pessoa física com parametrização selecionando Apresentar label informativa e omitindo o preenchimento do campo Nome e preenchendo demais campos com dados válidos.
#CTA015 - Realizar o cadastro de cliente para pessoa física com parametrização selecionando Apresentar label informativa e omitindo o preenchimento do campo CPF e preenchendo demais campos com dados válidos.
#CTA016 - Realizar o cadastro de cliente para pessoa física com parametrização selecionando Apresentar label informativa e preenchendo com um CPF inválido e preenchendo demais campos com dados válidos.
#CTA017 - Realizar o cadastro de cliente para pessoa física com parametrização selecionando Apresentar label informativa e omitindo o preenchimento do campo Telefone e preenchendo demais campos com dados válidos.
#CTA018 - Realizar o cadastro de cliente para pessoa física com parametrização selecionando Apresentar label informativa e omitindo o preenchimento do campo Celular e preenchendo demais campos com dados válidos.
#CTA019 - Realizar o cadastro de cliente para pessoa física com parametrização selecionando Apresentar label informativa e omitindo o preenchimento do campo E-mail e preenchendo demais campos com dados válidos.
#CTA020 - Realizar o cadastro de cliente para pessoa física com parametrização selecionando Apresentar label informativa e omitindo o preenchimento do campo Telefone, Celular e E-Mail e preenchendo demais campos com dados válidos.
#CTA021 - Realizar o cadastro de cliente para pessoa física com parametrização selecionando Apresentar label informativa e preenchendo com um Formato de Telefone inválido e preenchendo demais campos com dados válidos.
#CTA022 - Realizar o cadastro de cliente para pessoa física com parametrização selecionando Apresentar label informativa e preenchendo com um Formato de Celular inválido e preenchendo demais campos com dados válidos.
#CTA023 - Realizar o cadastro de cliente para pessoa física com parametrização selecionando Apresentar label informativa e preenchendo com um Formato de E-mail inválido e preenchendo demais campos com dados válidos.
#CTA024 - Realizar o cadastro de cliente para pessoa física com parametrização selecionando Apresentar label informativa e omitindo o preenchimento de todos os campos.
#CTA025 - Realizar o cadastro de cliente para pessoa física com parametrização selecionando Apresentar mensagem de confirmação de Cadastro, aceitando a mensagem e preenchendo todos os campos com dados válidos.
#CTA026 - Realizar o cadastro de cliente para pessoa física com parametrização selecionando Apresentar mensagem de confirmação de Cadastro, declinando o mensagem e preenchendo todos os campos com dados válidos.
#CTA027 - Realizar o cadastro de cliente para pessoa física com parametrização selecionando Apresentar mensagem de confirmação antes de limpar os campos preenchendo todos os campos e acionando o botão Limpar aceitando a mensagem.
#CTA028 - Realizar o cadastro de cliente para pessoa física com parametrização selecionando Apresentar mensagem de confirmação antes de limpar os campos preenchendo todos os campos e acionando o botão Limpar declinando a mensagem.
#CTA029 - Realizar o cadastro de cliente para pessoa física sem parametrização preenchendo todos os campos e acionando o botão Limpar.
#CTA030 - Realizar o cadastro de cliente para pessoa jurídica sem parametrização (Apresentar caixa de dialogo) preenchendo todos os campos com dados válidos.
#CTA031 - Realizar o cadastro de cliente para pessoa jurídica sem parametrização (Apresentar caixa de dialogo) omitindo o preenchimento do campo Nome Fantasia e preenchendo demais campos com dados válidos.
#CTA032 - Realizar o cadastro de cliente para pessoa jurídica sem parametrização (Apresentar caixa de dialogo) omitindo o preenchimento do campo Razão Social e preenchendo demais campos com dados válidos.
#CTA033 - Realizar o cadastro de cliente para pessoa jurídica sem parametrização (Apresentar caixa de dialogo) omitindo o preenchimento do campo CNPJ e preenchendo demais campos com dados válidos.
#CTA034 - Realizar o cadastro de cliente para pessoa jurídica sem parametrização (Apresentar caixa de dialogo) preenchendo com um CNPJ inválido e preenchendo demais campos com dados válidos.
#CTA035 - Realizar o cadastro de cliente para pessoa jurídica sem parametrização (Apresentar caixa de dialogo) omitindo o preenchimento do campo Celular, E-Mail e preenchendo demais campos com dados válidos.
#CTA036 - Realizar o cadastro de cliente para pessoa jurídica sem parametrização (Apresentar caixa de dialogo) omitindo o preenchimento do campo Celular, Telefone e preenchendo demais campos com dados válidos.
#CTA037 - Realizar o cadastro de cliente para pessoa jurídica sem parametrização (Apresentar caixa de dialogo) omitindo o preenchimento do campo E-mail, Telefone e preenchendo demais campos com dados válidos.
#CTA038 - Realizar o cadastro de cliente para pessoa jurídica sem parametrização (Apresentar caixa de dialogo) omitindo o preenchimento de todos os campos.
#CTA039 - Realizar o cadastro de cliente para pessoa jurídica com parametrização selecionando Apresentar label informativa e preenchendo todos os campos com dados válidos.
#CTA040 - Realizar o cadastro de cliente para pessoa jurídica com parametrização selecionando Apresentar label informativa e omitindo o preenchimento do campo Nome Fantasia e preenchendo demais campos com dados válidos.
#CTA041 - Realizar o cadastro de cliente para pessoa jurídica com parametrização selecionando Apresentar label informativa e omitindo o preenchimento do campo Razão Social e preenchendo demais campos com dados válidos.
#CTA042 - Realizar o cadastro de cliente para pessoa jurídica com parametrização selecionando Apresentar label informativa e omitindo o preenchimento do campo CNPJ e preenchendo demais campos com dados válidos.
#CTA043 - Realizar o cadastro de cliente para pessoa jurídica com parametrização selecionando Apresentar label informativa e preenchendo com um CNPJ inválido e preenchendo demais campos com dados válidos.
#CTA044 - Realizar o cadastro de cliente para pessoa jurídica com parametrização selecionando Apresentar label informativa e omitindo o preenchimento do campo Celular, E-Mail e preenchendo demais campos com dados válidos.
#CTA045 - Realizar o cadastro de cliente para pessoa jurídica com parametrização selecionando Apresentar label informativa e omitindo o preenchimento do campo Celular, Telefone e preenchendo demais campos com dados válidos.
#CTA046 - Realizar o cadastro de cliente para pessoa jurídica com parametrização selecionando Apresentar label informativa e omitindo o preenchimento do campo E-mail, Telefone e preenchendo demais campos com dados válidos.
#CTA047 - Realizar o cadastro de cliente para pessoa jurídica com parametrização selecionando Apresentar label informativa e omitindo o preenchimento de todos os campos.
#CTA048 - Realizar o cadastro de cliente para pessoa jurídica com parametrização selecionando Apresentar mensagem de confirmação de Cadastro, aceitando a mensagem e preenchendo todos os campos com dados válidos.
#CTA049 - Realizar o cadastro de cliente para pessoa jurídica com parametrização selecionando Apresentar mensagem de confirmação de Cadastro, declinando o mensagem e preenchendo todos os campos com dados válidos.
#CTA050 - Realizar o cadastro de cliente para pessoa jurídica com parametrização selecionando Apresentar mensagem de confirmação antes de limpar os campos preenchendo todos os campos e acionando o botão Limpar aceitando a mensagem.
#CTA051 - Realizar o cadastro de cliente para pessoa jurídica com parametrização selecionando Apresentar mensagem de confirmação antes de limpar os campos preenchendo todos os campos e acionando o botão Limpar declinando a mensagem.
#CTA052 - Realizar o cadastro de cliente para pessoa jurídica sem parametrização preenchendo todos os campos e acionando o botão Limpar.
