import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static Constants.Locators.Locators.*;

public class HomePage {
    WebDriver driver;
    public HomePage(WebDriver driver) {
        this.driver=driver;
    }

    //By searchField = By.xpath("/html/body/div[4]/div/div/div[2]/div/form/label/input");
    //By searchButton = By.xpath("/html/body/div[4]/div/div/div[2]/div/form/button[3]");


    public SearchResultPage enterSearchStr(String str) {
        driver.findElement(By.xpath(searchField)).sendKeys(str);
        System.out.println("The search string is : " +str);
        driver.findElement(By.xpath(searchButton)).click();
        return null;
    }
    public void clickONCartButton(){
        driver.findElement(By.xpath(cart)).click();
    }
}
