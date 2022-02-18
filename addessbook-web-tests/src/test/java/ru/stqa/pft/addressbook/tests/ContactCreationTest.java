package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.model.ContactData;
import ru.stqa.pft.addressbook.tests.TestBase;


public class ContactCreationTest extends TestBase {

    @Test
    public void testContactCreation() throws Exception {
        app.getContactHelper().initContactCreation();
        app.getContactHelper().fillContactForm(new ContactData("MC", "ISD", "1212 Pointe, Oldsmar, FL", "7275040276", "karinakkir@gmail.com", "Lika"));
        app.getContactHelper().submitContactCreation();
        app.getContactHelper().returnTOCOntactPage();
    }
}


