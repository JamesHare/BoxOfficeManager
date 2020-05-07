package com.jamesmhare.boxofficemanager.repository;

import com.jamesmhare.boxofficemanager.model.SeatReservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeatReservationRepository extends JpaRepository<SeatReservation, Long> {

    SeatReservation findBySeatReservationId(Long seatReservationId);
    SeatReservation findByPerformanceIdAndSeatId(Long performanceId, Long seatId);

}
