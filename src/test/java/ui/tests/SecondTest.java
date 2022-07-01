package ui.tests;

import driver.BrowserManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.GoogleMainPage;

public class SecondTest {
    public static WebDriver webDriver;
    public static GoogleMainPage googleMainPage;

    @BeforeClass
    public void beforeClass() {
        webDriver = BrowserManager.initialize();
        googleMainPage = new GoogleMainPage(webDriver);
        webDriver.get("https://google.com");
    }
    @AfterClass
    public void afterClass() throws InterruptedException {
        Thread.sleep(5000);
        BrowserManager.quit();
    }

//    @Test
//    public void someTest() {
//        googleMainPage.clickAppButton();
//    }

    @Test
    public void searhingTest(){
        googleMainPage.searchSomething("путин хуйло");
        Assert.assertFalse(googleMainPage.checkSearchFieldAmountIsEmpty(), "Field is not empty");
    }
}
