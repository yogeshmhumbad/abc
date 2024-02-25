package com.bookMyShow.entites;

import com.bookMyShow.entites.entityInteface.PaymentMode;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.HashSet;

@Entity
@Data
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private LocalDate bookingDate;

    private LocalTime time;

    private double totalPrice ;

    @OneToMany
    private Seat seat;

    @OneToMany
    private Movie movie;

    private PaymentMode paymentMode;

    @ManyToMany
    private Theater theater;

    @OneToMany
    private AddONs addONs;

    @OneToOne
    private BillCalculator billCalculator;

}
