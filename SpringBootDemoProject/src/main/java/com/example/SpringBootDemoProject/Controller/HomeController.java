package com.example.SpringBootDemoProject.Controller;

import com.example.SpringBootDemoProject.Error.StudentNotFoundException;
import com.example.SpringBootDemoProject.entities.Student;
import com.example.SpringBootDemoProject.service.Studentservice;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
   @RestController
   public class HomeController {
    @Autowired

    private Studentservice service;
   @PostMapping("/post")
    public Student saveStudent( @Valid @RequestBody Student student){

    return service.postStudent(student);


    }
   @GetMapping("/getting")
    public List<Student> getstudent(Student st){

    return service.getstudents(st);

    }
    @GetMapping("/fetch/{id}")
    public Student fetchbyid(@PathVariable("id") Long id) throws StudentNotFoundException {

       return service.fetching(id);
    }
    @PutMapping("/update/{id}")
    public Student updateStudent(@PathVariable long id , @RequestBody Student student) throws StudentNotFoundException {
      return this.service.updating(student);
    }

    @DeleteMapping("/delete/{id}")
    public void deletestudent(@PathVariable("id") Long studentid){

       service.deleting(studentid);
    }
    @GetMapping("/names/{name}")
    public Student findbyname(@PathVariable("name") String Studentname){

       return service.naming(Studentname);

    }


}

