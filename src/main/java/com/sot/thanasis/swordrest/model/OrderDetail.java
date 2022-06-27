package com.sot.thanasis.swordrest.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="orderDetails")
public class OrderDetail {
    @EmbeddedId
    private OrderDetailPK orderDetailPK;

    @Column(name="quantityOrdered")
    private int quantityOrdered;

    @Column(name="priceEach")
    private double priceEach;

    @Column(name="orderLineNumber")
    private int orderLineNumber;
}
