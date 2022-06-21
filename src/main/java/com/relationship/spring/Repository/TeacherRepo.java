package com.relationship.spring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.relationship.spring.Entity.Teacher;
@Repository
public interface TeacherRepo extends JpaRepository<Teacher,Long>{
    
}
