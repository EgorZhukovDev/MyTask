package ui.tests;

import driver.BrowserManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertEquals;

public class DataTablesTest {

    public static WebDriver webDriver;

    @BeforeClass
    public void beforeClass() {
        webDriver = BrowserManager.initialize();
        webDriver.get("https://datatables.net/examples/server_side/row_details.html");
        webDriver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);

    }
    @AfterClass
    public void afterClass() {
        BrowserManager.quit();
    }

    @Test
    public void implicitlyWait(){
        WebElement tableExamples = webDriver.findElement(By.id("example"));
        List<WebElement> tableRows = tableExamples.findElements(By.cssSelector("#example tbody >  tr[role='row']" ));
        List<WebElement> tableRows2 = tableExamples.findElements(By.xpath("//table[@id='example']" ));
        assertEquals(tableRows2.size(), 10);


    }
}
