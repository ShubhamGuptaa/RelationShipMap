package com.relationship.spring.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.relationship.spring.Entity.Student;
import com.relationship.spring.Service.StudentService;


@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService studentService;

    @GetMapping("/getAll")
    public List<Student> getAllStudents(){
        return studentService.getAll();
    }
    @GetMapping("/getById/{id}")
    public Student getStudentById(@PathVariable("id") long id){
        return studentService.getById(id);
    }
    @PostMapping("/post")
    public List<Student> postStudents(@RequestBody Student student){
        return studentService.post(student);
    }
    @GetMapping("/update")
    public List<Student> updateStudent(@RequestBody Student student){
        return studentService.update(student);
    }
    @GetMapping("/deleteById/{id}")
    public String deleteStudent(@PathVariable("id") long id){
        return studentService.deleteById((int) id);
    }
    
}
