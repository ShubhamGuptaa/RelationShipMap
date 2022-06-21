package com.relationship.spring.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.relationship.spring.Entity.Teacher;
@Service
public interface TeacherService {
    public List<Teacher> getAll(); 
    public Teacher getById(long id); 
    public List<Teacher> post(Teacher teacher);
    public List<Teacher> update(Teacher teacher);
    public String deleteById(long id);
}
