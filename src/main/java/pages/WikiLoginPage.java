package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WikiLoginPage {
    public WebDriver webDriver;

    public WikiLoginPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
        this.webDriver = webDriver;
    }
    @FindBy(id = "wpName1")
    WebElement nameField;

    @FindBy(id = "wpPassword1")
    WebElement passwordField;

    @FindBy(id = "wpLoginAttempt")
    WebElement loginButton;

    public void inputName(String name) {
        nameField.sendKeys(name);
    }

    public void inputPassword(String password) {
        passwordField.sendKeys(password);
    }

    public void clickLoginButton() {
        loginButton.click();
    }
}
