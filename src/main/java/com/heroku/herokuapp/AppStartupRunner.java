package com.heroku.herokuapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import com.heroku.herokuapp.model.Users;
import com.heroku.herokuapp.repository.IUserRepository;
@Component
public class AppStartupRunner implements ApplicationRunner {
	@Autowired
	IUserRepository usersRepository;
	@Override
	public void run(ApplicationArguments args) throws Exception {
		usersRepository.save(new Users("Aarooran","Kanthasamy","aaroor2015@gmail.com",new BCryptPasswordEncoder().encode("1234")));
		usersRepository.save(new Users("Aarooran","Kanthasamy","aathavanaaroor@gmail.com",new BCryptPasswordEncoder().encode("1234")));
		usersRepository.save(new Users("Aarooran","Kanthasamy","aarooran.kanthasamy@absi.digital",new BCryptPasswordEncoder().encode("1234")));
		usersRepository.save(new Users("Aarooran","Kanthasamy","aarooran.kanthasamy@team4.cms.lk",new BCryptPasswordEncoder().encode("1234")));
		
	}

}
