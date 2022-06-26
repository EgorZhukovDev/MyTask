package ui.tests;

import driver.BrowserManager;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

import static org.openqa.selenium.support.ui.ExpectedConditions.alertIsPresent;


public class BasicTest {
    public static WebDriver webDriver;

    public static void main(String[] args) throws InterruptedException {
        webDriver = BrowserManager.initialize();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        WebDriverWait wait = new WebDriverWait(webDriver, 10);

        webDriver.get("https://www.udemy.com/");
        WebElement element = webDriver.findElement(By.xpath("//input[@name='q']"));
        WebElement element2 = webDriver.findElement(By.xpath("(//div[@class='udlite-heading-md'])[2]"));
        String text = element2.getText();
        System.out.println(text);
        Assert.assertEquals(text, "Выбирайте курсы от экспертов с реальным опытом");

        Thread.sleep(5000);
        webDriver.quit();

    }
}
