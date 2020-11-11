package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductDataPages {
	
	static WebDriver driver;

	public ProductDataPages(WebDriver driver) {
		this.driver = driver;
		
	}
	
	public void preencherAbaProduct() {
		
		driver.findElement(By.id("startdate")).click();
		driver.findElement(By.id("startdate")).sendKeys("06/26/2021");
		
		driver.findElement(By.id("insurancesum")).click();		
		WebElement insurancesum = driver.findElement(By.id("insurancesum"));
		insurancesum.findElement(By.xpath("//*[@id=\"insurancesum\"]/option[2]")).click();		
		driver.findElement(By.id("insurancesum")).click();
		
		driver.findElement(By.id("meritrating")).click();		
		WebElement meritrating = driver.findElement(By.id("meritrating"));
		meritrating.findElement(By.xpath("//option[. = 'Super Bonus']")).click();		
		driver.findElement(By.id("meritrating")).click();
		
		driver.findElement(By.id("damageinsurance")).click();		
		WebElement damageinsurance = driver.findElement(By.id("damageinsurance"));
		damageinsurance.findElement(By.xpath("//option[. = 'Full Coverage']")).click();		
		driver.findElement(By.id("damageinsurance")).click();
		
		driver.findElement(By.cssSelector(".field:nth-child(5) .ideal-radiocheck-label:nth-child(1) > .ideal-check"))
				.click();
		
		driver.findElement(By.id("courtesycar")).click();		
		WebElement courtesycar = driver.findElement(By.id("courtesycar"));
		courtesycar.findElement(By.xpath("//*[@id=\"courtesycar\"]/option[3]")).click();		
		driver.findElement(By.id("courtesycar")).click();		
		
	}
	
	public void clicarSend() {
		
		driver.findElement(By.id("nextselectpriceoption")).click();	
	}

}
