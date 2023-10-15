package addressbook.appmanager;

import addressbook.model.ContactData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class ContactHelper extends HelperBase {

    public ContactHelper(WebDriver driver) {
        super(driver);
    }

    public void fillContactForms(ContactData contactData, boolean creationGroupList) {
        type(By.name("firstname"), contactData.getFirstName());
        type(By.name("lastname"), contactData.getLastName());
        type(By.name("address"), contactData.getAddress());
        type(By.name("mobile"), contactData.getMobilePhone());
        type(By.name("email"), contactData.getEmail());
        if(creationGroupList) {
            new Select(driver.findElement(By.name("new_group"))).selectByVisibleText(contactData.getGroup());
        } else {
            Assert.assertFalse(isElementPresent(By.name("new_group")));
        }

    }

    public void submitCreationContact() {
        click(By.name("submit"));
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

    public void contactCreate(ContactData contact, boolean creationGroupList) {
        fillContactForms(contact, creationGroupList);
        submitCreationContact();
    }

    public boolean isContactPresent() {
        return isElementPresent(By.cssSelector("img[title= 'Edit']"));
    }
}
