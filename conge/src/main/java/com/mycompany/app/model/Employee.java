package com.mycompany.app.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import org.springframework.lang.NonNull;

import javax.persistence.GenerationType;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employee {

    @Id
    @SequenceGenerator(
            name = "id",
            sequenceName = "employee_id_sequence"
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "employee_id_sequence"
    )
    private Long id;

    @NonNull
    private String name;

    @NonNull
    private String department;

    private Double salary;
}
