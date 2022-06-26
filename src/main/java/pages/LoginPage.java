package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public WebDriver driver;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver;
    }
    WebElement loginInput = driver.findElement(By.xpath("//input[@name='uid']"));
    WebElement passwordInput = driver.findElement(By.xpath("//input[@name='password']"));
    WebElement enter = driver.findElement(By.xpath("//input[@name='btnLogin']"));

    public void login(String login, String password){
        loginInput.sendKeys(login);
        passwordInput.sendKeys(password);
        enter.click();
    }
}
