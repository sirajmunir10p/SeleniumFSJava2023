import connectionString.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class sampleClass extends BaseClass {

    @Test (description = "Perform search on Google")
    public void googleSearch() throws InterruptedException {
        String pageTitle = driver.getTitle();

        Assert.assertEquals(pageTitle, "Google");

//        driver.findElement(By.name("q")).sendKeys("Hello World!");
        WebElement searchBar;
        searchBar = driver.findElement(By.name("q"));
        searchBar.clear();
        searchBar.sendKeys("Selenium");
        searchBar.sendKeys(Keys.RETURN);

       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // WebElement signInnBtn;
       // signInnBtn = driver.findElement(By.xpath("//*[@id=\"gb\"]/div/div[1]/a"));

       // WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
       // wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"gb\"]/div/div[1]/a"))).click();
        setExplicitWait(30).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"gb\"]/div/div[1]/a")));
    }

    /*@Test (description = "Perform search on Google")
    public void googleSearch10P() throws InterruptedException {
        driver.navigate().back();
        String pageTitle = driver.getTitle();

        Assert.assertEquals(pageTitle, "Google");

//        driver.findElement(By.name("q")).sendKeys("Hello World!");
        WebElement searchBar;
        searchBar = driver.findElement(By.name("q"));
        searchBar.clear();
        searchBar.sendKeys("10Pearls");
        searchBar.sendKeys(Keys.RETURN);
    }*/

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}