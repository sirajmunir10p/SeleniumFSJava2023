package objects;

import connectionString.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.security.Key;

public class GoogleSearchPage extends BaseClass {

    By searchBar = By.name("q");

    public void searchGoogle(String searchQuery) {
        WebElement input = driver.findElement(searchBar);
        input.sendKeys(searchQuery);
        input.sendKeys(Keys.RETURN);

    }
}
