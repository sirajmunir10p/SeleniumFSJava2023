package objects;

import connectionString.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class SaucelabLoginPage extends BaseClass {
    public void visitSauceLabWebsite(){
        driver.get("https://www.saucedemo.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void enterLoginDetails(String username, String password) {
        WebElement usernameField = driver.findElement(By.id("user-name"));
        WebElement passwordField = driver.findElement(By.id("password"));

        usernameField.sendKeys(username);
        passwordField.sendKeys(password);

    }
    public void clickLoginBtn(){
        WebElement loginBtn = driver.findElement(By.id("login-button"));
        loginBtn.click();
    }
}
