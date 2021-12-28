#language: pt
#Autor: Mano Caio
#Data: Dezembro/2021

@criar_conta
Funcionalidade: Criar Conta
  Como um usuario
  Eu quero criar uma conta
  Para que possa realizar pesquisas e pedidos
  
  Contexto:
  	Dado estou na tela para cadastrar conta 
  	Quando escrevo o endereco de e-mail
  	E clico no botao Crie sua conta aqui
  	
  	@CY001 @criar_conta_com_sucesso 
  	Cenario: Criar conta com sucesso 
  	E informar titulo, nome, sobrenome, senha, nascimento 
  	E preencho caixaBox, endereco cidade, caixa postal, telefone, pais, telefone celular
  	E clico em registro 
  	Entao devo visualizar a mensagem de bem vindo 
  	
  	@CY002 @criar_conta_existente
  	Cenario: Tentar criar com conta existente 
  	Entao devo verificar a mensagem que a conta ja existe

		@CY003 @criar_conta_invalida
		Cenario: Tentar criar conta com e-mail invalido
		Entao devo verificar a mensagem do o e-mail esta invalido
		
		@CY004 @criar_conta_com_CEP_invalido
		Cenario: Tentar cadastrar a conta com CEP invalido
		E preencho os campos e o cep invalido
		E clico em registrar
		Entao deve aparece a mensagem para colocar um valido 
		
		@CY005 @criar_conta_com_o_campo_telefone_vazio
		Cenario: Tentar cadastrar a conta com campo telefone vazio
		E preencho os camopos e o telefone vazio 
		E clico em registrar
		Entao deve aparecer a mensagem para inserir o telefone
		
		
		