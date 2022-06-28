package com.sot.thanasis.swordrest.model;

import javax.persistence.*;
@Entity
@Table(name="employees")
public class Employee {

    @Id
    @Column(name="employeeNumber")
    private int employeeNumber;

    @Column(name="lastName")
    private String lastName;

    @Column(name="firstName")
    private String firstName;

    @Column(name="extension")
    private String extension;

    @Column(name="email")
    private String email;

    @ManyToOne
    @JoinColumn(name="officeCode")
    private Office officeCode;

    @ManyToOne
    @JoinColumn(name = "reportsTo")
    private Employee reportsTo;

    @Column(name="jobTitle")
    private String jobTitle;

}
