import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import pages.*;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class BaseTests {
    private static WebDriver driver;
    private static WebDriverWait wait;
    protected static Homepage homepage;

    @BeforeClass
    public static void setupClass() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 30);
    }

    @AfterClass
    public static void quitDriver() {
        driver.quit();
    }

    @BeforeMethod
    public static void goHome(){
        driver.get("https://www.demoblaze.com/index.html");
        wait = new WebDriverWait(driver, 30);
    }
}
