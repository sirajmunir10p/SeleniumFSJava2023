package connectionString;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

public class BaseClass {
    public static WebDriver driver;
    public ChromeOptions options;
    public static WebDriverWait wait;

    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "D:\\SeleniumFSJava\\driver\\chromedriver.exe");
        //WebDriverManager.chromedriver().setup();
        options = new ChromeOptions();
        options.addArguments("start-maximized");
        // options.addArguments("headless");
        options.addArguments("incognito");
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
      //  driver.get("https://www.google.com/");
    }

    @AfterMethod
    public void tearDown() {
        driver.quit();
    }

    public static WebDriverWait setExplicitWait(int secs){
        wait = new WebDriverWait(driver, Duration.ofSeconds(secs));
        return wait;
    }
}
