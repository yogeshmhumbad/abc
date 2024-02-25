package com.bookMyShow.controller;

import com.bookMyShow.dtos.DebitCardDto;
import com.bookMyShow.services.serviceInterface.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
    @Autowired
    private PaymentService paymentService;
    @PostMapping("/addCard")
    public ResponseEntity<DebitCardDto> addCard(@RequestBody DebitCardDto debitCardDto){
        return new ResponseEntity<>(this.paymentService.addPaymentDetails(debitCardDto), HttpStatus.CREATED);
    }
}
