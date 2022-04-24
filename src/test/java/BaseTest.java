import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;

public class BaseTest {
    public static WebDriver driver;
    public static String baseUrl ="https://www.sas.am";
    protected HomePage homePage;
    protected SearchResultPage searchResultPage;
    protected ItemPage itemPage;

    @BeforeClass
    public void initWebDriver() {
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(baseUrl);
        homePage = new HomePage(driver);
    }
//    @BeforeMethod
//    public static void beforeEachTest() {
//        driver.get(baseUrl);
//    }
    //test1
    @Test
    public void navigate_to_homepage_click_on_searchButton() {
//        HomePage homePage = new HomePage(driver);
        homePage.enterSearchStr("Հյութ");

    }
    //test2
    @Test
    public void navigate_to_homepage_click_on_cart() {
        homePage.clickONCartButton();
    }
    //test3
    @Test
    public void navigate_to_searchResultPage() {
        homePage.enterSearchStr("Հյութ");
        searchResultPage.searchResult();
    }
    //test4
    @Test
    public void findIfByAddingToCartAsksForEmail() {
        SearchResultPage searchResult = homePage.enterSearchStr("Հյութ");
        assert(searchResult.)
        System.out.println("ok");

    }
    @AfterClass
    public static void tearDown() {
        driver.quit();
    }
}

