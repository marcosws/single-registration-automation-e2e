#language: pt
#Author: marcosws@ymail.com - Marcos Willian de Souza
#Início do Projeto: 13/07/2024

@Global @TecladoVirtual
Funcionalidade: Realizar acesso atraves do Teclado Virtual

	@CT1001 @DataEmpty @Firefox @Alto @Positivo
	Cenário: Realizar acesso atraves do Teclado Virtual utilizando a senha válida informada no campo sua senha com o Browser Firefox.
		Dado que que acesso a pagina inicial do Teclado Virtual.
		Quando recuperar a senha informada no campo sua senha e teclar numero por numero na tecla corespondente.
		Então valido valido a mensagem Acesso Permitido na Caixa de Dialogo 
		
	@CT1002 @DataEmpty @Chrome @Alto @Positivo
	Cenário: Realizar acesso atraves do Teclado Virtual utilizando a senha válida informada no campo sua senha com o Browser Chrome.
		Dado que que acesso a pagina inicial do Teclado Virtual.
		Quando recuperar a senha informada no campo sua senha e teclar numero por numero na tecla corespondente.
		Então valido valido a mensagem Acesso Permitido na Caixa de Dialogo 
		
	@CT1003 @DataEmpty @Edge @Alto @Positivo
	Cenário: Realizar acesso atraves do Teclado Virtual utilizando a senha válida informada no campo sua senha com o Browser Edge.
		Dado que que acesso a pagina inicial do Teclado Virtual.
		Quando recuperar a senha informada no campo sua senha e teclar numero por numero na tecla corespondente.
		Então valido valido a mensagem Acesso Permitido na Caixa de Dialogo 
