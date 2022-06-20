package com.spring.restful.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.restful.api.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
