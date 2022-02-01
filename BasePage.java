package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.HomePage;

public class BasePage {
    protected static WebDriver driver;
    protected static HomePage homePage;
    @BeforeClass
    public static void setUp(){
        System.setProperty("webdriver.chrome.driver","resource/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://itera-qa.azurewebsites.net/home/automation");
        homePage = new HomePage(driver);
    }
    @AfterClass
    public static void closeChrome(){
        driver.quit();
    }
}
