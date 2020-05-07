package com.jamesmhare.boxofficemanager.repository;

import com.jamesmhare.boxofficemanager.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReservationRepository extends JpaRepository<Reservation, Long> {

    Reservation findByReservationId(Long reservationId);
    List<Reservation> findByPersonAccountId(Long personAccountId);
    List<Reservation> findByPerformanceId(Long performanceId);

}
