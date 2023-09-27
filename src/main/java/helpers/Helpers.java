package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Helpers {
	
	public void espera(int seconds) {
		try { 
			Thread.sleep(seconds*1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
				}	
		}
	
	public void darclick(WebDriver driver, By objeto) {
	    WebElement elemento = driver.findElement(objeto);
	    elemento.click();
	}
	
	public void darclick2(WebDriver driver, WebElement objeto) {
		objeto.click();
	}

	public void escribir(WebDriver driver, WebElement objeto, String texto) {
	    objeto.clear();
	    objeto.sendKeys(texto);
	}
	
	public void dobleClic(WebDriver driver, WebElement objeto) {
	        Actions actions = new Actions(driver);
	        actions.doubleClick(objeto).perform();
	}
	
	public void CambiarFrame (WebDriver driver, String objeto) {
		driver.switchTo().frame(objeto);
		System.out.println("Cambio al frame " + objeto);
	}
	
	public void VolverAlFramePrincipal (WebDriver driver) {
		driver.switchTo().defaultContent();
		System.out.println("Cambio al frame Principal");
	}
}


