package com.heroku.herokuapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.heroku.herokuapp.model.Users;
@Repository
public interface IUserRepository extends JpaRepository<Users, Long> {
	Users findByEmail(String email);
}
