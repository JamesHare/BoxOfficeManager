package com.jamesmhare.boxofficemanager.model.person;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Employee extends Person {

    @Getter
    @Setter
    private String employeeId;

}
