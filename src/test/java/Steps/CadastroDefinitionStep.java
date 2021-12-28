package Steps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import PageObjects.CadastroPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class CadastroDefinitionStep {
	private  WebDriver driver;
	private CadastroPage mc;
	
	@Before
	public void setup() {
		System.setProperty("webdriver.chrome.driver", "chromedriver/chromedriver.exe");
		this.driver = new ChromeDriver();
		this.driver.manage().window().maximize();
		mc =new CadastroPage(driver);
	}
	
//	@After
//	public void After() throws InterruptedException {
//		Thread.sleep(3000);
//		driver.manage().deleteAllCookies();
//		driver.quit();
//	}

	@Dado("estou na tela para cadastrar conta")
	public void estou_na_tela_para_cadastrar_conta() {
		mc.site();
	}

	@Quando("escrevo o endereco de e-mail")
	public void escrevo_o_endereco_de_e_mail() {
	    mc.escreverEmail();
	}

	@E("clico no botao Crie sua conta aqui")
	public void clico_no_botao_crie_sua_conta_aqui() throws InterruptedException {
	   mc.cadastrarBTN();
	   Thread.sleep(3000);
	}

	@E("informar titulo, nome, sobrenome, senha, nascimento")
	public void informar_titulo_nome_sobrenome_senha_nascimento() throws InterruptedException {
		mc.Genero();
		mc.primeiroNome();
		mc.segundoNome();
		mc.senha();
		mc.checkbox();
		Thread.sleep(1000);
		mc.nascimento();
		Thread.sleep(1000);
	}

	@E("preencho caixaBox, endereco cidade, caixa postal, telefone, pais, telefone celular")
	public void preencho_caixa_box_endereco_cidade_caixa_postal_telefone_pais_telefone_celular() {
	   mc.Cep();
	   mc.Cidade();
	   mc.state();
	   mc.telefone();
	}

	@Quando("clico em registro")
	public void clico_em_registro() {
	   
	}

	@Entao("devo visualizar a mensagem de bem vindo")
	public void devo_visualizar_a_mensagem_de_bem_vindo() {
	    
	}

	@Entao("devo verificar a mensagem que a conta ja existe")
	public void devo_verificar_a_mensagem_que_a_conta_ja_existe() {
	    
	}

	@Entao("devo verificar a mensagem do o e-mail esta invalido")
	public void devo_verificar_a_mensagem_do_o_e_mail_esta_invalido() {
	    
	}

	@E("preencho os campos e o cep invalido")
	public void preencho_os_campos_e_o_cep_invalido() {
	    
	}

	@E("clico em registrar")
	public void clico_em_registrar() {
	   
	}

	@Entao("deve aparece a mensagem para colocar um valido")
	public void deve_aparece_a_mensagem_para_colocar_um_valido() {
	    
	}

	@E("preencho os camopos e o telefone vazio")
	public void preencho_os_camopos_e_o_telefone_vazio() {
	    
	}

	@Entao("deve aparecer a mensagem para inserir o telefone")
	public void deve_aparecer_a_mensagem_para_inserir_o_telefone() {
	    
	}
}
