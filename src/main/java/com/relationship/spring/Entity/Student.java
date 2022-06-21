package com.relationship.spring.Entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Student {
    @Id
    private long id;
    @Column
    private String name;
    @Column
    private int age;
    @Column
    private long salary;
    @OneToOne
    private Admission admission;
    @OneToMany
    private List<Address> address;
    @ManyToMany
    private List<Teacher> teacher;
    public Student() {
    }
    public Student(int id, String name, int age, long salary, Admission admission, List<Address> address,
            List<Teacher> teacher) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.admission = admission;
        this.address = address;
        this.teacher = teacher;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public long getSalary() {
        return salary;
    }
    public void setSalary(long salary) {
        this.salary = salary;
    }
    public Admission getAdmission() {
        return admission;
    }
    public void setAdmission(Admission admission) {
        this.admission = admission;
    }
    public List<Address> getAddress() {
        return address;
    }
    public void setAddress(List<Address> address) {
        this.address = address;
    }
    public List<Teacher> getTeacher() {
        return teacher;
    }
    public void setTeacher(List<Teacher> teacher) {
        this.teacher = teacher;
    }
    

}
