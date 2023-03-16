package tests;

import connectionString.BaseClass;
import objects.SauceLabHomePage;
import objects.SaucelabLoginPage;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SauceLabTests extends BaseClass {
    SaucelabLoginPage saucelabLoginPage = new SaucelabLoginPage();
    SauceLabHomePage sauceLabHomePage = new SauceLabHomePage();

    @Test
    public void loginWithValidUsernamePassword() {
        saucelabLoginPage.visitSauceLabWebsite();
        saucelabLoginPage.enterLoginDetails("standard_user", "secret_sauce");
        saucelabLoginPage.clickLoginBtn();

        System.out.println(sauceLabHomePage.getPageTitle());
        System.out.println(sauceLabHomePage.getItemName());
        Assert.assertEquals(sauceLabHomePage.getItemName(), "Sauceeee Labs Backpack");
        sauceLabHomePage.clickAddToCart();
    }

    @Test (dataProvider = "loginData")
    public void loginWithMultipleUsernamePassword(String name, String pwd) {
        saucelabLoginPage.visitSauceLabWebsite();
        saucelabLoginPage.enterLoginDetails(name, pwd);
        saucelabLoginPage.clickLoginBtn();

        System.out.println(sauceLabHomePage.getPageTitle());
        System.out.println(sauceLabHomePage.getItemName());
/*        Assert.assertEquals(sauceLabHomePage.getItemName(), "Sauceeee Labs Backpack");
        sauceLabHomePage.clickAddToCart();*/
    }

/*    @DataProvider(name = "loginTestData")
    public Object[][] loginData() {
        Object[][] data = new Object[2][2];
        data[0][0] = "standard_user";
        data[0][1] = "secret_sauce";

        data[1][0] = "siraj.munir";
        data [1][1] = "sdsds";

 *//*       data[2][0] = "Arsalan";
        data [2][1] = "Arsalan121323";
 *//*       return data;
    }*/
    @DataProvider(name = "loginData")
    public Object[][] fileNameAndFormat() {
        return new Object[][]{
                {"standard_user", "secret_sauce"},
                {"locked_out_user", "secret_sauce"},
                {"Arsalan", "sdewedsds"},
        };
}
}