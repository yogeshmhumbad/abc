package com.bookMyShow.services.serviceInterface;

import com.bookMyShow.dtos.*;
import com.bookMyShow.entites.entityInteface.PaymentMode;

import java.util.HashSet;

public interface BookingService {

    BookingDto createTicket(BookingDto bookingDto);
    BookingDto getTicket();
}
