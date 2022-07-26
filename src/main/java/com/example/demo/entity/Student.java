package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name="student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    @NotNull
    private String studentName;


    @NotNull
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "course_id")
    Course course;

    @CreationTimestamp
    @Column(name = "create_date", updatable = false)
    private Date createDate;

    @UpdateTimestamp
    @Column(name = "update_date", updatable = true)
    private Date updateDate;

    public Student() {
    }

    public Student(Long id, String studentName) {
        this.id = id;
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", studentName='" + studentName + '\'' +
                ", course=" + course +
                '}';
    }

    public Student(String studentName, Course course) {
        this.studentName = studentName;
        this.course = course;
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

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Date getUpdateDate() {
        return updateDate;
    }

    public void setUpdateDate(Date updateDate) {
        this.updateDate = updateDate;
    }
}
