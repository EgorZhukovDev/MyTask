package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GoogleMainPage {
    public WebDriver driver;

    public GoogleMainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//div[@class='gb_z gb_ed gb_f gb_xf']")
    private WebElement applicationsButton;

    @FindBy(xpath = "//input[@class='gLFyf gsfi']")
    private WebElement searchGoogleInput;

    public GoogleMainPage clickAppButton(){
        applicationsButton.click();
        return this;
    }

    public void searchSomething(String searchingText){
        searchGoogleInput.sendKeys(searchingText, Keys.ENTER);
    }

    public boolean checkSearchFieldAmountIsEmpty() {
        return searchGoogleInput.getAttribute("value").isEmpty();
    }
}
