package com.gl.lab6.StudentRegistration.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.gl.lab6.StudentRegistration.Model.User;
import com.gl.lab6.StudentRegistration.Repository.UserRepository;
import com.gl.lab6.StudentRegistration.Security.MyUserDetails;

@Service
public class MyUserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = userRepository.getUserByUsername(username);

		if (user == null) {
			throw new UsernameNotFoundException("Could not find user");
		}

		return new MyUserDetails(user);
	}
}
