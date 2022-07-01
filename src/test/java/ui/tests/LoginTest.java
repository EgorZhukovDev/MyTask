package ui.tests;

import driver.BrowserManager;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPageGuru;

import java.util.concurrent.TimeUnit;

public class LoginTest {
    public static WebDriver webDriver;
    public static LoginPageGuru loginPageGuru;


    @BeforeClass
    public void beforeClass() {
        webDriver = BrowserManager.initialize();
        loginPageGuru = new LoginPageGuru(webDriver);
        webDriver.get("https://demo.guru99.com/V4/");
    }
    @AfterClass
    public void afterClass() {
        BrowserManager.quit();
    }

    @Test
    public void loginTest(){
        webDriver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        loginPageGuru.login("mngr399867", "ubadUdu");
    }
}