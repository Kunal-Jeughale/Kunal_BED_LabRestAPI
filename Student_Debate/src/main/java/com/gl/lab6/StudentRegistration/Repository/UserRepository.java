package com.gl.lab6.StudentRegistration.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.gl.lab6.StudentRegistration.Model.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	@Query("SELECT u FROM User u WHERE u.username = ?1")
	public User getUserByUsername(String username);
}
