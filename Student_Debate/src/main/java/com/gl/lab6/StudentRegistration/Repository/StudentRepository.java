package com.gl.lab6.StudentRegistration.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gl.lab6.StudentRegistration.Model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>{
}
