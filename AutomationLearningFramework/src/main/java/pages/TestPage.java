package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestPage {

    protected static WebDriver driver;
    protected static WebDriverWait wait;

    public void init() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ilinca.ghircoias\\Desktop\\web-driver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        if (System.getenv().containsKey("browser")) {
            if (System.getenv("browser").equals("chrome_headless")) {
                options.addArguments("--headless", "--window-size=1920,1200");
            }
        }
        driver = new ChromeDriver(options);
        driver.get("http://automationpractice.com/index.php");
        wait = new WebDriverWait(driver, 10);

    }

    public void clickIt(By locator) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
        driver.findElement(locator).click();

    }

    public void waitForLoad(By locator) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
        driver.findElement(locator).isDisplayed();
    }

    public void maximizePAGE() {
        driver.manage().window().maximize();
    }

    public void tearDown() {
        driver.close();
        if (driver != null) {
            driver.quit();
        }
    }
}
