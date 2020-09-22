package com.casestudy.customerservice.model;

import javax.validation.constraints.NotEmpty;
import java.util.Objects;

public class Customer {
    private int customerId;
    @NotEmpty(message = "first name??")
    private String fistName;
    @NotEmpty(message = "last name??")
    private String lastName;
    @NotEmpty(message = "street name??")
    private String street;
    @NotEmpty(message = "city name??")
    private String city;
    @NotEmpty(message = "zip code??")
    private String zip;
    @NotEmpty(message = "email??")
    private String email;
    @NotEmpty(message = "phone??")
    private String phone;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer that = (Customer) o;
        return customerId == that.customerId &&
                fistName.equals(that.fistName) &&
                lastName.equals(that.lastName) &&
                street.equals(that.street) &&
                city.equals(that.city) &&
                zip.equals(that.zip) &&
                email.equals(that.email) &&
                phone.equals(that.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, fistName, lastName, street, city, zip, email, phone);
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getZip() {
        return zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
