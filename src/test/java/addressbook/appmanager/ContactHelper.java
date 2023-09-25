package addressbook.appmanager;

import addressbook.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ContactHelper extends HelperBase {

    public ContactHelper(WebDriver driver) {
        super(driver);
    }

    public void fillContactForms(ContactData contactData) {
        type(By.name("firstname"), contactData.getFirstName());
        type(By.name("lastname"), contactData.getLastName());
        type(By.name("address"), contactData.getAddress());
        type(By.name("mobile"), contactData.getMobilePhone());
        type(By.name("email"), contactData.getEmail());
    }

    public void submitCreationContact() {
        click(By.name("submit"));
    }

    public void returnHomePage() {
        click(By.linkText("home page"));
    }

    public void selectContact() {
        click(By.cssSelector("img[title= 'Edit']"));
    }

    public void submitDeletionContact() {
        click(By.cssSelector("input[value = 'Delete']"));
    }

    public void submitContactModification() {
        click(By.name("update"));
    }
}
