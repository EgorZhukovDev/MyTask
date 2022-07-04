package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BBCpage {
    public WebDriver webDriver;

    public BBCpage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
        this.webDriver = webDriver;
    }

    @FindBy(xpath = "//a[@id='orbit-search-button']")
    private WebElement searchBbcButton;

    @FindBy(xpath = "//nav[@class='orbit-header-links international']//li[@class='orb-nav-reeldotcom']")
    private WebElement reelBbcButton;

    @FindBy(xpath = "//section[@class='module module--promo']//li[@class='media-list__item media-list__item--1']")
    private WebElement section;

//    bv6aHG!S-6cTPGY


    public void searchSomethingOnBbc(String searchingText){
        searchBbcButton.sendKeys(searchingText, Keys.ENTER);
    }

    public void clickOnReelButtonOnBbc(){
        reelBbcButton.click();
    }

    public void findSearchField() {
        String text = searchBbcButton.getText();
        System.out.println(text);
    }

    public void findReelField() {
        String text = reelBbcButton.getText();
        System.out.println(text);
    }

    public void findSectionField() {
        String text = section.getText();
        System.out.println(text);
    }
}
