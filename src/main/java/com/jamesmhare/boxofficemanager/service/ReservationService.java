package com.jamesmhare.boxofficemanager.service;

import com.jamesmhare.boxofficemanager.model.Reservation;
import com.jamesmhare.boxofficemanager.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {

    @Autowired
    ReservationRepository reservationRepository;

    Reservation findByReservationId(Long reservationId) {
        return reservationRepository.findByReservationId(reservationId);
    }

    List<Reservation> findByPersonAccountId(Long personAccountId) {
        return reservationRepository.findByPersonAccountId(personAccountId);
    }

    List<Reservation> findByPerformanceId(Long performanceId) {
        return reservationRepository.findByPerformanceId(performanceId);
    }

}
