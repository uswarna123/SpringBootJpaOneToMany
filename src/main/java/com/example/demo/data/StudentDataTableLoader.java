package com.example.demo.data;

import com.example.demo.contoller.StudentController;
import com.example.demo.entity.Course;
import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class StudentDataTableLoader implements ApplicationRunner {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception
    {
     //  addStudentData();

    }
     public void addStudentData()
     {
         Student student =  new Student();
         student.setStudentName("Tony");
       // student.setCourseId();
         studentRepository.save(student);
         System.out.println("new record inserted to student table...");

     }

}
