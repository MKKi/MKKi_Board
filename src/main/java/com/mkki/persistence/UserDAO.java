package com.mkki.persistence;

import java.util.Date;

import com.mkki.domain.UserVO;
import com.mkki.dto.LoginDTO;

public interface UserDAO {

	public UserVO login(LoginDTO dto) throws Exception;

	public void keepLogin(String uid, String sessionId, Date next);

	public UserVO checkUserWithSessionKey(String value);
}
