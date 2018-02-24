package pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {



    @FindBy(xpath = "//input[@id='Email']")
    private WebElement fieldEmail;

    @FindBy (xpath = "//input[@id='Password']" )
    private WebElement fieldPassword;

    @FindBy (xpath = "//input[@class='button-1 login-button']" )
    private WebElement loginButton;


    public void clickOnfieldEmail(){fieldEmail.click();}
    public void sendEmail(String email){fieldEmail.sendKeys(email);}
    public void clickOnPassword(){fieldPassword.click();}
    public void sendPassword(String password){fieldPassword.sendKeys(password);}
    public void clickOnLoginButton(){loginButton.click();}
}
