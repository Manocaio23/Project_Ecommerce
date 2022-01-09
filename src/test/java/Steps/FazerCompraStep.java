package Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.CadastroPage;
import PageObjects.CompraPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class FazerCompraStep {
	private  WebDriver driver;
	private CompraPage mc;
	
	@Before ("@compra")
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "chromedriver/chromedriver.exe");
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		mc=new CompraPage(driver);
	}
	
	@After ("@compra")
	public void After() throws InterruptedException {
		Thread.sleep(3000);
		driver.manage().deleteAllCookies();
		driver.quit();
	}
	
	@Dado("que estou no site")
	public void que_estou_no_site() throws InterruptedException {
	   //driver.get("http://automationpractice.com/index.php?controller=authentication&back=my-account");
	   mc.site();
		Thread.sleep(1000);
		 
		
	}

	@Quando("faco login")
	public void faco_login() throws InterruptedException {
		mc.Login();  
	}

	@Quando("visualizo os dados da conta")
	public void visualizo_os_dados_da_conta() {
	    
	}
	



	@E("clico em {string}")
	public void clico_em(String string) throws InterruptedException {
		Thread.sleep(1000);
		mc.MenuCamisa();
		Thread.sleep(1000);
	}


	@E("visualizo a camisa {string}")
	public void visualizo_a_camisa(String string) throws InterruptedException {
		Thread.sleep(1000);
		mc.AdicionarCarrinho(string);
	   Thread.sleep(1000);
	}

	@Quando("clico em adicionar ao carrinho")
	public void clico_em_adicionar_ao_carrinho() {
	   
	}

	@E("prossigo com o checkout")
	public void prossigo_com_o_checkout() throws InterruptedException {
		Thread.sleep(1000);
		mc.ProcederChecout();  
	 
	}

	@E("clico no botao checkout para avancar")
	public void clico_no_botao_checkout_para_avancar() throws InterruptedException {
		Thread.sleep(1000);
		mc.ProcederCheckoutSumary();
	}

	@E("ao visualizar o endereco clico no botao checkout")
	public void ao_visualizar_o_endereco_clico_no_botao_checkout() {
	    
	}

	@Quando("aceito os termos")
	public void aceito_os_termos() throws InterruptedException {
	    mc.ProcederCheckoutAndrees();
	    mc.AcitarTermos();
	}

	@E("clico no botao de avanca checkout")
	public void clico_no_botao_de_avanca_checkout() {
	    
	}

	@Quando("clico em tranferencia bancaria")
	public void clico_em_tranferencia_bancaria() throws InterruptedException {
	    mc.trasferBancaria();
	}

	@E("clico no botao para confimar meu pedido")
	public void clico_no_botao_para_confimar_meu_pedido() {
	   
	}

	@Entao("devo visualizar a mensagem {string}")
	public void devo_visualizar_a_mensagem(String string) throws InterruptedException {
	 mc.validacaoOrderConfirmation(string);  
	}
	
	//cenario 2 
	
	@Quando("passo mouse em cima do menu vestido")
	public void passoMouseEmCimaDoMenuVestido() throws InterruptedException {
	    mc.ClicarVestido();
	}


	@Quando("clico em vestido de verao")
	public void clicoEmVestidoDeVerao() {
	    
	}
	@Quando("visualizo {string}")
	public void visualizo(String string) throws InterruptedException {
	   mc.validaVestidoPrindedDress(string);
	}
	@Quando("dou um clique em cima")
	public void douUmCliqueEmCima() throws InterruptedException {
		mc.clicarNoVestido();
	}
	@Quando("visualizo as informcoes")
	public void visualizoAsInformcoes() {
	    
	}
	@Quando("coloco a quantidade mais {int}")
	public void colocoAQuantidadeMais(Integer int1) throws InterruptedException {
		//Thread.sleep(2000);
		mc.EspecificacoesVestido();
	}
	@Quando("o tamanho L com a cor branca")
	public void oTamanhoLComACorBranca() {
	    
	}
	@Entao("faco todo procedimento de finalizar compra {string}")
	public void facoTodoProcedimentoDeFinalizarCompra(String string) throws InterruptedException {
		Thread.sleep(2000);
		mc.CompraVestidoPrindedDress();
		mc.ProcederCheckoutSumary();
		mc.ProcederCheckoutAndrees();
		mc.AcitarTermos();
		mc.trasferBancaria();
		mc.validacaoOrderConfirmation(string);
	}
}
