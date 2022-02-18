package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactHelper extends HelperBase {
    private WebDriver wd;

    public ContactHelper(WebDriver wd) {
        super(wd);
        this.wd = wd;
    }

    public void returnTOCOntactPage() {
        wd.findElement(By.linkText("home")).click();
    }

    public void submitContactCreation() {
        wd.findElement(By.xpath("//div[@id='content']/form/input[21]")).click();
    }

    public void fillContactForm(ContactData contactData) {
        type(By.name("firstname"), contactData.getNamef());
        type(By.name("lastname"), contactData.getNamel());
        type(By.name("company"), contactData.getCompany());
        type(By.name("address"), contactData.getAddress());
        type(By.name("home"), contactData.getPhone());
        type(By.name("email"), contactData.getEmail());
    }

    public void initContactCreation() {
        wd.findElement(By.linkText("add new")).click();
    }

    public void deleteSelectedContact() {
      wd.findElement(By.xpath("//input[@value='Delete']")).click();
    }

    public void selectContact() {
      wd.findElement(By.id("10")).click();
    }

    public void initContactModification() {
        wd.findElement (By.xpath("//table[@id='maintable']/tbody/tr[3]/td[8]/a/img")).click();
    }

    public void submitContactModification() {
        click(By.name("update"));
    }
}
