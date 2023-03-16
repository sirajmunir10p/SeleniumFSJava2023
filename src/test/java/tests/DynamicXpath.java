package tests;

import connectionString.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class DynamicXpath extends BaseClass {

//    WebDriver driver;
    By lastname = new By.ById("lastname");
    By SingleAttribute = new By.ByXPath("//*[@id='firstname']");
    By MulitpeAttribute = new By.ByXPath("//*[@id='firstname'][@class='form-control']");
    By ANDoPERATOR = new By.ByXPath("//*[@id='firstname' and @class='form-control']");
    By OROpertor = new By.ByXPath("//*[@id='firstname' or @class='form-control']");
    By ContainFirstname = new By.ByXPath("//*[contains(@id,'firstname')]");
    By startsWith = new By.ByXPath("//*[starts-with(@id,'firstname')]");
    By SingleSlash = new By.ByXPath("/html/body/div[2]/div[1]/div/form/div[1]/div/input");
    By DoubleSlah = new By.ByXPath("//div[2]/div/input");
    By UsingText = new By.ByXPath("//label[text()='First Name:']");
    By LastIndex = new By.ByXPath("(//input[@type='text'])[last()]");
    By SECLAST = new By.ByXPath("(//input[@type='text'])[3]");
    By UsingPosition2 = new By.ByXPath("(//input[@type='text'])[position()=2]");
    By UsingPosition = new By.ByXPath("(//input[@type='text'])[2]");
    By usingIndexusername = new By.ByXPath("(//input[contains(@type,'text')])[4]");
 /*   public DynamicXpath(WebDriver driver) {
        this.driver = driver;
    }*/

    @Test
    public void DynamicApproach() {
        driver.get("http://uitestpractice.com/Students/Form");
        driver.manage().window().maximize();
        //  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(SingleSlash).sendKeys("Single Slash");
        driver.findElement(DoubleSlah).sendKeys("Double Slash");
        driver.findElement(SingleAttribute).clear();
        driver.findElement(MulitpeAttribute).sendKeys("Double attribute");
        driver.findElement(ANDoPERATOR).clear();
        driver.findElement(ANDoPERATOR).sendKeys("Siraj");
        driver.findElement(OROpertor).clear();
        driver.findElement(OROpertor).sendKeys("Munir");
        driver.findElement(ContainFirstname).clear();
        driver.findElement(ContainFirstname).sendKeys("SM");
        driver.findElement(startsWith).clear();
        String msg = driver.findElement(UsingText).getText();
        System.out.println(msg);
        driver.findElement(LastIndex).sendKeys("siraj.munir");
        driver.findElement(SECLAST).sendKeys("SLAST");
        driver.findElement(UsingPosition).clear();
        driver.findElement(UsingPosition).sendKeys("SMTest");
        driver.findElement(UsingPosition2).clear();
        driver.findElement(UsingPosition2).sendKeys("pOSTION2");
        driver.findElement(usingIndexusername).clear();
        driver.findElement(usingIndexusername).sendKeys("S.m");

    }
}
