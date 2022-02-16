package ru.stqa.pft.addressbook.model;

public class ContactData {
    private final String namel;
    private final String company;
    private final String address;
    private final String phone;
    private final String email;
    private final String namef;

    public ContactData(String namel, String company, String address, String phone, String email, String namef) {
        this.namel = namel;
        this.company = company;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.namef = namef;
    }

    public String getNamel() {
        return namel;
    }

    public String getCompany() {
        return company;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getNamef() {
        return namef;
    }
}
