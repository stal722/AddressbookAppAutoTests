package addressbook.tests;

import addressbook.appmanager.ApplicationManager;
import org.openqa.selenium.remote.Browser;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class TestBase {

    protected final ApplicationManager app = new ApplicationManager(Browser.CHROME);

    @BeforeMethod
    public void setUp() {
        app.init();

    }

    @AfterMethod
    public void tearDown() {
        app.stop();
    }

}
