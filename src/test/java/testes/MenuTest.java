package testes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import pageobjects.HomePage;
import pageobjects.LoginPage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MenuTest {

    private String HOME_URL = "http://demo.nopcommerce.com/";
    private WebDriver driver;
    private static HomePage homePage;
    private static LoginPage loginPage;


    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chrome/chromedriver_Linux64");
        driver = new ChromeDriver();
        homePage = PageFactory.initElements(driver, HomePage.class);

        driver.manage().timeouts().pageLoadTimeout(4, TimeUnit.SECONDS);
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void checkMenuElements(){

        driver.get(HOME_URL);

        List<WebElement> listMenu = driver.findElements(By.xpath("//ul[@class='top-menu']/li"));

        List <String> listOfMenuElements = new ArrayList<>();

        boolean doesContain = false;

        for (WebElement e : listMenu){
            listOfMenuElements.add(e.getText());
        }

        List<String> elements = Arrays.asList("Computers","Electronics", "Apparel", "Digital downloads", "Books", "Jewelry", "Gift Cards");
        doesContain = listOfMenuElements.containsAll(elements);

        assertTrue("Element does not exist", doesContain);


    }
    @Test
    public void shoppingCartTest() {

        driver.get(HOME_URL);

        WebElement computers = driver.findElement(By.xpath("//a[@href='/computers']"));

        computers.click();

        driver.get("http://demo.nopcommerce.com/computers");

        WebElement desktops = driver.findElement(By.xpath("//img[@alt='Picture for category Desktops']"));

        desktops.click();

    }
}