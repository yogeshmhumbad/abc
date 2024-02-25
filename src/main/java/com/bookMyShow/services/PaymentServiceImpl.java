package com.bookMyShow.services;

import com.bookMyShow.dtos.DebitCardDto;
import com.bookMyShow.entites.DebitCard;
import com.bookMyShow.services.serviceInterface.PaymentService;
import org.modelmapper.ModelMapper;

public class PaymentServiceImpl implements PaymentService {
    private ModelMapper modelMapper;
    @Override
    public DebitCardDto addPaymentDetails(DebitCardDto debitCardDto) {
        DebitCard debitCard = new DebitCard();
        debitCard.setCardNo(debitCardDto.getCardNo());
        debitCard.setCardHolder(debitCardDto.getCardHolder());
        debitCard.setExpDate(debitCardDto.getExpDate());
        return this.modelMapper.map(debitCard,DebitCardDto.class);
    }
}
