package ui.tests;

import driver.BrowserManager;
import io.qameta.allure.Story;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import pages.CountryLanguagePage;
import pages.CurrencyExchangeCalculatorPage;


/**
 * @author Egor Zhukovetsky
 */

@Slf4j
@Story("US 1.2 \"ExchangePayseraTests\"")   //for Allure
public class ExchangeTests {
    public static CurrencyExchangeCalculatorPage currencyExchangeCalculatorPage;
    public static CountryLanguagePage countryLanguagePage;
    public static WebDriver webDriver;

    @BeforeClass
    public void beforeClass() {
        webDriver = BrowserManager.initialize();
        currencyExchangeCalculatorPage = new CurrencyExchangeCalculatorPage(webDriver);
        countryLanguagePage = new CountryLanguagePage(webDriver);
    }

    @AfterClass
    public void afterClass() {
        BrowserManager.quit();
    }

    @Test
    public void inputBuyAmountExchange() {
        currencyExchangeCalculatorPage.inputBuyAmount("140");
        currencyExchangeCalculatorPage.inputSellAmount("120");
        Assert.assertTrue(currencyExchangeCalculatorPage.checkFieldBuyAmountIsEmpty(), "Field is not empty");
    }
//    @DataProvider(name = "data-provider")
//    public Object[][] objects(){
//        return new Object[][] {
//                {"Lithuania", "EUR"}, {"United Kingdom", "GBP"},
//        };
//    }
//    @Test(dataProvider = "data-provider")
//    public void countryLanguage(String name, String currency) {
//        countryLanguagePage.clickFlagBtn().clickCountryBtn().clickLithuaniaBtn(name);
//        Assert.assertEquals(countryLanguagePage.getCurrencyFromInput(),currency, "Currency selection error");
//    }
}


