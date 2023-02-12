package com.gl.lab6.StudentRegistration.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gl.lab6.StudentRegistration.Model.Role;

public interface RoleRepository extends JpaRepository<Role, Integer>{

}
