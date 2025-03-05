package com.esprit.gestionevenement.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name="Event")
public class Event implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer eventId;
    private String name;
    private String description;

    @Temporal(TemporalType.DATE)
    private Date startDate;

    @Temporal(TemporalType.DATE)
    private Date endDate;
    private Integer userId;


}