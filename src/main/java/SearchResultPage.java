import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

import static Constants.Locators.Locators.*;
//import static Constants.Locators.Locators.webElements;

public class SearchResultPage {
    WebDriver driver;

    public SearchResultPage(WebDriver driver) {
        this.driver = driver;
    }
    public void searchResult(){
        //driver.findElements();
    }
    public String SearchResultHeader(){
        return driver.findElement(By.xpath(searchResultHeader));
    }
}

