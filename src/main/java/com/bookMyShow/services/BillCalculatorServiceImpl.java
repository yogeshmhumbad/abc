package com.bookMyShow.services;

import com.bookMyShow.entites.BillCalculator;
import com.bookMyShow.services.serviceInterface.BillCalculatorService;
import org.springframework.stereotype.Service;

@Service
public class BillCalculatorServiceImpl implements BillCalculatorService {

    @Override
    public BillCalculator calculateBill(BillCalculator billCalculator) {
        billCalculator.setTotalDiscount((billCalculator.getTotal()*billCalculator.getDiscount())/100);

        billCalculator.setCgstBill((billCalculator.getTotal()*billCalculator.getCgst())/100);

        billCalculator.setSgstbill((billCalculator.getTotal()*billCalculator.getSgst())/100);

        billCalculator.setTotalBill(billCalculator.getTotal()+billCalculator.getCgstBill()+billCalculator.getSgstbill()+ billCalculator.getTotalDiscount());

        return billCalculator;
    }
}
