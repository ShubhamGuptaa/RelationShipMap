package com.relationship.spring.ServiceImple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.relationship.spring.Entity.Student;
import com.relationship.spring.Repository.StudentRepo;
import com.relationship.spring.Service.StudentService;

@Component
public class StudentImple implements StudentService{

    @Autowired
    StudentRepo studentRepo;
    @Override
    public List<Student> getAll() {
        return studentRepo.findAll();
    }

    @Override
    public Student getById(long id) {
        return studentRepo.findById(id).get();
    }

    @Override
    public List<Student> post(Student student) {
        studentRepo.save(student);
        return studentRepo.findAll();
    }

    @Override
    public List<Student> update(Student student) {
        List<Student> new_list = studentRepo.findAll();
        for(Student a: new_list){
         if(a.getId() == student.getId()){
            studentRepo.save(student);
         }
         else{
             System.out.println("Id doesn't exist!");
         }
        }
        return studentRepo.findAll();
    }

    @Override
    public String deleteById(long id) {
        studentRepo.deleteById(id);
        return "Deleted item with id: "+id;
    }
    
}
