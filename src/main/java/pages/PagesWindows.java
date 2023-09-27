package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import helpers.Helpers;

public class PagesWindows {
	
	// Controlador 
	private WebDriver driver;
	//elementos de la pagina 
	private By BottonClickHere;
	private String textoCapturado;
	
	public PagesWindows(WebDriver driver, String URL) {
		driver.navigate().to(URL);
		this.driver = driver;
		BottonClickHere = By.xpath("/html/body/div[2]/div/div/a");
	}
	
	
	 public String testapap3() {
		 System.out.println ("Dentro del contructor");
	     Helpers helper = new Helpers();

	     // Hacer clic en el botón que abre una nueva ventana
	     helper.darclick(driver, BottonClickHere);
         helper.espera(3);
         
         // Obtener la primera ventana
	     String primeraVentana = driver.getWindowHandle();

	     // Obtener todas las ventanas abiertas
	     for (String ventana : driver.getWindowHandles()) {
	         if (!ventana.equals(primeraVentana)) {
	     // Cerrar la ventana original
	     driver.close();
	     helper.espera(3);
         // Cambiar el control a la nueva ventana
         driver.switchTo().window(ventana);
         helper.espera(3);
         // Realizar acciones en la nueva ventana
         WebElement FieldNewWindows = driver.findElement(By.xpath("/html/body"));
         String textoCapturado = FieldNewWindows.getText();
         helper.espera(3);
         System.out.println("Texto capturado: " + textoCapturado + " Impreso desde test en nueva ventana");
         helper.espera(3);
         return textoCapturado;
           }
        }
		return textoCapturado;
	    }
	}
