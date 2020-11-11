package tests;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.InsurantDataPages;
import pages.PriceOptionPages;
import pages.ProductDataPages;
import pages.SendQuotePages;
import pages.VehicleDataPages;


public class SeleniumTest {
	
	private WebDriver driver;
	static VehicleDataPages cadastroVehicle;
	static InsurantDataPages cadastroInsurant;
	static ProductDataPages cadastroProduct;
	static PriceOptionPages selecionePrice;
	static SendQuotePages cadastroContact;
	private String url = "http://sampleapp.tricentis.com/101/app.php";

	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50000, TimeUnit.MILLISECONDS);
		driver.findElement(By.id("nav_automobile")).click();
		
		cadastroVehicle = new VehicleDataPages(driver);
		
		cadastroInsurant = new InsurantDataPages(driver);
		
		cadastroProduct = new ProductDataPages(driver);
		
		selecionePrice = new PriceOptionPages(driver);
		
		cadastroContact = new SendQuotePages(driver);
		
	}

	@After
	public void tearDown() {
		driver.quit();
	}

	@Test
	public void selenium02() {
		
		cadastroVehicle.preencherAbaVehicle();
		cadastroVehicle.clicarSend();
		
		cadastroInsurant.preencherAbaInsurant();
		cadastroInsurant.clicarSend();
		
		cadastroProduct.preencherAbaProduct();
		cadastroProduct.clicarSend();
		
		selecionePrice.selecionarPriceOption();
		selecionePrice.clicarSend();
	
		cadastroContact.preencherSendQuote();
		cadastroContact.clicarSend();
		cadastroContact.clicarOk();
		cadastroContact.validarSucesso();

	}	
	
}
