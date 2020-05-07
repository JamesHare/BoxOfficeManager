package com.jamesmhare.boxofficemanager.service;

import com.jamesmhare.boxofficemanager.model.Seat;
import com.jamesmhare.boxofficemanager.repository.SeatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SeatService {

    @Autowired
    SeatRepository seatRepository;

    Seat findBySeatId(Long seatId) {
        return seatRepository.findBySeatId(seatId);
    }

    Seat findByRowAndNumber(String row, int number) {
        return seatRepository.findByRowAndNumber(row, number);
    }

}
