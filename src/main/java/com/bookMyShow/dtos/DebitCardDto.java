package com.bookMyShow.dtos;

import com.bookMyShow.entites.entityInteface.PaymentMode;
import lombok.Data;

import javax.persistence.*;
@Data
public class DebitCardDto{

    private int id;

    private long cardNo;

    private String cardHolder;

    private String expDate;

}
