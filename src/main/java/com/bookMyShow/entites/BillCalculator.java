package com.bookMyShow.entites;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BillCalculator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private double discount;
    private double totalDiscount;
    private double cgst;
    private double cgstBill;
    private double sgst;
    private double sgstbill;
    private double total;
    private double totalBill;
}
