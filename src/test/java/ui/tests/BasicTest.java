package ui.tests;

import driver.BrowserManager;
import org.openqa.selenium.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPageGuru;

import java.util.concurrent.TimeUnit;

public class BasicTest {
    public static WebDriver webDriver;

    @BeforeClass
    public void beforeClass() {
        webDriver = BrowserManager.initialize();
        webDriver.get("https://demo.guru99.com/V4/");
    }
    @AfterClass
    public void afterClass() {
        BrowserManager.quit();
    }

    @Test
    public void loginTest(){
    }
}
