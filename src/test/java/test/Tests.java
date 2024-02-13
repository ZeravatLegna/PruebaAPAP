package test;

import helpers.BaseTest;
import helpers.Url;
import helpers.*;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.PagesNested_frames;
import pages.PagesTinymce;
import pages.PagesWindows;

public class Tests extends BaseTest {

    @BeforeMethod
    public void setUp() {
        openBrowser(Url.TINYMCE_URL, BrowserType.CHROME);
       
    }

    @Test
    public void test1() {
        System.out.println("antes de hacer el constructor");
        PagesTinymce pages = new PagesTinymce(getDriver(), Url.TINYMCE_URL);
        System.out.println("después del constructor");
        String textoCapturado = pages.testapap("Prueba de APAP");
        System.out.println("corrió la prueba 1");
        System.out.println("Texto capturado: " + textoCapturado + " Impreso desde test");
        System.out.println("corrió la prueba print final");
    }

    @Test
    public void test2() {
        System.out.println("antes de hacer el constructor");
        PagesNested_frames pages = new PagesNested_frames(getDriver(), Url.NESTED_FRAMES_URL);
        System.out.println("después del constructor");
        String textoCapturado = pages.testapap2();
        System.out.println("corrió la prueba 2");
        System.out.println("Texto capturado: " + textoCapturado + " Impreso desde test");
        System.out.println("corrió la prueba print final");
    }

    @Test
    public void test3() {
        System.out.println("antes de hacer el constructor");
        PagesWindows pages = new PagesWindows(getDriver(), Url.WINDOWS_URL);
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
