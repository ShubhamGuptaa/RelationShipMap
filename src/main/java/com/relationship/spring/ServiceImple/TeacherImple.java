package com.relationship.spring.ServiceImple;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.relationship.spring.Entity.Teacher;
import com.relationship.spring.Repository.TeacherRepo;
import com.relationship.spring.Service.TeacherService;

@Component
public class TeacherImple implements TeacherService{
    @Autowired
    TeacherRepo teacherRepo;
    @Override
    public List<Teacher> getAll() {
        return teacherRepo.findAll();
    }

    @Override
    public Teacher getById(long id) {
        return teacherRepo.findById(id).get();
    }

    @Override
    public List<Teacher> post(Teacher teacher) {
        teacherRepo.save(teacher);
        return teacherRepo.findAll();
    }

    @Override
    public List<Teacher> update(Teacher teacher) {
        List<Teacher> new_list = teacherRepo.findAll();
        for(Teacher a: new_list){
         if(a.getId() == teacher.getId()){
            teacherRepo.save(teacher);
         }
         else{
             System.out.println("Id doesn't exist!");
         }
        }
        return teacherRepo.findAll();
    }

    @Override
    public String deleteById(long id) {
        teacherRepo.deleteById(id);
        return "Deleted item with id: "+id;
    }
    
}
