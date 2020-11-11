package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VehicleDataPages {
	
	static WebDriver driver;
	
	public VehicleDataPages(WebDriver driver) {
		this.driver = driver;
		
	}
	
	public void preencherAbaVehicle() {
		
		driver.findElement(By.id("make")).click();		
		WebElement make = driver.findElement(By.id("make"));
		make.findElement(By.xpath("//option[. = 'Volvo']")).click();		
		driver.findElement(By.id("make")).click();
		
		driver.findElement(By.id("engineperformance")).click();
		driver.findElement(By.id("engineperformance")).sendKeys("2000");
		
		driver.findElement(By.id("dateofmanufacture")).click();
		driver.findElement(By.id("dateofmanufacture")).sendKeys("05/05/2020");
		
		driver.findElement(By.id("numberofseats")).click();		
		WebElement numberofseats = driver.findElement(By.id("numberofseats"));
		numberofseats.findElement(By.xpath("//option[. = '5']")).click();		
		driver.findElement(By.id("numberofseats")).click();
		
		driver.findElement(By.id("fuel")).click();		
		WebElement fuel = driver.findElement(By.id("fuel"));
		fuel.findElement(By.xpath("//option[. = 'Gas']")).click();		
		driver.findElement(By.id("fuel")).click();
		
		driver.findElement(By.id("listprice")).click();
		driver.findElement(By.id("listprice")).sendKeys("50000");
		
		driver.findElement(By.id("licenseplatenumber")).sendKeys("445566");
		driver.findElement(By.id("annualmileage")).sendKeys("12000");
		
	}
	
	public void clicarSend() {
		
		driver.findElement(By.id("nextenterinsurantdata")).click();
	}

}
