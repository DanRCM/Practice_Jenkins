package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import pages.Wikipedia;

import java.time.Duration;

public class BaseTest {
    WebDriver driver;
    Wikipedia wikipedia;
    WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));
    public WebDriver getDriver(){
        return driver;
    }

    public WebDriverWait getWait(){
        return wait;
    }

    @BeforeSuite()
    public void setup(){
        driver = new ChromeDriver();
        this.driver.get("https://www.wikipedia.com/");
        wikipedia = new Wikipedia(driver);
    }
}
