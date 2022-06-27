package com.sot.thanasis.swordrest.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="products")
public class Product {

    @Id
    @Column(name="productCode")
    private String productCode;

    @Column(name="productName")
    private String productName;

    @ManyToOne
    @JoinColumn(name="productLine")
    private ProductLine productLine;

    @Column(name="productScale")
    private String productScale;

    @Column(name="productVendor")
    private String productVendor;

    @Column(name="productDescription")
    private String productDescription;

    @Column(name="quantityInStock")
    private int quantityInStock;

    @Column(name="buyPrice")
    private Double buyPrice;

    @Column(name="MSRP")
    private Double MSRP;

}
