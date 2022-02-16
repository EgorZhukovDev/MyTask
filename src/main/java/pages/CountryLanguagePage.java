package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CountryLanguagePage {
    public WebDriver driver;

    public CountryLanguagePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//span[@class='caret']")
    private WebElement flagButton;

    @FindBy(xpath = "//button[@class='btn btn-default btn-sm btn-block dropdown-toggle']")
    private WebElement countryButton;

    @FindBy(xpath = "//span[@class='flag-icon-small flag-icon-lt']")
    private WebElement countryLithuaniaButton;


    public CountryLanguagePage clickFlagBtn() {
        flagButton.click();
        return this;
    }

    public CountryLanguagePage clickCountryBtn() {
        countryButton.click();
        return this;
    }

    public void clickLithuaniaBtn(String country) {
        countryButton.click();
        driver.findElement(By.linkText(country)).click();
    }
}

