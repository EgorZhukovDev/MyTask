package ui.tests;

import driver.BrowserManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.WikiLoginPage;
import pages.WikiMainPage;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class WikiLoginTest {
    public static WebDriver driver;
    public static WikiLoginPage wikiLoginPage;
    public static WikiMainPage wikiMainPage;

    public static String name = "EgorZhu";
    public static String password = "bv6aHG!S-6cTPGY";

    @BeforeClass
    public static void openWikiLoginPage() {
        driver = BrowserManager.initialize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get("https://ru.wikipedia.org/w/index.php?title=Служебная:Вход&returnto=Заглавная+страница");
        wikiLoginPage = new WikiLoginPage(driver);
        wikiMainPage = new WikiMainPage(driver);
    }

    @AfterClass
    public static void quitDriver() {
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.quit();
    }

    @Test
    public void wikiLoginTest() {
        wikiLoginPage.inputName(name);
        wikiLoginPage.inputPassword(password);
        wikiLoginPage.clickLoginButton();
        Assert.assertEquals(wikiMainPage.getUserName(), name);
    }
}
