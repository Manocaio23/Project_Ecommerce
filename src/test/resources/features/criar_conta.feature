#language: pt
#Autor: bruna.rafaelly.silva
#Data: Novembro/2020

@criar_conta
Funcionalidade: Criar Conta No Eccomerce
  Como um usuario
  Eu quero criar uma conta
  Para que possa realizar pesquisas e pedidos

	Contexto:
  	Dado estou na tela de login
  	E aceito os cookies utilizados no site
  	Quando pressionar o botão Criar conta	

	@CY001 @criar_conta_com_sucesso @trg @done
	Cenario: CY001_Criar_conta_com_sucesso
  	E informar email, senha e confirmar senha
  	E clicar em cadastrar
  	Entao serei direcionado para tela de mensagem para confirmacao de email com sucesso

	@CY002 @criar_conta_email_invalido @trg @done
	Cenario: CY002_Criar_conta_com_email_invalido
		E informar um email invalido
		Entao irei receber mensagem de erro
  
  @CY003 @criar_conta_senha_invalida @trg @done
	Cenario: CY003_Criar_Cadastro_Senha_invalida
		E preencher o campos de senha e confirmar senha
		Entao irei receber mensagem de erro

  @CY004 @criar_conta_senhas_divergentes @trg @done
	Cenario: CY004_Criar_conta_Senhas_divergentes
		E preencher o campos de senha e confirmar senha com valores diferentes
		Entao irei receber mensagem de erro

  @CY005 @acessar_link_politicas_privacidade @trg @done
  Cenario: CY005_Acessar_link_de_politicas_de_privacidade
    Entao clico no link de politica de privacidade
