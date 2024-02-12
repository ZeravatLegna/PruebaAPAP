package helpers;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BaseTest {

    private static WebDriver driver;

    public void openBrowser(String url) {
        driver.navigate().to(url);
    }

    public static WebDriver getBrowser(BrowserType browserType) {
        String sslIgnore = "--ignore-certificate-errors";
        String defaultMaximize = "--start-maximized";
        String allowRunningInsecure = "--allow-running-insecure-content";
        DesiredCapabilities desCapabilities = new DesiredCapabilities();
        desCapabilities.setAcceptInsecureCerts(true);

        try {
            switch (browserType) {
                case CHROME:
                    WebDriverManager.chromedriver().setup();
                    ChromeOptions chromeOptions = new ChromeOptions();
                    chromeOptions.setHeadless(true); 
                    chromeOptions.merge(desCapabilities);
                    driver = new ChromeDriver(chromeOptions);
                    break;
                case FIREFOX:
                    WebDriverManager.firefoxdriver().setup();
                    FirefoxOptions firefoxOptions = new FirefoxOptions();
                    firefoxOptions.setHeadless(true); 
                    firefoxOptions.merge(desCapabilities);
                    driver = new FirefoxDriver(firefoxOptions);
                    break;
                case EDGE:
                    WebDriverManager.edgedriver().setup();
                    EdgeOptions edgeOptions = new EdgeOptions();
                    edgeOptions.merge(desCapabilities);
                    driver = new EdgeDriver(edgeOptions);
                    break;
                default:
                    WebDriverManager.chromedriver().setup();
                    ChromeOptions options = new ChromeOptions();
                    options.setHeadless(true); 
                    options.addArguments(sslIgnore, allowRunningInsecure, defaultMaximize);
                    options.merge(desCapabilities);
                    driver = new ChromeDriver(options);
            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            return driver;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public void closeBrowser() {
        if (driver != null) {
            driver.quit();
        }
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setupDriver(BrowserType browserName) {
        getBrowser(browserName);
    }
}
