package com.bookMyShow.repositores;

import com.bookMyShow.entites.DebitCard;
import com.bookMyShow.entites.entityInteface.PaymentMode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentModeRepository extends JpaRepository<DebitCard,Integer> {

}
