package com.bookMyShow.services;

import com.bookMyShow.dtos.*;
import com.bookMyShow.entites.*;
import com.bookMyShow.entites.entityInteface.PaymentMode;
import com.bookMyShow.services.serviceInterface.BookingService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;

@Service
public class BookingServiceImpl implements BookingService {

    @Autowired
    private ModelMapper modelMapper;
    private BillCalculator billCalculator;
    @Override
    public BookingDto createTicket(BookingDto bookingDto) {
        Booking booking = new Booking();
        booking.setBookingDate(bookingDto.getBookingDate());
        booking.setTime(bookingDto.getTime());
        booking.setSeat(bookingDto.getSeat());
        booking.setMovie(bookingDto.getMovie());
        booking.setPaymentMode(bookingDto.getPaymentMode());
        booking.setTheater(bookingDto.getTheater());
        booking.setAddONs(bookingDto.getAddONs());
        booking.setTotalPrice(bookingDto.getTotalPrice());

        return null;
    }

    @Override
    public BookingDto getTicket() {

        return null;
    }
}
