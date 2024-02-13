package com.northwind.customer_service.model.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Column;
import org.springframework.data.relational.core.mapping.Table;

@Table("Customers")
public class Customer {

    @Id
    @Column("CustomerID")
    private String customerId;

    @Column("CompanyName")
    private String companyName;

    @Column("ContactName")
    private String contactName;

    @Column("ContactTitle")
    private String contactTitle;

    @Column("Address")
    private String address;

    @Column("City")
    private String city;

    @Column("Region")
    private String region;

    @Column("PostalCode")
    private String postalCode;

    @Column("Country")
    private String country;

    @Column("Phone")
    private String phone;

    @Column("Fax")
    private String fax;

    public Customer() {
    }

    public Customer(String customerId, String companyName, String contactName, String contactTitle, String address, String city, String region, String postalCode, String country, String phone, String fax) {
        this.customerId = customerId;
        this.companyName = companyName;
        this.contactName = contactName;
        this.contactTitle = contactTitle;
        this.address = address;
        this.city = city;
        this.region = region;
        this.postalCode = postalCode;
        this.country = country;
        this.phone = phone;
        this.fax = fax;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getContactTitle() {
        return contactTitle;
    }

    public void setContactTitle(String contactTitle) {
        this.contactTitle = contactTitle;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId='" + customerId + '\'' +
                ", companyName='" + companyName + '\'' +
                ", contactName='" + contactName + '\'' +
                ", contactTitle='" + contactTitle + '\'' +
                ", address='" + address + '\'' +
                ", city='" + city + '\'' +
                ", region='" + region + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", country='" + country + '\'' +
                ", phone='" + phone + '\'' +
                ", fax='" + fax + '\'' +
                '}';
    }
}
