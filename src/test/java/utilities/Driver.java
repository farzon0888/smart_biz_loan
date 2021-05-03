package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.concurrent.TimeUnit;


public class Driver {


    private static WebDriver driver;

    private Driver() {

    }

    public static WebDriver getReference(){
        return driver;
    }

    public static WebDriver getDriver() {

        if (driver == null) {

            switch (Config.getProperty("browser")) {

                case "chrome":

                    System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver");
                    driver = new ChromeDriver();
                    break;

                default:
                    System.out.println("No Web driver were found");
            }

            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            driver.manage().window().maximize();

        }

        return driver;

    }

    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

}
