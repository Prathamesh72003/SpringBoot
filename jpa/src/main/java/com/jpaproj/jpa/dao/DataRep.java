package com.jpaproj.jpa.dao;

import org.springframework.data.repository.CrudRepository;

import com.jpaproj.jpa.model.Student;

public interface DataRep extends CrudRepository<Student, Integer> {
    
}
