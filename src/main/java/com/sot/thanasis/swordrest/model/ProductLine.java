package com.sot.thanasis.swordrest.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="productLines")
public class ProductLine {

    @Id
    @Column(name="productLine")
    private String productLine;

    @Column(name="textDescription")
    private String textDescription;

    @Column(name="htmlDescription")
    private String htmlDescription;

    @Column(name="image")
    private byte[] amount;
}
