package com.jamesmhare.boxofficemanager.model.person;

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
public class Person {

    @Getter
    @Setter
    @Id
    @GeneratedValue
    private Long personAccountId;
    @Getter
    @Setter
    private String firstName;
    @Getter
    @Setter
    private String lastName;

}
