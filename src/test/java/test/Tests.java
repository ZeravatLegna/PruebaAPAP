package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.firefox.FirefoxDriver;
import helpers.Helpers;
import org.openqa.selenium.WebDriver;
import pages.PagesNested_frames;
import pages.PagesTinymce;
import pages.PagesWindows;

public class Tests {
	private static final String URL1 = ("https://the-internet.herokuapp.com/tinymce");
	private static final String URL2 = ("https://the-internet.herokuapp.com/nested_frames");
	private static final String URL3 = ("https://the-internet.herokuapp.com/windows");
	private WebDriver driver; 
	
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.gecko.driver", "Drivers/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		Helpers helpers = new Helpers();
		helpers.espera(5);			
	}

	@Test
	public void test1() {
		System.out.println ("antes de hacer el contructor");
		PagesTinymce pages = new PagesTinymce(driver, URL1);
		System.out.println ("despues del contructor");
		String textoCapturado = pages.testapap("PruebadeAPAP");
		System.out.println ("corrio la prueba 1");
		System.out.println("Texto capturado: " + textoCapturado + "Impreso desde test");
	    System.out.println("corrió la prueba print final");
	}
	
	@Test
	public void test2( ) {
		System.out.println ("antes de hacer el contructor");
		PagesNested_frames pages = new PagesNested_frames(driver, URL2);
		System.out.println ("despues del contructor");
		String textoCapturado = pages.testapap2();
		System.out.println ("corrio la prueba 2");
		System.out.println("Texto capturado: " + textoCapturado + "Impreso desde test");
	    System.out.println("corrió la prueba print final");
		
	}
	
	@Test
	public void test3( ) {
		System.out.println ("antes de hacer el contructor");
		PagesWindows pages = new PagesWindows(driver, URL3);
		System.out.println ("despues del contructor");
		String textoCapturado = pages.testapap3();
		System.out.println ("corrio la prueba 2");
		System.out.println("Texto capturado: " + textoCapturado);
	    System.out.println("corrió la prueba print final");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();	
	}
}


