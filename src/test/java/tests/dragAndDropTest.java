package tests;

import objects.dragAndDropPage;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class dragAndDropTest extends dragAndDropPage {

    @Test
    public void testDragNDrop() throws InterruptedException {
        dragAndDropActions();
        ((JavascriptExecutor) driver).executeScript("scroll(0,500)");
        ((JavascriptExecutor) driver).executeScript("scroll(0,500)");
        ((JavascriptExecutor) driver).executeScript("scroll(500,0)");
        ((JavascriptExecutor) driver).executeScript("scroll(500,0)");
    }
}
