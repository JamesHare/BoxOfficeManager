package com.jamesmhare.boxofficemanager.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Book {

    @Getter
    @Setter
    @Id
    @GeneratedValue
    private long id;
    @Getter
    @Setter
    private String name;

}
