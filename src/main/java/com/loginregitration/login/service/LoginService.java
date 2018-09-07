package com.loginregitration.login.service;

import javax.validation.Valid;

import com.loginregitration.login.document.Login;

public interface LoginService {

	Login createloginuser(@Valid Login login);

}
