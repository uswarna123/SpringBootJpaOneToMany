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
      //addCourseData();
    }

    public void addCourseData()
    {
        Course course = new Course();
        course.setName("Hadoop");
        course.setDuration("3 Months");
        courseRepository.save(course);
        System.out.println("Data inserted in Course table");
    }

}
