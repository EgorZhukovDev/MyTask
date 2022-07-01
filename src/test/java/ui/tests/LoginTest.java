package ui.tests;

import driver.BrowserManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;

import java.util.concurrent.TimeUnit;

public class LoginTest {
    public static WebDriver webDriver;
    public static LoginPage loginPage;

    @BeforeClass
    public void beforeClass() {
        webDriver = BrowserManager.initialize();
        webDriver.get("https://demo.guru99.com/V4/");
        loginPage = new LoginPage(webDriver);
    }
    @AfterClass
    public void afterClass() throws InterruptedException{
        Thread.sleep(5000);
        BrowserManager.quit();
    }

    @Test
    public void loginTest(){
        loginPage.login("mngr421802", "ezUbAze");
    }
}