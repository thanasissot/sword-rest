package com.sot.thanasis.swordrest.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Data
@Table(name="orders")
public class Order {

    @Id
    @Column(name="orderNumber")
    private int orderNumber;

    @Column(name="orderDate")
    private Date orderDate;

    @Column(name="requiredDate")
    private Date requiredDate;

    @Column(name="shippedDate")
    private Date shippedDate;

    @Column(name="status")
    private String status;

    @Column(name="comments")
    private String comments;

    @ManyToOne
    @JoinColumn(name="customerNumber")
    private Customer customerNumber;

}
