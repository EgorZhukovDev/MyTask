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

    public void setUserName(String name){
        loginInput.sendKeys(name);

    }
    public void setUserPassword(String password){
        passwordInput.sendKeys(password);
    }
    public void clickEnterButton(){
        enter.click();
    }
}
