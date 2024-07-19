package br.com.appflix.login.controller;

import br.com.appflix.login.dao.LoginDao;

public class LoginController {
	
	private LoginDao loginDao;

	public LoginController() {
		this.loginDao = new LoginDao();
	}

	public boolean authenticate(String username, String password) {
		return loginDao.validateLogin(username, password);
	}
}
