#language: pt
#Autor: Mano Caio
#Data: Janeiro/2022

@compra @regresivo
Funcionalidade: fazer compra 
  Dado que quero fazer uma compra no site
  para assim ter o produto que desejo
  E assim recomendar se vale apena
  
  
  Contexto:
  	Dado que estou no site 
  	Quando faco login
  	E visualizo os dados da conta
  	
    @CY001 @comprar_camisa_com_sucesso
  	Cenario: comprar camisa com sucesso 
  	E clico em "T-Shirts"
  	E visualizo a camisa "Faded Short Sleeve T-shirts"
  	Quando clico em adicionar ao carrinho
  	E prossigo com o checkout
  	E clico no botao checkout para avancar
  	E ao visualizar o endereco clico no botao checkout 
  	Quando aceito os termos 
  	E clico no botao de avanca checkout
  	Quando clico em tranferencia bancaria
  	E clico no botao para confimar meu pedido 
  	Entao devo visualizar a mensagem "Your order on My Store is complete."
  	
  	@CY002 @comprar_Vestido_com_sucesso
  	Cenario: compra vestido com sucesso 
  	E passo mouse em cima do menu vestido 
  	E clico em vestido de verao
  	Quando visualizo "Printed Summer Dress"
  	E dou um clique em cima
  	E visualizo as informcoes
  	Quando coloco a quantidade mais 1 
  	E o tamanho L com a cor branca
  	Entao faco todo procedimento de finalizar compra "Your order on My Store is complete."

  	
  	
  	
  	Exemplos:
  	|Camisas	 |
  	|"T-Shirts"|
		
		
		