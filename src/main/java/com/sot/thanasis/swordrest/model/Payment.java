package com.sot.thanasis.swordrest.model;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Data
@Table(name="payments")
public class Payment {

    @EmbeddedId
    private PaymentPK paymentPK;

    @Column(name="paymentDate")
    private Date paymentDate;

    @Column(name="amount")
    private double amount;

}
