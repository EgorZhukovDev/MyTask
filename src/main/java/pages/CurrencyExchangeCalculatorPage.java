package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class CurrencyExchangeCalculatorPage {
    public WebDriver driver;

    public CurrencyExchangeCalculatorPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }

    @FindBy(xpath = "//label[text()='Sell']/../input")
    private WebElement sellInput;

    @FindBy(xpath = "//label[text()='Buy']/../input")
    private WebElement buyInput;

    @FindBy(xpath = "//span[@class='js-localization-popover']")
    private WebElement flagButton;

    @FindBy(xpath = "//span[@class='ng-binding']")
    private WebElement swedbankAmountLine;

    @FindBy(xpath = "//span[@class='btn btn-default form-control ui-select-toggle']")
    private WebElement payseraRateLine;

    public void inputSellAmount(String amount) {
        sellInput.sendKeys(amount);
    }

    public void inputBuyAmount(String amount) {
        buyInput.sendKeys(amount);
    }

    public void clickFlagBtn() {
        flagButton.click();
    }

    public boolean checkFieldBuyAmountIsEmpty() {
        return buyInput.getAttribute("value").isEmpty();
    }
}
