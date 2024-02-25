package com.bookMyShow.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BillCalculatorDto {
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
