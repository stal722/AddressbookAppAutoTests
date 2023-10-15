package addressbook.tests;

import addressbook.model.ContactData;
import org.testng.annotations.Test;

public class ContactModificationTests extends TestBase{

    @Test
    public void testContactModification() {
        if(!app.getContactHelper().isContactPresent()) {
            app.getNavigationHelper().gotoAddNewPage();
            app.getContactHelper().contactCreate(new ContactData("Ivan", "Ivanov", "test",
                    "00234", "test@mai.ru", "test1"), true);
            app.getNavigationHelper().returnHomePage();
        }
        app.getContactHelper().selectContact();
        app.getContactHelper().fillContactForms(new ContactData("Vasil", "Petrov", "test", "000",
                "rea@re.ru", null), false);
        app.getContactHelper().submitContactModification();
        app.getNavigationHelper().returnHomePage();
    }
}
