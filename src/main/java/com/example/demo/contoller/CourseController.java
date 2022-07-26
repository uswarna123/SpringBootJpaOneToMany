package com.example.demo.contoller;

import com.example.demo.entity.Course;
import com.example.demo.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController
{
    @Autowired
    CourseRepository courseRepository;

    @GetMapping("/FindAllCourses")
    public List<Course> getAllCourses()
    {
        return courseRepository.findAll();
    }

    @PostMapping("/addNewCourse")
    public ResponseEntity<Course> addNewCourse(@RequestBody Course course)
    {
        Course response=courseRepository.save(course);
        return ResponseEntity.ok(response);
    }
    @PutMapping("/UpdateCourse/{Id}")
    public ResponseEntity<Course> updateCourse(@RequestBody Course course,@PathVariable(name = "Id")Long Id){
         Course rs=courseRepository.findById(Id).get();
         rs.setName(course.getName());
         rs.setDuration(course.getDuration());
         Course updatedCourse = courseRepository.save(rs);
         return ResponseEntity.ok(updatedCourse);
    }

    @PatchMapping("/ModifyCourse/{Id}")
    public ResponseEntity<Course> modifyCourse(@RequestBody Course course,@PathVariable(name = "Id") Long Id){
      Course rs=courseRepository.findById(Id).get();
      rs.setName(course.getName());
      rs.setDuration(course.getDuration());
        Course result = courseRepository.save(rs);
        return ResponseEntity.ok(rs);
    }

     @DeleteMapping("/DeleteAllCourses")
    public void deleteAllCourses()
    {
        courseRepository.deleteAll();
    }

}
