package addressbook.tests;

import addressbook.model.ContactData;
import org.testng.annotations.Test;

public class ContactDeletionTests extends TestBase {

    @Test
    public void testContactDeletion() {
        if(!app.getContactHelper().isContactPresent()) {
            app.getNavigationHelper().gotoAddNewPage();
            app.getContactHelper().contactCreate(new ContactData("Ivan", "Ivanov", "test",
                    "00234", "test@mai.ru", "test1"), true);
            app.getNavigationHelper().returnHomePage();
        }
        app.getContactHelper().selectContact();
        app.getContactHelper().submitDeletionContact();
        app.getNavigationHelper().returnHomePage();
    }
}
