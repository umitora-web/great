package com.example.Lamal.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Entity
@Data

public class Cadet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private  Long id;
    @Column(length = 40)
    private String name;
    @Column(length = 40)
    private String surname;
    @Column(length = 40)
    private String city;
}
