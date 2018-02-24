package testes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pageobjects.HomePage;
import pageobjects.LoginPage;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LoginTest {

    private String HOME_URL ="http://demo.nopcommerce.com/";
    private String EMAIL = "koksu@koksu.pl";
    private String PASSWORD = "password";

 private WebDriver driver;
 private static HomePage homePage;
 private static LoginPage loginPage;


 @Before
 public void setUp() {
     System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chrome/chromedriver_Linux64");
     driver = new ChromeDriver();

     homePage = PageFactory.initElements(driver, HomePage.class);
     loginPage = PageFactory.initElements(driver, LoginPage.class);
     driver.manage().timeouts().pageLoadTimeout(4, TimeUnit.SECONDS);
 }


    @After
    public void tearDown() {
        driver.quit();
    }


 //LOGIN TEST
    @Test
    public void loginTest() {

        driver.get(HOME_URL);
        homePage.clickOnLoginButton();
        loginPage.clickOnfieldEmail();
        loginPage.sendEmail(EMAIL);
     loginPage.clickOnfieldEmail();
     loginPage.sendPassword(PASSWORD);
     loginPage.clickOnLoginButton();

        assertEquals("Log out", driver.findElement(By.xpath("//a[@href='/logout']")).getText());


 }
}
