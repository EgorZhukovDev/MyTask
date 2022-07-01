package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageGuru {
    public WebDriver driver;

    public LoginPageGuru(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }

    @FindBy(xpath = "//input[@name='uid']")
    private WebElement loginInput;

    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordInput;

    @FindBy(xpath = "//input[@name='btnLogin']")
    private WebElement enter;

    public LoginPageGuru login(String login, String password){
        loginInput.sendKeys(login);
        passwordInput.sendKeys(password);
        enter.click();
        return this;
    }
}
