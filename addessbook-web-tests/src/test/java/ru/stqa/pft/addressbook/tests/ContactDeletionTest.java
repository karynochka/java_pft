package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.*;
import ru.stqa.pft.addressbook.tests.TestBase;


public class ContactDeletionTest extends TestBase {

  @Test
  public void testContactDeletion() throws Exception {
    app.getContactHelper().returnTOCOntactPage();
    app.getContactHelper().selectContact();
    app.getContactHelper().deleteSelectedContact();
    //assertTrue(closeAlertAndGetItsText().matches("^Delete 1 addresses[\\s\\S]$"));
  }

}

