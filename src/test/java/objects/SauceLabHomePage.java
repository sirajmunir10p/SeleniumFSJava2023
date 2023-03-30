package objects;

import connectionString.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SauceLabHomePage extends BaseClass {
    protected By backPackElm = By.xpath("//div[text()='Sauce Labs Backpack']");
    protected By addToCartElm = By.xpath("//*[@id=\"add-to-cart-sauce-labs-backpack\"]");

    public String getItemName() {
        setExplicitWait(30).until(ExpectedConditions.visibilityOfElementLocated(backPackElm));
        WebElement backPackLink = driver.findElement(backPackElm);
        return backPackLink.getText();
    }

    public void clickAddToCart() {
        setExplicitWait(30).until(ExpectedConditions.visibilityOfElementLocated(addToCartElm));
        WebElement addToCartBtn = driver.findElement(addToCartElm);
        addToCartBtn.click();
    }

    public String getPageTitle() {
        return driver.getTitle();
    }
}
