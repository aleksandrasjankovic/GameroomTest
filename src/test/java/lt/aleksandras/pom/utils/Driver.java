package lt.aleksandras.pom.utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Driver {

    private static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setDriver() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(getDriverOptions());

    }

    public static void quitDriver() {
        driver.quit();
    }

    private static ChromeOptions getDriverOptions() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("window-size=2000,3000");
        options.addArguments("--force-device-scale-factor=0.5");
//        options.addArguments("headless");
        return options;

    }
}
