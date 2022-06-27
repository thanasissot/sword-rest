package com.sot.thanasis.swordrest.model;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@Table(name="offices")
public class Office {

    @Id
    @Column(name="officeCode")
    private String officeCode;

    @Column(name="city")
    private String city;

    @Column(name="phone")
    private String phone;

    @Column(name="addressLine1")
    private String addressLine1;

    @Column(name="addressLine2")
    private String addressLine2;

    @Column(name="state")
    private String state;

    @Column(name="country")
    private String country;

    @Column(name="postalCode")
    private String postalCode;

    @Column(name="territory")
    private String territory;
}
