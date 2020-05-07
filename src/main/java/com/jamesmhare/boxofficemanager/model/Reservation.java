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
public class Reservation {

    @Getter
    @Setter
    @Id
    @GeneratedValue
    private Long reservationId;
    @Getter
    @Setter
    private Long personAccountId;
    @Getter
    @Setter
    private Long performanceId;
    @Getter
    @Setter
    private boolean paid;

}