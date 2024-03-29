package com.heroku.herokuapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.heroku.herokuapp.model.Users;
import com.heroku.herokuapp.principals.UserPrincipals;
import com.heroku.herokuapp.repository.IUserRepository;
@Service
public class AppUserDetailService implements UserDetailsService {
	@Autowired
	IUserRepository userRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Users user=userRepository.findByEmail(username);
		if(user == null) {
			throw new UsernameNotFoundException("User 404");
		}
		return new UserPrincipals(user);
	}

}
