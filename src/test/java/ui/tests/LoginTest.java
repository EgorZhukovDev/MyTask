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
        loginPage = new LoginPage(webDriver);
        webDriver.get("https://demo.guru99.com/V4/");
    }
    @AfterClass
    public void afterClass() {
        BrowserManager.quit();
    }

    @Test
    public void loginTest(){
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        loginPage.login("mngr399867", "ubadUdu");
    }
}