package com.relationship.spring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.relationship.spring.Entity.Admission;

@Repository
public interface AdmissionRepo extends JpaRepository<Admission,Long>{
    
}
