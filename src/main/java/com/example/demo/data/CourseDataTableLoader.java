package com.example.demo.data;

import com.example.demo.entity.Course;
import com.example.demo.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseDataTableLoader implements ApplicationRunner {


    @Autowired
    CourseRepository courseRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
    // addCourseData();
    //   addCourseData2();
   //  addCourseData1();
    }

    public void addCourseData()
    {
        Course course = new Course();
        course.setName("Payton");
        course.setDuration("1 Year");
        courseRepository.save(course);
        System.out.println("Data inserted in Course table");
    }
    public void addCourseData1()
    {
        Course course = new Course();
        course.setName("C++");
        course.setDuration("6 Months");
        courseRepository.save(course);
        System.out.println("Data inserted in Course table");
    }
    public void addCourseData2()
    {
        Course course = new Course();
        course.setName("Java");
        course.setDuration("12 Months");
        courseRepository.save(course);
        System.out.println("Data inserted in Course table");
    }

}
