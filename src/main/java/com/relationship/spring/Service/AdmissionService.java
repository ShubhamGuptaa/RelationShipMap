package com.relationship.spring.Service;

import java.util.List;


import org.springframework.stereotype.Service;

import com.relationship.spring.Entity.Admission;
@Service
public interface AdmissionService {
    public List<Admission> getAll(); 
    public Admission getById(long id); 
    public List<Admission> post(Admission admission);
    public List<Admission> update(Admission admission);
    public String deleteById(long id);
}
