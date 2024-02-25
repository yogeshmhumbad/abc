package com.bookMyShow.controller;

import com.bookMyShow.dtos.BookingDto;
import com.bookMyShow.entites.Booking;
import com.bookMyShow.services.serviceInterface.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookingController {

    @Autowired
    private BookingService bookingService;
    @PostMapping()
    public ResponseEntity<BookingDto> bookTicket(){
        BookingDto bookingDto = null;
        return new ResponseEntity<>(bookingDto, HttpStatus.CREATED);
    }
     @GetMapping("/view-tickets")
     public ResponseEntity<List<BookingDto>> getTickets(){
        return null;
        //return new ResponseEntity<>(this.bookingService.getTickets(), HttpStatus.OK);
     }

    @PostMapping("/Create-ticket")
    public ResponseEntity<BookingDto> createTicket(@RequestBody BookingDto bookingDto){
        return new ResponseEntity<>(this.bookingService.createTicket(bookingDto),HttpStatus.CREATED);
    }
}
