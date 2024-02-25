package com.bookMyShow.repositores;

import com.bookMyShow.entites.Seat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeatRepository extends JpaRepository<Seat,Integer> {
}
