package com.lv2code.batch.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lv2code.batch.model.Student;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
