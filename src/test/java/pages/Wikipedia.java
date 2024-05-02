package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Wikipedia extends BasePage{

    @FindBy(id = "searchInput")
    WebElement input;

    @FindBy(css = ".pure-button.pure-button-primary-progressive")
    WebElement btnSearch;

    public void input(String msg){
        getWait().until(ExpectedConditions.visibilityOf(input));
        input.sendKeys(msg);
    }

    public void clickBtnSearch(){
        getWait().until(ExpectedConditions.visibilityOf(btnSearch));
        btnSearch.click();
    }

    public Wikipedia(WebDriver driver) {
        super(driver);
    }
}
