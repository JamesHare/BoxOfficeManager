package com.jamesmhare.boxofficemanager.repository;

import com.jamesmhare.boxofficemanager.model.Seat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeatRepository extends JpaRepository<Seat, Long> {

    Seat findBySeatId(Long seatId);
    Seat findByRowAndNumber(String row, int number);

}
