package com.adventurelandVillage.service;

import com.adventurelandVillage.exception.AdminException;
import com.adventurelandVillage.exception.LoginException;
import com.adventurelandVillage.model.LoginDTO;

public interface LoginService {
	public String logIntoAccount(LoginDTO dto) throws LoginException;

	public String logOutFromAccount(String key) throws LoginException;

	public String logInAsUser(LoginDTO loginDTO) throws LoginException;

	public boolean isLoggedIn(String key) throws LoginException;

	public boolean isAdmin(String uuid) throws AdminException;
}
