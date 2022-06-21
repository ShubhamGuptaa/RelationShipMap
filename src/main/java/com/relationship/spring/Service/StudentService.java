package com.relationship.spring.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.relationship.spring.Entity.Student;
@Service
public interface StudentService {
    public List<Student> getAll(); 
    public Student getById(long id); 
    public List<Student> post(Student student);
    public List<Student> update(Student student);
    public String deleteById(long id);
}
