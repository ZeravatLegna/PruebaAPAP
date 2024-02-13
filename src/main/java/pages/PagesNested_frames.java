package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import helpers.BaseTest;
import helpers.Helpers;

public class PagesNested_frames {
	// Controlador 
	private WebDriver driver;
	//elementos de la pagina 
	private String FrameTop = "frame-top";
	private String FrameLeft = "frame-left";
	private String FrameMiddle = "frame-middle";
	private String FrameRight = "frame-right";
	private String FrameBotton = "frame-bottom";

    public PagesNested_frames(WebDriver webDriver, String URL) {
        this.driver = BaseTest.getDriver();
        new Helpers();
        driver.get(URL);
    }
		
		
	public String testapap2() {
		Helpers helper = new Helpers();
		StringBuilder textoAcumulado = new StringBuilder();
		helper.espera(2);
		System.out.println("entro a la prueba");
		// Cambiar al frame top
		
		helper.CambiarFrame(driver, FrameTop);
		helper.espera(2);
		
        // Cambiar al frame FramedLeft
		helper.CambiarFrame(driver, FrameLeft);
        helper.espera(2);
        
        WebElement Frame = driver.findElement(By.xpath("/html/body"));
        String textoCapturado = Frame.getText();
        textoAcumulado.append(textoCapturado).append("\n");
        helper.VolverAlFramePrincipal(driver);
        helper.espera(2);

        // Cambiar al frame FrameMiddle
        helper.CambiarFrame(driver, FrameTop);
		helper.espera(2);
		
		helper.CambiarFrame(driver, FrameMiddle);
        helper.espera(2);
        
        WebElement Frame1 = driver.findElement(By.xpath("/html/body"));
        String textoCapturado1 = Frame1.getText();
        textoAcumulado.append(textoCapturado1).append("\n");
        helper.VolverAlFramePrincipal(driver);
        helper.espera(2);

        // Cambiar al frame FrameRight
        helper.CambiarFrame(driver, FrameTop);
		helper.espera(2);
		
		helper.CambiarFrame(driver, FrameRight);
        helper.espera(2);
        
        WebElement Frame2 = driver.findElement(By.xpath("/html/body"));
        String textoCapturado2 = Frame2.getText();
        textoAcumulado.append(textoCapturado2).append("\n");
        helper.VolverAlFramePrincipal(driver);
        helper.espera(2);

        // Regresar al frame principal
        helper.VolverAlFramePrincipal(driver);
        helper.espera(2);

        // Cambiar al frame FrameBotton
        helper.CambiarFrame(driver, FrameBotton);
        helper.espera(2);
        
        WebElement Frame3 = driver.findElement(By.xpath("/html/body"));
        String textoCapturado3 = Frame3.getText();
        textoAcumulado.append(textoCapturado3).append("\n");
        
        // Retornar el texto acumulado
        return textoAcumulado.toString();
	 
	}
}