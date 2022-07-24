package com.example.demo.entity;

import javax.persistence.*;

@Entity
@Table(name="student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String studentName;
    @ManyToOne(optional = false)
    @JoinColumn(name = "courseId", nullable = false, referencedColumnName = "id")
    private Course courseId;
    public Student() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Course getCourseId() {
        return courseId;
    }

    public void setCourseId(Course courseId) {
        this.courseId = courseId;
    }

    public Student(Long id, String studentName, Course courseId) {
        this.id = id;
        this.studentName = studentName;
        this.courseId = courseId;
    }

    public Student(Long id, String studentName) {
        this.id = id;
        this.studentName = studentName;
    }
}
