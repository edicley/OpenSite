package pages;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SendQuotePages {
	
	static WebDriver driver;

	public SendQuotePages(WebDriver driver) {
		this.driver = driver;
		
	}
	
	public void preencherSendQuote() {
		
		driver.findElement(By.id("email")).click();
		driver.findElement(By.id("email")).sendKeys("jose@joao.com");
		
		driver.findElement(By.id("phone")).sendKeys("999999999");
		
		driver.findElement(By.id("username")).click();
		driver.findElement(By.id("username")).sendKeys("josejose");
		
		driver.findElement(By.id("password")).sendKeys("J0@0jose");
		
		driver.findElement(By.id("confirmpassword")).click();
		driver.findElement(By.id("confirmpassword")).sendKeys("J0@0jose");
		
		driver.findElement(By.id("Comments")).sendKeys("TESTE");			
	}
	
	public void clicarSend() {
		
		driver.findElement(By.id("sendemail")).click();
	}
	
	public void clicarOk() {
		
		driver.findElement(By.cssSelector("button.confirm")).click();
	}
	
	public void validarSucesso() {
		
        WebElement checaMensagemSucesso = driver.findElement(By.cssSelector("h2"));
        String sucesso = checaMensagemSucesso.getText();
        assertEquals("Sending e-mail success!",sucesso);
		
	}

}
