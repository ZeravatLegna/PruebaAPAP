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
    private static BrowserType browserType;

    public void openBrowser(String url, BrowserType type) {
        browserType = type;
        driver = getBrowser(browserType);
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
                    return new ChromeDriver(chromeOptions);
                case FIREFOX:
                    WebDriverManager.firefoxdriver().setup();
                    FirefoxOptions firefoxOptions = new FirefoxOptions();
                    firefoxOptions.setHeadless(true);
                    firefoxOptions.merge(desCapabilities);
                    return new FirefoxDriver(firefoxOptions);
                case EDGE:
                    WebDriverManager.edgedriver().setup();
                    EdgeOptions edgeOptions = new EdgeOptions();
                    edgeOptions.merge(desCapabilities);
                    return new EdgeDriver(edgeOptions);
                default:
                    WebDriverManager.chromedriver().setup();
                    ChromeOptions options = new ChromeOptions();
                    options.setHeadless(true);
                    options.addArguments(sslIgnore, allowRunningInsecure, defaultMaximize);
                    options.merge(desCapabilities);
                    return new ChromeDriver(options);
            }
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

    public static BrowserType getBrowserType() {
        return browserType;
    }
}
