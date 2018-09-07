package com.loginregitration.login.conroller;

import java.util.UUID;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.loginregitration.login.document.Login;
import com.loginregitration.login.service.LoginService;

@RestController
@RequestMapping("/loginapi/")
@CrossOrigin(origins="http://localhost:4200")
public class LoginController {
	@Autowired
	private LoginService loginservice;
	@PostMapping("login/create")
	public Login createUserLogin(@Valid @RequestBody Login login) {
		
	login.setLoginId(UUID.randomUUID());
	
		return loginservice.createloginuser(login);
		
		
	}

}
