package com.sot.thanasis.swordrest.model;

import lombok.NonNull;

import javax.persistence.*;
import java.io.Serializable;

@Embeddable
public class PaymentPK implements Serializable {

    @Column
    @NonNull
    private int customerNumber;

    @Column
    @NonNull
    private String checkNumber;

}
