package com.relationship.spring.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.relationship.spring.Entity.Admission;
import com.relationship.spring.Service.AdmissionService;

@RestController
@RequestMapping("/admission")
public class AdmissionController {
    @Autowired
    AdmissionService admissionService;
    

    @GetMapping("/getAll")
    public List<Admission> getAllAdmission(){
        return admissionService.getAll();
    }
    @GetMapping("/getById/{id}")
    public Admission getAdmissionById(@PathVariable("id") long id){
        return admissionService.getById(id);
    }
    @PostMapping("/post")
    public List<Admission> postAdmission(@RequestBody Admission admission){
        return admissionService.post(admission);
    }
    @GetMapping("/update")
    public List<Admission> updateAdmission(@RequestBody Admission admission){
        return admissionService.update(admission);
    }
    @GetMapping("/deleteById/{id}")
    public String deleteAdmission(@PathVariable("id") long id){
        return admissionService.deleteById(id);
    }
    
}
