package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class LoginPage extends TestPage {

    private final By auth = By.xpath("//h1[contains(text(), \"Authentication\")]");
    private By login = By.xpath("//a[contains(@class, 'login')]");
    private final By signInButton = By.xpath("//button[contains(@id, 'SubmitLogin')]");

    public LoginPage() {
        clickIt(login);
        waitForLoad(auth);
    }

    public boolean authIsDisplayed() {
        return driver.findElement(auth).isDisplayed();
    }
}