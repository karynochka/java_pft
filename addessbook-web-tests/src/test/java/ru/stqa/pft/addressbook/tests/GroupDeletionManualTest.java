package ru.stqa.pft.addressbook.tests;

import org.testng.annotations.Test;

public class GroupDeletionManualTest extends TestBase {
    @Test
    public void testDeletionManual(){
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().deleteSelectedGroup();
        app.getGroupHelper().returnToGroupPage();
    }
}
