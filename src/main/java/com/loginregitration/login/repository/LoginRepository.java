package com.loginregitration.login.repository;

import java.util.UUID;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.loginregitration.login.document.Login;
@Repository("loginrepo")
@CrossOrigin(origins="http://localhost:4200")
public interface LoginRepository extends MongoRepository<Login, UUID> {

}
