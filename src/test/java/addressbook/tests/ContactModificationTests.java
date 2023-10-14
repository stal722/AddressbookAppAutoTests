package addressbook.tests;

import addressbook.model.ContactData;
import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase{

    @Test
    public void testContactModification() {
        app.getContactHelper().selectContact();
        app.getContactHelper().fillContactForms(new ContactData("Vasil", "Petrov", "test", "000",
                "rea@re.ru", null), false);
        app.getContactHelper().submitContactModification();
        app.getNavigationHelper().returnHomePage();
    }
}
