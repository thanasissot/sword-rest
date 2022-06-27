package com.sot.thanasis.swordrest.model;

import lombok.NonNull;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class OrderDetailPK implements Serializable{
    @Column
    @NonNull
    private int orderNumber;

    @Column
    @NonNull
    private String productCode;
}
