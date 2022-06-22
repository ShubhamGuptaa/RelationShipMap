package com.relationship.spring.Controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
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
    String msg ="";
    @PostMapping("/post")
    public ResponseEntity<String> postAdmission(@RequestBody Admission admission){
        try{
            if(admission.getFees() < 1000){
                
                msg = "Less fess!";
                return new ResponseEntity<String>(msg,HttpStatus.BAD_GATEWAY);
            }
            else{
                msg = "Data sent Successfully!";
                admissionService.post(admission);
               return new ResponseEntity<String>(msg,HttpStatus.OK);          
            }
          
        }catch(Exception e){
            System.out.println(e);
        }
      return null;
        
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
