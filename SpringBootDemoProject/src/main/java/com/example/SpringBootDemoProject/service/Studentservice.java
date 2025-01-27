package com.example.SpringBootDemoProject.service;

import com.example.SpringBootDemoProject.Error.StudentNotFoundException;
import com.example.SpringBootDemoProject.entities.Student;
import com.example.SpringBootDemoProject.repositery.Studentrepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class Studentservice {

    @Autowired
    private Studentrepository repository;


   public Student postStudent(Student student){

       return repository.save(student);

   }

   public List<Student> getstudents(Student st){

       return repository.findAll();

   }

   public Student fetching(Long id) throws StudentNotFoundException {

      Optional<Student> student= repository.findById(id);

      if(!student.isPresent()){

          throw new StudentNotFoundException("Student not available with id :"+ id);
      }

      return student.get();
   }

    public void  deleting(Long studentid) {

        repository.deleteById(studentid);
    }

    public Student updating(Student student) throws StudentNotFoundException {

       Optional<Student> update=this.repository.findById(student.getId());

       if (update.isPresent()){

           Student studentupdate= update.get();
           studentupdate.setId(student.getId());
           studentupdate.setStudentname(student.getStudentname());
           studentupdate.setStudentDepartment(student.getStudentDepartment());
           repository.save(studentupdate);
           return studentupdate;
       }else{
           throw new StudentNotFoundException("Student not found with id : " + student.getId());
       }

    }

    public Student naming(String Studentname) {

       return repository.findByStudentname(Studentname);
   }
}
