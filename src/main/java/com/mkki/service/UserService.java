package com.mkki.service;

import java.util.Date;

import com.mkki.domain.UserVO;
import com.mkki.dto.LoginDTO;

public interface UserService {

  public UserVO login(LoginDTO dto) throws Exception;

  public void keepLogin(String userid, String sessionId, Date next)throws Exception;
  
  public UserVO checkLoginBefore(String value);  
}
