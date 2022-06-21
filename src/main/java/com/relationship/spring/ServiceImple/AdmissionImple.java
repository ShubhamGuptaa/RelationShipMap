package com.relationship.spring.ServiceImple;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.relationship.spring.Entity.Admission;
import com.relationship.spring.Repository.AdmissionRepo;
import com.relationship.spring.Service.AdmissionService;

@Component
public class AdmissionImple implements AdmissionService{

    @Autowired
    AdmissionRepo admissionRepo;
    

    @Override
    public List<Admission> getAll() {
        return admissionRepo.findAll();
    }

    @Override
    public Admission getById(long id) {
        return admissionRepo.findById(id).get();
    }

    @Override
    public List<Admission> post(Admission admission) {
        admissionRepo.save(admission);
        return admissionRepo.findAll();
    }

    @Override
    public List<Admission> update(Admission admission) {
        List<Admission> new_list = admissionRepo.findAll();
        for(Admission a: new_list){
         if(a.getId() == admission.getId()){
            admissionRepo.save(admission);
         }
         else{
             System.out.println("Id doesn't exist!");
         }
        }
        return admissionRepo.findAll();
    }

    @Override
    public String deleteById(long id) {
        admissionRepo.deleteById(id);
        return "Deleted item with id: "+id;
    }
    
}
