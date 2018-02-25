package pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage {
    private String HOME_PAGE ="http://demo.nopcommerce.com/";

    @FindBy (xpath = "//li/a[@href='/login']")
    private WebElement loginButton;

    @FindBy (xpath = "//input[@id='Email']")
    private WebElement fieldEmail;

    @FindBy (xpath = "//input[@id='Password']" )
    private WebElement fieldPassword;

    @FindBy (xpath = "//li/a[@href='/computers']")
    private WebElement copmutersButton;

    @FindBy (xpath = "//li/a[@href='/electronics']")
    private WebElement electronicsButton;

    @FindBy (xpath = "//li/a[@href='/apparel']")
    private WebElement apparelButton;

    @FindBy (xpath = "//li/a[@href='digital-downloads']")
    private WebElement digitalDownloadButton;

    @FindBy (xpath = "//li/a[@href='books']")
    private WebElement booksButton;

    @FindBy (xpath = "//li/a[@href='jevelery']")
    private WebElement jeveleryButton;

    @FindBy (xpath = "//li/a[@href='gift-cards']")
    private WebElement giftCardsButton;


//Methods
    public void openHompePage(){
        }
    public void clickOnLoginButton(){loginButton.click();}


}
