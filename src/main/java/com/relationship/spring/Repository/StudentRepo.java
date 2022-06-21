package com.relationship.spring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.relationship.spring.Entity.Student;
@Repository
public interface StudentRepo extends JpaRepository<Student,Long>{
    
}
