package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikiMainPage {
    public WebDriver webDriver;

    public WikiMainPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
        this.webDriver = webDriver;
    }
    @FindBy(xpath = "//*[@id='pt-userpage']/a/span")
    private WebElement userName;

    public String getUserName() {
        return userName.getText();
    }
}
