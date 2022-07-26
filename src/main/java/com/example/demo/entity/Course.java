package com.example.demo.entity;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    private String duration;

    @CreationTimestamp
    @Column(name ="create_date",updatable = false)
    private Date CreateDate;

    @UpdateTimestamp
    @Column(name ="update_date",updatable = true)
    private Date UpdateDate;

    @OneToMany(mappedBy = "course")
    private List<Student> stdList = new ArrayList<>();

    public Course(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Course(Long id) {
        this.id = id;
    }


    public Course(Long id, String name, String duration) {
        this.id = id;
        this.name = name;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", duration='" + duration + '\'' +
                ", CreateDate=" + CreateDate +
                ", UpdateDate=" + UpdateDate +
                ", stdList=" + stdList +
                '}';
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Course() {
    }

    public Date getCreateDate() {
        return CreateDate;
    }

    public void setCreateDate(Date createDate) {
        CreateDate = createDate;
    }

    public Date getUpdateDate() {
        return UpdateDate;
    }

    public void setUpdateDate(Date updateDate) {
        UpdateDate = updateDate;
    }

    public List<Student> getStdList() {
        return stdList;
    }

    public void setStdList(List<Student> stdList) {
        this.stdList = stdList;
    }
}
