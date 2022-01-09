package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import junit.framework.Assert;


public class CompraPage {
	private static final String URL = "http://automationpractice.com/index.php?controller=authentication&back=my-account.com";
	private WebDriver driver;
	
	public CompraPage(WebDriver driver) {
		this.driver = driver;
	}
	
	public void site() {
		driver.get(URL);
		
	}
	
	public void Login() {
		driver.findElement(By.id("email")).sendKeys("caionike03@hotmail.com");
		driver.findElement(By.id("passwd")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"SubmitLogin\"]/span")).click();
	
	}
	
	public void MenuCamisa() {
		driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[3]/a")).click();
		
	}
	
	public void AdicionarCarrinho(String string) throws InterruptedException {
		//WebElement validacao=  driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/h5/a"));
	   //Assert.assertEquals(validacao.getText(), string);
	   Thread.sleep(1000);
	   WebElement element =driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[1]/div/a[1]/img"));
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li/div/div[2]/div[2]/a[1]/span")).click();
		
	}
	
	public void ProcederChecout() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")).click();
	}
	
	public void ProcederCheckoutSumary() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span")).click();
	}
	
	public void ProcederCheckoutAndrees() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"center_column\"]/form/p/button/span")).click();
		
	}
	
	public void AcitarTermos() throws InterruptedException {
		Thread.sleep(1000);
		driver.findElement(By.id("cgv")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"form\"]/p/button/span")).click();
	}
	
	public void trasferBancaria() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"HOOK_PAYMENT\"]/div[1]/div/p/a")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"cart_navigation\"]/button/span")).click();
	}
	
	public void validacaoOrderConfirmation(String string) throws InterruptedException {
		Thread.sleep(1000);
		WebElement validacao=  driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/p/strong"));
		   Assert.assertEquals(validacao.getText(), string);
	}
	
	//cenario 2 
	
	public void ClicarVestido() throws InterruptedException {
		WebElement element =driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/a"));
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"block_top_menu\"]/ul/li[2]/ul/li[3]/a")).click();
	}
	
	public void validaVestidoPrindedDress(String string) throws InterruptedException {
		Thread.sleep(1000);
		WebElement validacao=  driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[2]/div/div[2]/h5/a"));
		   Assert.assertEquals(validacao.getText(), string);
	}
	
	public void clicarNoVestido() throws InterruptedException {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500);");
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[2]/div/div[1]/div/a[1]/img")).click();
		  driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[2]/div/div[2]/h5/a")).click();
		
		
	}
	
	public void EspecificacoesVestido() throws InterruptedException {
		//Thread.sleep(2000);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500);");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"quantity_wanted_p\"]/a[2]/span")).click();
		Thread.sleep(1000);
		WebElement element=driver.findElement(By.id("group_1"));
		Select select= new Select(element);
		select.selectByVisibleText("M");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"color_8\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span")).click();
		
	}
	
	public void CompraVestidoPrindedDress() throws InterruptedException {
		driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")).click(); 
		Thread.sleep(1000);
		
	}
	
	
	
		
	
	
}
