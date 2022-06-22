package com.relationship.spring.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.relationship.spring.Entity.Teacher;
import com.relationship.spring.Service.TeacherService;

@RestController
@RequestMapping("/teacher")
public class TeacherController {
    @Autowired
    TeacherService teacherService;

    @GetMapping("/getAll")
    public List<Teacher> getAllTeacher() {
        return teacherService.getAll();
    }

    @GetMapping("/getById/{id}")
    public Teacher getTeacherById(@PathVariable("id") long id) {
        return teacherService.getById(id);
    }

    @PostMapping("/post")
    public List<Teacher> postTeacher(@RequestBody Teacher teacher) {
        return teacherService.post(teacher);
    }

    @GetMapping("/update")
    public List<Teacher> updateTeacher(@RequestBody Teacher teacher) {
        return teacherService.update(teacher);
    }

    @GetMapping("/deleteById/{id}")
    public String deleteTeacher(@PathVariable("id") long id) {
        return teacherService.deleteById(id);
    }

}
