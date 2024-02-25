package com.bookMyShow.services.serviceInterface;

import com.bookMyShow.dtos.DebitCardDto;

public interface PaymentService {
    DebitCardDto addPaymentDetails(DebitCardDto debitCardDto);
}
