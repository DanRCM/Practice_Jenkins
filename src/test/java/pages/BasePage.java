package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import test.BaseTest;

public class BasePage extends BaseTest{

    public BasePage(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

}
