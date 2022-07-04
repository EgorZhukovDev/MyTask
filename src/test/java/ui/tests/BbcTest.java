package ui.tests;

import driver.BrowserManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.BBCpage;

import java.util.concurrent.TimeUnit;

public class BbcTest {
    public static WebDriver webDriver;
    public static BBCpage bbCpage;

    @BeforeClass
    public void beforeClass() {
        webDriver = BrowserManager.initialize();
        webDriver.get("https://www.bbc.com/");
        bbCpage = new BBCpage(webDriver);
    }
    @AfterClass
    public void afterClass() {
        BrowserManager.quit();
    }

    @Test
    public void searchingTest(){
        bbCpage.findSearchField();
    }

    @Test
    public void searchingTest2(){
        bbCpage.findReelField();
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        bbCpage.clickOnReelButtonOnBbc();
    }

    @Test
    public void searchingTest3(){
        bbCpage.findSectionField();
    }

}
