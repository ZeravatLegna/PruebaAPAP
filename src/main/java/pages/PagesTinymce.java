package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import helpers.Helpers;

public class PagesTinymce {
	// Controlador 
	private WebDriver driver;
	//elementos de la pagina 
	private By BottonFormato;
	private By BottonNegrita;
	private By BottonCursiva;
	private By BottonAlinearIzquierda;
	private By BottonCentrar;
	private By BottonAlinearDerecha;
	private By BottonJustificar;
	private By FieldTexto;
	private By OptionColorTexto;
	private By tableColors;
	private By OptionRojo;
	private String Frame = "mce_0_ifr";
	//Constructor
	public PagesTinymce(WebDriver driver, String URL) {
		driver.navigate().to(URL);
		this.driver = driver;
		BottonFormato = By.xpath("/html/body/div[2]/div/div/div/div[1]/div[1]/div[1]/button[4]");
		BottonNegrita = By.xpath("/html/body/div[2]/div/div/div/div[1]/div[1]/div[2]/div/div[3]/button[1]");
		BottonCursiva = By.xpath("/html/body/div[2]/div/div/div/div[1]/div[1]/div[2]/div/div[3]/button[2]");
		BottonAlinearIzquierda = By.xpath("/html/body/div[2]/div/div/div/div[1]/div[1]/div[2]/div/div[4]/button[1]");
		BottonCentrar = By.xpath("/html/body/div[2]/div/div/div/div[1]/div[1]/div[2]/div/div[4]/button[2]");
		BottonAlinearDerecha = By.xpath("/html/body/div[2]/div/div/div/div[1]/div[1]/div[2]/div/div[4]/button[3]");
		BottonJustificar = By.xpath("/html/body/div[2]/div/div/div/div[1]/div[1]/div[2]/div/div[4]/button[4]");
		OptionColorTexto = By.xpath("/html/body/div[4]/div/div/div[1]/div[3]/div[1]");
		tableColors = By.xpath("/html/body/div[4]/div/div/div[2]");
		OptionRojo = By.xpath("/html/body/div[4]/div/div/div[2]/div/div/div/div/div[2]/div[3]");
		FieldTexto = By.xpath("/html/body");
		
	}
	
	 public String testapap(String texto) {
		 Helpers helper = new Helpers();
		 
		 // Cambiar al frane
		 helper.CambiarFrame(driver, Frame);
		    
		 // Localizar el campo de texto
		 WebElement FieldTexto = driver.findElement(By.id("tinymce"));  
		
		 helper.escribir(driver, FieldTexto, texto);
		 helper.espera(2);
		 
		 helper.dobleClic(driver, FieldTexto);
		 helper.espera(2);
		 
		 String textoCapturado = FieldTexto.getText();
		 helper.espera(2);
		 
		//Volver al frame principal
		 helper.VolverAlFramePrincipal(driver);
		 helper.espera(2);
		 
		  
		 helper.darclick(driver, BottonNegrita);
		 helper.espera(2);
		 System.out.println("Se Puso en negrita el texto");
		  
		 helper.darclick(driver, BottonFormato);
		 helper.espera(2);
		 
		 helper.darclick(driver, OptionColorTexto);
		 helper.espera(2);
		 
		 helper.darclick(driver, tableColors);
		 helper.espera(2);
		 System.out.println("Se cambio el color del texto");
		  
		 // Cambiar al iframe
		 helper.CambiarFrame(driver, Frame);
		 helper.darclick2(driver, FieldTexto);
		 
		//Volver al frame principal
		 helper.VolverAlFramePrincipal(driver);
		 helper.espera(2);
		  
		 helper.darclick(driver, BottonCentrar);
		 helper.espera(2);
		 System.out.println("Se Centro el texto");
		 System.out.println("Texto capturado: " + textoCapturado);
		 return textoCapturado;
	    }

}
