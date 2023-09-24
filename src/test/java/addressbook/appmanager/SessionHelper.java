package addressbook.appmanager;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;

public class SessionHelper extends HelperBase {


    public SessionHelper(WebDriver driver) {
       super(driver);
    }

    public void openApp() {
        driver.get("http://localhost:8080/addressbook/");
        driver.manage().window().setSize(new Dimension(1550, 838));

    }
}
