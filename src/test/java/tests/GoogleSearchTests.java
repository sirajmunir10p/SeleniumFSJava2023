package tests;

import objects.GoogleSearchPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleSearchTests extends GoogleSearchPage {

    @Test
    public void searchTest() {
        Assert.assertEquals(driver.getCurrentUrl(), "Google");
        searchGoogle("Facebook");
    }
}
