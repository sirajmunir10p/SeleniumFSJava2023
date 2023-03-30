package objects;

import connectionString.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class dragAndDropPage extends BaseClass {
    By from = By.id("draggable");
    By to = By.id("droppable");

    public void dragAndDropActions() throws InterruptedException {
        driver.get("https://demoqa.com/droppable/");
        Thread.sleep(3000);
        Actions builder = new Actions(driver);

        WebElement drag = driver.findElement(from);

        WebElement drop = driver.findElement(to);

        builder.dragAndDrop(drag, drop).perform();

        String textDrop = drop.getText();

        System.out.println("Our Test Case is Passed ---> " + textDrop);
    }
}
