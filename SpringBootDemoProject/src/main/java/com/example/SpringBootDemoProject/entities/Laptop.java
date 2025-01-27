package com.example.SpringBootDemoProject.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity

public class Laptop {

     @Id
     @GeneratedValue(strategy = GenerationType.AUTO)

    private Long laptopId;

    private String model;

    private String company;

}
