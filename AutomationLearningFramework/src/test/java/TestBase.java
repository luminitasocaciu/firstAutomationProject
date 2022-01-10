import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import pages.TestPage;

public class TestBase extends TestPage {

    @BeforeClass
    public void start() {
        init();
    }

    @AfterClass
    public void stop() {
        tearDown();
    }
}
