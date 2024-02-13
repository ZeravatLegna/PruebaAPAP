package test;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import helpers.BaseTest;
import helpers.Url;

import org.openqa.selenium.WebDriver;
import pages.PagesNested_frames;
import pages.PagesTinymce;
import pages.PagesWindows;

public class Tests extends BaseTest {
    private WebDriver driver;

    @BeforeMethod
    public void setUp() {
		openBrowser(URL, BrowserType.CHROME);
        espera(5);
    }

    @Test
    public void test1() {
        System.out.println("antes de hacer el constructor");
        PagesTinymce pages = new PagesTinymce(driver, Url.TINYMCE_URL);
        System.out.println("después del constructor");
        String textoCapturado = pages.testapap("Prueba de APAP");
        System.out.println("corrió la prueba 1");
        System.out.println("Texto capturado: " + textoCapturado + " Impreso desde test");
        System.out.println("corrió la prueba print final");
    }

    @Test
    public void test2() {
        System.out.println("antes de hacer el constructor");
        PagesNested_frames pages = new PagesNested_frames(driver, Url.NESTED_FRAMES_URL);
        System.out.println("después del constructor");
        String textoCapturado = pages.testapap2();
        System.out.println("corrió la prueba 2");
        System.out.println("Texto capturado: " + textoCapturado + " Impreso desde test");
        System.out.println("corrió la prueba print final");
    }

    @Test
    public void test3() {
        System.out.println("antes de hacer el constructor");
        PagesWindows pages = new PagesWindows(driver, Url.WINDOWS_URL);
        System.out.println("después del constructor");
        String textoCapturado = pages.testapap3();
        System.out.println("corrió la prueba 3");
        System.out.println("Texto capturado: " + textoCapturado);
        System.out.println("corrió la prueba print final");
    }

    @AfterMethod
    public void tearDown() {
        closeBrowser();
    }
}
