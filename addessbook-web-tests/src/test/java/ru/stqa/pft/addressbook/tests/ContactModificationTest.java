package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactModificationTest extends TestBase {

    @Test
    public void testContactModification () {
        app.getContactHelper().returnTOCOntactPage();
        app.getContactHelper().selectContact();
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillContactForm(new ContactData("MC", "ISD", "1212 Pointe, Oldsmar, FL", "7275040276", "karinakkir@gmail.com", "Lika"));
        app.getContactHelper().submitContactModification();
        app.getContactHelper().returnTOCOntactPage();
    }
}
