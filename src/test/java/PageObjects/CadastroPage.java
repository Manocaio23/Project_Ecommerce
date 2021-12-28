package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.github.javafaker.Faker;

public class CadastroPage {
	private static final String URL = "http://automationpractice.com/index.php?controller=authentication&back=my-account.com";
	private WebDriver driver;
	private WebElement element;
	private WebElement element1;
	private WebElement element2;
	Faker faker = new Faker();
	
	
	public CadastroPage(WebDriver driver) {
		this.driver = driver;
	}

	public void site() {
		driver.get(URL);
		
	}
	
	public void escreverEmail() {
		String email = Faker.instance().internet().emailAddress();
		driver.findElement(By.id("email_create")).sendKeys(email);
		
		
	}
	
	public void cadastrarBTN() {
		driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span")).click();
	}
	
	public void Genero() {
		driver.findElement(By.id("id_gender1")).click();
	}

	public void primeiroNome() {
		String nome = faker.name().firstName();
		driver.findElement(By.id("customer_firstname")).sendKeys(nome);
		
	}
	
	public void segundoNome() {
		String sobrenome= faker.name().lastName();
		driver.findElement(By.id("customer_lastname")).sendKeys(sobrenome);
		
	}
	
	public void senha() {
		driver.findElement(By.id("passwd")).sendKeys("123456");
	}
	
	public void nascimento() throws InterruptedException {
		//dia
		element=driver.findElement(By.id("days"));
		Select select= new Select(element);
		select.selectByValue("23");
		//mes 
		Thread.sleep(1000);
		element1=driver.findElement(By.id("months"));
		Select select1= new Select(element1);
		select1.selectByValue("12");
		//ano 
		Thread.sleep(1000);
		element2=driver.findElement(By.id("years"));
		Select select2= new Select(element2);
		select2.selectByValue("1996");
	}
	
	public void checkbox() {
		driver.findElement(By.id("newsletter")).click();
		driver.findElement(By.id("optin")).click();
	}
	public void Cep() {
		driver.findElement(By.id("address1")).sendKeys("00500");
	}
	
	public void Cidade() {
		String cidade = Faker.instance().address().cityName();
		driver.findElement(By.id("city")).sendKeys(cidade);
		
	}
	
	public void state() {
		element=driver.findElement(By.id("id_state"));
		Select select= new Select(element);
		//select.selectByValue("23");
		select.selectByVisibleText("Florida");
		
	}
	
	public void telefone() {
		driver.findElement(By.id("phone_mobile")).sendKeys("81997780849");
	}
	
	public void emailExistente() {
		driver.findElement(By.id("email_create")).sendKeys("caionike03@hotmail.com");
	}
	
	
}
