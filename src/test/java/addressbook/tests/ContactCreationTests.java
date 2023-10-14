package addressbook.tests;

import addressbook.model.ContactData;
import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {
    @Test
    public void testContactCreation() {
        app.getNavigationHelper().gotoAddNewPage();
        app.getContactHelper().fillContactForms(new ContactData("Ivan", "Ivanov", "Mosc", "123", "test@test.com",
                "test1"), true);
        app.getContactHelper().submitCreationContact();
        app.getNavigationHelper().returnHomePage();
    }
}
