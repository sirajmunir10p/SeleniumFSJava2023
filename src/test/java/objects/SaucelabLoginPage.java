package objects;

import connectionString.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.concurrent.TimeUnit;

public class SaucelabLoginPage extends BaseClass {
    public void visitSauceLabWebsite(){
        driver.get("https://www.saucedemo.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void enterLoginDetails(String username, String password) {

        WebElement usernameField = setExplicitWait(30).until(ExpectedConditions.visibilityOfElementLocated(By.id("user-name")));

        WebElement passwordField = setExplicitWait(30).until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));

        usernameField.sendKeys(username);

        passwordField.sendKeys(password);

    }
    public void clickLoginBtn(){
        WebElement loginBtn = driver.findElement(By.id("login-button"));
        loginBtn.click();
    }
}
