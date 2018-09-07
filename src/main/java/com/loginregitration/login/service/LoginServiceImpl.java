package com.loginregitration.login.service;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.loginregitration.login.document.Login;
import com.loginregitration.login.repository.LoginRepository;

@Service("loginservice")
public class LoginServiceImpl implements LoginService {
	@Autowired
	private LoginRepository loginrepo;

	@Override
	public Login createloginuser(@Valid Login login) {
		
		return loginrepo.insert(login);
	}
	
	

}
