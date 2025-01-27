package com.example.SpringBootDemoProject.repositery;

import com.example.SpringBootDemoProject.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Studentrepository extends JpaRepository<Student, Long> {

    public Student findByStudentname(String Studentname);


}
