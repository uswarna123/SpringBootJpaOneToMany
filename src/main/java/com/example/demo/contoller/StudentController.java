package com.example.demo.contoller;

import com.example.demo.entity.Course;
import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentController
{
    @Autowired
    StudentRepository studentRepository;

    @GetMapping("/Hello")
    public String hell(){
        System.out.println("Tested ok");
        return "Tested Ok";
    }
  /* @GetMapping("/findAllStudents")
    public List<Student> findAllStudents(){

        List<Student> list = studentRepository.findAll();
        System.out.println(list);
        return list;
    } */
    @GetMapping("/findAllStudents")
    public List<Student> findAllStudents(){
        return studentRepository.findAll();
    }

    @PostMapping("/addStudent")
    public ResponseEntity<Student> addNewStudent(@RequestBody Student student){
        Student response=studentRepository.save(student);
        return ResponseEntity.ok(response);
    }


     @PutMapping("/UpdateStudent/{id}")
     public ResponseEntity<Student> updateStudent(@RequestBody Student student,@PathVariable(name = "id")Long Id){
         Student studentResponse=studentRepository.findById(Id).get();
         studentResponse.setStudentName(student.getStudentName());
         studentResponse.setCourse(student.getCourse());
         Student updatedStudent = studentRepository.save(studentResponse);
         return ResponseEntity.ok(updatedStudent);
     }

     @PatchMapping("/ModifyStudent/{Id}")
     public ResponseEntity<Student> modifyStudent(@RequestBody Student student,@PathVariable(name = "Id") Long Id){
         Student studentResponse = studentRepository.findById(Id).get();
         studentResponse.setStudentName(student.getStudentName());
         studentResponse.setCourse(student.getCourse());
         Student modifiedStudent = studentRepository.save(studentResponse);
         return ResponseEntity.ok(modifiedStudent);
     }

    @DeleteMapping("/DeleteAllStudents")
    public String deleteAllStudent(){
        studentRepository.deleteAll();
        return "All Student Records Deleted";
    }
}
