package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PriceOptionPages {
	
	static WebDriver driver;

	public PriceOptionPages(WebDriver driver) {
		this.driver = driver;
		
	}
	
	public void selecionarPriceOption() {
		
		driver.findElement(By.cssSelector(".choosePrice:nth-child(4) > .ideal-radio")).click();
	}
	
	public void clicarSend() {
		
		driver.findElement(By.id("nextsendquote")).click();		
	}

}
