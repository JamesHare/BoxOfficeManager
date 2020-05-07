package com.jamesmhare.boxofficemanager.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class SeatReservation {

    @Getter
    @Setter
    @Id
    @GeneratedValue
    private Long seatReservationId;
    @Getter
    @Setter
    private Long seatId;
    @Getter
    @Setter
    private Long reservationId;
    @Getter
    @Setter
    private Long performanceId;

}
