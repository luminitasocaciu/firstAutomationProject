import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.TestPage;

public class TestClass extends TestBase {

    LoginPage loginPage;

    @BeforeClass
    public void setup() {
        maximizePAGE();
        loginPage = new LoginPage();
    }

    @Test
    public void test() {
        Assert.assertTrue(loginPage.authIsDisplayed());
    }
}
