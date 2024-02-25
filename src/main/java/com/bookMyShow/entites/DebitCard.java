package com.bookMyShow.entites;

import com.bookMyShow.entites.entityInteface.PaymentMode;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class DebitCard implements PaymentMode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(nullable = false)
    private long cardNo;
    @Column(nullable = false)
    private String cardHolder;
    @Column(nullable = false)
    private String expDate;

}
