package com.bookMyShow.repositores;

import com.bookMyShow.entites.Theater;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TheaterRepository extends JpaRepository<Theater,Integer> {
}
