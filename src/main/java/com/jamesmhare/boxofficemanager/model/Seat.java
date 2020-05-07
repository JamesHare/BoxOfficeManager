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
public class Seat {

    @Getter
    @Setter
    @Id
    @GeneratedValue
    private Long seatId;
    @Getter
    @Setter
    private String row;
    @Getter
    @Setter
    private int number;

}
