package com.jamesmhare.boxofficemanager.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Performance {

    @Getter
    @Setter
    @Id
    @GeneratedValue
    private Long performanceId;
    @Getter
    @Setter
    private Date date;
    @Getter
    @Setter
    private String showName;

}
