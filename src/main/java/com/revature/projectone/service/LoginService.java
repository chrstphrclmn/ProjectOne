package com.revature.projectone.service;

import java.util.List;

import com.revature.projectone.model.Login;

public interface LoginService {
	
	public boolean isAvailableUsername(String str);
	public boolean isAManager(String username);
	public List<Login> logins();
	public int createLogin(Login login);
	public int updateLogin(Login login);

}
