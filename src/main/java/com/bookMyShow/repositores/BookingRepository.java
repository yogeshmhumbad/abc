package com.bookMyShow.repositores;

import com.bookMyShow.entites.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking,Integer> {

}
