package com.bookMyShow.controller;

import com.bookMyShow.entites.BillCalculator;
import com.bookMyShow.services.serviceInterface.BillCalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BillController {
    @Autowired
    private BillCalculatorService billCalculatorService;
    @PostMapping("/bill")
    public ResponseEntity<BillCalculator> getTotalBill(@RequestBody BillCalculator billCalculator){

        return new ResponseEntity<>(billCalculatorService.calculateBill(billCalculator), HttpStatus.CREATED);
    }
}
