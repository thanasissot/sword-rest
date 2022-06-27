package com.sot.thanasis.swordrest.model;

import lombok.*;
import org.hibernate.Hibernate;
import org.springframework.lang.Nullable;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "customers")
@Data
public class Customer {

    @Id
    @Column(name="customerNumber")
    private int customerNumber;

    @Column(name="customerName")
    private String customerName;

    @Column(name="contactLastName")
    private String contactLastName;

    @Column(name="contactFirstName")
    private String contactFirstName;

    @Nullable
    @Column(name="phone")
    private String phone;

    @Nullable
    @Column(name="addressLine1")
    private String addressLine1;

    @Nullable
    @Column(name="addressLine2")
    private String addressLine2;

    @Nullable
    @Column(name="city")
    private String city;

    @Nullable
    @Column(name="state")
    private String state;

    @Nullable
    @Column(name="postalCode")
    private String postalCode;

    @Nullable
    @Column(name="country")
    private String country;

    @ManyToOne
    @JoinColumn(name = "salesRepEmployeeNumber")
    @ToString.Exclude
    private Employee salesRepEmployeeNumber;

    @Nullable
    @Column(name="creditLimit")
    private String creditLimit;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Customer customer = (Customer) o;
        return Objects.equals(customerNumber, customer.customerNumber);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
