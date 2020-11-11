package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InsurantDataPages {

	static WebDriver driver;

	public InsurantDataPages(WebDriver driver) {
		this.driver = driver;
		
	}
	
	public void preencherAbaInsurant() {
		
		driver.findElement(By.id("firstname")).click();
		driver.findElement(By.id("firstname")).sendKeys("Jose");
		driver.findElement(By.id("lastname")).sendKeys("Joao");
		
		driver.findElement(By.id("birthdate")).click();
		driver.findElement(By.id("birthdate")).sendKeys("09/12/1990");
		
		driver.findElement(By.cssSelector(".group:nth-child(2) > .ideal-radiocheck-label:nth-child(1) > .ideal-radio"))
				.click();
		
		driver.findElement(By.id("streetaddress")).click();
		driver.findElement(By.id("streetaddress")).sendKeys("Recife");
		
		driver.findElement(By.id("country")).click();		
		WebElement country = driver.findElement(By.id("country"));
		country.findElement(By.xpath("//option[. = 'Brazil']")).click();		
		driver.findElement(By.id("country")).click();
		
		driver.findElement(By.id("zipcode")).click();
		driver.findElement(By.id("zipcode")).sendKeys("54520245");
		
		driver.findElement(By.id("city")).sendKeys("Cabo");
		
		driver.findElement(By.id("occupation")).click();		
		WebElement occupation = driver.findElement(By.id("occupation"));
		occupation.findElement(By.xpath("//option[. = 'Public Official']")).click();		
		driver.findElement(By.id("occupation")).click();
		
		driver.findElement(By.cssSelector(".field:nth-child(10) .ideal-radiocheck-label:nth-child(1) > .ideal-check"))
				.click();
		
		driver.findElement(By.id("website")).click();
		driver.findElement(By.id("website")).sendKeys("www.google.com");		
		
	}
	
	public void clicarSend() {
		
		driver.findElement(By.id("nextenterproductdata")).click();
	}

}
