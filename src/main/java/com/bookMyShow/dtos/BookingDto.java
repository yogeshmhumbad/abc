package com.bookMyShow.dtos;

import com.bookMyShow.entites.AddONs;
import com.bookMyShow.entites.Movie;
import com.bookMyShow.entites.Seat;
import com.bookMyShow.entites.Theater;
import com.bookMyShow.entites.entityInteface.PaymentMode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.OneToMany;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BookingDto {

    private int id;

    @NotNull
    private LocalDate bookingDate;

    @NotNull
    private LocalTime time;

    private double totalPrice ;

    private Seat seat;

    private Movie movie;

    private PaymentMode paymentMode;

    private Theater theater;

    private AddONs addONs;

    private BillCalculatorDto billCalculatorDto;

}
