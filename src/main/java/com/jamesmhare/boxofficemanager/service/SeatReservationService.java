package com.jamesmhare.boxofficemanager.service;

import com.jamesmhare.boxofficemanager.model.SeatReservation;
import com.jamesmhare.boxofficemanager.repository.SeatReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SeatReservationService {

    @Autowired
    SeatReservationRepository seatReservationRepository;

    SeatReservation findBySeatReservationId(Long seatReservationId) {
        return seatReservationRepository.findBySeatReservationId(seatReservationId);
    }

    SeatReservation findByPerformanceIdAndSeatId(Long performanceId, Long seatId) {
        return seatReservationRepository.findByPerformanceIdAndSeatId(performanceId, seatId);
    }

}
