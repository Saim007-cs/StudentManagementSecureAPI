package com.example.SpringBootDemoProject.entities;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Student {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)


    @Column(name="Student_Id")
    private Long id;

    private String studentname;

    @Column(name="student_department")
    private String studentDepartment;

    @OneToOne(cascade = CascadeType.ALL)
    private Laptop laptop;

}

